package net.comtor.ocelot.bootstrap.forms;

import net.comtor.ocelot.html.HtmlTag;
import net.comtor.ocelot.html.forms.HtmlLabel;
import net.comtor.ocelot.html.styles.HtmlDiv;

/**
 *
 * @author Guido Cafiel
 */
public class BWrapper extends HtmlDiv {

    public BWrapper(HtmlTag element) {
        addClass("form-group");
        HtmlLabel ll = new HtmlLabel();
        ll.addClass("form-label").setStyle("color:white");
        ll.addData(".");
        add(ll);
        element.addClass("col-sm-12");
        add(element.addClass("form-comtrol").setStyle("color:white;background-color:#17a2b8"));
    }

    public BWrapper getDiv() {
        return this;
    }

}
