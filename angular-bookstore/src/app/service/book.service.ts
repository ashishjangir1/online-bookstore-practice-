import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Book } from '../common/book';

@Injectable({
  providedIn: 'root',
})
export class BookService {
  private baseUrl = 'http://localhost:8080/all';
  constructor(private httpClient: HttpClient) {}

  getBooks() {
    return this.httpClient.get(this.baseUrl).subscribe((response) => {
      console.log(response);
    });
  }
}
