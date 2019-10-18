package net.comtor.ocelot.bootstrap.layout;

import net.comtor.ocelot.html.styles.HtmlDiv;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BLayout extends HtmlDiv {

    public BLayout addMargingLeft(int size) {
        addClass("ml-" + size);
        return this;
    }

    public BLayout addMargingTop(int size) {
        addClass("mt-" + size);
        return this;
    }

    public BLayout addMargingRight(int size) {
        addClass("mr-" + size);
        return this;
    }

    public BLayout addMargingBottom(int size) {
        addClass("mb-" + size);
        return this;
    }

}
