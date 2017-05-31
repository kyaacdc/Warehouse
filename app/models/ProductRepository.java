package models;

import com.google.inject.ImplementedBy;

import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.stream.Stream;

/**
 * This interface provides a non-blocking API for possibly blocking operations.
 */
@ImplementedBy(ProductRepositoryImpl.class)
public interface ProductRepository {
    List<Product> findAll();

    CompletionStage<Stream<Product>> findAllAsync();

    Product findOne(String ean);
    Product add(Product product);
    void delete(String ean);
}