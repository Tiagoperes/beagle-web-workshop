import { Component, Input, OnInit } from '@angular/core';

@Component({
    selector: 'app-material-input',
    templateUrl: './material-input.component.html',
    styleUrls: ['./material-input.component.scss']
})
export class MaterialInputComponent {
    @Input() public label: string = '';
    @Input() public value: string = '';
    @Input() public type: string = 'text';
    @Input() public placeholder: string = '';
    @Input() public onChange?: (event: { value: string }) => void
    @Input() public onBlur?: (event: { value: string }) => void
    @Input() public onFocus?: (event: { value: string }) => void

    handleChange(value: string) {
        console.log('changed', value)
        this.onChange && this.onChange({ value })
    }

    handleBlur(e: any) {
        this.onBlur &&  this.onBlur({ value: e.target.value })
    }

    handleFocus(e: any) {
        this.onFocus &&  this.onFocus({ value: e.target.value })
    }
}

