package br.com.zup.bff.builder.custom

import br.com.zup.beagle.action.*
import br.com.zup.beagle.builder.core.cornerRadius
import br.com.zup.beagle.builder.widget.edgeValue
import br.com.zup.beagle.builder.widget.size
import br.com.zup.beagle.core.CornerRadius
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyFlex
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitPercent
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.widget.action.*
import br.com.zup.beagle.widget.context.ContextData
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.form.SimpleForm
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.layout.ScreenBuilder
import br.com.zup.beagle.widget.ui.*
import br.com.zup.bff.widget.Title
import javax.swing.Spring

object ScreenConfirmCustom : ScreenBuilder {
  private val title = Title(
    icon = "far fa-share-square",
    title = "Transferências: passo 2",
    subtitle = "Confirme a transferência")

  private val form = SimpleForm(
    context = ContextData(id = "password", value = ""),
    onSubmit = listOf(SendRequest(
      url = "https://demo9535405.mockable.io/transfer",
      data = mapOf(
        "name" to "@{global.transfer.name}",
        "document" to "@{global.transfer.document}",
        "bank" to "@{global.transfer.bank}",
        "branch" to "@{global.tranfer.branch}",
        "account" to "@{global.tranfer.account}",
        "value" to "@{global.tranfer.value}",
        "password" to "@{password}"
      ),
      method = RequestActionMethod.POST,
      onSuccess = listOf(Navigate.PushView(Route.Remote("/success-custom"))),
      onError = listOf(Alert(title = null, message = "@{onError.data.message}"))
    )),
    children = listOf(
      Text(
        text = "Aceito trasnferir a quantia de  @{global.transfer.value} para @{global.transfer.name} (@{global.transfer.document}).",
      ).applyStyle(
        Style(
          margin = edgeValue { bottom = 20.unitReal() }
        )
      ),
      Text(
        text = "O dinheiro será transferido para @{global.transfer.bank}, agência @{global.transfer.branch}, conta @{global.transfer.account}.",
      ).applyStyle(
        Style(
          margin = edgeValue { bottom = 20.unitReal() }
        )
      ),
      Text(
        text = "Para confirmar, por favor, digite sua senha e então clique em \"próximo\".",
      ).applyStyle(
        Style(
          margin = edgeValue { bottom = 20.unitReal() }
        )
      ),
      TextInput(
        placeholder = "Senha de 6 dígitos",
        type = TextInputType.PASSWORD,
        value = "@{password}",
        onChange = listOf(SetContext(contextId = "password", value = "@{onChange.value}"))
      ).applyStyle(
        Style(
          margin = edgeValue { bottom = 20.unitReal() }
        )
      ),
      Container(
        children = listOf(
          Button(
            text = "Voltar",
            onPress = listOf(Navigate.PopView())
          ),
          Button(
            text = "Próximo",
            onPress = listOf(submitForm { })
          )
        )
      ).applyFlex(
        Flex(
          flexDirection = FlexDirection.ROW,
          justifyContent = JustifyContent.SPACE_BETWEEN
        )
      )
    )
  )

  override fun build() = Screen(
    child = Container(
      children = listOf(
          title,
          form
        )
      ).applyFlex(
        Flex(
          flexDirection = FlexDirection.COLUMN
        )
      )
    )
}