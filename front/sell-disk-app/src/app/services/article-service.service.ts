import { Injectable } from '@angular/core';
import {Article} from "../models/article";
import {HttpClient} from "@angular/common/http";

@Injectable()
export class ArticleService {
  private article: Article;

  constructor(private http: HttpClient) {
    this.article = {idArticle: 1, titre: 'La vrai vie', description: 'Album de Big Flo & Oli', prix: 14.99};
  }

  myData() {
    return this.article;
  }

  getAllArticle() {
    return this.http.get('http://localhost:8080/article/getAll').subscribe(data => {
      data;
    });
  }

}
