import { Component, OnInit } from '@angular/core';
import {Article} from '../models/article';
import {HttpClient} from "@angular/common/http";
import {ArticleService} from "../services/article-service.service";

@Component({
  selector: 'app-article',
  templateUrl: './article.component.html',
  styleUrls: ['./article.component.css']
})
export class ArticleComponent implements OnInit {

  article: any;
  nbArticle: number;

  constructor( private articleService: ArticleService) {
    this.nbArticle = 0;

  }

  ngOnInit() {
    this.article = this.articleService.getAllArticle();
  }

  public addArticle(){
    this.nbArticle += 1;
  }

  public removeArticle() {
    if(this.nbArticle > 0) {
      this.nbArticle -= 1;
    }
  }

}
