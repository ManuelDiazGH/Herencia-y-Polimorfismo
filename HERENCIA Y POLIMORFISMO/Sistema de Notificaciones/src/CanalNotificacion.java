abstract class CanalNotificacion {
    String usuario;
    String mensaje;
    abstract void enviarNotificacion();
}
class CorreoElectronico extends CanalNotificacion {
    String direccionCorreo;
    @Override
    void enviarNotificacion() {
    }
}