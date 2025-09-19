import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FormReativo } from './componentes/form-reativo/form-reativo';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, FormReativo],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('angular9');
}
