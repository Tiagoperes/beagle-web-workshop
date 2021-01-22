import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AccountComponent } from './pages/account/account.component';
import { ProfileComponent } from './pages/profile/profile.component';
import { TransfersComponent } from './pages/transfers/transfers.component';
import { PaymentMethodsComponent } from './pages/payment-methods/payment-methods.component';
import { CommonModule } from '@angular/common';

@NgModule({
    declarations: [
        AppComponent,
        AccountComponent,
        ProfileComponent,
        TransfersComponent,
        PaymentMethodsComponent
    ],
    imports: [
        CommonModule,
        BrowserModule,
        AppRoutingModule
    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule { }
