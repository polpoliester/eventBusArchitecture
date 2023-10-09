package domain.users;
/**
 * La clase "User" representa a un usuario en un sistema.
 * Cada usuario tiene un nombre que lo identifica de manera única.
 */
public class User {

    private String name;

    /**
     * Constructor de la clase User que crea una instancia de usuario con un nombre específico.
     *
     * @param name El nombre del usuario.
     */
    public User(String name) {
        this.name = name;
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return El nombre del usuario.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre del usuario.
     *
     * @param name El nuevo nombre del usuario.
     */
    public void setName(String name) {
        this.name = name;
    }
}
