package com.gazprom.repo;

import com.gazprom.domain.Fifth;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FifthRepo extends CrudRepository<Fifth, String> {
    List<Fifth>findById(Long id);
}
