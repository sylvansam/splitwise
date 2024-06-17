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
 * A customer will have n contacts
 * He will make shared expenses with these contacts
 */

@Entity
@Builder
@Table(name = "contact")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactEntity extends SWTrackableEntity {


    @ManyToOne
    @JoinColumn(name = "owner_id")
    @NotNull
    private CustomerEntity owner;

    @ManyToOne
    @JoinColumn(name = "friend_id")
    @NotNull
    private CustomerEntity friend;

}
