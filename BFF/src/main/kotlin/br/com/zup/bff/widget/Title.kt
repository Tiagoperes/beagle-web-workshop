package br.com.zup.bff.widget

import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.widget.Widget

@RegisterWidget
class Title(
    val icon: String,
    val title: String,
    val subtitle: String
) : Widget()
