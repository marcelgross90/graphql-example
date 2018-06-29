package rocks.marcelgross.graphql.todo.repository

import rocks.marcelgross.graphql.todo.api.TodoDto
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class TodoEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long?,
        val title: String?,
        val content: String?
) {
    /** For hibernate */
    @Suppress("unused")
    internal constructor() : this( null, "", "")

    fun toDto(): TodoDto {
        return TodoDto(this.id!!, this.title, this.content)
    }
}