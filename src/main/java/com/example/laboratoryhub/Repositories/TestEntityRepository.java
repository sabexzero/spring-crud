package com.example.laboratoryhub.Repositories;

import com.example.laboratoryhub.Entities.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TestEntityRepository extends JpaRepository<TestEntity,Long> {

}
