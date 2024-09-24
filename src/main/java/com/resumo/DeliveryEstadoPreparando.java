package com.resumo;

public class DeliveryEstadoPreparando extends DeliveryEstado {
    private DeliveryEstadoPreparando() {};
    private static DeliveryEstadoPreparando instance = new DeliveryEstadoPreparando();
    public static DeliveryEstadoPreparando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Preparando";
    }

    public boolean sairParaEntrega(Delivery delivery) {
        delivery.setEstado(DeliveryEstadoSaiuParaEntrega.getInstance());
        return true;
    }

    public boolean cancelar(Delivery delivery) {
        delivery.setEstado(DeliveryEstadoCancelado.getInstance());
        return true;
    }
}
