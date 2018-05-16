import {Component, OnInit, ViewEncapsulation} from '@angular/core';
import {MatDialogRef} from "@angular/material";

@Component({
  selector: 'app-connexion-dialog',
  templateUrl: './connexion-dialog.component.html',
  styleUrls: ['./connexion-dialog.component.css'],
  encapsulation: ViewEncapsulation.None
})
export class ConnexionDialogComponent implements OnInit {

  id: string;
  mdp: string;

  constructor(private dialogRef: MatDialogRef<ConnexionDialogComponent>) { }

  ngOnInit() {
    this.id = '';
    this.mdp = '';
  }

  close() {
    this.dialogRef.close({id: this.id, mdp: this.mdp});
  }

}
