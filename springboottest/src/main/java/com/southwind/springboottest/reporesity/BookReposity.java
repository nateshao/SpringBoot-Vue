package com.southwind.springboottest.reporesity;

import com.southwind.springboottest.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookReposity extends JpaRepository<Book,Integer>{


}
