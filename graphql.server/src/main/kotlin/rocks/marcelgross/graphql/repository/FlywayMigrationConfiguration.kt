package rocks.marcelgross.graphql.repository

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class FlywayMigrationConfiguration {

    private val LOG = LoggerFactory.getLogger(FlywayMigrationStrategy::class.java)

    @Bean
    fun migrateStrategy(): FlywayMigrationStrategy {

        return FlywayMigrationStrategy { flyway ->
            LOG.info("Run Flyway")
            flyway.clean()
            flyway.migrate()
        }
    }
}
