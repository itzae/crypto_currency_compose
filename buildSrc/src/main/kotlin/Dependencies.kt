import Versions.composeVersion
import Versions.hiltVersion
import Versions.hiltViewModelVersion
import Versions.logginInterceptorVersion
import Versions.retrofit2Version

object Dependencies {
    const val retrofit2 = "com.squareup.retrofit2:retrofit:$retrofit2Version"
    const val retrofit2_gson = "com.squareup.retrofit2:converter-gson:$retrofit2Version"
    const val logging_interceptor =
        "com.squareup.okhttp3:logging-interceptor:$logginInterceptorVersion"
    const val compose_ui = "androidx.compose.ui:ui:$composeVersion"
    const val compose_material = "androidx.compose.material:material:$composeVersion"
    const val compose_tooling_preview ="androidx.compose.ui:ui-tooling-preview:$composeVersion"
    const val hiltAndroid = "com.google.dagger:hilt-android:$hiltVersion"
    const val hiltViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:$hiltViewModelVersion"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:$hiltVersion"
    const val hiltAndroidCompiler = "androidx.hilt:hilt-compiler:$hiltViewModelVersion"
    const val class_path_hilt = "com.google.dagger:hilt-android-gradle-plugin:$hiltVersion"
}