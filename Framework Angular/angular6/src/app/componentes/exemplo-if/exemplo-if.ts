import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-exemplo-if',
  imports: [CommonModule],
  templateUrl: './exemplo-if.html',
  styleUrl: './exemplo-if.css'
})
export class ExemploIf {
  titulo:string = "Exemplo Diretiva - IF";
  exibe:boolean = false;
  mostrarConteudo:boolean = false;
  trocarTexto:boolean = false;
}
