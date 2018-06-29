package rocks.marcelgross.graphql.book.repository

import rocks.marcelgross.graphql.book.api.BookDto
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class BookEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long?,
        val title: String?,
        val author: String?
) {
    /** For hibernate */
    @Suppress("unused")
    internal constructor() : this( null, "", "")

    fun toDto(): BookDto {
        return BookDto(this.id!!, this.title!!, this.author!!)
    }
}