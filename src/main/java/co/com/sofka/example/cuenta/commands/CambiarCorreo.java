package co.com.sofka.example.cuenta.commands;

import co.com.sofka.example.cuenta.values.CuentaId;
import co.com.sofka.example.cuenta.values.Email;

public class CambiarCorreo {

    private final CuentaId entityId;
    private final Email email;

    public CambiarCorreo(CuentaId entityId, Email email) {
        this.entityId = entityId;
        this.email = email;
    }

    public CuentaId getEntityId() {
        return entityId;
    }

    public Email getEmail() {
        return email;
    }
}
