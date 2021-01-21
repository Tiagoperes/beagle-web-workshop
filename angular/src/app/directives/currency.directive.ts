import { Directive, ElementRef, HostListener } from "@angular/core";

@Directive({
    selector: '[appCurrencyOnlyNumbers]'
})
export class CurrencyDirective {

    constructor(private el: ElementRef) { }

    @HostListener('keydown', ['$event']) public onKeyDown(event: KeyboardEvent): void {
        const key = event.keyCode || event.charCode || event.which;
        const isCtrl = event.ctrlKey;
        const isMeta = event.metaKey;
        const isShift = event.shiftKey;

        if (([46, 8, 9, 27, 13, 110, 188].indexOf(key) >= 0) ||
            (([65, 67, 86, 88].indexOf(key) >= 0) && (isCtrl || isMeta)) ||
            (key >= 35 && key <= 39)) {
            return;
        }

        if ((isShift || (key < 48 || key > 57)) && (key < 96 || key > 105)) {
            event.preventDefault();
        }
    }
}
