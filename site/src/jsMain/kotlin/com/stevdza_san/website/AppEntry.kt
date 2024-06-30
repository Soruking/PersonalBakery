package com.superduperboi.website

import androidx.compose.runtime.*
import com.superduperboi.website.util.Res
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.theme.colors.palette.button
import org.jetbrains.compose.web.css.*

@App
@Composable
fun MyApp(content: @Composable () -> Unit) {
    SilkApp {
        Surface(SmoothColorStyle.toModifier().minHeight(100.vh)) {
            content()
        }
    }
}

@InitSilk
fun overrideSilkTheme(context: InitSilkContext) {
    context.apply {
        theme.palettes.apply {
            light.apply {
                button.apply {
                    default = Res.Theme.MAIN.color
                    hover = Res.Theme.MAIN.color
                    pressed = Res.Theme.MAIN.color
                }
            }

            dark.apply {
                button.apply {
                    default = Res.Theme.LIGHT_CARD.color
                    hover = Res.Theme.LIGHT_CARD.color
                    pressed = Res.Theme.LIGHT_CARD.color
                }
            }
        }
    }
}