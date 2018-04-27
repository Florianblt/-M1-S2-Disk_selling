import { Injectable } from '@angular/core';
import {Article} from "../models/article";

@Injectable()
export class ArticleService {
  private article: Article;

  constructor() {
    this.article = {idArticle: 1, titre: 'La vrai vie', description: 'Album de Big Flo & Oli', prix: 14.99};
  }

  myData() {
    return this.article;
  }

}
