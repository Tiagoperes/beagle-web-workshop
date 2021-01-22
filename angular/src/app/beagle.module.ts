import { BeagleModule } from '@zup-it/beagle-angular';
import { BeagleUIElement, Tree } from '@zup-it/beagle-web';
import { MoneyInputComponent } from './components/money-input/money-input.component';
import { RadioGroupComponent } from './components/radio-group/radio-group.component';
import { SelectComponent } from './components/select/select.component';
import { TitleComponent } from './components/title/title.component';
import { MaterialInputComponent } from './components/material-input/material-input.component';

@BeagleModule({
    baseUrl: 'http://localhost:8080/',
    module: {
        path: './beagle-components.module',
        name: 'BeagleComponentsModule',
    },
    components: {
        'custom:title': TitleComponent,
        'custom:radioGroup': RadioGroupComponent,
        'custom:select': SelectComponent,
        'custom:moneyInput': MoneyInputComponent,
        'custom:materialInput': MaterialInputComponent,
    },
    customOperations: {
        currency: (value) => 
            Intl.NumberFormat('pt-BR', {
                style: 'currency',
                currency: 'BRL',
            }).format(value)
    }
})
export class Beagle { }
