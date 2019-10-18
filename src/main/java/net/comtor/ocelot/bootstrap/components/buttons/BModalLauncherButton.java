package net.comtor.ocelot.bootstrap.components.buttons;

import net.comtor.ocelot.html.formatting.HtmlIcon;

/**
 *
 * @author Guido Cafiel
 */
public class BModalLauncherButton extends BButton {

    public BModalLauncherButton(String modalId, String iconClass) {
        addAttribute("data-toggle", "modal");
        addAttribute("data-target", "#" + modalId);
        setIconClass(iconClass);
    }

    public BModalLauncherButton setIconClass(String iconClass) {
        add(new HtmlIcon().addClass(iconClass));
        return this;
    }

    public BModalLauncherButton setBColor(String bcolor) {
        addClass(bcolor);
        return this;
    }

}
