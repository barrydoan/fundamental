package com.pluralsight.fundamental.respositoty;

import org.springframework.data.repository.CrudRepository;

import com.pluralsight.fundamental.entity.Release;

public interface ReleaseRepository extends CrudRepository<Release, Long> {

}
