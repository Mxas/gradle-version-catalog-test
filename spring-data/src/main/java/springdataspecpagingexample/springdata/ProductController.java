package springdataspecpagingexample.springdata;

import static java.util.stream.IntStream.range;
import static org.springframework.data.domain.PageRequest.of;
import static org.springframework.data.domain.Sort.Direction.ASC;
import static org.springframework.data.domain.Sort.by;
import static springdataspecpagingexample.springdata.entity.Product.Fields.NAME;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springdataspecpagingexample.springdata.entity.Product;
import springdataspecpagingexample.springdata.repo.ProductRepo;

@RestController
@RequiredArgsConstructor
class ProductController {

	final ProductRepo repo;

	@GetMapping("load")
	List<Product> load() {
		// still performs count :D
		return repo.findAll((root, query, cb) -> cb.and(), of(2, 5, by(ASC, NAME)));
	}

	@GetMapping("add")
	@Transactional
	Page<Product> add() {
		range(0, 5 + new Random().nextInt(20))
				.forEach(i -> repo.save(Product.builder()
						.name("Product - #" + i)
						.price(new BigDecimal(i + 500))
						.build()));
		return repo.findAll(of(0, 5000, by(ASC, NAME)));
	}

}
