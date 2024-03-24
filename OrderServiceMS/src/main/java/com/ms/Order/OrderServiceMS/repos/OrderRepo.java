package com.ms.Order.OrderServiceMS.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ms.Order.OrderServiceMS.Model.OrderModel;

@Repository
public interface OrderRepo extends JpaRepository<OrderModel, Long> {

}
