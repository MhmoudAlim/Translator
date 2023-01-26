/**
 * @author Mahmoud Alim on 26/01/2023.
 */
object Deps {

    // COMPOSE
    private const val activityComposeVersion = "1.6.1"
    const val activityCompose = "androidx.activity:activity-compose:${Deps.activityComposeVersion}"

    const val composeVersion = "1.4.0-alpha02"
    const val composeUi = "androidx.compose.ui:ui:${Deps.composeVersion}"
    const val composeUiTooling = "androidx.compose.ui:ui-tooling:${Deps.composeVersion}"
    const val composeUiToolingPreview = "androidx.compose.ui:ui-tooling-preview:${Deps.composeVersion}"
    const val composeFoundation = "androidx.compose.foundation:foundation:${Deps.composeVersion}"
    const val composeMaterial = "androidx.compose.material:material:${Deps.composeVersion}"
    const val composeIconsExtended = "androidx.compose.material:material-icons-extended:${Deps.composeVersion}"

    private const val composeNavigationVersion = "2.5.3"
    const val composeNavigation = "androidx.navigation:navigation-compose:${Deps.composeNavigationVersion}"

    // COIL
    private const val coilComposeVersion = "2.1.0"
    const val coilCompose = "io.coil-kt:coil-compose:${Deps.coilComposeVersion}"

    // KOTLIN DATE TIME
    private const val dateTimeVersion = "0.4.0"
    const val kotlinDateTime = "org.jetbrains.kotlinx:kotlinx-datetime:${Deps.dateTimeVersion}"

    // HILT
    private const val hiltVersion = "2.42"
    const val hiltAndroid = "com.google.dagger:hilt-android:${Deps.hiltVersion}"
    const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:${Deps.hiltVersion}"
    const val hiltGradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:${Deps.hiltVersion}"


    private const val hiltCompilerVersion = "1.0.0"
    const val hiltCompiler = "androidx.hilt:hilt-compiler:${Deps.hiltCompilerVersion}"
    const val hiltNavigationCompose = "androidx.hilt:hilt-navigation-compose:${Deps.hiltCompilerVersion}"

    // KTOR
    private const val ktorVersion = "2.1.3"
    const val ktorCore = "io.ktor:ktor-client-core:${Deps.ktorVersion}"
    const val ktorSerializationJson = "io.ktor:ktor-serialization-kotlinx-json:${Deps.ktorVersion}"
    const val ktorAndroid = "io.ktor:ktor-client-android:${Deps.ktorVersion}"
    const val ktorIOS = "io.ktor:ktor-client-ios:${Deps.ktorVersion}"

    // GRADLE PLUGINS
    const val kotlinVersion = "1.7.21"
    const val ktorSerialization = "io.ktor:ktor-client-content-negotiation:${Deps.ktorVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Deps.kotlinVersion}"

    private const val gradleVersion = "7.2.2"
    const val androidBuildTools = "com.android.tools.build:gradle:${Deps.gradleVersion}"

    // SQLDELIGHT
    private const val sqlDelightGradleVersion = "1.5.3"
    const val sqlDelightGradlePlugin = "com.squareup.sqldelight:gradle-plugin:${Deps.sqlDelightGradleVersion}"

    private const val sqlDelightVersion = "1.5.4"
    const val sqlDelightRuntime = "com.squareup.sqldelight:runtime:${Deps.sqlDelightVersion}"
    const val sqlDelightAndroidDriver = "com.squareup.sqldelight:android-driver:${Deps.sqlDelightVersion}"
    const val sqlDelightNativeDriver = "com.squareup.sqldelight:native-driver:${Deps.sqlDelightVersion}"
    const val sqlDelightCoroutinesExtensions = "com.squareup.sqldelight:coroutines-extensions:${Deps.sqlDelightVersion}"

    // TESTING
    private const val assertKVersion = "0.25"
    const val assertK = "com.willowtreeapps.assertk:assertk:${Deps.assertKVersion}"

    private const val turbineVersion = "0.7.0"
    const val turbine = "app.cash.turbine:turbine:${Deps.turbineVersion}"

    private const val jUnitVersion = "4.13.2"
    const val jUnit = "junit:junit:${Deps.jUnitVersion}"

    private const val testRunnerVersion = "1.5.1"
    const val testRunner = "androidx.test:runner:${Deps.testRunnerVersion}"

    const val composeTesting = "androidx.compose.ui:ui-test-junit4:${Deps.composeVersion}"
    const val composeTestManifest = "androidx.compose.ui:ui-test-manifest:${Deps.composeVersion}"

    const val hiltTesting = "com.google.dagger:hilt-android-testing:$hiltVersion"


}
