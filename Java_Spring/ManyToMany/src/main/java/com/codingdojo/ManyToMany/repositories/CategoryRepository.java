package com.codingdojo.ManyToMany.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.codingdojo.ManyToMany.models.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Long> {
}