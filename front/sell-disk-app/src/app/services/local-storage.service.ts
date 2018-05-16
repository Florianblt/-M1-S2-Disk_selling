import { Injectable } from '@angular/core';
import {User} from "../models/user";
import {ClientService} from "./client.service";

@Injectable()
export class LocalStorageService {

  constructor(private clientService: ClientService) { }

  setCurrentUser(user: User) {
    let idNumber: number = user.idClient;
    window.localStorage.setItem('userId', user.idClient.toString());
    window.localStorage.setItem('userMail', user.mail);
    window.localStorage.setItem('userMdp', user.password);
    window.localStorage.setItem('userName', user.nom);
  }

  getCurrentUser(): any {
    let user: User = null;
    if(window.localStorage.getItem('userId')
      && window.localStorage.getItem('userMail')
      && window.localStorage.getItem('userMdp')
      && window.localStorage.getItem('userName')) {
      user = {idClient: +window.localStorage.getItem('userId'),
        mail: window.localStorage.getItem('userMail'),
        password: window.localStorage.getItem('userMdp'),
        nom : window.localStorage.getItem('userName')}
    }
    return user;
  }

  disconnect() {
    window.localStorage.removeItem('userId');
    window.localStorage.removeItem('userMail');
    window.localStorage.removeItem('userMdp');
    window.localStorage.removeItem('userName');
  }
}
