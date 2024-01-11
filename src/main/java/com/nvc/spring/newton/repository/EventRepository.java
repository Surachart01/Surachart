package com.nvc.spring.newton.repository;

import org.springframework.data.repository.CrudRepository;
import com.nvc.spring.newton.model.Event;

public interface EventRepository extends CrudRepository<Event,Integer> {

}
