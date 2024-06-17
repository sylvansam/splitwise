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
 * These are members of the group who are splitting a group expense
 */

@Entity
@Builder
@Table(name = "expense_group_member")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseGroupMemberEntity extends SWTrackableEntity {

    @ManyToOne
    @JoinColumn(name = "group_id")
    @NotNull
    private CustomerGroupEntity group;

    @ManyToOne
    @JoinColumn(name = "expense_id")
    @NotNull
    private ExpenseEntity expense;

    @ManyToOne
    @JoinColumn(name = "split_customer_id")
    @NotNull
    private CustomerEntity splitCustomer;


    @NotNull
    private int splitValue;

    private String description;

}
