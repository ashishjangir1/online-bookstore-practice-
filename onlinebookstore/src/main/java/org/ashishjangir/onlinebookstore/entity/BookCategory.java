package org.ashishjangir.onlinebookstore.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="TBL_CATEGORY")
@Setter
@Getter
@ToString
public class BookCategory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name="CATEGORY_NAME")
	private String categoryName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="category")
	private Set<Book> book;

}
