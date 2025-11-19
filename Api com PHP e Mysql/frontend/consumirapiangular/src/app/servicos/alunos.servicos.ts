import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Aluno } from '../modelo/aluno.model';

interface ApiRetorno {
  erro: boolean;
  mensagem: string;
  dados: Aluno[];
}

@Injectable({
  providedIn: 'root',
})
export class AlunosServicos {
  private readonly API_URL = 'http://localhost/2025API/ExemploApi/api/Alunos/';

  // Construtor da Classe
  // vai receber o HttpClient
  constructor(private http : HttpClient) {}
  
  // Metódo para chamar API para consultar todos os alunos
  listarTodos() : Observable<ApiRetorno> {
    return this.http.get<ApiRetorno>(this.API_URL);
  }

  // Método para chamar a API para Incluir aluno
  criar(aluno:Aluno) : Observable<ApiRetorno> {
    return this.http.post<ApiRetorno>(this.API_URL, aluno);
  }

   // Método para chamar a API para Alterar aluno
  atualizar(codigo:number, aluno:Aluno) : Observable<ApiRetorno> {
    return this.http.put<ApiRetorno>(`${this.API_URL}/${codigo}`, aluno);
  }

  // Método para chamar a API para Deletar aluno
  excluir(codigo:number) : Observable<ApiRetorno> {
    return this.http.delete<ApiRetorno>(`${this.API_URL}/${codigo}`);
  }
}
