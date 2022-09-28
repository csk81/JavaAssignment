import { Component, OnInit } from '@angular/core';
import { hero } from '../hero';

@Component({
  selector: 'app-for-each',
  templateUrl: './for-each.component.html',
  styleUrls: ['./for-each.component.css']
})
export class ForEachComponent implements OnInit {
heros = ['akarsh','thanush','kim jong un','osama bin laden'];
  data = [new hero(123,"sam"),
          new hero(234,'milton')];
constructor() { }

  ngOnInit(): void {
  }

}
