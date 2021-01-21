import { Component, Input, OnInit } from '@angular/core';

@Component({
    selector: 'app-title',
    templateUrl: './title.component.html',
    styleUrls: ['./title.component.scss']
})
export class TitleComponent {
    @Input() public icon: string = '';
    @Input() public title: string = '';
    @Input() public subtitle: string = '';
}

