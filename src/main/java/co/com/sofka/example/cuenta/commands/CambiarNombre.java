package co.com.sofka.example.cuenta.commands;

import co.com.sofka.example.cuenta.values.CuentaId;
import co.com.sofka.example.cuenta.values.Nombre;

public class CambiarNombre {

    private final CuentaId entityId;
    private final Nombre nombre;

    public CambiarNombre(CuentaId entityId, Nombre nombre) {
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public CuentaId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
