import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ProductosService } from './services/productos/productos.service'
import { UsuariosService } from './services/usuarios/usuarios.service'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'mercancia-frontend';

  constructor(
    public fb: FormBuilder,
  ){

  }
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

 
}
