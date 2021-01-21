import { Component, Input } from '@angular/core';
import { Option } from '../interfaces/option.interface';

@Component({
    selector: 'app-select',
    templateUrl: './select.component.html',
    styleUrls: ['./select.component.scss']
})
export class SelectComponent {
    @Input() public options: Option[] = [];
    @Input() public value: Option = {} as Option;
    @Input() public onChange: (value: { value: any }) => void = (value: { value: any }) => {};

    public handleChange(e: any): void {
        console.log(e);
        this.onChange({ value: e.target.value });
    }
}
