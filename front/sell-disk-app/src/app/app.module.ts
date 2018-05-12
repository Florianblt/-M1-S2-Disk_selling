import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import {AppRoutingModule} from "./app-routing.module";

import { AppComponent } from './app.component';

import {ArticleComponent} from "./article/article.component";
import {HttpClientModule} from "@angular/common/http";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {MaterialModule} from "./material.module";
import {ArticleService} from "./services/article-service.service";
import {DetailArticleComponent} from "./detail-article/detail-article.component";
import {ConnexionDialogComponent} from "./connexion-dialog/connexion-dialog.component";


@NgModule({
  declarations: [
    AppComponent,
    ArticleComponent,
    DetailArticleComponent,
    ConnexionDialogComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MaterialModule,
  ],
  entryComponents: [
    ConnexionDialogComponent,
  ],
  providers: [
    ArticleService,
  ],
  bootstrap: [
    AppComponent
  ]
})
export class AppModule { }
