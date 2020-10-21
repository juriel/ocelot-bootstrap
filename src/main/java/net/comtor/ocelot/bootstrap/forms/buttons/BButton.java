package net.comtor.ocelot.bootstrap.forms.buttons;

import net.comtor.ocelot.html.formatting.HtmlIcon;
import net.comtor.ocelot.html.forms.buttons.HtmlButton;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BButton extends HtmlButton {

    public BButton() {
        super("");
        addClass("btn");
    }

    public BButton(BButtonStyle styleButon, String value, String type) {
        super(value);

        addClass("btn");
        addClass(styleButon.getStyle());

        if (StringUtils.isNotEmpty(type)) {
            setType(type);
        }
    }

    public BButton(BButtonStyle buttonStyle, String value) {
        this(buttonStyle, value, null);
    }

    public BButton(String value) {
        this(BButtonStyle.PRIMARY, value);
    }

    public BButton setButtonStyle(BButtonStyle buttonStyle) {
        addClass(buttonStyle.getStyle());

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
