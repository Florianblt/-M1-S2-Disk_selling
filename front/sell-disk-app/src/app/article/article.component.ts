import { Component, OnInit } from '@angular/core';
import {Article} from '../models/article';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-article',
  templateUrl: './article.component.html',
  styleUrls: ['./article.component.css']
})
export class ArticleComponent implements OnInit {

  article: any;

  constructor(private http: HttpClient) {

  }

  ngOnInit() {
    this.http.get('http://localhost:8080/article/get/1').subscribe(data => {
      this.article = data;
    });
  }

}
