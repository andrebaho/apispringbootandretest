package com.test.springboot.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.springboot.restapi.entity.Hardware;
public interface HardwareRepository extends JpaRepository<Hardware, Long> {

}
