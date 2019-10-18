package net.comtor.ocelot.bootstrap.components.cards;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import net.comtor.ocelot.html.HtmlObject;
import net.comtor.ocelot.html.basic.HtmlH2;
import net.comtor.ocelot.html.formatting.HtmlIcon;
import net.comtor.ocelot.html.styles.HtmlDiv;

/**
 * Componente card de Bootstrap con opción de endpoint
 *
 * @author juandiego@comtor.net
 * @since 1.8
 * @version Jul 30, 2019
 */
public class BButtonCard extends HtmlDiv {

    private List<HtmlObject> bodyElements;
    private String title;
    private int size;
    private String endpoint;
    private HtmlIcon icon;
    private HtmlDiv mainDiv;

    public BButtonCard() {
        this.mainDiv = new HtmlDiv();
        this.bodyElements = new LinkedList<>();
        mainDiv.addAttribute("style", "cursor: pointer;");
    }

    public BButtonCard(List<HtmlObject> bodyElements, String title, int size, String endpoint) {
        this();
        this.title = title;
        this.size = size;
        this.endpoint = endpoint;
    }

    public BButtonCard(String title, String endpoint) {
        this(new LinkedList<>(), title, 12, endpoint);
    }

    public BButtonCard(int size, String endpoint) {
        this(new LinkedList<>(), "", size, endpoint);
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public HtmlIcon getIcon() {
        return icon;
    }

    public void setIcon(HtmlIcon icon) {
        this.icon = icon;
    }

    public void setIcon(String icon) {
        if (icon != null) {
            this.icon = new HtmlIcon();
            this.icon.addClass(icon);
            this.icon.addClass("card-title-icon");
            this.icon.addClass("mr-2");
        }
    }

    public HtmlObject setBodyElements(List<HtmlObject> bodyElements) {
        this.bodyElements = bodyElements;

        return mainDiv;
    }

    public HtmlObject addBodyElements(HtmlObject... bodyElements) {
        this.bodyElements.addAll(Arrays.asList(bodyElements));

        return mainDiv;
    }

    public HtmlObject addBodyElement(HtmlObject bodyElements) {
        this.bodyElements.add(bodyElements);
        return mainDiv;
    }

    public HtmlObject addToBody(HtmlObject htmlObject) {
        this.bodyElements.add(htmlObject);

        return mainDiv;
    }

    protected HtmlObject getHeader(String title) {
        HtmlDiv cardHeader = new HtmlDiv();
        cardHeader.addClass("card-header");

        HtmlH2 cardTitle = new HtmlH2();
        cardTitle.addClass("card-header-title");

        if (icon != null) {
            cardTitle.add(icon);
        }

        cardTitle.setText(title);
        cardHeader.add(cardTitle);
        return cardHeader;
    }

    protected HtmlObject getCardBody(List<HtmlObject> bodyElements) {
        HtmlDiv bodyDiv = new HtmlDiv();
        bodyDiv.addClass("card-body");
        bodyDiv.addAll(bodyElements);
        return bodyDiv;
    }

    @Override
    protected void preHtmlRender() {
        mainDiv.add(getHeader(title));
        mainDiv.add(getCardBody(bodyElements));

        mainDiv.addClass("card");

        if (endpoint != null) {
            mainDiv.addClass("ajaxGet");
            mainDiv.addAttribute("endpoint", endpoint);
            mainDiv.addAttribute("title", "Seleccionar");
        }

        add(mainDiv);
        addClass("col-" + size);
    }

}
