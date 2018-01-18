package AOPNew;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Before;


public class Audience {
	@Before("execution(** AOPNew.Performance(..))")
	public void silenceCellPhones() {
		System.out.println("Silencing cell phone");
	}
	
	@Before("execution(** AOPNew.Performance(..)")
	public void takeSeats() {
		System.out.println("taking seats");
	}
	
	@AfterReturning("execution(** AOPNew.Performance(..)")
	public void applause() {
		System.out.println("Clap Clap Clap");
	}
	
	@AfterThrowing("execution(** AOPNew.Performance(..)")
	public void demandRefund() {
		System.out.println("Demanding a refund");
	}

}
