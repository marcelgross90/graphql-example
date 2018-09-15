package rocks.marcelgross.graphql.person.api

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import org.springframework.stereotype.Component
import rocks.marcelgross.graphql.person.repository.PersonEntity
import rocks.marcelgross.graphql.person.repository.PersonRepository
import java.util.*

@Component
class PersonMutationResolver(private val personRepository: PersonRepository) : GraphQLMutationResolver {
    fun createPerson(name: String) = personRepository.save(PersonEntity(id = UUID.randomUUID().toString(), name = name))
}