import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Router} from "@angular/router";
import {User} from "./models/user";
import {MatDialog} from "@angular/material";
import {ConnexionDialogComponent} from "./connexion-dialog/connexion-dialog.component";
import {ClientService} from "./services/client.service";
import {LocalStorageService} from "./services/local-storage.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'Vente de Disque';
  user: User;

  constructor(private http: HttpClient,
              private router: Router,
              public dialog: MatDialog,
              private clientService: ClientService,
              private localStorageService: LocalStorageService){
  }

  ngOnInit(): void {
    this.user = this.localStorageService.getCurrentUser();
  }

  backToHome() {
    this.router.navigate(['']);
  }

  goProfil() {
    if(!this.user) {
      let dialogRef = this.dialog.open(ConnexionDialogComponent, {
        width: '80%',
      });
      dialogRef.afterClosed().subscribe(result => {
        this.clientService.connexion(result.id, result.mdp).subscribe(data => {
          this.user = data;
          this.localStorageService.setCurrentUser(this.user);
          this.router.navigate(['profil'])
        });
      });
    } else {
      this.router.navigate(['profil']);
    }
  }

  disconnect() {
    this.user = null;
    this.localStorageService.disconnect();
    this.router.navigate(['']);
  }
}
