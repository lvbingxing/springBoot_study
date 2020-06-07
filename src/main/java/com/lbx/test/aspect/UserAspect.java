package com.lbx.test.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;


@Component
@Aspect
public class UserAspect {

    private final Logger logger = LoggerFactory.getLogger(UserAspect.class);

    @Pointcut("execution(public * com.lbx.test.service.impl.UserService.*(..))")
    public void myAspect() {
    }

    @Around(value = "myAspect()")
    public Object log1(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        for (Object arg : args) {
            logger.info("请求参数：" + arg);
        }
        Object obj = pjp.proceed();

        logger.info("返回：" + obj.toString());
        return obj;
    }

    @Before("myAspect()")
    public void beforeLog() {
        /*
         * 获取request*/
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();

        logger.info("Method:" + request.getMethod());
        logger.info("URI:" + request.getRequestURI());
        logger.info("URL:" + request.getRequestURL());
    }
}
