package net.comtor.ocelot.bootstrap.components.buttons;

import net.comtor.ocelot.html.formatting.HtmlIcon;
import net.comtor.ocelot.html.forms.buttons.HtmlButton;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BButton extends HtmlButton {

    public BButton() {
        super("");
    }

    public BButton(String buttonStyle, String value) {
        super(value);
        addClass("btn").addClass("btn-" + buttonStyle);
    }

    public BButton(String buttonStyle, String type, String value) {
        super(type, value);
        addClass("btn").addClass("btn-" + buttonStyle);
    }

    public void setButtonStyle(String buttonStyle) {
        addClass("btn").addClass("btn-" + buttonStyle);
    }

    public BButton setIcon(String buttonStyle) {
        add(new HtmlIcon().setStyle("margin-right:5px").addClass(buttonStyle));
        return this;
    }

}
