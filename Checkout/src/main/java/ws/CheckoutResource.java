package ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CheckoutResource {

    @Autowired
    private CheckoutReposity checkoutReposity;

    //TODO: 2 implement getCheckouts and getCheckout [5 marks]
    //TODO: 3 implement checkout (create) [5 marks]
}
