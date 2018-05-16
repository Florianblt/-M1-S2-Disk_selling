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
import {FormsModule} from "@angular/forms";
import {ClientService} from "./services/client.service";
import {LocalStorageService} from "./services/local-storage.service";
import {ProfilComponent} from "./profil/profil.component";


@NgModule({
  declarations: [
    AppComponent,
    ArticleComponent,
    DetailArticleComponent,
    ConnexionDialogComponent,
    ProfilComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MaterialModule,
    FormsModule
  ],
  entryComponents: [
    ConnexionDialogComponent,
  ],
  providers: [
    ArticleService,
    ClientService,
    LocalStorageService
  ],
  bootstrap: [
    AppComponent
  ]
})
export class AppModule { }
