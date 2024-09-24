package com.resumo;

public class Delivery {
    private String pedido;
    private DeliveryEstado estado;

    public Delivery() {
        this.estado = DeliveryEstadoPreparando.getInstance();
    }

    public void setEstado(DeliveryEstado estado) {
        this.estado = estado;
    }

    public boolean preparar() {
        return estado.preparar(this);
    }

    public boolean sairParaEntrega() {
        return estado.sairParaEntrega(this);
    }

    public boolean entregar() {
        return estado.entregar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public DeliveryEstado getEstado() {
        return estado;
    }
}
