package com.cpan252.clotheswarehouse.repository;

import org.springframework.data.repository.CrudRepository;

import com.cpan252.clotheswarehouse.model.Cloth;


public interface ClothRepository  extends CrudRepository<Cloth, Long>{
    
}
