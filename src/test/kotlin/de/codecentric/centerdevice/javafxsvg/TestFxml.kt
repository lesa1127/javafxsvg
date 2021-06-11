package de.codecentric.centerdevice.javafxsvg

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.stage.Stage
import org.junit.jupiter.api.Test
import kotlin.concurrent.thread

class TestFxml:BaseTestWindow() {
    override fun start(primaryStage: Stage) {
        super.start(primaryStage)
        val part=FXMLLoader.load<Parent>(
            javaClass.classLoader.getResource(
                "imagetest.fxml"
            )
        )
        root.children.add(part)
    }
}

class TestLoadFxml{
    @Test
    fun begin(){
//        thread {
//            SvgImageLoaderFactory.install();
//            Application.launch(TestFxml::class.java,*arrayOf())
//        }.join()
    }
}