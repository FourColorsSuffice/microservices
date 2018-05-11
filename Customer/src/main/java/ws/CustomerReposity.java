package ws;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerReposity extends JpaRepository<Customer, Integer> {
}
