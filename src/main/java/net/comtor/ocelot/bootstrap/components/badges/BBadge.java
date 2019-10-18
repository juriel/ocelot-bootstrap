package net.comtor.ocelot.bootstrap.components.badges;

import net.comtor.ocelot.bootstrap.commons.BColor;
import net.comtor.ocelot.html.styles.HtmlSpan;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public abstract class BBadge extends HtmlSpan implements BColor {

    public BBadge(String text) {
        setText(text);
        addClass("badge").addClass("badge-" + getColor());
    }

}
