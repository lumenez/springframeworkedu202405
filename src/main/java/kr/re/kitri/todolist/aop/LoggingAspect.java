package kr.re.kitri.todolist.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LoggingAspect {
    //logging function
    @Before("execution(* kr.re.kitri.todolist.controller.*.*(..))")
    public void logging(JoinPoint joinPoint) {
        log.debug(joinPoint.getSignature().getDeclaringTypeName());
        log.debug("{} LogginAspect.logging", joinPoint);
    }
}
