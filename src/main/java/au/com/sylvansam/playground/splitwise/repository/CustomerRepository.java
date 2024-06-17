package au.com.sylvansam.playground.splitwise.repository;

import au.com.sylvansam.playground.splitwise.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

    Optional<CustomerEntity> findByMobile(String mobile);

}
