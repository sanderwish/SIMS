package com.eversis.spaceagency.repositories;

import com.eversis.spaceagency.entities.Mission;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissionRepository extends CrudRepository<Mission, Integer> {

    Mission findByName(String name);
}
