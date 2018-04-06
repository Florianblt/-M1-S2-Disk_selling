import { Component, OnInit } from '@angular/core';
import {Article} from '../models/article';

@Component({
  selector: 'app-article',
  templateUrl: './article.component.html',
  styleUrls: ['./article.component.css']
})
export class ArticleComponent implements OnInit {

  article: Article;

  constructor() {

  }

  ngOnInit() {
    this.article = {
      idArticle: 1,
      titre: 'La vrai vie',
      description: 'Album de Big Flo & Oli',
      prix: 14.99
    }
  }

}
