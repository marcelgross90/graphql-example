package rocks.marcelgross.graphql.address.api

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component
import rocks.marcelgross.graphql.address.repository.AddressRepository

@Component
class AddressQueryResolver(private val addressRepository: AddressRepository): GraphQLQueryResolver {

    fun addresses() = addressRepository.findAll().map { it.toDto() }.toList()
}