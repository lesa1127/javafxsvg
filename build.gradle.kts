/*
 * This file was generated by the Gradle 'init' task.
 */
import org.jetbrains.kotlin.konan.properties.Properties

plugins {
    `java-library`
    kotlin("jvm") version "1.4.32"
    kotlin("kapt") version "1.4.32"
    id("org.openjfx.javafxplugin") version "0.0.10"
    `maven-publish`

}

repositories {
    mavenCentral()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}



group = "github.lesa1127.code"
version = "1.4.0"
description = "CenterDevice JavaFxSVG"


javafx {

    version = "11.0.2"
    modules("javafx.base", "javafx.graphics","javafx.controls","javafx.fxml")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.4.32")

    implementation("org.apache.xmlgraphics:batik-transcoder:1.14")
    implementation("org.apache.xmlgraphics:xmlgraphics-commons:2.6")


    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>{
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

java {
    withSourcesJar()
    withJavadocJar()
}

publishing {
    publications{
        create<MavenPublication>("maven") {
            from(components["java"])
        }
        create<MavenPublication>("local-maven") {
            artifactId = "javafx.svg"
            from(components["java"])
            versionMapping {
                usage("java-api") {
                    fromResolutionOf("runtimeClasspath")
                }
                usage("java-runtime") {
                    fromResolutionResult()
                }
            }
        }
    }
    repositories {
        maven {
//			val releasesRepoUrl = uri("http://127.0.0.1:8081/repository/zycm-repo/")
//			val snapshotsRepoUrl = uri("http://127.0.0.1:8081/repository/zycm-snapshots/")
            val releasesRepoUrl = uri("http://192.168.101.106:8082/repository/zycm-repo/")
            val snapshotsRepoUrl = uri("http://192.168.101.106:8082/repository/zycm-snapshots/")
            url = if (version.toString().endsWith("SNAPSHOT")) snapshotsRepoUrl else releasesRepoUrl
            credentials{
                val prop = Properties()
                val input=project.file("/home/lesa/key/password.properties").inputStream()
                prop.load(input)

                username=prop["MAVEN_USER_NAME"] as String
                password=prop["MAVEN_PASSWORD"] as String
            }
        }
    }
}




tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}
