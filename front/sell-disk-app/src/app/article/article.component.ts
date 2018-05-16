import { Component, OnInit } from '@angular/core';
import {Article} from '../models/article';
import {HttpClient} from "@angular/common/http";
import {ArticleService} from "../services/article-service.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-article',
  templateUrl: './article.component.html',
  styleUrls: ['./article.component.css']
})
export class ArticleComponent implements OnInit {

  articles: Article[];

  constructor( private articleService: ArticleService,
               private router: Router) {
    this.articles = [];
  }

  ngOnInit() {
    this.articleService.getAllArticle().subscribe(data => {
      this.articles = data;
    });
  }

  goDetail(idArticle: number) {
    this.router.navigate(['article/' + idArticle]);
  }



}
