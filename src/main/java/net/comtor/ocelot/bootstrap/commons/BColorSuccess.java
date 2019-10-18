/*
Esta clase y todo su contenido es propiedad intelectual de Guido Antonio Cafiel Vellojin, 
Queda prohibido el uso, distribución y comercialización sin previa autorización del titular
(Guido Antonio Cafiel Vellojin) cualquier duda al respecto contáctese al correo guido.cafiel@ingenieros.com
 */
package net.comtor.ocelot.bootstrap.commons;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public interface BColorSuccess extends BColor {

    default String getColor() {
        return SUCCESS;
    }
}
