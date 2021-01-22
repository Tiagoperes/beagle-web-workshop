import { CommonModule } from '@angular/common';
import { NgModule, Type } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { MatInputModule } from '@angular/material/input';
import { AppRoutingModule } from './app-routing.module';
import { MoneyInputComponent } from './components/money-input/money-input.component';
import { RadioGroupComponent } from './components/radio-group/radio-group.component';
import { SelectComponent } from './components/select/select.component';
import { TitleComponent } from './components/title/title.component';
import { MaterialInputComponent } from './components/material-input/material-input.component';
import { DirectivesModule } from './directives/directives.module';

const components: Type<any>[] = [
    TitleComponent,
    RadioGroupComponent,
    SelectComponent,
    MoneyInputComponent,
    MaterialInputComponent
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
        MatInputModule
    ]
})
export class BeagleComponentsModule { }
