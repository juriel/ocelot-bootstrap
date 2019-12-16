package net.comtor.ocelot.bootstrap.components.alerts;

import net.comtor.ocelot.bootstrap.commons.BColor;
import net.comtor.ocelot.html.formatting.HtmlIcon;
import net.comtor.ocelot.html.styles.HtmlDiv;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public abstract class BAlert extends HtmlDiv implements BColor {

    public BAlert(String iconClass, String message) {
        add(new HtmlIcon().addClass(iconClass));

        addClass("alert")
                .addClass("alert-" + getColor());
        addEscapedText(message);
    }

    public BAlert(String message) {
        this("", message);
    }

}
