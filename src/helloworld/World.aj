package helloworld;

public aspect World {
	
	pointcut execHello() : execution(* Hello.sayHello());
	
	after() : execHello() {
		System.out.println(" World!");
	}
	
	before() : execHello() {
		System.out.print("Bonjour, ");
	}

}
