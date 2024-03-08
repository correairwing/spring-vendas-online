/**
 * 
 */
package com.icorrea.vendas.online.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author irwing.correa
 *
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.icorrea.vendas.online.repository")
public class MongoConfig {

}
