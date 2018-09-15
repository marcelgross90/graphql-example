package rocks.marcelgross.graphql.person.repository

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class PersonEntity(
        @Id
        val id: String = "",
        val name: String = ""
)