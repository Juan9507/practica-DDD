package co.com.sofka.example.cuenta.commands;

import co.com.sofka.example.cuenta.values.CuentaId;
import co.com.sofka.example.cuenta.values.Email;
import co.com.sofka.example.cuenta.values.Nombre;

public class CrearCuenta {


    private final CuentaId entityId;
    private final Nombre nombre;
    private final Email email;


    public CrearCuenta(CuentaId entityId, Nombre nombre, Email email) {
        this.entityId = entityId;
        this.nombre = nombre;
        this.email = email;
    }

    public CuentaId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Email getEmail() {
        return email;
    }
}
