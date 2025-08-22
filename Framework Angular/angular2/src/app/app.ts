import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Comp1 } from './componentes/comp1/comp1';
import { Comp2 } from './componentes/comp2/comp2';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Comp1, Comp2],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('angular2');
}
