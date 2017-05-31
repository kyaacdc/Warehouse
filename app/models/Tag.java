package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Tag {
    @Id
    public Long id;

    public String name;

    @ManyToMany(mappedBy = "tags")
    public List<Product> products;

}
