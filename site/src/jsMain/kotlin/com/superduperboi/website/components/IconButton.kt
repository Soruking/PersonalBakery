package com.superduperboi.website.components

import androidx.compose.runtime.Composable
import com.superduperboi.website.util.Res
import com.superduperboi.website.util.Res.Dimens.BORDER_RADIUS
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.CSSSizeValue
import org.jetbrains.compose.web.css.CSSUnit
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px

@Composable
fun IconButton(
    modifier: Modifier = Modifier,
    colorMode: ColorMode,
    link: String = "",
    icon: String,
    iconSize: CSSSizeValue<CSSUnit.px> = Res.Dimens.ICON_SIZE.px,
    onClick: (() -> Unit)? = null
) {
    Link(path = link) {
        Box(
            modifier = modifier
                .padding(all = 8.px)
                .borderRadius(r = BORDER_RADIUS.px)
                .cursor(Cursor.Pointer)
                .border(
                    width = 1.px,
                    style = LineStyle.Solid,
                    color = if (colorMode.isLight) Res.Theme.SOCIAL_ICON_BACKGROUND_LIGHT.color
                    else Res.Theme.SOCIAL_ICON_BACKGROUND_DARK.color
                )
                .onClick { onClick?.invoke() }
        ){
            Image(
                modifier = Modifier.size(iconSize),
                src = icon
            )
        }
    }
}

enum class SocialIcon(
    val icon: String,
    val link: String
) {
    Telegram(
        icon = Res.Icon.TELEGRAM,
        link = "https://t.me/bulochnaya34ru"
    ),
    TelegramLight(
        icon = Res.Icon.TELEGRAM_LIGHT,
        link = "https://t.me/bulochnaya34ru"
    ),
    Whatsapp(
        icon = Res.Icon.WHATSAPP,
        link = "https://api.whatsapp.com/send/?phone=%2B79053982161&text&type=phone_number&app_absent=0"
    ),
    WhatsappLight(
        icon = Res.Icon.WHATSAPP_LIGHT,
        link = "https://api.whatsapp.com/send/?phone=%2B79053982161&text&type=phone_number&app_absent=0"
    ),
    VK(
        icon = Res.Icon.VK,
        link = "https://vk.com/bulochnaya34"
    ),
    VKLight(
        icon = Res.Icon.VK_LIGHT,
        link = "https://vk.com/bulochnaya34"
    )
}