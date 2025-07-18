package com.example.laboratorio9.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember
import com.example.laboratorio9.util.CompactDimens
import com.example.laboratorio9.util.Dimens

/**
 * @author Hazrat Ummar Shaikh
 */


@Composable
fun AppUtils(
    appDimens: Dimens,
    content:@Composable () -> Unit
) {
    val appDimens = remember {
        appDimens
    }
    CompositionLocalProvider(LocalAppDimens provides appDimens) {
        content()
    }

}


val LocalAppDimens = compositionLocalOf {
    CompactDimens
}