package com.shoppingweb.DAO;

import com.shoppingweb.Entity.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromotionRepository  extends JpaRepository<Promotion,Long> {
    //
    public Promotion findById(int id);
}
