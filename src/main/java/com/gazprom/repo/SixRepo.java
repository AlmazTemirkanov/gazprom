package com.gazprom.repo;

import com.gazprom.domain.Six;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SixRepo extends CrudRepository<Six,String> {
    List<Six>findById(Long id);
}
