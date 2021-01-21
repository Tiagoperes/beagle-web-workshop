import { Component, Input } from '@angular/core';
import { Option } from '../interfaces/option.interface';

@Component({
    selector: 'app-radio-group',
    templateUrl: './radio-group.component.html',
    styleUrls: ['./radio-group.component.scss']
})
export class RadioGroupComponent {
    @Input() public groupName: string = '';
    @Input() public options: Option[] = [];
    @Input() public direction?: 'horizontal' | 'vertical' = 'horizontal';
    @Input() public value: Option = {} as Option;
    @Input() public onChange: (option: Option) => void = (option: Option) => {};
}
