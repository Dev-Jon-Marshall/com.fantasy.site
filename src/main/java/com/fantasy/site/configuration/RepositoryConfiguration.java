package com.fantasy.site.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Jonathan.Marshall on 3/30/2017.
 */
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.fantasy.site.domain"})
@EnableJpaRepositories(basePackages = {"com.fantasy.site.repositories"})
@EnableTransactionManagement
@EnableSpringDataWebSupport
public class RepositoryConfiguration
{

}
