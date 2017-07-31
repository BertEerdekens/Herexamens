package pxl.hoofdstuk2.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BeerRepository extends CrudRepository<Beer, Integer>{
	public List<Beer> getBeerByAlcohol(float alcohol);
}
