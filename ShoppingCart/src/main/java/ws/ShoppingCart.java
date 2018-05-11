package ws;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ShoppingCart {

    @Id
    @GeneratedValue
    private int id;
    private int customerId;
    private int[] productIds;

    //TODO: 1 add getters and setters for the fields (10 marks)

    public ShoppingCart() {}

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
