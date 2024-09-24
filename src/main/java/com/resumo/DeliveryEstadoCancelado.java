package com.resumo;

public class DeliveryEstadoCancelado extends DeliveryEstado {
    private DeliveryEstadoCancelado() {};
    private static DeliveryEstadoCancelado instance = new DeliveryEstadoCancelado();
    public static DeliveryEstadoCancelado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cancelado";
    }
}
