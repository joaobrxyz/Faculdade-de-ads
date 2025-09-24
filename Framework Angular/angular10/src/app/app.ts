import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FormCep } from './componentes/form-cep/form-cep';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, FormCep],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('angular10');
}
