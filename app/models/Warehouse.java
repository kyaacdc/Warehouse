package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Warehouse {

    @Id
    public Long id;

    public String name;

    @OneToMany
    public List<StockItem> stock = new ArrayList<>();

    @OneToOne
    public Address address;

}
