import { Component } from '@angular/core';

@Component({
  selector: 'app-evento2',
  imports: [],
  templateUrl: './evento2.html',
  styleUrl: './evento2.css'
})
export class Evento2 {
  corTexto:string = "red";

  mudarCor(novaCor:string) {
    this.corTexto = novaCor;
  }
}
