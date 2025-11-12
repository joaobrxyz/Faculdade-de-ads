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
}
