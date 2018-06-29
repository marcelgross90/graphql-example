package rocks.marcelgross.graphql.todo.repository

import org.springframework.data.repository.PagingAndSortingRepository

interface TodoRepository: PagingAndSortingRepository<TodoEntity, Long>