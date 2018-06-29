package rocks.marcelgross.graphql.user.repository

import rocks.marcelgross.graphql.address.repository.AddressEntity
import rocks.marcelgross.graphql.user.api.UserDto
import javax.persistence.*

@Entity
data class UserEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long?,
        val firstName: String?,
        val lastName: String?,
        val email: String?,
        @OneToMany(fetch = FetchType.LAZY)
        @JoinColumn(name = "user_id")
        val addresses: MutableSet<AddressEntity>
) {
    /** For hibernate */
    @Suppress("unused")
    internal constructor() : this(null, "", "", "", mutableSetOf())

    fun toDto(): UserDto {
        return UserDto(
                this.id!!,
                this.firstName,
                this.lastName,
                this.email,
                this.addresses.map { it.toDto() }.toMutableSet())
    }
}
