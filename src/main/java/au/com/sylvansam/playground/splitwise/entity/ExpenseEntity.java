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
 * An expense is an outward transaction a customer makes
 * He will later split this expense with other contacts or groups
 */

@Entity
@Builder
@Table(name = "expense")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseEntity extends SWTrackableEntity {

    @ManyToOne
    @JoinColumn(name = "owner_id")
    @NotNull
    private CustomerEntity owner;

    @NotNull
    private int value;

    private String description;

}
