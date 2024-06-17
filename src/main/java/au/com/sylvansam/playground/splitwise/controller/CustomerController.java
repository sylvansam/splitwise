package au.com.sylvansam.playground.splitwise.controller;

import au.com.sylvansam.playground.splitwise.controller.dto.CustomerDetailsResponse;
import au.com.sylvansam.playground.splitwise.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private final CustomerService service;

    //TODO: fetch user using header auth id
    @GetMapping("/{mobile}")
    public CustomerDetailsResponse fetchDetails(@PathVariable String mobile) {
        //TODO: how is mobile validated, not null or format

        return service.fetchDetails(mobile);
    }


}
