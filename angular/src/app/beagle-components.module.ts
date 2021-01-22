import { CommonModule } from '@angular/common';
import { NgModule, Type } from '@angular/core';

const components: Type<any>[] = [
    // place your custom components here
];

@NgModule({
    declarations: components,
    entryComponents: components,
    exports: components,
    imports: [
        CommonModule
    ]
})
export class BeagleComponentsModule { }
