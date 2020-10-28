package net.comtor.ocelot.bootstrap.components.cards;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import net.comtor.ocelot.html.HtmlContainer;
import net.comtor.ocelot.html.HtmlDoubleTag;
import net.comtor.ocelot.html.HtmlObject;
import net.comtor.ocelot.html.basic.HtmlH2;
import net.comtor.ocelot.html.basic.HtmlH5;
import net.comtor.ocelot.html.formatting.HtmlIcon;
import net.comtor.ocelot.html.styles.HtmlDiv;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BCard extends HtmlContainer {

    private int size;
    private HtmlIcon icon;
    private String title;
    private List<HtmlObject> headerElements;
    private List<HtmlObject> bodyElements;
    private boolean hasSmallTitle;
    private HtmlDiv mainDiv;

    public BCard() {
        this.size = 12;
        this.headerElements = new LinkedList<>();
        this.bodyElements = new LinkedList<>();
        hasSmallTitle = false;
        mainDiv = new HtmlDiv();
    }

    public BCard(String title) {
        this();
        this.title = title;
    }

    public BCard(String icon, String title) {
        this(title);

        if (icon != null) {
            this.icon = new HtmlIcon();
            this.icon.addClass(icon);
            this.icon.addClass("card-title-icon");
            this.icon.addClass("mr-2");
        }

        hasSmallTitle = false;
    }

    public BCard(String title, List<HtmlObject> headerElements) {
        mainDiv = new HtmlDiv();
        this.size = 12;
        this.title = title;
        this.headerElements = headerElements == null ? new LinkedList<>() : headerElements;
        this.bodyElements = new LinkedList<>();
        hasSmallTitle = false;
    }

    public BCard(int size, String title) {
        mainDiv = new HtmlDiv();

        if (size > 12) {
            size = 12;
        }

        if (size < 1) {
            size = 1;
        }

        this.size = size;
        this.title = title;
        this.headerElements = new LinkedList<>();
        this.bodyElements = new LinkedList<>();
        hasSmallTitle = false;
    }

    public BCard(int size, String title, boolean titleSmall) {
        mainDiv = new HtmlDiv();

        if (size > 12) {
            size = 12;
        }

        if (size < 1) {
            size = 1;
        }

        this.size = size;
        this.title = title;
        this.headerElements = new LinkedList<>();
        this.bodyElements = new LinkedList<>();
        this.hasSmallTitle = titleSmall;
    }

    public HtmlObject setHeaderElements(List<HtmlObject> headerElements) {
        this.headerElements = headerElements;

        return this;
    }

    public HtmlObject addHeaderElements(HtmlObject... headerElements) {
        this.headerElements.addAll(Arrays.asList(headerElements));

        return this;
    }

    public HtmlObject addToHeader(HtmlObject htmlObject) {
        this.headerElements.add(htmlObject);

        return this;
    }

    public HtmlObject setBodyElements(List<HtmlObject> bodyElements) {
        this.bodyElements = bodyElements;

        return this;
    }

    public HtmlObject addBodyElements(HtmlObject... bodyElements) {
        this.bodyElements.addAll(Arrays.asList(bodyElements));

        return this;
    }

    public HtmlObject addToBody(HtmlObject htmlObject) {
        this.bodyElements.add(htmlObject);

        return this;
    }

    protected HtmlObject getHeader(String title, List<HtmlObject> headerElements) {
        HtmlDiv cardHeader = new HtmlDiv();
        cardHeader.addClass("card-header").addClass("with-elements");

        HtmlDoubleTag cardHeaderTitle;

        if (hasSmallTitle) {
            cardHeaderTitle = new HtmlH5();
        } else {
            cardHeaderTitle = new HtmlH2();
        }

        if (icon != null) {
            cardHeaderTitle.add(icon);
        }

        cardHeaderTitle.addClass("card-header-title");
        cardHeaderTitle.addEscapedText(title);

        HtmlDiv cardHeaderElements = new HtmlDiv();
        cardHeaderElements.addClass("card-header-elements").addClass("ml-auto");
        cardHeaderElements.addAll(headerElements);

        cardHeader.add(cardHeaderTitle);
        cardHeader.add(cardHeaderElements);

        return cardHeader;
    }

    protected HtmlObject getBody(List<HtmlObject> bodyElements) {
        HtmlDiv body = new HtmlDiv();
        body.addClass("card-body");
        body.addAll(bodyElements);

        return body;
    }

    @Override
    protected void preHtmlRender() {
        super.preHtmlRender();

        mainDiv.add(getHeader(title, headerElements));
        mainDiv.add(getBody(bodyElements));
        mainDiv.addClass("card");

        if (size > 12) {
            mainDiv.addClass("col-12").addClass("h-100");
            add(mainDiv);

            return;
        }

        HtmlDiv container = new HtmlDiv();
        container.setStyle("padding: 5px");
        container.addClass("col-md-" + size);
        container.add(mainDiv);
        add(container);
    }

    public void addClass(String clazz) {
        mainDiv.addClass(clazz);
    }

}
