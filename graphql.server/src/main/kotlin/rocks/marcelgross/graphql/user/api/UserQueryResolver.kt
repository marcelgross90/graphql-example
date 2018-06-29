package rocks.marcelgross.graphql.user.api

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component
import rocks.marcelgross.graphql.user.repository.UserRepository

@Component
class UserQueryResolver(private val userRepository: UserRepository): GraphQLQueryResolver {

    fun users() = userRepository.findAll().map { it.toDto() }.toList()

}