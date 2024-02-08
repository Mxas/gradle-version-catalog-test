package springdataspecpagingexample.springdata;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import springdataspecpagingexample.springdata.entity.Product;
import springdataspecpagingexample.springdata.repo.ProductRepo;

@Controller
@RequiredArgsConstructor
public class ProductController {

	final ProductRepo productRepo;


	@GetMapping("test")
	public List<Product> get() {

		Specification<Product> spec = (root, query, cb) -> {
			return cb.and();
		};
		Pageable pageable = PageRequest.of(2, 5, Sort.by(Sort.Direction.ASC, "name"));

		List<Product> page = productRepo.findAll(spec, pageable);
		return page;
	}

}
