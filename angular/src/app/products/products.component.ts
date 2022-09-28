import { Component, OnInit } from '@angular/core';
import { prod } from '../prod';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
products = []
data = [new prod("flower","100","assets/images/sunflr.jpg"),
        new prod("phone","20000","assets/images/phoneImg.jpg")    
  ];
  constructor() { }

  ngOnInit(): void {
  }

}
