package com.halilkrkn.instagramprofileui.presantation

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.halilkrkn.instagramprofileui.R
import com.halilkrkn.instagramprofileui.model.ImageWithText
import com.halilkrkn.instagramprofileui.model.TabViews

enum class TabV() {
    GRID,
    PLAY,
    COLLECTION,
    WALLPAPER
}

@Preview(showBackground = true)
@Composable
fun ProfileScreen() {

    var selectedTabIndex: Any? by remember {
        mutableStateOf(0)
    }
    val highlights = listOf(
        ImageWithText(image = painterResource(id = R.drawable.halilkrkn), text = "Gezi"),
        ImageWithText(image = painterResource(id = R.drawable.halilkrkn), text = "Dünya"),
        ImageWithText(image = painterResource(id = R.drawable.halilkrkn), text = "Ev"),
        ImageWithText(image = painterResource(id = R.drawable.halilkrkn), text = "Hayat"),
        ImageWithText(image = painterResource(id = R.drawable.halilkrkn), text = "İş"),
        ImageWithText(image = painterResource(id = R.drawable.halilkrkn), text = "Kod"),
        ImageWithText(image = painterResource(id = R.drawable.halilkrkn), text = "Tatil")
    )

    val imageWithText = listOf(
        ImageWithText(image = painterResource(id = R.drawable.baseline_grid_on_24), text = "Grid"),
        ImageWithText(
            image = painterResource(id = R.drawable.baseline_local_play_24),
            text = "Play"
        ),
        ImageWithText(
            image = painterResource(id = R.drawable.baseline_collections_24),
            text = "Collection"
        ),
        ImageWithText(
            image = painterResource(id = R.drawable.baseline_wallpaper_24),
            text = "Wallpaper"
        ),
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        TopBar(name = "halilkrkn", modifier = Modifier)
        Spacer(modifier = Modifier.height(4.dp))
        ProfileSection()
        Spacer(modifier = Modifier.height(25.dp))
        ButtonSection(modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(25.dp))
        HighlightSection(
            highlights = highlights,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 19.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        PostTabView(
            imageWithText = imageWithText,
            onTabSelected = {
                selectedTabIndex = it
            }
        )
        when (selectedTabIndex) {
            0 -> PostSection(
                posts = listOf(
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                )
            )

            1 -> PostSection(
                posts = listOf(
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                ),
                aspectRatio = 0.5f
            )

            TabViews.Collection -> PostSection(
                posts = listOf(
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                ),
                aspectRatio = 0.5f
            )

            TabViews.Wallpaper -> PostSection(
                posts = listOf(
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                    painterResource(id = R.drawable.halilkrkn),
                ),
                aspectRatio = 0.5f
            )

            else -> {}
        }
    }
}

@Composable
fun TopBar(
    name: String? = null,
    modifier: Modifier,
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "back",
            tint = Color.Black,
            modifier = Modifier
                .clickable { }
                .size(24.dp)
        )

        Text(
            text = "$name",
            style = TextStyle(
                fontSize = MaterialTheme.typography.headlineMedium.fontSize,
                fontWeight = FontWeight.Bold,
            ),
            color = Color.Black,
            overflow = TextOverflow.Ellipsis
        )

        Icon(
            painter = painterResource(id = R.drawable.baseline_notifications_none_24),
            contentDescription = "Notification",
            tint = Color.Black,
            modifier = Modifier
                .clickable { }
                .size(24.dp)

        )
        Icon(
            imageVector = Icons.Default.MoreVert,
            contentDescription = "Menu",
            tint = Color.Black,
            modifier = Modifier
                .clickable { }
                .size(24.dp)
        )
    }
}


@Composable
fun ProfileSection(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp)
        ) {
            RoundImage(
                image = painterResource(id = R.drawable.halilkrkn),
                modifier = Modifier
                    .size(100.dp)
                    .weight(2f)
            )
            Spacer(modifier = Modifier.width(20.dp))
            StatSection(
                modifier = Modifier
                    .weight(5f)
                    .padding(start = 6.dp)
            )
        }
        ProfileDescription(
            displayName = "WhatScienceMan",
            description = "10 years of coding experience \n " +
                    "Want me to make your app? Send me an email! \n" +
                    "Subscribe to my Instagram Profile",
            url = "https://linkedin/halilkrkn",
            followedBy = listOf("codinginflow", "miakhalifa"),
            otherCount = 17
        )
    }
}

@Composable
fun RoundImage(
    image: Painter,
    modifier: Modifier = Modifier,
) {
    Image(
        painter = image,
        contentDescription = "Profile Image",
        modifier = modifier
            .aspectRatio(1f, matchHeightConstraintsFirst = true)
            .border(
                width = 1.dp,
                color = Color.LightGray,
                shape = CircleShape
            )

            .clip(CircleShape)
    )
}

