import { Component } from '@angular/core';
import { AlunosServicos } from '../../servicos/alunos.servicos';
import { Aluno } from '../../modelo/aluno.model';
import { CommonModule } from '@angular/common';
import { tick } from '@angular/core/testing';

@Component({
  selector: 'app-tela',
  imports: [CommonModule],
  templateUrl: './tela.html',
  styleUrl: './tela.css',
})
export class Tela {
  mensagem : string = '';
  erro : boolean = false;
  listaAlunos : Aluno[] = [];

  constructor(private alunoService : AlunosServicos) {}

  // Evento para quando a página for carregada
  ngOnInit() {
    this.buscarTodosAlunos();
  }

  // Método
  buscarTodosAlunos(){
    this.alunoService.listarTodos().subscribe({
      next: (resposta) => {
        this.listaAlunos = resposta.dados;
      },
      error : (resposta) => {
        this.erro = resposta?.erro || true;
        this.mensagem = resposta?.mensagem || 'Erro ao acessar a API';
      }
    });
  }

}
