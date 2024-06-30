package com.superduperboi.website.util

import com.varabyte.kobweb.compose.ui.graphics.Color

object Res {
    enum class Theme(val color: Color) {
        MAIN(color = Color.rgb(r = 255, g = 186, b = 115)),
        LIGHT_CARD(color = Color.rgb(r = 255, g = 186, b = 115)),
        DARK_CARD(color = Color.rgb(r = 191, g = 120, b = 48)),
        SOCIAL_ICON_BACKGROUND_LIGHT(color = Color.rgb(r = 255, g = 186, b = 115)),
        SOCIAL_ICON_BACKGROUND_DARK(color = Color.rgb(r = 255, g = 129, b = 0)),
        GRADIENT_ONE(color = Color.rgb(r = 255, g = 246, b = 237)),
        GRADIENT_TWO(color = Color.rgb(r = 255, g = 207, b = 115)),
        GRADIENT_ONE_DARK(color = Color.rgb(r = 255, g = 129, b = 0)),
        GRADIENT_TWO_DARK(color = Color.rgb(r = 166, g = 84, b = 0)),

    }

    object Icon {
        const val TELEGRAM = "telegram.svg"
        const val TELEGRAM_LIGHT = "telegram_light.svg"
        const val WHATSAPP = "whatsapp.svg"
        const val WHATSAPP_LIGHT = "whatsapp_light.svg"
        const val VK = "vk.svg"
        const val VK_LIGHT = "vk_light.svg"
        const val SUN = "sun.svg"
        const val MOON = "moon.svg"
    }

    object Image {
        const val PROFILE_PHOTO = "https://optim.tildacdn.com/tild3132-6533-4339-b832-663061633463/-/format/webp/IMG_6141.JPG"
    }

    object String {
        const val NAME = "БУЛОЧНАЯ"
        const val PROFESSION = "кондитерская"
        const val ABOUT_ME =
            "Вас приветствует кафе-кондитерская «Булочная», где уже более 10 лет каждый день становится вкуснее! Откройте для себя мир из более чем 150 видов лакомств — от тортов и десертов до горячих завтраков. Всё приготовлено с душой и из лучших натуральных ингредиентов. Переходите в меню и выбирайте своё любимое угощение сейчас!"
        const val BUTTON_TEXT = "Наше меню"
        const val ROBOTO_CONDENSED = "RobotoCondensedBold"
        const val ROBOTO_REGULAR = "RobotoRegular"
        const val MY_MENU = "https://bulochnaya34.ru/menu"
        const val SAVED_THEME = "theme"
    }

    object Dimens {
        const val BORDER_RADIUS = 8
        const val MAX_CARD_WIDTH = 1000
        const val MAX_CARD_HEIGHT = 600
        const val ICON_SIZE = 24
        const val ICON_SIZE_LG = 32
    }
}