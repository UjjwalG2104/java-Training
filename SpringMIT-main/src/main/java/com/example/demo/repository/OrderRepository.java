package com.example.demo.repository;

import com.example.demo.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {

        @Query("""
            SELECT COUNT(o)
            FROM Orders o
            WHERE o.customer.customerId = :customerId
            """)
        Long countOrder(@Param("customerId") Long customerId);


        @Query("""
            SELECT SUM(o.totalPrice)
            FROM Orders o
            WHERE o.customer.customerId = :customerId
            """)
        Double totalAmount(@Param("customerId") Long customerId);


        @Query("""
            SELECT SUM(o.totalPrice)
            FROM Orders o
            """)
        Double totalRevenue();
}