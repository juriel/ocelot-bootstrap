package net.comtor.ocelot.bootstrap.components.alerts;

import net.comtor.ocelot.bootstrap.commons.BColorDanger;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BAlertDanger extends BAlert implements BColorDanger {

    public BAlertDanger(String message) {
        super("fas fa-times-circle mr-2",message);
    }

}
