package au.com.sylvansam.playground.splitwise.service;

import au.com.sylvansam.playground.splitwise.common.SWException;
import au.com.sylvansam.playground.splitwise.common.SWExceptionCategory;
import au.com.sylvansam.playground.splitwise.controller.dto.CustomerDetailsResponse;
import au.com.sylvansam.playground.splitwise.converter.CustomerConverter;
import au.com.sylvansam.playground.splitwise.entity.CustomerEntity;
import au.com.sylvansam.playground.splitwise.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class CustomerService {

    @Autowired
    private final CustomerRepository customerRepository;
    @Autowired
    private final CustomerConverter customerConverter;

    public CustomerDetailsResponse fetchDetails(String mobile) {

        Optional<CustomerEntity> customerEntityOpt = customerRepository.findByMobile(mobile);
        if (customerEntityOpt.isEmpty()) {
            throw new SWException(SWExceptionCategory.MissingEntity, "Unable to find customer with mobile : " + mobile);
        }

        return customerConverter.entityToDto(customerEntityOpt.get());
    }
}
