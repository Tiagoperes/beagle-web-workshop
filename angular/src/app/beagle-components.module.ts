import { CommonModule } from '@angular/common';
import { NgModule, Type } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { InputContainerComponent } from './components/input-container/input-container.component';
import { MoneyInputComponent } from './components/money-input/money-input.component';
import { RadioGroupComponent } from './components/radio-group/radio-group.component';
import { SelectComponent } from './components/select/select.component';
import { TitleComponent } from './components/title/title.component';
import { DirectivesModule } from './directives/directives.module';

const components: (any[] | Type<any>)[] = [
    TitleComponent,
    RadioGroupComponent,
    SelectComponent,
    MoneyInputComponent,
    InputContainerComponent
];

@NgModule({
    declarations: components,
    entryComponents: components,
    exports: components,
    imports: [
        CommonModule,
        BrowserModule,
        AppRoutingModule,
        FormsModule,
        ReactiveFormsModule,
        DirectivesModule,
    ]
})
export class BeagleComponentsModule { }
