package rocks.marcelgross.graphql.relationship.api

import com.coxautodev.graphql.tools.GraphQLResolver
import org.springframework.stereotype.Component
import rocks.marcelgross.graphql.person.repository.PersonRepository
import rocks.marcelgross.graphql.relationship.repository.RelationshipEntity

@Component
class RelationshipResolver(private val personRepository: PersonRepository) : GraphQLResolver<RelationshipEntity> {
    fun getFrom(relationship: RelationshipEntity) = personRepository.findOne(relationship.from.id)
    fun getTo(relationship: RelationshipEntity) = personRepository.findOne(relationship.to.id)
}