package pxl.hoofdstuk2.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "Beers")
@NamedQuery(name="Beer.getBeerByAlcohol", query="select b from Beer b where b.alcohol=?1")
public class Beer implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Price")
	private Float price;
	
	@Column(name = "Stock")
	private int stock;
	
	@Column(name = "Alcohol")
	private float alcohol;
	
	@Version
	@Column(name = "Version")
	private int version;
	
	@ManyToOne
	@JoinColumn(name = "BrewerId")
	private Brewer brewer;
	
	@ManyToOne
	@JoinColumn(name = "CategoryId")
	private Category category;	
	
	public Category getCategory() {
		return category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public Brewer getBrewer() {
		return brewer;
	}
	
	public void setBrewer(Brewer brewer) {
		this.brewer = brewer;
	}
	
	public float getAlcohol() {
		return alcohol;
	}
	
	public void setAlcohol(float alcohol) {
		this.alcohol = alcohol;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append(name).append(" ").append(alcohol).append(" ");
		b.append(stock).append(" ").append(price).append(" ");
		return b.toString();
	}
}
