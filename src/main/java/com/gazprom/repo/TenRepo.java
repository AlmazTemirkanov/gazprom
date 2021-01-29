package com.gazprom.repo;

import com.gazprom.domain.Ten;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TenRepo extends CrudRepository<Ten,String> {
    List<Ten>findById(Long id);
}
