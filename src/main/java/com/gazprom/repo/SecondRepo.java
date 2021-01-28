package com.gazprom.repo;

import com.gazprom.domain.Second;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SecondRepo extends CrudRepository<Second, String> {

    List<Second> findById(Long id);
}
