plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.ben.manes) apply false
}

// Load apiKey.properties file
val apiKeyPropertiesFile = file("apiKey.properties")
if (apiKeyPropertiesFile.exists()) {
    val apiKeyProperties = java.util.Properties()
    apiKeyProperties.load(apiKeyPropertiesFile.inputStream())

    // Make the properties global accessible
    ext.set("API_KEY", apiKeyProperties["API_KEY"])
    ext.set("BASE_URL", apiKeyProperties["BASE_URL"])
    ext.set("BASE_URL_IMAGE", apiKeyProperties["BASE_URL_IMAGE"])
} else {
    throw GradleException("apiKey.properties file not found in the project root!")
}
