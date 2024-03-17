package ma.emsi.studentapp.repository;

import ma.emsi.studentapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
