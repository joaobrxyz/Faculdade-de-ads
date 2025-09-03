import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { DuasVias } from './componentes/duas-vias/duas-vias';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, DuasVias],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('angular5');
}
