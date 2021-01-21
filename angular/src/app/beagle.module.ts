import { BeagleModule } from '@zup-it/beagle-angular';
import { InputContainerComponent } from './components/input-container/input-container.component';
import { MoneyInputComponent } from './components/money-input/money-input.component';
import { RadioGroupComponent } from './components/radio-group/radio-group.component';
import { SelectComponent } from './components/select/select.component';
import { TitleComponent } from './components/title/title.component';

@BeagleModule({
    baseUrl: 'http://localhost:4200/assets/json',
    module: {
        path: './beagle-components.module',
        name: 'BeagleComponentsModule',
    },
    components: {
        'custom:title': TitleComponent,
        'custom:radio-group': RadioGroupComponent,
        'custom:select': SelectComponent,
        'custom:money-input': MoneyInputComponent,
        'custom:input-container': InputContainerComponent
    },
})
export class Beagle { }
