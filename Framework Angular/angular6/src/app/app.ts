import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ExemploIf } from './componentes/exemplo-if/exemplo-if';
import { ExemploFor } from './componentes/exemplo-for/exemplo-for';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, ExemploIf, ExemploFor],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('angular6');
}
