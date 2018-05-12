import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ArticleComponent} from "./article/article.component";
import {DetailArticleComponent} from "./detail-article/detail-article.component";

const routes: Routes = [
  { path: '', component: ArticleComponent},
  { path: 'article/:id', component: DetailArticleComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
