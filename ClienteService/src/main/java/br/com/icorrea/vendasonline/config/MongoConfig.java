/**
 * 
 */
package br.com.icorrea.vendasonline.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@EnableMongoRepositories(basePackages = "br.com.icorrea.vendasonline.repository")
public class MongoConfig {

}
