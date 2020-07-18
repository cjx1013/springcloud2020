package com.atguigu.cloudalibaba.serivce;

import com.atguigu.cloudalibaba.domain.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

public interface OrderService {
    void create(Order order);
}
