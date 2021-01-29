package com.gazprom.repo;

import com.gazprom.domain.Thirteen;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ThirteenRepo extends CrudRepository<Thirteen,String> {
    List<Thirteen>findById(Long id);
}
