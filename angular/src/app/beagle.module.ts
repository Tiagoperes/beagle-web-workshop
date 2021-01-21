import { BeagleModule } from '@zup-it/beagle-angular';
import { MoneyInputComponent } from './components/money-input/money-input.component';
import { RadioGroupComponent } from './components/radio-group/radio-group.component';
import { SelectComponent } from './components/select/select.component';
import { TitleComponent } from './components/title/title.component';

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
        'custom:moneyInput': MoneyInputComponent
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
