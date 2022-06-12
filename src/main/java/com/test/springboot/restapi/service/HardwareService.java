package com.test.springboot.restapi.service;


import java.util.List;

import com.test.springboot.restapi.entity.Hardware;

public interface HardwareService {

	   List<Hardware> findAll();

	    Hardware findById(Long id);

	    Hardware update(Long id, Hardware hardware);

	    Hardware create(Hardware hardware);

	    void delete(Long id);

}
