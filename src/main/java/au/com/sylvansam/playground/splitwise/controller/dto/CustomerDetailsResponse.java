package au.com.sylvansam.playground.splitwise.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerDetailsResponse {
    private String mobile;
    private String netBalance;
}
