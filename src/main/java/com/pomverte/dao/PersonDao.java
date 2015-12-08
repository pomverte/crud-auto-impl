package com.pomverte.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.pomverte.entity.Person;

@RepositoryRestResource(collectionResourceRel = "person", path = "person")
public interface PersonDao extends PagingAndSortingRepository<Person, Long> {

    Person findByName(@Param("name") String name);

}
