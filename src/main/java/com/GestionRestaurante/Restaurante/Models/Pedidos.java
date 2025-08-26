package com.GestionRestaurante.Restaurante.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdPedido;
    private BigDecimal Total, seña;
    private Date Fecha_de_entrega;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "IdCliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "IdMesa")
    private mesas mesa;

    @OneToMany(mappedBy = "pedido")
    private List<Detalle_pedido> detalles;
}