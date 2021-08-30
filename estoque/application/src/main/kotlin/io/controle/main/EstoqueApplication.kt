import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@ComponentScan(basePackages = arrayOf("io.controle.*"))
@EntityScan(basePackages = ["io.controle.*"])
@EnableJpaRepositories(basePackages = ["io.controle.*"])
class EstoqueApplication

fun main(args: Array<String>) {
    runApplication<EstoqueApplication>(*args)
}