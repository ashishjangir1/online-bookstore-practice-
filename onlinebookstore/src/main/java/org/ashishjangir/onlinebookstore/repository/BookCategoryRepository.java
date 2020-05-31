package org.ashishjangir.onlinebookstore.repository;

import org.ashishjangir.onlinebookstore.entity.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="bookCategory", path="book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
