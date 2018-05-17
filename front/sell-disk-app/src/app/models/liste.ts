import {Article} from "./article";
import {Format} from "./format";
import {LigneArticle} from "./ligneArticle";

export class Liste {
  idListe?: number;
  date: Date;
  etat: number;
  total: number;
  ligneArticles: LigneArticle[];

  add(article: Format) {
    if(this.contains(article)) {

    } else {
      this.ligneArticles.push()
    }
  }

  contains(article: Format) {
    let ret = false;
    for(let item of this.ligneArticles) {
      if(item.article === article) {
        ret = true;
      }
    }
    return ret;
  }
}
