import { Injectable } from '@angular/core';
import {Article} from "../models/article";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs/Observable";

@Injectable()
export class ArticleService {

  constructor(private http: HttpClient) {
  }

  getAllArticle(): any {
    return this.http.get('http://localhost:8080/article/getAll');
  }

  getArticle(id: number): any {
    return this.http.get('http://localhost:8080/article/get/' + id);
  }

}
