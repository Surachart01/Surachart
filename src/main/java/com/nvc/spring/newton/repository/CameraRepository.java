package com.nvc.spring.newton.repository;



import org.springframework.data.repository.CrudRepository;
import com.nvc.spring.newton.model.Camera;

import java.util.List;


public interface CameraRepository extends CrudRepository<Camera,Integer> {
    
    List<Camera> findByLocationContaining(String location);
    List<Camera> findByIpAddress(String ipAddress);
}
