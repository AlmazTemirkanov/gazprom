package com.gazprom.repo;

import com.gazprom.domain.Third;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ThirdRepo extends CrudRepository<Third, String> {
    List<Third> findById(Long id);
}
