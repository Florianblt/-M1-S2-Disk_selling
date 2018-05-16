import { Component, OnInit } from '@angular/core';
import {LocalStorageService} from "../services/local-storage.service";
import {User} from "../models/user";
import {Router} from "@angular/router";

@Component({
  selector: 'app-profil',
  templateUrl: './profil.component.html',
  styleUrls: ['./profil.component.css']
})
export class ProfilComponent implements OnInit {

  user: User;

  constructor(private localStorageService: LocalStorageService,
              private router: Router) {
    this.user = this.localStorageService.getCurrentUser();
    if(!this.user) {
      this.router.navigate(['']);
    }
  }

  ngOnInit() {

  }

}
