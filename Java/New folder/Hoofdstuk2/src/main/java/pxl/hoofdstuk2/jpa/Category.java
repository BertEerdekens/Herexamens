package pxl.hoofdstuk2.jpa;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Categories")
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;
	
	@Column(name = "Name")
	private String name;
	
	@OneToMany(mappedBy="category")
	private Set<Beer> beers = new HashSet<Beer>();
	
	public Set<Beer> getBeers(){
		return beers;
	}
	
	public void setBeers(Set<Beer> beers) {
		this.beers = beers;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

}
