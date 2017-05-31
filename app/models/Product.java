package models;

import play.data.validation.Constraints;
import play.data.validation.ValidationError;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity
public class Product {

    @Constraints.Required
    @Id
    public String ean;

    @Constraints.Required
    public String name;

    public String description;

    @OneToMany(mappedBy = "product")
    public List<StockItem> stockItems = new ArrayList<>();

    @ManyToMany
    public List<Tag> tags;

    public Product(String ean, String name, String description) {
        this.ean = ean;
        this.name = name;
        this.description = description;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "ean='" + ean + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
