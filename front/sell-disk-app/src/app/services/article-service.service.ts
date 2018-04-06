import { Injectable } from '@angular/core';
import {Article} from "../models/article";

@Injectable()
export class ArticleService {
  private article: Article;

  constructor() {
    this.article.idArticle = 1;
    this.article.titre = 'La vrai vie';
    this.article.description = 'Album de Big Flo & Oli'
    this.article.prix = 14.99;
  }

  myData() {
    return this.article;
  }

}
