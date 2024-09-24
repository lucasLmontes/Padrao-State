package com.resumo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryTest {
    Delivery delivery;

    @BeforeEach
    public void setUp() {
        delivery = new Delivery();
    }

    @Test
    public void naoDevePrepararDeliveryEmPreparacao() {
        delivery.setEstado(DeliveryEstadoPreparando.getInstance());
        assertFalse(delivery.preparar());
    }

    @Test
    public void deveSairParaEntregaDeliveryEmPreparacao() {
        delivery.setEstado(DeliveryEstadoPreparando.getInstance());
        assertTrue(delivery.sairParaEntrega());
        assertEquals(DeliveryEstadoSaiuParaEntrega.getInstance(), delivery.getEstado());
    }

    @Test
    public void deveCancelarDeliveryEmPreparacao() {
        delivery.setEstado(DeliveryEstadoPreparando.getInstance());
        assertTrue(delivery.cancelar());
        assertEquals(DeliveryEstadoCancelado.getInstance(), delivery.getEstado());
    }

    @Test
    public void naoDeveEntregarDeliveryEmPreparacao() {
        delivery.setEstado(DeliveryEstadoPreparando.getInstance());
        assertFalse(delivery.entregar());
    }

    @Test
    public void naoDevePrepararDeliverySaiuParaEntrega() {
        delivery.setEstado(DeliveryEstadoSaiuParaEntrega.getInstance());
        assertFalse(delivery.preparar());
    }

    @Test
    public void deveEntregarDeliverySaiuParaEntrega() {
        delivery.setEstado(DeliveryEstadoSaiuParaEntrega.getInstance());
        assertTrue(delivery.entregar());
        assertEquals(DeliveryEstadoEntregue.getInstance(), delivery.getEstado());
    }

    @Test
    public void deveCancelarDeliverySaiuParaEntrega() {
        delivery.setEstado(DeliveryEstadoSaiuParaEntrega.getInstance());
        assertTrue(delivery.cancelar());
        assertEquals(DeliveryEstadoCancelado.getInstance(), delivery.getEstado());
    }

    @Test
    public void naoDeveSairParaEntregaDeliverySaiuParaEntrega() {
        delivery.setEstado(DeliveryEstadoSaiuParaEntrega.getInstance());
        assertFalse(delivery.sairParaEntrega());
    }

    @Test
    public void naoDevePrepararDeliveryEntregue() {
        delivery.setEstado(DeliveryEstadoEntregue.getInstance());
        assertFalse(delivery.preparar());
    }

    @Test
    public void naoDeveSairParaEntregaDeliveryEntregue() {
        delivery.setEstado(DeliveryEstadoEntregue.getInstance());
        assertFalse(delivery.sairParaEntrega());
    }

    @Test
    public void naoDeveCancelarDeliveryEntregue() {
        delivery.setEstado(DeliveryEstadoEntregue.getInstance());
        assertFalse(delivery.cancelar());
    }

    @Test
    public void naoDeveEntregarDeliveryEntregue() {
        delivery.setEstado(DeliveryEstadoEntregue.getInstance());
        assertFalse(delivery.entregar());
    }

    @Test
    public void naoDevePrepararDeliveryCancelado() {
        delivery.setEstado(DeliveryEstadoCancelado.getInstance());
        assertFalse(delivery.preparar());
    }

    @Test
    public void naoDeveSairParaEntregaDeliveryCancelado() {
        delivery.setEstado(DeliveryEstadoCancelado.getInstance());
        assertFalse(delivery.sairParaEntrega());
    }

    @Test
    public void naoDeveCancelarDeliveryCancelado() {
        delivery.setEstado(DeliveryEstadoCancelado.getInstance());
        assertFalse(delivery.cancelar());
    }

    @Test
    public void naoDeveEntregarDeliveryCancelado() {
        delivery.setEstado(DeliveryEstadoCancelado.getInstance());
        assertFalse(delivery.entregar());
    }
}