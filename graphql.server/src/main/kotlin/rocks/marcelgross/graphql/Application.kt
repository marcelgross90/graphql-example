package rocks.marcelgross.graphql

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EntityScan(basePackages = arrayOf("rocks.marcelgross.graphql"))
@EnableJpaRepositories(basePackages = arrayOf("rocks.marcelgross.graphql"))
class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}
