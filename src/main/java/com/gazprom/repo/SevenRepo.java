package com.gazprom.repo;

import com.gazprom.domain.Seven;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SevenRepo extends CrudRepository<Seven, String> {
    List<Seven>findById(Long id);
}
