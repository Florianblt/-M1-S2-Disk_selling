import {Component, OnDestroy, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {ArticleService} from "../services/article-service.service";
import {Article} from "../models/article";
import {Format} from "../models/format";

@Component({
  selector: 'app-detail-article',
  templateUrl: './detail-article.component.html',
  styleUrls: ['./detail-article.component.css']
})
export class DetailArticleComponent implements OnInit, OnDestroy {

  id: number;
  article: Article;
  selectedFormat: Format
  private sub: any;

  constructor(private route: ActivatedRoute,
              private articleService: ArticleService) {
    this.selectedFormat = null;
  }

  ngOnInit() {
    this.sub = this.route.params.subscribe(params => {
      this.id = +params['id']; // (+) converts string 'id' to a number

      this.articleService.getArticle(this.id).subscribe(data => {
        this.article = data;
      });
    });
  }

  ngOnDestroy() {
    this.sub.unsubscribe();
  }

  selectThis(format: Format) {
    this.selectedFormat = format;
  }

  addToBasket(){

  }
}
