

import { Component } from '@angular/core';
import { HttpClientModule} from '@angular/common/http';
import {HttpClient} from '@angular/common/http';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})


export class AppComponent {
  

  name:string = '';
  found:boolean;

  age:number;
  

  constructor(private httpClient:HttpClient){  }
  onNameKeyUp(event:any){
    this.name = event.target.value;
    this.found = false;
  }
  getProfile(){
    this.httpClient.get(`http://localhost:8082/displayAllBills`)
    .subscribe(
      (data:any[]) => {
        if(data.length) {
            this.name = data[0];
          this.found = true;
          console.log(data);
        }
      }
    )
  }
}
