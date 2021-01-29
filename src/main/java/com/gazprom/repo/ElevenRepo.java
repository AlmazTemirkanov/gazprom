package com.gazprom.repo;

import com.gazprom.domain.Eleven;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ElevenRepo extends CrudRepository<Eleven,String> {
    List<Eleven>findById(Long id);
}
