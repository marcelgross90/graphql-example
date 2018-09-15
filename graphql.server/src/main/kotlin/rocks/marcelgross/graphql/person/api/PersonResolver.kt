package rocks.marcelgross.graphql.person.api

import com.coxautodev.graphql.tools.GraphQLResolver
import org.springframework.stereotype.Component
import rocks.marcelgross.graphql.person.repository.PersonEntity
import rocks.marcelgross.graphql.relationship.repository.RelationshipRepository
import rocks.marcelgross.graphql.relationship.repository.RelationshipType

@Component
class PersonResolver(private val relationshipRepository: RelationshipRepository) : GraphQLResolver<PersonEntity> {

    fun relationships(person: PersonEntity, type: RelationshipType?) =
            when (type) {
                null -> relationshipRepository.findByFromId(person.id)
                else -> relationshipRepository.findByFromIdAndRelationship(person.id, type)
            }
}
