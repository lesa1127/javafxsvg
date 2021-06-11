package de.codecentric.centerdevice.javafxsvg

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.layout.StackPane
import javafx.stage.Stage

open class BaseTestWindow : Application() {
    val root = StackPane()
    override fun start(primaryStage: Stage) {
        primaryStage.title = "Test"
        primaryStage.scene = Scene(root, 600.0, 400.0)
        primaryStage.show()
    }
}
