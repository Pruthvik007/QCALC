package com.crio.qcalc;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		

		

		LogicCalculator calc = new LogicCalculator();

		calc.AND(8, 6);
		
		calc.printResult();
		
		
	}

}
