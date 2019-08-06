package com.vitane.jschool.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder
                .driverClassName("org.postgresql.Driver")
                .url("jdbc:postgresql:dumbo.db.elephantsql.com:5432/cispqglk")
                .username("cispqglk")
                .password("N77dQLzMF3CjCep-6QeQtdsVdEaRL1_V");
        return dataSourceBuilder.build();
    }
}
