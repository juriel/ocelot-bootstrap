package net.comtor.ocelot.bootstrap.forms.buttons;

import net.comtor.ocelot.bootstrap.commons.BColor;
import net.comtor.ocelot.html.formatting.HtmlIcon;
import net.comtor.ocelot.html.forms.buttons.HtmlButton;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BButton extends HtmlButton {

    public static final String PRIMARY = "btn-primary";
    public static final String SECONDARY = "btn-secondary";
    public static final String DEFAULT = "btn-default";
    public static final String SUCCESS = "btn-success";
    public static final String WARNING = "btn-warning";
    public static final String INFO = "btn-info";
    public static final String DANGER = "btn-danger";
    public static final String DARK = "btn-dark";
    public static final String LINK = "btn-link";

    public BButton() {
        super("");
        addClass("btn");
    }

    public BButton(String value) {
        super(value);
        addClass("btn");
        addClass("btn-" + BColor.PRIMARY);

    }

    public BButton(String styleButon, String value) {
        super(value);
        addClass("btn");
        addClass("btn-" + styleButon);
    }

    public BButton(String styleButon, String value, String type) {
        super(value);
        addClass("btn");
        addClass("btn-" + styleButon);
        setType(type);
    }

    public BButton setButtonStyle(String styleButon) {
        addClass("btn-" + styleButon);
        return this;
    }

    public BButton setIcon(String iconClass) {
        add(new HtmlIcon().addClass(iconClass));
        return this;
    }

    public BButton setTitle(String title) {
        addAttribute("title", title);
        return this;
    }

}
