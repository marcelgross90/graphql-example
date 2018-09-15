package rocks.marcelgross.graphql.person.api

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component
import rocks.marcelgross.graphql.person.repository.PersonRepository

@Component
class PersonQueryResolver(private val personRepository: PersonRepository) : GraphQLQueryResolver {

    fun persons() = personRepository.findAll()
    fun getPersonById(id: String) = personRepository.findOne(id)
}