import {Artiste} from "./artiste";
import {Format} from "./format";

export class Article {
  idArticle: number;
  titre: string;
  description: string;
  prix: number;
  jaquette: string;
  artiste: Artiste;
  formats: Format[];
}
