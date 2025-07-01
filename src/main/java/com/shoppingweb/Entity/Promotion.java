package com.shoppingweb.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="promotion")
public class Promotion {
    @Id
    @GeneratedValue
    Long id;
    //
    @Column(name="name")
    String name;
    //@
    @Column(name="description")
    String description;
    //
    @Column(name="discount_percent")
    Double percent;
    //
    @Column(name="start_date")
    String startDate;
    @Column(name="end_date")
    String endDate;
}
