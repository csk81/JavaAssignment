import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MyComponent } from './MyComponent';
import { ForEachComponent } from './for-each/for-each.component';
import { ImgComponent } from './img/img.component';
import { FormsModule } from '@angular/forms';
import { IfExampleComponent } from './if-example/if-example.component';
import { CustomDirective } from './CustomDirective';
import { ProductsComponent } from './products/products.component';
@NgModule({
  declarations: [
    AppComponent,CustomDirective,MyComponent, ForEachComponent, ImgComponent, IfExampleComponent, ProductsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
