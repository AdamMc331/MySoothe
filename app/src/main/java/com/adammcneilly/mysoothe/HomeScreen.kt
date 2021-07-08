package com.adammcneilly.mysoothe

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Spa
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adammcneilly.mysoothe.ui.theme.MySootheTheme

@Composable
fun HomeScreen() {
    Scaffold(
        bottomBar = {
            BottomNavigation()
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(
                    Icons.Default.PlayArrow,
                    contentDescription = null,
                )
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        isFloatingActionButtonDocked = true,
    ) {
        HomeScreenContent(
            modifier = Modifier.padding(it)
        )
    }
}

@Composable
private fun HomeScreenContent(
    modifier: Modifier = Modifier,
) {
    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colors.background,
    ) {
        Column {
            Spacer(modifier = Modifier.height(16.dp))

            MySootheTextField(
                labelText = "Search",
                leadingIcon = Icons.Default.Search,
                modifier = Modifier.padding(horizontal = 16.dp),
            )

            FavoriteCollectionsSection()

            AlignYourBodySection()

            AlignYourMindSection()
        }
    }
}

@Composable
private fun BottomNavigation() {
    BottomAppBar(
        backgroundColor = MaterialTheme.colors.background,
    ) {
        BottomNavigationItem(
            selected = true,
            onClick = {},
            icon = {
                Icon(
                    Icons.Default.Spa,
                    contentDescription = null,
                )
            },
            label = {
                Text("HOME")
            }
        )

        BottomNavigationItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    Icons.Default.AccountCircle,
                    contentDescription = null,
                )
            },
            label = {
                Text("PROFILE")
            }
        )
    }
}

@Composable
private fun AlignYourBodySection() {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Text(
            "ALIGN YOUR BODY",
            modifier = Modifier
                .paddingFromBaseline(40.dp)
                .padding(horizontal = 16.dp),
            style = MaterialTheme.typography.h2,
        )

        CollectionRow(collections = alignYourBodyCollections)
    }
}

@Composable
private fun AlignYourMindSection() {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Text(
            "ALIGN YOUR MIND",
            modifier = Modifier
                .paddingFromBaseline(40.dp)
                .padding(horizontal = 16.dp),
            style = MaterialTheme.typography.h2,
        )

        CollectionRow(collections = alignYourMindCollections)
    }
}

@Composable
private fun FavoriteCollectionsSection() {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Text(
            "FAVORITE COLLECTIONS",
            modifier = Modifier
                .paddingFromBaseline(40.dp)
                .padding(horizontal = 16.dp),
            style = MaterialTheme.typography.h2,
        )

        FavoriteCollectionRow(collections = favoriteCollectionsOne)

        FavoriteCollectionRow(collections = favoriteCollectionsTwo)
    }
}

@Preview(
    name = "Night Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Preview(
    name = "Day Mode",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
)
@Composable
private fun HomeScreenPreview() {
    MySootheTheme {
        HomeScreen()
    }
}