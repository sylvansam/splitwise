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
 * A customer will have n groups
 * He will make shared expenses with these groups
 */

@Entity
@Builder
@Table(name = "customer_group")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerGroupEntity extends SWTrackableEntity {

    @NotNull
    private String name;

    private String description;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    @NotNull
    private CustomerEntity owner;


}
