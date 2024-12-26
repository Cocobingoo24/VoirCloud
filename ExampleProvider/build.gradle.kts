dependencies {
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.recyclerview:recyclerview:1.2.1")
}
// use an integer for version numbers
version = 0


cloudstream {
    // All of these properties are optional, you can safely remove them

    description = "Plugin pour voirAnime"
    authors = listOf("Ccbingo24")

    /**
    * Status int as the following:
    * 0: Down
    * 1: Ok
    * 2: Slow
    * 3: Beta only
    * */
    status = 3

    tvTypes = listOf("Anime")

    requiresResources = true
    language = "fr"

    // random cc logo i found
    iconUrl = "https://static.gameloop.com/img/32abfe027f30de7fb1f866e09c8a759a.png?imageMogr2/thumbnail/172.8x172.8/format/webp"
}

android {
    buildFeatures {
        viewBinding = true
    }
}
