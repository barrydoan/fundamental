package com.pluralsight.fundamental.service;

import com.pluralsight.fundamental.entity.Release;
import com.pluralsight.fundamental.respository.ReleaseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReleaseServiceImpl implements ReleaseService {
    @Autowired
    private ReleaseRepository releaseRepository;

    @Override
    public List<Release> listReleases() {
        return (List<Release>) releaseRepository.findAll();
    }

}
