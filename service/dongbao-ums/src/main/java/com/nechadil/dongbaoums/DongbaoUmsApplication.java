package com.nechadil.dongbaoums;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Nehcadil
 * @datetime 2021/3/8 9:58
 */
@SpringBootApplication
@MapperScan("com.nechadil.dongbaoums.mapper")
public class DongbaoUmsApplication {
	public static void main(String[] args) {
		SpringApplication.run(DongbaoUmsApplication.class, args);
	}
}
