import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ProductosService } from './services/productos/productos.service'
import { UsuariosService } from './services/usuarios/usuarios.service'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  
  model: any;
  productoForm: FormGroup;
  title: any;
  productos: any;
  
  

  constructor(
    public fb: FormBuilder,
    public productosService: ProductosService,
    public usuariosService: UsuariosService
  ){

  }
  ngOnInit(): void {

    this.productoForm = this.fb.group({
      nombre :  ['', Validators.required],
      cantidad :  ['', Validators.required],
      fechaIngreso :  [Date.now],
      usuario :  [1],
    })

    this.productosService.getAllProductos().subscribe(resp=>{
        this.productos = resp;
        console.log(resp);
    },
      error => {console.error()}
    );
  }




  guardar(): void{
    this.productosService.saveProducto(this.productoForm.value).subscribe(resp=>{
      
    },
      error=> {console.error(error)}
    )
  }

  
 
}
