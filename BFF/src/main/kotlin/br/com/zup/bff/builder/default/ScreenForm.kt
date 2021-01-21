package br.com.zup.bff.builder.default

import br.com.zup.beagle.action.setContext
import br.com.zup.beagle.action.submitForm
import br.com.zup.beagle.builder.core.cornerRadius
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

data class FormData(
    val type: String = "",
    val name: String = "",
    val document: String = "",
    val bank: String = "",
    val branch: String = "",
    val account: String = "",
    val value: String = "",
)

object ScreenForm : ScreenBuilder {
    private val title = Container(
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
                        text = "Transferências: passo 1",
                        textColor = "#0A2C46"
                    ).applyStyle(
                        Style(
                            margin = EdgeValue(
                                right = 5.unitReal()
                            )
                        )
                    ),
                    Text(
                        text = "Utilize o formulário abaixo para efetuar a transferência",
                        textColor = "#212121"
                    )
                )
            )
        )
    ).applyFlex(
        Flex(
            flexDirection = FlexDirection.ROW,
            alignItems = AlignItems.CENTER
        )
    )

    private val separator = Container(children = listOf())
        .applyStyle(
            Style(
                size = size { width(100.unitPercent()); height(3.unitReal()) },
                backgroundColor = "#F1F3F5",
                cornerRadius = cornerRadius { radius = 3.0 },
                margin = EdgeValue(
                    vertical = 15.unitReal(),
                )
            )
        )

    private val form = SimpleForm(
        context = ContextData(id = "form", value = FormData()),
        onSubmit = listOf(Navigate.PushView(Route.Remote("/confirm")), SetContext(contextId = "global", path = "transfer", value = "@{form}")),
        children = listOf(
            Text(
                text = "Tipo de pessoa:",
            ),
            TextInput(
                placeholder = "física/jurídica",
                value = "@{form.type}",
                onChange = listOf(setContext { contextId = "form"; path = "type"; value = "@{onChange.value}" }),

                ).applyStyle(
                Style(
                    margin = EdgeValue(bottom = (15.unitReal())),
                )
            ),
            Text(
                text = "Nome completo:",
            ),
            TextInput(
                placeholder = "",
                value = "@{form.name}",
                onChange = listOf(setContext { contextId = "form"; path = "name"; value = "@{onChange.value}" })
            ).applyStyle(
                Style(
                    margin = EdgeValue(
                        bottom = 15.unitReal()
                    )
                )
            ),
            Text(
                text = "CPF:",
            ),
            TextInput(
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
            TextInput(
                placeholder = "Código do banco ou nome",
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
                    Container(
                        children = listOf(
                            Text(
                                text = "Agência:",
                            ),
                            TextInput(
                                placeholder = "Número da Agência",
                                value = "@{form.branch}",
                                onChange = listOf(setContext { contextId = "form"; path = "branch"; value = "@{onChange.value}" })
                            )
                        )
                    ).applyStyle(
                        Style(
                            size = size { width(48.unitPercent()) }
                        )
                    ),
                    Container(
                        children = listOf(
                            Text(
                                text = "Conta:",
                            ),
                            TextInput(
                                placeholder = "Número da Conta",
                                value = "@{form.account}",
                                onChange = listOf(setContext { contextId = "form"; path = "account"; value = "@{onChange.value}" })
                            ),
                        )
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
            TextInput(
                placeholder = "Valor em reais",
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
                separator,
                form,
            ),
        ).applyFlex(
            Flex(
                flexDirection = FlexDirection.COLUMN
            )
        )
    )
}