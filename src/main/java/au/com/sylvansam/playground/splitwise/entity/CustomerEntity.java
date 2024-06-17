package au.com.sylvansam.playground.splitwise.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * A customer , almost always a user too.
 * He uses the system to split his expenses
 */

@Entity
@Builder
@Table(name = "customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerEntity extends SWTrackableEntity {

    @NotNull
    private String mobile;

    private int netBalance;
    private Long usrId;

}
