package com.GestionRestaurante.Restaurante.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Producto {
    @Id
    private String CodProducto;
    private String Descripcion, estado;
    private BigDecimal precio;

    @ManyToOne
    @JoinColumn(name = "IdTipoProducto")
    private TipoProducto tipoProducto;

    @OneToMany(mappedBy = "producto")
    private List<Detalle_pedido> detalles;
}