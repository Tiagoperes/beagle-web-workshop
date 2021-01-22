import { BeagleModule } from '@zup-it/beagle-angular';

@BeagleModule({
    baseUrl: 'http://localhost:8080/',
    module: {
        path: './beagle-components.module',
        name: 'BeagleComponentsModule',
    },
    components: {
        // place your custom components map here
    }
})
export class Beagle { }
