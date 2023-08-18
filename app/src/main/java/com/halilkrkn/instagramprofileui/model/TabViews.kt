package com.halilkrkn.instagramprofileui.model

sealed class TabViews() {
    object Grid: TabViews()
    object Play: TabViews()
    object Collection: TabViews()
    object Wallpaper: TabViews()
}
