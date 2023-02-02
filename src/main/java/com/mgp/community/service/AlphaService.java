package com.mgp.community.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class AlphaService {

    public AlphaService() {
        System.out.println("AlphaService construct");
    }

    @PostConstruct
    public void init() {
        System.out.println("AlphaService init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("AlphaService destroy");
    }
}
