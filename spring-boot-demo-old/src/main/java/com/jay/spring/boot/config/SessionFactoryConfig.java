package com.jay.spring.boot.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @Description 集成myBatis
 * @author jay.xiang
 */
@Configuration
@EnableTransactionManagement
public class SessionFactoryConfig implements TransactionManagementConfigurer {
	/** * mybatis 配置路径 */ 
	private static final String MYBATIS_CONFIG = "classpath:/mybatis/mapper/*.xml";
	/** * model 配置路径 */ 
	private static final String TYPE_ALIAS_PACKAGE = "com.jay.spring.boot.model";
	
	@Resource(name = "dataSource")
	private DataSource dataSource;
	
	/** 
	*创建sqlSessionFactoryBean 实例
	* 并且设置configtion 如驼峰命名.等等
	* 设置mapper 映射路径 
	* 设置datasource数据源 
	* @return 
	* @throws Exception
	*/
	@Bean(name = "sqlSessionFactory")
	public SqlSessionFactoryBean createSqlSessionFactoryBean() throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		/** 设置datasource */ 
		sqlSessionFactoryBean.setDataSource(dataSource); 
		/** 设置typeAlias 包扫描路径 */
		sqlSessionFactoryBean.setTypeAliasesPackage(TYPE_ALIAS_PACKAGE);
		
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        /** 设置mybatis configuration 扫描路径 */
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(MYBATIS_CONFIG));
		return sqlSessionFactoryBean;
	}
	
	
	 /**
     * 用于实际查询的sql工具,传统dao开发形式可以使用这个,基于mapper代理则不需要注入
     * @param sqlSessionFactory
     * @return
     */
	@Bean
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
	
	
	 /**
     * 事务管理,具体使用在service层加入@Transactional注解
     */
	@Bean
	@Override
	public PlatformTransactionManager annotationDrivenTransactionManager() {
		return new DataSourceTransactionManager(dataSource);
	}
}
