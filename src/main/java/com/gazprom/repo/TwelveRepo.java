package com.gazprom.repo;

import com.gazprom.domain.Twelve;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TwelveRepo extends CrudRepository<Twelve,String> {
    List<Twelve>findById(Long id);
}
