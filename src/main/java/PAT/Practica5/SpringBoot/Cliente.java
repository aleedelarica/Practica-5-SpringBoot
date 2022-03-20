package PAT.Practica5.SpringBoot;


import javax.validation.constraints.*;
import java.io.Serializable;

public class Cliente implements Serializable {

    @NotBlank
    @Size(min = 3, max = 50)
    private String nombre;

    @NotBlank
    @Email(message = "Please enter a valid e-mail address")
    private String email;

    @NotBlank
    @Size(min = 8, max = 15)
    private String asunto;

    @NotBlank
    @Size(min=10, max = 100)
    private String mensaje;

    public Cliente(String nombre, String email, String asunto, String mensaje) {
        this.nombre = nombre;
        this.email = email;
        this.asunto = asunto;
        this.mensaje = mensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
