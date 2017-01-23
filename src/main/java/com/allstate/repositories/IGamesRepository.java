package com.allstate.repositories;

import com.allstate.entities.Game;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by localadmin on 23/01/17.
 */
public interface IGamesRepository extends CrudRepository<Game, Integer> {
}
