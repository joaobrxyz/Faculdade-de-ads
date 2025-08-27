import { Component } from '@angular/core';

@Component({
  selector: 'app-web',
  imports: [],
  templateUrl: './web.html',
  styleUrl: './web.css'
})
export class Web {
  nome: string = "João";

  vermelho:string = "#ff0000";
  corFundo:string = "background-color: #99adffff"
  
  urlImagem:string = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/10/Palmeiras_logo.svg/800px-Palmeiras_logo.svg.png";
  tamanhoImagem:string = "400";

  naoAdm:boolean = false;
}
