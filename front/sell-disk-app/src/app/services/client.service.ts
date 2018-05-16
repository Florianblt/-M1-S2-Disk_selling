import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable()
export class ClientService {

  constructor(private http: HttpClient) { }

  connexion(id: string, mdp: string): any {
    return this.http.get('http://localhost:8080/client/get/' + id + '/' + mdp);
  }

  getClient(id: string): any {
    return this.http.get('http://localhost:8080/client/get/' + id);
  }

}
