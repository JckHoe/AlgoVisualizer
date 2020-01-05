package visualizer.application

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class VisualizerApplication {
    companion object{
        @JvmStatic
        fun main(args:Array<String>){
            SpringApplication.run(VisualizerApplication::class.java, *args)
            println("Started!")
        }
    }
}