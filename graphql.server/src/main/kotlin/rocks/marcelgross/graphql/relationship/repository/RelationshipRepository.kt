package rocks.marcelgross.graphql.relationship.repository

import org.springframework.data.repository.PagingAndSortingRepository

interface RelationshipRepository : PagingAndSortingRepository<RelationshipEntity, String> {

    fun findByFromId(personId: String): List<RelationshipEntity>
    fun findByFromIdAndRelationship(personId: String, type: RelationshipType): List<RelationshipEntity>
}