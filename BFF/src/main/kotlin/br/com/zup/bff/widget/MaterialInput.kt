package br.com.zup.bff.widget

import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.widget.Widget
import br.com.zup.beagle.widget.action.Action

@RegisterWidget
class MaterialInput (
    val value: String,
    val label: String? = null,
    val type: String? = null,
    val placeholder: String? = null,
    val onChange: List<Action>? = null,
    val onFocus: List<Action>? = null,
    val onBlur: List<Action>? = null
) : Widget()