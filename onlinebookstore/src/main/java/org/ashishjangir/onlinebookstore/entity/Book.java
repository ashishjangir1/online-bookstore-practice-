package org.ashishjangir.onlinebookstore.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tbl_book")
@Setter
@Getter
@ToString
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	private String sku;
	private String name;
	private String description;
	
	@Column(name="IMAGE_URL")
	private String imageUrl;
	
	@Column(name="UNIT_PRICE")
	private BigDecimal unitPrice;
		
	private boolean active;
	
	@Column(name="UNITS_IN_STOCK")
	private int unitsInStock;
	
	@Column(name="DATE_CREATED")
	private Date createdOn;
	
	@Column(name="LAST_UPDATED")
	private Date updatedOn;
	
	@ManyToOne
	@JoinColumn(name="CATEGORY_ID", nullable=false)
	private BookCategory category;

}
