import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Evento1 } from './componentes/evento1/evento1';
import { Evento2 } from './componentes/evento2/evento2';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Evento1, Evento2],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('angular4');
}
