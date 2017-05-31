package models;

import javax.persistence.*;

@Entity
public class StockItem{
    @Id
    public Long id;

    @ManyToOne
    public Warehouse warehouse;

    @ManyToOne
    public Product product;

    public Long quantity;

}
