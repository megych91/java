package com.codingdojo.ManyToMany.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.codingdojo.ManyToMany.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {
}