package com.delivery_api.Projeto.Delivery.API.projection;

import java.math.BigDecimal;

// interface de projeção
public interface RelatorioVendas {

    String getNomeRestaurante();
    BigDecimal getTotalVendas();
    Long getQuantidadePedidos();
}
