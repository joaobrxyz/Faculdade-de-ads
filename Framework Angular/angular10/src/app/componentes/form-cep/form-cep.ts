import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Correio } from '../../servicos/correio';

@Component({
  selector: 'app-form-cep',
  imports: [FormsModule],
  templateUrl: './form-cep.html',
  styleUrl: './form-cep.css'
})
export class FormCep {
  cep:string = '';
  endereco:any = {};

  constructor(private cepServico:Correio) {}

  buscar() {
    if (this.cep.length === 8) {
      this.cepServico.buscarCep(this.cep).subscribe({
        next:(resposta) => {
          if (resposta.erro) {
            alert("Cep não encontrado.");
          } else {
            this.endereco = resposta;
          }
        },
        error: (error) => {alert(error); }
      });
    }
  }
}
