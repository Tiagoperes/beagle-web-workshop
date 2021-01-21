package br.com.zup.bff.widget

import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.widget.Widget
import br.com.zup.beagle.widget.action.Action
import br.com.zup.bff.widget.model.Option

@RegisterWidget
class Select (
    val options: List<Option>,
    val value: String,
    val onChange: List<Action>
) : Widget()

