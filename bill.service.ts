import { Injectable } from '@angular/core';
import {Http,Response,Headers,RequestOptions,} from '@angular/http';
import {Observable} from 'rxjs/observable';
import {Bill} from '../Bill';

import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BillService {
  private baseUrl:string ='http://localhost:8082/displayAllBills';
  private headers = new Headers({'Content.Type':'application/json'});
  private options = new RequestOptions({headers:this.headers});
  constructor(private _http:HttpClient) { }

  getItems(){
    return  this._http.get(`http://localhost:8082/displayAllBills`)
    .catch(this.errorHandler);

  }

   getItem(billName:String){
     return this._http.get(`http://localhost:8082/displayAllBills`).map((response:Response)=>response.json)
     .catch(this.errorHandler);
   }
  
  errorHandler(error:Response){

    return Observable.throw(error||"Server Error");
    
  }
  
}
