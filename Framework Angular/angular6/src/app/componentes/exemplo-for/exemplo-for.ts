import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-exemplo-for',
  imports: [CommonModule],
  templateUrl: './exemplo-for.html',
  styleUrl: './exemplo-for.css'
})
export class ExemploFor {
  titulo:string = "Exemplo Diretiva - FOR";
  lista:string[] = ['PHP', 'Angular', 'Java', 'C#', 'TypeScript'];
}
