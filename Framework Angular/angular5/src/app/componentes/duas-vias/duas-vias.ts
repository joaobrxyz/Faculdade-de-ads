import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-duas-vias',
  imports: [FormsModule],
  templateUrl: './duas-vias.html',
  styleUrl: './duas-vias.css'
})
export class DuasVias {
  titulo:string = "Exemplo Duas Vias";

  cor:string = "yellow";

  notaPort:number = 0;
  notaExec:number = 0;
  notaProva:number = 0;
  media:number = 0;

  calcularMedia() {
    this.media = (this.notaPort * 0.3) + (this.notaExec * 0.2) + (this.notaProva * 0.5);
  }
}
