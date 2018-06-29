package rocks.marcelgross.graphql.address.repository

import org.springframework.data.repository.PagingAndSortingRepository

interface AddressRepository: PagingAndSortingRepository<AddressEntity, Long>