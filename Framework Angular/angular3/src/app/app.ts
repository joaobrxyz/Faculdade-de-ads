import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Web } from './componentes/web/web';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Web],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('angular3');
}
