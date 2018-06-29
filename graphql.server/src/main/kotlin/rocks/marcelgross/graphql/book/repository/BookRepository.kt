package rocks.marcelgross.graphql.book.repository

import org.springframework.data.repository.PagingAndSortingRepository

interface BookRepository: PagingAndSortingRepository<BookEntity, Long> {

    fun findById(id: Long): BookEntity
}