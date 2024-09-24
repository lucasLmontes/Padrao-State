package com.resumo;

public abstract class DeliveryEstado {
    public abstract String getEstado();

    public boolean preparar(Delivery delivery) {
        return false;
    }

    public boolean sairParaEntrega(Delivery delivery) {
        return false;
    }

    public boolean entregar(Delivery delivery) {
        return false;
    }

    public boolean cancelar(Delivery delivery) {
        return false;
    }
}
