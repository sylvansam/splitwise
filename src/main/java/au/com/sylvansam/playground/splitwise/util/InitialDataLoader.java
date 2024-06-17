package au.com.sylvansam.playground.splitwise.util;

import au.com.sylvansam.playground.splitwise.entity.CustomerEntity;
import au.com.sylvansam.playground.splitwise.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class InitialDataLoader implements CommandLineRunner {

    @Autowired
    private final CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {

        var sam = CustomerEntity.builder().mobile("61470200742").netBalance(10).build();
        var swathi = CustomerEntity.builder().mobile("61470356431").netBalance(-10).build();
        customerRepository.save(sam);
        customerRepository.save(swathi);

        log.info("Created two users : Sam & Swathi ");

    }
}