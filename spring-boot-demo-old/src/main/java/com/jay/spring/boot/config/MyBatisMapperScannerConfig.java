package com.jay.spring.boot.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description 扫描MyBatis的Mapper接口
 */
@Configuration
//注意，由于MapperScannerConfigurer执行的比较早，所以必须有下面的注解
@AutoConfigureAfter(SessionFactoryConfig.class)
public class MyBatisMapperScannerConfig {

	/**Mapper接口路径*/
	private static final String BASE_PACKAGE = "com.jay.spring.boot.mapper";
	
	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer() {
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
		mapperScannerConfigurer.setBasePackage(BASE_PACKAGE);
		return mapperScannerConfigurer;
	 }

}