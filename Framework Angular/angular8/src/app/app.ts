import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FormModelo } from './componentes/form-modelo/form-modelo';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, FormModelo],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('angular8');
}
