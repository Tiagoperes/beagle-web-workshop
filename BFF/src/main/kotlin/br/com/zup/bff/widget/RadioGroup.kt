package br.com.zup.bff.widget

import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.widget.Widget
import br.com.zup.beagle.widget.action.Action
import br.com.zup.bff.widget.model.Option

@RegisterWidget
class RadioGroup (
    val direction: RadioGroupDirection,
    val options: List<Option>,
    val value: Any,
    val onChange: List<Action>
) : Widget()

enum class RadioGroupDirection {
    VERTICAL,
    HORIZONTAL
}
