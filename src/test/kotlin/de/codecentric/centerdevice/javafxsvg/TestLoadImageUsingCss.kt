package de.codecentric.centerdevice.javafxsvg

import javafx.application.Application
import javafx.scene.control.Button
import javafx.scene.layout.AnchorPane
import javafx.stage.Stage
import org.junit.jupiter.api.Test
import kotlin.concurrent.thread

class TestLoadImageUsingCss:BaseTestWindow() {
    override fun start(primaryStage: Stage) {
        super.start(primaryStage)
        Thread.currentThread().contextClassLoader
        val css = Thread.currentThread().contextClassLoader.getResource("imagetest.css")!!
            .toExternalForm()

        val button =  Button("Test")
        button.id = "TestButton"

        val  anchorPane = AnchorPane(button)
        anchorPane.stylesheets.add(css)
        root.children.add(anchorPane)
    }
}

class TestLoadImageUsingStylesheet{

    @Test
    fun test(){
//        thread {
//            SvgImageLoaderFactory.install();
//            Application.launch(TestLoadImageUsingCss::class.java,*arrayOf())
//        }.join()
    }
}