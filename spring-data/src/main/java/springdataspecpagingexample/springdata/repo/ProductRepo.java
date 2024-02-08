package springdataspecpagingexample.springdata.repo;

import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import springdataspecpagingexample.springdata.entity.Product;

@Repository
public interface ProductRepo extends ListPagingAndSortingRepository<Product, Long> {

	List<Product> findAll(Specification<Product> spec, Pageable pageable);

}
