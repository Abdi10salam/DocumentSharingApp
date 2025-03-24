// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    id("com.google.gms.google-services") version "4.4.2" apply false
}
plugins {
    id "org.sonarqube" version "4.0.0.2929"
}

sonarqube {
    properties {
        property "sonar.projectKey", "sonar-server_task4"
        property "sonar.organization", "sonar-server"
        property "sonar.host.url", "https://sonarcloud.io"
        property "sonar.login", "6ae456d896915b731a20bc476c39262bdc2aa2b8"
    }
}
