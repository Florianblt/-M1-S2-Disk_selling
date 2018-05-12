import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Router} from "@angular/router";
import {User} from "./models/user";
import {MatDialog} from "@angular/material";
import {ConnexionDialogComponent} from "./connexion-dialog/connexion-dialog.component";

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
              public dialog: MatDialog){
  }

  ngOnInit(): void {

  }

  backToHome() {
    this.router.navigate(['']);
  }

  goProfil(){
    if(!this.user) {
      let dialogRef = this.dialog.open(ConnexionDialogComponent, {
        width: '80%', //height: '70vh',
        data: 'This text is passed into the dialog!'
      });
      dialogRef.afterClosed().subscribe(result => {
        console.log(`Dialog closed: ${result}`);
        // this.dialogResult = result;
      });
    }
  }
}
