package rocks.marcelgross.graphql.book.api

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component
import rocks.marcelgross.graphql.book.repository.BookRepository

@Component
class BookQueryResolver(private val bookRepository: BookRepository): GraphQLQueryResolver {

    fun books() = bookRepository.findAll().map { it.toDto() }.toList()

    fun getBookById(id: Long) = bookRepository.findById(id).toDto()
}