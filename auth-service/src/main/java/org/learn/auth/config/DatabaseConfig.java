package org.learn.auth.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 数据库相关配置
 *
 * @author tanjie
 * @since 2019/04/05
 */
@Configuration
@MapperScan("org.learn.auth.mapper")
public class DatabaseConfig {
//    @Autowired
//    private DataSourceProperties dataSourceProperties;
//
//
//    @Bean
//    public DataSource dataSource() {
//        DataSource dataSource = DataSourceBuilder.create().driverClassName(dataSourceProperties.getDriverClassName())
//                .url(dataSourceProperties.getUrl())
//                .username(dataSourceProperties.getUsername())
//                .password(dataSourceProperties.getPassword()).build();
//        return dataSource;
//    }
//
//
//    @Bean
//    @Primary
//    public MybatisSqlSessionFactoryBean mybatisSqlSessionFactoryBean() throws Exception {
//        MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource());
//        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/org/learn/mapper/*.xml"));
//        return sqlSessionFactoryBean;
//    }
}
