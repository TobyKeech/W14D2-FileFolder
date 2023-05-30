package com.codeclan.fileandfolder.repositories;

import com.codeclan.fileandfolder.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
