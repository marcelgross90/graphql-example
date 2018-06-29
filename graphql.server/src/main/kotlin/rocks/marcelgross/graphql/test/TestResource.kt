package rocks.marcelgross.graphql.test

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import rocks.marcelgross.graphql.todo.api.TodoDto
import rocks.marcelgross.graphql.todo.repository.TodoRepository
import rocks.marcelgross.graphql.user.api.UserDto
import rocks.marcelgross.graphql.user.repository.UserRepository

const val TEST_URI = "v1/test"

@RestController
@RequestMapping(
        path = [TEST_URI],
        produces = [(MediaType.APPLICATION_JSON_VALUE)]
)
class TestResource(private val userRepository: UserRepository, private val todoRepository: TodoRepository) {

    @GetMapping()
    fun getAllUsers(pageable: Pageable): Page<UserDto> {

        return userRepository.findAll(pageable).map { it.toDto() }
    }

    @GetMapping(path = ["todo"])
    fun getTodos(pageable: Pageable): Page<TodoDto> {
        return todoRepository.findAll(pageable).map { it.toDto() }
    }
}