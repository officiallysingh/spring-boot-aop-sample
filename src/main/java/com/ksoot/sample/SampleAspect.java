package com.ksoot.sample;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Log4j2
@Aspect
@Component
class SampleAspect {

  //  @Around("execution (@com.ksoot.TriggerAop * *.*(..))")
  @Around("@annotation(com.ksoot.TriggerAop)")
  public Object doLogging(final ProceedingJoinPoint pjp) throws Throwable {
    final Method method = ((MethodSignature) pjp.getSignature()).getMethod();
    final String className = pjp.getTarget().getClass().getSimpleName();
    final String methodName = pjp.getSignature().getName();
    System.out.println(
        "In Sample AOP Advice className: " + className + " and methodName: " + methodName);
    return pjp.proceed();
  }
}
