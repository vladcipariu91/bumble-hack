package com.bumble.hack

import android.os.Bundle
import androidx.activity.compose.setContent
import com.bumble.appyx.core.integration.NodeHost
import com.bumble.appyx.core.integrationpoint.NodeActivity
import com.bumble.hack.root.RootNode
import com.bumble.hack.ui.theme.BumbleHackTheme

class MainActivity : NodeActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BumbleHackTheme {
                NodeHost(integrationPoint = integrationPoint) {
                    RootNode(buildContext = it)
                }
            }
        }
    }
}
