import { Component } from '@angular/core';
import { ReactiveFormsModule, FormGroup, Validator, FormBuilder, Validators } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-form-reativo',
  imports: [ReactiveFormsModule, CommonModule],
  templateUrl: './form-reativo.html',
  styleUrl: './form-reativo.css'
})
export class FormReativo {
  form:FormGroup;

  constructor (fb:FormBuilder) {
    this.form  = fb.group({ 
      nome: ['', [Validators.required, Validators.minLength(4)] ],
      email: ['', [Validators.required, Validators.email] ],
      idade: ['', [Validators.required, Validators.min(0)]]
     });
  }
}
