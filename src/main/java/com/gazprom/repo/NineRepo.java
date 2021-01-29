package com.gazprom.repo;

import com.gazprom.domain.Nine;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NineRepo extends CrudRepository<Nine,String> {
    List<Nine>findById(Long id);
}
