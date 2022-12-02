package com.prodevjohn.artspace

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.prodevjohn.artspace.ui.theme.ArtSpaceTheme
import org.junit.Rule
import org.junit.Test

class ArtSpaceUITests {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun next_artwork_display() {
        composeTestRule.setContent {
            ArtSpaceTheme {
                ArtSpaceApp()
            }
        }
        composeTestRule.onNodeWithText("Next").performClick()
        composeTestRule.onNodeWithText("The Cannon Shot").assertExists()
    }

    @Test
    fun previous_artwork_display() {
        composeTestRule.setContent {
            ArtSpaceTheme {
                ArtSpaceApp()
            }
        }
        composeTestRule.onNodeWithText("Previous").performClick()
        composeTestRule.onNodeWithText("John Warwick Smith (1780 – 1782)").assertExists()
    }
}
