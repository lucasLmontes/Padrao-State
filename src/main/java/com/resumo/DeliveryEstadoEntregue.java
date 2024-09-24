package com.resumo;

public class DeliveryEstadoEntregue extends DeliveryEstado {

    private DeliveryEstadoEntregue() {};
    private static DeliveryEstadoEntregue instance = new DeliveryEstadoEntregue();
    public static DeliveryEstadoEntregue getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Entregue";
    }
}
