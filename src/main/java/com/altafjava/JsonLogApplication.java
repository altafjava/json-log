package com.altafjava;

import org.slf4j.MDC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.altafjava.constant.AppConstant;
import lombok.extern.slf4j.Slf4j;

/**
 * @author altaf
 *
 */
@Slf4j
@SpringBootApplication
public class JsonLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonLogApplication.class, args);
		MDC.put("id", AppConstant.PROJECT_NAME_PREFIX + "_" + AppConstant.MARKET_CODE + "_" + AppConstant.PARAM_TYPE);
		log.info("---------- Spring Application started successfully ----------");
		log.debug("This is a debug message.");
		log.info("This is an info message.");
		log.warn("This is a warn message.");
		log.error("This is an error message.");
		log.info("---------- Spring Application ended successfully ----------");
	}

}
