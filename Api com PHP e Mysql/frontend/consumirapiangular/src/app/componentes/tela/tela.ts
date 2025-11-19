import { Component } from '@angular/core';
import { AlunosServicos } from '../../servicos/alunos.servicos';
import { Aluno } from '../../modelo/aluno.model';
import { CommonModule } from '@angular/common';
import { tick } from '@angular/core/testing';
import { FormGroup, ReactiveFormsModule, FormBuilder, Validator, Validators } from '@angular/forms';

@Component({
  selector: 'app-tela',
  imports: [CommonModule, ReactiveFormsModule],
  templateUrl: './tela.html',
  styleUrl: './tela.css',
})
export class Tela {
  mensagem : string = '';
  erro : boolean = false;
  listaAlunos : Aluno[] = [];

  form : FormGroup;

  constructor(private alunoService : AlunosServicos, private fb : FormBuilder) {
    this.form = this.fb.group({
      codigo : [0],
      nome : ['', Validators.required],
      email : ['', Validators.required],
      telefone : ['', Validators.required]
    });
  }

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

  carregarAlunosFormulario(aluno : any) {
    this.form.patchValue({
      codigo: aluno.codigo,
      nome: aluno.nome,
      email: aluno.email,
      telefone: aluno.telefone
    });
  }

  salvar() {
    if (this.form.valid) {
      this.alunoService.criar(this.form.value).subscribe({
        next : (resposta) => {
          this.erro = resposta?.erro || true;
          this.mensagem = resposta?.mensagem || 'Erro na API';
          if (!resposta.erro) {
            this.form.reset;
            this.form.patchValue({c0digo : 0});
            this.buscarTodosAlunos();
          }
        },
        error : (resposta) => {
          this.erro = resposta?.erro || true;
          this.mensagem = resposta?.mensagem || 'Erro na API';
        }
      });
    } else {
      this.mensagem = 'Preencha todos os campos';
      this.erro = true;
    }
  }

  alterarDados() {
    if (this.form.valid) {
      this.alunoService.atualizar(this.form.value.codigo, this.form.value).subscribe({
        next : (resposta) => {
          this.erro = resposta?.erro || true;
          this.mensagem = resposta?.mensagem || 'Erro na API';
          if (!resposta.erro) {
            this.form.reset;
            this.form.patchValue({c0digo : 0});
            this.buscarTodosAlunos();
          }
        },
        error : (resposta) => {
          this.erro = resposta?.erro || true;
          this.mensagem = resposta?.mensagem || 'Erro na API';
        }
      });
    } else {
      this.mensagem = 'Preencha todos os campos';
      this.erro = true;
    }
  }

  excluirDados() {
    if (this.form.value.codigo > 0) {
      this.alunoService.excluir(this.form.value.codigo).subscribe({
        next : (resposta) => {
          this.erro = resposta?.erro || true;
          this.mensagem = resposta?.mensagem || 'Erro na API';
          if (!resposta.erro) {
            this.form.reset;
            this.form.patchValue({c0digo : 0});
            this.buscarTodosAlunos();
          }
        },
        error : (resposta) => {
          this.erro = resposta?.erro || true;
          this.mensagem = resposta?.mensagem || 'Erro na API';
        }
      });
    } else {
      this.mensagem = 'Preencha um código de aluno válido';
      this.erro = true;
    }
  }

}
