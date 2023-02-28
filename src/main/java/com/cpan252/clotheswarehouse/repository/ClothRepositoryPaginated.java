package com.cpan252.clotheswarehouse.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cpan252.clotheswarehouse.model.Cloth;

public interface ClothRepositoryPaginated extends PagingAndSortingRepository<Cloth, Long> {
    
}
