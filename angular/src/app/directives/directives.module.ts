import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CurrencyDirective } from './currency.directive';

@NgModule({
    declarations: [CurrencyDirective],
    exports: [CurrencyDirective],
    imports: [
        CommonModule
    ]
})
export class DirectivesModule { }
