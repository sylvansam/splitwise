package au.com.sylvansam.playground.splitwise.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * These are customers with whom the owner customer is sharing his expense with
 */

@Entity
@Builder
@Table(name = "expense")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseCustomerEntity extends SWTrackableEntity {

    @ManyToOne
    @JoinColumn(name = "split_customer_id")
    @NotNull
    private CustomerEntity splitCustomer;

    @ManyToOne
    @JoinColumn(name = "expense_id")
    @NotNull
    private ExpenseEntity expense;

    @NotNull
    private int splitValue;

    private String description;

}
