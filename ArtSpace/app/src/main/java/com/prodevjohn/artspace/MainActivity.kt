package com.prodevjohn.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.prodevjohn.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                ArtSpaceApp()
            }
        }
    }
}

@Composable
fun ArtSpaceApp() {
    var currentArtwork by remember { mutableStateOf(1) }

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
        when (currentArtwork) {
            1 -> {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(16.dp)
                ) {
                    ArtSpaceScreen(
                        artworkDrawableResourceId = R.drawable.europeana_6c43fgrt0dw_unsplash,
                        titleResourceId = R.string.vase_of_flowers,
                        artistAndYearResourceId = R.string.jan_davidsz_de_heem
                    )

                    Row {
                        NavigationButton(
                            navigationResourceId = R.string.previous,
                            modifier = Modifier.weight(1f)
                        ) {
                            if (currentArtwork == 1) currentArtwork = 5 else currentArtwork--
                        }
                        Spacer(Modifier.width(15.dp))
                        NavigationButton(
                            navigationResourceId = R.string.next,
                            modifier = Modifier.weight(1f)
                        ) {
                            if (currentArtwork == 5) currentArtwork = 1 else currentArtwork++
                        }
                    }
                }
            }
            2 -> {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(16.dp)
                ) {
                    ArtSpaceScreen(
                        artworkDrawableResourceId = R.drawable.the_cannon,
                        titleResourceId = R.string.the_cannon_shot,
                        artistAndYearResourceId = R.string.rijksmuseum
                    )

                    Row {
                        NavigationButton(
                            navigationResourceId = R.string.previous,
                            modifier = Modifier.weight(1f)
                        ) {
                            if (currentArtwork == 1) currentArtwork = 5 else currentArtwork--
                        }
                        Spacer(Modifier.width(15.dp))
                        NavigationButton(
                            navigationResourceId = R.string.next,
                            modifier = Modifier.weight(1f)
                        ) {
                            if (currentArtwork == 5) currentArtwork = 1 else currentArtwork++
                        }
                    }
                }
            }
            3 -> {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(16.dp)
                ) {
                    ArtSpaceScreen(
                        artworkDrawableResourceId = R.drawable.the_river_severn,
                        titleResourceId = R.string.the_river_severn,
                        artistAndYearResourceId = R.string.paul_sandby
                    )

                    Row {
                        NavigationButton(
                            navigationResourceId = R.string.previous,
                            modifier = Modifier.weight(1f)
                        ) {
                            if (currentArtwork == 1) currentArtwork = 5 else currentArtwork--
                        }
                        Spacer(Modifier.width(15.dp))
                        NavigationButton(
                            navigationResourceId = R.string.next,
                            modifier = Modifier.weight(1f)
                        ) {
                            if (currentArtwork == 5) currentArtwork = 1 else currentArtwork++
                        }
                    }
                }
            }
            4 -> {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(16.dp)
                ) {
                    ArtSpaceScreen(
                        artworkDrawableResourceId = R.drawable.vera_gorbunova_rffcngfoypa_unsplash,
                        titleResourceId = R.string.water_color_paintings,
                        artistAndYearResourceId = R.string.vera_Gorbunova
                    )

                    Row {
                        NavigationButton(
                            navigationResourceId = R.string.previous,
                            modifier = Modifier.weight(1f)
                        ) {
                            if (currentArtwork == 1) currentArtwork = 5 else currentArtwork--
                        }
                        Spacer(Modifier.width(15.dp))
                        NavigationButton(
                            navigationResourceId = R.string.next,
                            modifier = Modifier.weight(1f)
                        ) {
                            if (currentArtwork == 5) currentArtwork = 1 else currentArtwork++
                        }
                    }
                }
            }
            5 -> {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(16.dp)
                ) {
                    ArtSpaceScreen(
                        artworkDrawableResourceId = R.drawable.naples,
                        titleResourceId = R.string.naples_from_sir_william_villa,
                        artistAndYearResourceId = R.string.john_warwick_smith
                    )

                    Row {
                        NavigationButton(
                            navigationResourceId = R.string.previous,
                            modifier = Modifier.weight(1f)
                        ) {
                            if (currentArtwork == 1) currentArtwork = 5 else currentArtwork--
                        }
                        Spacer(Modifier.width(15.dp))
                        NavigationButton(
                            navigationResourceId = R.string.next,
                            modifier = Modifier.weight(1f)
                        ) {
                            if (currentArtwork == 5) currentArtwork = 1 else currentArtwork++
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ArtSpaceScreen(
    artworkDrawableResourceId: Int,
    titleResourceId: Int,
    artistAndYearResourceId: Int,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ArtworkWall(artworkDrawableResourceId = artworkDrawableResourceId)
        Spacer(Modifier.height(20.dp))
        ArtworkDescriptor(
            titleResourceId = titleResourceId,
            artistAndYearResourceId = artistAndYearResourceId
        )
        Spacer(Modifier.height(20.dp))


    }
}

/**
 * The Artwork Image
 */
@Composable
fun ArtworkWall(@DrawableRes artworkDrawableResourceId: Int) {
    Image(
        painter = painterResource(artworkDrawableResourceId),
        contentDescription = null,
        modifier = Modifier
            .border(BorderStroke(2.dp, Color.Gray))
            .padding(30.dp)
    )
}

/**
 * Information about the artwork's title, artist and year of publication
 */
@Composable
fun ArtworkDescriptor(
    @StringRes titleResourceId: Int,
    @StringRes artistAndYearResourceId: Int,
    modifier: Modifier = Modifier
) {
    Card {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .wrapContentSize()
                .padding(10.dp)
        ) {
            Text(
                text = stringResource(titleResourceId),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Text(text = stringResource(artistAndYearResourceId))
        }
    }
}

/**
 * Will Display the next or previous artwork
 */
@Composable
fun NavigationButton(
    @StringRes navigationResourceId: Int,
    modifier: Modifier = Modifier,
    onButtonClick: () -> Unit
) {
    Button(onClick = onButtonClick, modifier = modifier.fillMaxWidth()) {
        Text(
            text = stringResource(navigationResourceId),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ArtSpaceAppPreview() {
    ArtSpaceTheme {
        ArtSpaceApp()
    }
}
