package com.learning.sba.config;

import com.learning.sba.business.usecases.impl.CrudUserService;
import com.learning.sba.ports.impl.LocalRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public CrudUserService getCrudUserService() {
        return new CrudUserService(new LocalRepository());
    }
}
