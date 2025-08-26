package com.GestionRestaurante.Restaurante.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Entity
public class Detalle_pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdDetallePedido;
    private BigDecimal Subtotal, PU;
    private int Cantidad;

    @ManyToOne
    @JoinColumn(name = "IdPedido")
    private Pedidos pedido;

    @ManyToOne
    @JoinColumn(name = "IdProducto")
    private Producto producto;
}