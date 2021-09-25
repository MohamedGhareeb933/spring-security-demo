package spring.security.spring.boot.security.tut.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages={"${spring.data.jpa.repository.packages}"})
public class DataSourcesConfigs {

    @Bean
    @Primary
    @ConfigurationProperties("app.datasource")
    public DataSource appDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.data.jpa.entity")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,
                                                                       DataSource appDataSource) {
        return builder
                .dataSource(appDataSource)
                .build();
    }

    @Bean(name = "securityDataSource")
    @ConfigurationProperties("security.datasource")
    public DataSource securityDataSource() {
        return DataSourceBuilder.create().build();
    }

}
