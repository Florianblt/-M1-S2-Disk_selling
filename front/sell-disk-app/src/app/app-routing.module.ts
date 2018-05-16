import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ArticleComponent} from "./article/article.component";
import {DetailArticleComponent} from "./detail-article/detail-article.component";
import {ProfilComponent} from "./profil/profil.component";

const routes: Routes = [
  { path: '', component: ArticleComponent},
  { path: 'article/:id', component: DetailArticleComponent},
  { path: 'profil', component: ProfilComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
