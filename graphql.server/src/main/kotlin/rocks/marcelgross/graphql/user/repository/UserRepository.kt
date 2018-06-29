package rocks.marcelgross.graphql.user.repository

import org.springframework.data.repository.PagingAndSortingRepository

interface UserRepository : PagingAndSortingRepository<UserEntity, Long>
