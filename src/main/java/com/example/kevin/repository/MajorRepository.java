package com.example.kevin.repository;

import com.example.kevin.model.Major;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface MajorRepository extends CrudRepository<Major, Long> {

    Major findByName(@Param("name") String name);

}
