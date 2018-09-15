package rocks.marcelgross.graphql.relationship.repository

import rocks.marcelgross.graphql.person.repository.PersonEntity
import javax.persistence.*

@Entity
data class RelationshipEntity(
        @Id
        val id: String,
        @ManyToOne
        @JoinColumn(name = "from_id")
        val from: PersonEntity,
        @ManyToOne
        @JoinColumn(name = "to_id")
        val to: PersonEntity,
        @Enumerated(EnumType.STRING)
        val relationship: RelationshipType
)