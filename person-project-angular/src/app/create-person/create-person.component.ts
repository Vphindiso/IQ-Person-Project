import { PersonService } from '../person.service';
import { Person } from '../person';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-person',
  templateUrl: './create-person.component.html',
  styleUrls: ['./create-person.component.css']
})
export class CreatePersonComponent implements OnInit {

  person: Person = new Person();
  submitted = false;

  constructor(private personService: PersonService, private router: Router) { }

  ngOnInit(): void {
  }

  newPerson(): void{
    this.submitted = false;
    this.person = new Person();
  }

  savePerson(){
    this.personService.savePersonDetails(this.person).subscribe(data => {
    console.log(data)
    this.person = new Person();
    this.gotoList();
    },
    error => console.log(error));
  }

  onSubmit(){
    this.submitted = true;
    this.savePerson();
  }

  gotoList(){
    this.router.navigate(['/people']);
  }
}
