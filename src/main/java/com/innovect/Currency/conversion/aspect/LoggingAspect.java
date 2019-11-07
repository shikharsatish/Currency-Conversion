package com.innovect.Currency.conversion.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggingAspect {

  Logger logger = (Logger) LoggerFactory.getLogger(LoggingAspect.class);

  @Before("execution(public double getRates(String to, double quantity))")
  public void LoggingAdvice(){
    logger.info("Get Rates method called");
  }
}
