package br.com.zup.bff.builder

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

object ScreenSuccess : ScreenBuilder {
  override fun build() = Screen(
    child = Container(
      children = listOf(
        Container(
          children = listOf(
            Image(
              path = ImagePath.Remote("https://i.ibb.co/xCqPw9w/transfer.gif"),
            ).applyStyle(
              Style(
                margin = EdgeValue(
                  right = 15.unitReal()
                )
              )
            ),
            Container(
              children = listOf(
                Text(
                  text = "Transferências: concluído",
                  textColor = "#0A2C46"
                ).applyStyle(
                  Style(
                    margin = EdgeValue(
                      right = 5.unitReal()
                    )
                  )
                ),
                Text(
                  text = "Transferência efetuada com sucesso",
                  textColor = "#212121"
                )
              )
            ).applyStyle(
              Style(
                margin = edgeValue { right = 5.unitReal() }
              )
            ),
            Container(

              children = listOf(
                Text(
                  text = "Transferência concluida! Obrigado por usar o Beagle Bank!",
                )
              )
            ).applyStyle(
              Style(
                size = size { height(3.unitReal()); width(100.unitPercent()) },
                backgroundColor = "#F1F3F5",
                cornerRadius = cornerRadius { radius = 3.0 },
                margin = edgeValue { vertical = 15.unitReal() }
              )
            )
          )
        ).applyFlex(
          Flex(
            flexDirection = FlexDirection.ROW,
            alignItems = AlignItems.CENTER
          )
        ),
        Container(
          children = listOf(
            Button(
              text = "Fazer outra transferência",
              onPress = listOf(Navigate.PushView(Route.Remote("/5-submit.json")))
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