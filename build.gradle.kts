plugins {
    id("java")
}

group = "elenapltnkv"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("com.codeborne:selenide:6.16.0")
}

tasks.test {
    useJUnitPlatform()
}