import { Component } from '@angular/core';

@Component({
  selector: 'app-evento1',
  imports: [],
  templateUrl: './evento1.html',
  styleUrl: './evento1.css'
})
export class Evento1 {
  titulo:string = "Data Binding - Eventos";
  cor:string = "red";

  contador:number = 0;

  contar() {
    this.contador++;
  }

  zerarContador(){
    this.contador = 0;
  }

}
