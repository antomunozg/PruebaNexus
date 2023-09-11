import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UsuariosService {

  private API_SERVER = "http://localhost:8080/"

  constructor(
    private httpClient: HttpClient
  ) { }

  
}
