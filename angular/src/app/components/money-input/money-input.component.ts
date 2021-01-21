import { Component, Input } from '@angular/core';

@Component({
    selector: 'app-money-input',
    templateUrl: './money-input.component.html',
    styleUrls: ['./money-input.component.scss']
})
export class MoneyInputComponent {
    public valueModel: string = '';

    @Input() public onChange: (params: { value: number }) => void = (params: { value: number }) => {};

    @Input() public set value(value: number) {
        this.valueModel = value ? value.toLocaleString('pt-BR', { useGrouping: false }) : '0';
    }

    public get value(): number {
        try {
            return Number(this.valueModel);
        } catch (error) {
            console.log(error);
            return 0;
        }
    }

    public onInputChange(): void {
        this.onChange({ value: this.value });
    }
}
