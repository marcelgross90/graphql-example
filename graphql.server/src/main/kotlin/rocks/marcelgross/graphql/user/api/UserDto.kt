package rocks.marcelgross.graphql.user.api

import rocks.marcelgross.graphql.address.api.AddressDto

data class UserDto(
    val id: Long,
    val firstName: String?,
    val lastName: String?,
    val email: String?,
    val addresses: MutableSet<AddressDto>
)
