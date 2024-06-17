package au.com.sylvansam.playground.splitwise.converter;


import au.com.sylvansam.playground.splitwise.controller.dto.CustomerDetailsResponse;
import au.com.sylvansam.playground.splitwise.entity.CustomerEntity;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CustomerConverter {

    @Autowired
    private final AmountConverter amountConverter;

    public CustomerDetailsResponse entityToDto(CustomerEntity entity) {
        return CustomerDetailsResponse.builder()
                .mobile(entity.getMobile())
                .netBalance(amountConverter.getDisplayAmount(entity.getNetBalance()))
                .build();
    }
}
