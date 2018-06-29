package rocks.marcelgross.graphql.address.api

data class AddressDto (
        val id: Long,
        val street: String?,
        val houseNr: String?,
        val zipCode: Int?,
        val city: String?
)