package com.gazprom.repo;

import com.gazprom.domain.Fourth;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FourthRepo extends CrudRepository<Fourth, String> {

    List<Fourth>findById(Long id);
}
