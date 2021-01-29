package com.gazprom.repo;

import com.gazprom.domain.Eight;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EightRepo extends CrudRepository<Eight,String> {
    List<Eight>findById(Long id);
}
