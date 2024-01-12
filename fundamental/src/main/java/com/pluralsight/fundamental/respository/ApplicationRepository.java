package com.pluralsight.fundamental.respository;

import org.springframework.data.repository.CrudRepository;

import com.pluralsight.fundamental.entity.Application;

public interface ApplicationRepository extends CrudRepository<Application, Long> {

}
