package net.comtor.ocelot.bootstrap.components.alerts;

import net.comtor.ocelot.bootstrap.commons.BColor;
import net.comtor.ocelot.html.styles.HtmlDiv;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public abstract class BAlert extends HtmlDiv implements BColor {

    public BAlert(String message) {
        addClass("alert").addClass("alert-" + getColor());
        addData(message);
    }

}
