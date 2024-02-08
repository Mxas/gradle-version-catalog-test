package springdataspecpagingexample.springdata.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import lombok.Data;

@Entity
@Table
@Data
public class Product {

	@Id
	private Long id;
	private String name;
	private BigDecimal price;
}
