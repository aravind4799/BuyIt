import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserDetailsService } from '../services/user-details.service';
import { allUsers } from '../shared/user-details';


@Component({
  selector: 'app-user-activation',
  templateUrl: './user-activation.component.html',
  styleUrls: ['./user-activation.component.css']
})
export class UserActivationComponent implements OnInit {
  userList! : allUsers[];
  userData! : allUsers[];
  activated! : boolean;
  constructor(
    private detailService:UserDetailsService,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.detailService.getProducts().subscribe((data)=>{
      this.userList=data;
      this.userData=this.userList;
    })
  }

  handle_userid_activation=(userId: number)=>{
    console.log(userId)
    this.detailService.user_activation(userId).subscribe()
    confirm("Are you Sure?")
    window.location.reload();
  }

  handle_userid_deletion(userId: number){
    console.log(userId)
    this.detailService.user_deletion(userId).subscribe()
    confirm("Are you Sure?")
    window.location.reload();
  }
}
