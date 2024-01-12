package com.felipeGuimaraes.workshop.entities.enums;

import lombok.Getter;

@Getter
public enum OrderStatus {
    WAITING_PAYMENT(1),
    SHIPPED(2),
    PAID(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;
    private OrderStatus(int code){
        this.code = code;
    }

    public static OrderStatus valueOf(int code){
        for(OrderStatus value : OrderStatus.values()){
            if(value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid order status code");
    }
}
