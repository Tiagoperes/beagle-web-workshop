package br.com.zup.bff.builder.custom

import br.com.zup.beagle.action.setContext
import br.com.zup.beagle.action.submitForm
import br.com.zup.beagle.builder.widget.size
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyFlex
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitPercent
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.widget.action.Navigate
import br.com.zup.beagle.widget.action.Route
import br.com.zup.beagle.widget.action.SetContext
import br.com.zup.beagle.widget.context.ContextData
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.form.SimpleForm
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.layout.ScreenBuilder
import br.com.zup.beagle.widget.ui.*
import br.com.zup.bff.widget.*
import br.com.zup.bff.widget.MaterialInput
import br.com.zup.bff.widget.model.Option

data class FormData(
    val type: String = "F",
    val name: String = "",
    val document: String = "",
    val bank: String = "Itau",
    val branch: String = "",
    val account: String = "",
    val value: String = "",
)

object ScreenFormCustom : ScreenBuilder {
    private val title = Title(
        icon = "far fa-share-square",
        title = "Transferências: passo 1",
        subtitle = "Utilize o formulário abaixo para efetuar a transferência")

    private val form = SimpleForm(
        context = ContextData(id = "form", value = FormData()),
        onSubmit = listOf(Navigate.PushView(Route.Remote("/confirm-custom")), SetContext(contextId = "global", path = "transfer", value = "@{form}")),
        children = listOf(
            Text(
                text = "Tipo de pessoa:",
            ),
            RadioGroup(
                direction = RadioGroupDirection.HORIZONTAL,
                options = listOf(
                    Option(value = "F", label = "Física"),
                    Option(value = "J", label = "Jurídica")
                ),
                value = "@{form.type}",
                onChange = listOf(setContext { contextId = "form"; path = "type"; value = "@{onChange.value}" })
            ).applyStyle(
                Style(
                    margin = EdgeValue(bottom = (15.unitReal())),
                )
            ),

            MaterialInput(
                label = "Nome completo",
                placeholder = "Digite seu nome",
                value = "@{form.name}",
                onChange = listOf(setContext { contextId = "form"; path = "name"; value = "@{onChange.value}" })
            ).applyStyle(
                Style(
                    margin = EdgeValue(
                        bottom = 15.unitReal()
                    )
                )
            ),

            MaterialInput(
                label = "@{condition(eq('F', form.type), 'CPF:', 'CNPJ:')}",
                placeholder = "xxx.xxx.xxx-xx",
                value = "@{form.document}",
                onChange = listOf(setContext { contextId = "form"; path = "document"; value = "@{onChange.value}" })
            ).applyStyle(
                Style(
                    margin = EdgeValue(
                        bottom = 15.unitReal()
                    )
                )
            ),

            Text(
                text = "Banco:",
            ),
            Select(
                options = listOf(
                    Option(value = "Itaú", label = "Itaú"),
                    Option(value = "Beagle Bank", label = "Beagle Bank")
                ),
                value = "@{form.bank}",
                onChange = listOf(setContext { contextId = "form"; path = "bank"; value = "@{onChange.value}" })
            ).applyStyle(
                Style(
                    margin = EdgeValue(
                        bottom = 15.unitReal()
                    )
                )
            ),

            Container(
                children = listOf(
                    MaterialInput(
                        label = "Agência:",
                        placeholder = "Número da Agência",
                        value = "@{form.branch}",
                        onChange = listOf(setContext { contextId = "form"; path = "branch"; value = "@{onChange.value}" })
                    ).applyStyle(
                        Style(
                            size = size { width(48.unitPercent()) }
                        )
                    ),
                    MaterialInput(
                        label = "Conta:",
                        placeholder = "Número da Conta",
                        value = "@{form.account}",
                        onChange = listOf(setContext { contextId = "form"; path = "account"; value = "@{onChange.value}" })
                    ).applyStyle(
                        Style(
                            size = size { width(48.unitPercent()) }
                        )
                    )
                )
            ).applyFlex(
                Flex(
                    flexDirection = FlexDirection.ROW,
                    justifyContent = JustifyContent.SPACE_BETWEEN
                )
            ).applyStyle(
                Style(
                    margin = EdgeValue(
                        bottom = 15.unitReal()
                    )
                )
            ),

            Text(
                text = "Valor:",
            ),


            MoneyInput(
                value = "@{form.value}",
                onChange = listOf(setContext { contextId = "form"; path = "value"; value = "@{onChange.value}" })
            ).applyStyle(
                Style(
                    margin = EdgeValue(
                        bottom = 30.unitReal()
                    )
                )
            ),

            Container(
                children = listOf(
                    Button(
                        text = "Cancelar"
                    ),
                    Button(
                        text = "Próximo",
                        onPress = listOf(submitForm { })
                    ),
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
                form,
            ),
        ).applyFlex(
            Flex(
                flexDirection = FlexDirection.COLUMN
            )
        )
    )
}