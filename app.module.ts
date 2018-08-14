import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {HttpClientModule} from '@angular/common/http';
import { ListitemsComponent } from './component/listitems/listitems.component';
import {ListformComponent} from './component/listform/listform.component';
import{RouterModule,Routes} from '@angular/router'; 
import{BillService} from './shared_service/bill.service'; 
import {HttpModule} from '@angular/http';

const appRoutes:Routes=[
  {path:"", component:ListitemsComponent},
  {path:"op", component:ListformComponent}
];
@NgModule({
  declarations: [
    AppComponent,
    ListitemsComponent,
    ListformComponent

  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    HttpModule,
    RouterModule.forRoot(appRoutes)
    

  ],
  providers: [BillService],
  bootstrap: [AppComponent]
})
export class AppModule { }
