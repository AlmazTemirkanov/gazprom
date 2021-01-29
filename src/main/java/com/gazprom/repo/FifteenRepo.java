package com.gazprom.repo;

import com.gazprom.domain.Fifteen;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FifteenRepo extends CrudRepository<Fifteen,String> {
    List<Fifteen>findById(Long id);
}
