
package org.ashishjangir.onlinebookstore.repository;

import org.ashishjangir.onlinebookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{

}
