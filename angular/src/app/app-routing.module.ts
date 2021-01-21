import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AccountComponent } from './pages/account/account.component';
import { PaymentMethodsComponent } from './pages/payment-methods/payment-methods.component';
import { ProfileComponent } from './pages/profile/profile.component';
import { TransfersComponent } from './pages/transfers/transfers.component';

const routes: Routes = [
    {
        path: 'conta',
        component: AccountComponent 
    },
    {
        path: 'perfil',
        component: ProfileComponent 
    },
    {
        path: 'transferencias',
        component: TransfersComponent 
    },
    {
        path: 'meios-de-pagamento',
        component: PaymentMethodsComponent 
    },
    {
        path: '',   
        pathMatch: 'full',
        redirectTo: 'transferencias'
    }
];

@NgModule({
    imports: [
        RouterModule.forRoot(routes)
    ],
    exports: [RouterModule]
})
export class AppRoutingModule { }
