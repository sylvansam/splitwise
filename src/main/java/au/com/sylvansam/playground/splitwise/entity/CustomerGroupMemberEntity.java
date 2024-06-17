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
 * Many customer group members are part of group
 * They will share expenses with each other
 */

@Entity
@Builder
@Table(name = "customer_group_member")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerGroupMemberEntity extends SWTrackableEntity {

    @ManyToOne
    @JoinColumn(name = "group_id")
    @NotNull
    private CustomerGroupEntity group;

    @ManyToOne
    @JoinColumn(name = "member_id")
    @NotNull
    private CustomerEntity member;

}
