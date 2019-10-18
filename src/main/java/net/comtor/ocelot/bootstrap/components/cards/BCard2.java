package net.comtor.ocelot.bootstrap.components.cards;

import net.comtor.ocelot.html.HtmlObject;
import net.comtor.ocelot.html.IHtmlContainer;
import net.comtor.ocelot.html.styles.HtmlDiv;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BCard2 extends HtmlDiv {

    HtmlDiv innerDiv = new HtmlDiv();

    public BCard2() {
        addClass("hpanel");
        innerDiv = new HtmlDiv();
        innerDiv.addClass("panel-body");
        add(innerDiv);
        initComponent();
    }

    private void initComponent() {
        this.addClass("hpanel");
        super.add(innerDiv);
    }

    @Override
    public IHtmlContainer add(HtmlObject obj) {
        innerDiv.add(obj);
        return this;
    }

    public HtmlDiv getInnerDiv() {
        return innerDiv;
    }

    public void setInnerDiv(HtmlDiv innerDiv) {
        this.innerDiv = innerDiv;
    }

}
