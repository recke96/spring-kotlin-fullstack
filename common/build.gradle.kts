buildscript {
    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.2.21")
    }
}

apply {
    plugin("kotlin-platform-common")
}


repositories {
    mavenCentral()
}

dependencies {
    "compile"("org.jetbrains.kotlin:kotlin-stdlib-common")
}
