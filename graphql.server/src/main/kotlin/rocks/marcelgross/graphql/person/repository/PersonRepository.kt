package rocks.marcelgross.graphql.person.repository

import org.springframework.data.repository.PagingAndSortingRepository

interface PersonRepository: PagingAndSortingRepository<PersonEntity, String>