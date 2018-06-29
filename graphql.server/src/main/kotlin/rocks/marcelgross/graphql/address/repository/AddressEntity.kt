package rocks.marcelgross.graphql.address.repository

import rocks.marcelgross.graphql.address.api.AddressDto
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class AddressEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long?,
        val street: String?,
        val houseNr: String?,
        val zipCode: Int?,
        val city: String?
) {
    /** For hibernate */
    @Suppress("unused")
    internal constructor() : this(null, "", "", -1, "")

    fun toDto(): AddressDto {
        return AddressDto(
                this.id!!,
                this.street,
                this.houseNr,
                this.zipCode,
                this.city)
    }
}