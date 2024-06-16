package au.com.sylvansam.playground.splitwise;

import org.springframework.boot.SpringApplication;

public class TestSplitwiseApplication {

	public static void main(String[] args) {
		SpringApplication.from(SplitwiseApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
