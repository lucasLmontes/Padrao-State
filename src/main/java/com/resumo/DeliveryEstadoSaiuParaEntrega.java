package com.resumo;

public class DeliveryEstadoSaiuParaEntrega extends DeliveryEstado {
    private DeliveryEstadoSaiuParaEntrega() {};
    private static DeliveryEstadoSaiuParaEntrega instance = new DeliveryEstadoSaiuParaEntrega();
    public static DeliveryEstadoSaiuParaEntrega getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Saiu Para Entrega";
    }

    public boolean entregar(Delivery delivery) {
        delivery.setEstado(DeliveryEstadoEntregue.getInstance());
        return true;
    }

    public boolean cancelar(Delivery delivery) {
        delivery.setEstado(DeliveryEstadoCancelado.getInstance());
        return true;
    }
}
