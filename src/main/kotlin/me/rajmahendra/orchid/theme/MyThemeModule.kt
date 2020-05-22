package me.rajmahendra.orchid.theme

import com.eden.orchid.api.registration.OrchidModule
import com.eden.orchid.api.theme.Theme
import com.eden.orchid.utilities.addToSet

class MyThemeModule : OrchidModule() {

    override fun configure() {
        addToSet<Theme, MyTheme>()
    }
}
