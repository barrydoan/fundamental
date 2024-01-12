package com.pluralsight.fundamental.respository;

import org.springframework.data.repository.CrudRepository;

import com.pluralsight.fundamental.entity.Release;

public interface ReleaseRepository extends CrudRepository<Release, Long> {

}
