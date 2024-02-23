package com.store.notification.component;

public interface RabbitMQComponent {
    void handleMessage(String message);
}
