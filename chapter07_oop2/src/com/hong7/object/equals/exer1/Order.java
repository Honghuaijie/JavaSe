package com.hong7.object.equals.exer1;

import java.util.Objects;

/**
 * ClassName: Order
 * Package: com.hong7.object.equals.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/8 15:12
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Order {
    private int orderId;
    private String orderName;

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof Order){
            Order order = (Order) obj;
            return orderId == order.orderId && Objects.equals(orderName,order.orderName);
        }

        return false;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}
