package pxl.hoofdstuk1.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	
	@Before("execution(* *.sayHello(..))")
	public void before() {
		System.out.println("before");
	}
	
	@AfterReturning("execution(* *.sayHello(..))")
	public void afterReturning() {
		System.out.println("Afterreturning");
	}
	
	@AfterThrowing("execution(* *.sayHello(..))")
	public void afterException() {
		System.out.println("afterException");
	}
	
	@After("executrion(* *.sayHello(..))")
	public void after() {
		System.out.println("After");
	}
}
