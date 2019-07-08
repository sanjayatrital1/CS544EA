package cs544.spring40.aop.terms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	private static Logger logger = LogManager.getLogger(LogAspect.class.getName());

	// indicate any return type
	//any method name
	//any parameters
	@Before("execution(* *(..))")
	public void logzBefore(JoinPoint joinpoint) {
		logger.warn("logBefore: " + joinpoint.getSignature().getName());
	}

	@After("execution(* *(..))")
	public void logAfter(JoinPoint joinpoint) {
		logger.warn("logAfter: " + joinpoint.getSignature().getName());
	}

	@Before("execution(* *(..))")
	public void logTargetBefore(JoinPoint joinpoint) {
		logger.warn("logTargetBefore: " + joinpoint.getTarget());
	}
	@After("execution(* *(..))")
	public void logTargetAfter(JoinPoint joinpoint) {
		logger.warn("logTargetAfter: " + joinpoint.getTarget());
	}

}