@Composable
fun StatSection(
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = modifier
    ) {
        ProfileStat(numberText = "152", text = "Posts")
        ProfileStat(numberText = "152K", text = "Followers")
        ProfileStat(numberText = "77", text = "Following")
    }
}

@Composable
fun ProfileStat(
    numberText: String,
    text: String,
    modifier: Modifier = Modifier,
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Text(
            text = numberText,
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = text
        )
    }
}

@Composable
fun ProfileDescription(
    displayName: String,
    description: String,
    url: String,
    followedBy: List<String>,
    otherCount: Int,
) {
    val letterSpacing = 0.5.sp
    val lineHeight = 20.sp

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
            .padding(top = 12.dp)
    ) {
        Text(
            text = displayName,
            fontWeight = FontWeight.Bold,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight
        )
        Text(
            text = description,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight
        )
        Text(
            text = url,
            color = Color(0xFF3D3D91),
            letterSpacing = letterSpacing,
            lineHeight = lineHeight
        )
        if (followedBy.isNotEmpty()) {
            Text(
                text = buildAnnotatedString {
                    val boldStyle = SpanStyle(
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                    append("Followed by ")
                    followedBy.forEachIndexed { index, name ->
                        pushStyle(boldStyle)
                        append(name)
                        pop()
                        if (index < followedBy.size - 1) {
                            append(", ")
                        }
                    }
                    if (otherCount > 2) {
                        append(" and ")
                        pushStyle(boldStyle)
                        append("$otherCount others")
                    }
                },
                letterSpacing = letterSpacing,
                lineHeight = lineHeight
            )
        }
    }
}

@Composable
fun ButtonSection(
    modifier: Modifier = Modifier,
) {
    val minWidth = 95.dp
    val height = 40.dp

    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = modifier
    ) {
        ActionButton(
            text = "Following",
            icon = Icons.Default.KeyboardArrowDown,
            modifier = Modifier
                .defaultMinSize(minWidth = minWidth)
                .height(height)
        )
        ActionButton(
            text = "Message",
            modifier = Modifier
                .defaultMinSize(minWidth = minWidth)
                .height(height)
        )
        ActionButton(
            text = "Email",
            modifier = Modifier
                .defaultMinSize(minWidth = minWidth)
                .height(height)
        )
        ActionButton(
            icon = Icons.Default.KeyboardArrowDown,
            modifier = Modifier
                .height(height)
        )
    }
}


@Composable
fun ActionButton(
    modifier: Modifier = Modifier,
    text: String? = null,
    icon: ImageVector? = null,
) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .border(
                width = 1.dp,
                color = Color.LightGray,
                shape = RoundedCornerShape(7.dp)
            )
            .padding(6.dp)
    ) {
        if (text != null) {
            Text(
                text = text,
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp
            )
        }
        if (icon != null) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = Color.Black
            )
        }
    }
}

@Composable
fun HighlightSection(
    modifier: Modifier = Modifier,
    highlights: List<ImageWithText>,
) {
    LazyRow(modifier = modifier) {
        items(highlights.size) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(start = 11.dp, end = 15.dp)
            ) {
                RoundImage(
                    image = highlights[it].image,
                    modifier = Modifier.size(70.dp)
                )
                Text(
                    text = highlights[it].text,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
fun PostTabView(
    modifier: Modifier = Modifier,
    imageWithText: List<ImageWithText>,
    onTabSelected: (selectedIndex: Int) -> Unit,
) {
    var selectedTabIndex by remember {
        mutableStateOf(0)
    }
    val inactiveColor = Color(0xFF777777)

    TabRow(
        selectedTabIndex = selectedTabIndex,
        containerColor = Color.Transparent,
        contentColor = Color.Black,
        modifier = modifier
    ) {
        imageWithText.forEachIndexed { index, item ->
            Tab(
                selected = selectedTabIndex == index,
                selectedContentColor = Color.Black,
                unselectedContentColor = inactiveColor,
                onClick = {
                    selectedTabIndex = index
                    onTabSelected(index)
                }) {
                Icon(
                    painter = item.image,
                    contentDescription = item.text,
                    tint = if (selectedTabIndex == index) Color.Black else inactiveColor,
                    modifier = Modifier
                        .padding(10.dp)
                        .size(20.dp)
                )
            }
        }
    }
}

@Composable
fun PostSection(
    posts: List<Painter>,
    modifier: Modifier = Modifier,
    aspectRatio: Float = 1f,
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = modifier
            .scale(1.01f)
    ) {
        items(posts.size) {
            Image(
                painter = posts[it],
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .aspectRatio(aspectRatio)
                    .border(
                        width = 1.dp,
                        color = Color.White,
                    )
            )
        }
    }
}





































































































































