package com.pluralsight.fundamental.service;

import com.pluralsight.fundamental.entity.Application;

import java.util.List;
import java.util.Optional;

public interface ApplicationService {
    List<Application> listApplications();

    Application findApplication(long id);
}
