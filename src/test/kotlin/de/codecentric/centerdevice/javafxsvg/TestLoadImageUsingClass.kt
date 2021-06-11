package de.codecentric.centerdevice.javafxsvg

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.layout.StackPane
import javafx.stage.Stage
import org.junit.jupiter.api.Test
import kotlin.concurrent.thread


class TestLoadImageUsingClass : BaseTestWindow() {
    override fun start(primaryStage: Stage) {
        super.start(primaryStage)
        val imageData = this.javaClass.classLoader
            .getResourceAsStream("bacon.svg")
        val image = Image(imageData)
        val imageView = ImageView(image)
        imageView.id = "TestImage"
        root.children.add(imageView)
    }
}






class TestLoadImageUsing{
    @Test
    fun begin(){
        thread {
            SvgImageLoaderFactory.install();
            Application.launch(TestLoadImageUsingClass::class.java,*arrayOf())
        }.join()
    }
}