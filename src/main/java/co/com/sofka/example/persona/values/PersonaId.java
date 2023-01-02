package co.com.sofka.example.persona.values;

import co.com.sofka.domain.generic.Identity;

/**
 * Objetos de valor
 * para los identificadores debemos tener un metodo para construir ese identificador
 */
public class PersonaId extends Identity {

    public PersonaId(){

    }

    private PersonaId(String id){
        super(id);
    }

    /**
     * EL metodo of se usa para obtener una instancia de esta clase
     * Metodo que me permite crear el id
     * con este metodo lo que se hace es qye cuendo se vaya a usar no se necesite
     * instanciar la clase
     *
     */
    public static PersonaId of(String id){
        return new PersonaId(id);
    }
}
