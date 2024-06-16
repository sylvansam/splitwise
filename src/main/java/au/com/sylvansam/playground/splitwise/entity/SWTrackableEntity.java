package au.com.sylvansam.playground.splitwise.entity;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.validation.constraints.NotNull;
import org.slf4j.MDC;

import java.time.LocalDateTime;

@MappedSuperclass
public abstract class SWTrackableEntity extends SWEntity {

    @NotNull
    private LocalDateTime createdAt;

    @NotNull
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();

//        String authUserMobileHeader = MDC.get(Constants.AUTH_USER_MOBILE_HEADER);
//        UserEntity user = userCache.getUser(authUserMobileHeader);
//        updatedBy = user;
//        createdBy = user;
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();

//        String authUserMobileHeader = MDC.get(Constants.AUTH_USER_MOBILE_HEADER);
//        updatedBy = userCache.getUser(authUserMobileHeader);
    }
}
