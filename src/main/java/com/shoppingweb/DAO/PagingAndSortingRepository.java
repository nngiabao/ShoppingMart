package com.shoppingweb.DAO;

import com.shoppingweb.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagingAndSortingRepository extends JpaRepository<Product, Long> {

}
