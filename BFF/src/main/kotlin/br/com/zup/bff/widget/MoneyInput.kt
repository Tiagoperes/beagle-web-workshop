package br.com.zup.bff.widget

import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.widget.Widget
import br.com.zup.beagle.widget.action.Action

@RegisterWidget
class MoneyInput (
    val value: String,
    val onChange: List<Action>
) : Widget()