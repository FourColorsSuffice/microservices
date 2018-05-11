package ws;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckoutReposity extends JpaRepository<Checkout, Integer> {
}
