package br.com.zup.bff.builder.custom

import br.com.zup.beagle.action.navigatePushView
import br.com.zup.beagle.builder.core.cornerRadius
import br.com.zup.beagle.builder.widget.edgeValue
import br.com.zup.beagle.builder.widget.size
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyFlex
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitPercent
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.widget.action.Navigate
import br.com.zup.beagle.widget.action.Route
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.layout.ScreenBuilder
import br.com.zup.beagle.widget.ui.*
import br.com.zup.bff.widget.Title

object ScreenSuccessCustom : ScreenBuilder {
  private val title = Title(
    icon = "far fa-share-square",
    title = "Transferências: passo 3",
    subtitle = "Transferência bem sucedida")

  private val content = Container(
    children = listOf(
      Text(
        text = "Transferência concluida! Obrigado por usar o Beagle Bank!",
      )
    )
  )

  override fun build() = Screen(
    child = Container(
      children = listOf(
        title,
        content,

        Container(
          children = listOf(
            Button(
              text = "Fazer outra transferência",
              onPress = listOf(Navigate.PushView(Route.Remote("/form-custom")))
            ),
            Button(
              text = "Imprimir comprovante"
            )
          )
        ).applyStyle(
          Style(
            margin = edgeValue { top = 20.unitReal() }
          )
        ).applyFlex(
          Flex(
            flexDirection = FlexDirection.ROW,
            justifyContent = JustifyContent.SPACE_BETWEEN
          )
        ),
      )
    )
  )
}