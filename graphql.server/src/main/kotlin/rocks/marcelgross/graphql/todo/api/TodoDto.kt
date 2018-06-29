package rocks.marcelgross.graphql.todo.api

data class TodoDto(
        val id: Long,
        val title: String?,
        val content: String?
)