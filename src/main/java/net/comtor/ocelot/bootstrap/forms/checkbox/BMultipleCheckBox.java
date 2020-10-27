package net.comtor.ocelot.bootstrap.forms.checkbox;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import net.comtor.ocelot.html.forms.HtmlFieldset;
import net.comtor.ocelot.html.forms.HtmlLabel;
import net.comtor.ocelot.html.forms.IHtmlCheckbox;
import net.comtor.ocelot.html.styles.HtmlDiv;

/**
 *
 * @author juriel@comtor.net
 * @author juandiego@comtor.net
 * @since 1.8
 * @version Nov 13, 2019
 */
public class BMultipleCheckBox extends HtmlDiv {

    public static final String STYLE_INLINE = "checkbox-inline";
    public static final String STYLE_NORMAL = "checkbox";

    private String label;
    private String style;
    private String name;
    private HtmlDiv container;
    private Map<String, LinkedList<IHtmlCheckbox>> boxes;

    public BMultipleCheckBox(String labelText, String name, String style) {
        this.label = labelText;
        this.name = name;
        this.style = style;

        container = new HtmlDiv();
        container.addClass("-inline");
        container.addClass("row");
        container.setStyle("padding-left: 30px; padding-right: 30px;");

        boxes = new LinkedHashMap<>();

        addClass("form-group");

        init();
    }

    public BMultipleCheckBox(String labelText, String name) {
        this.label = labelText;
        this.name = name;

        container = new HtmlDiv();
        container.addClass("-inline");
        container.addClass("row");
        container.setStyle("padding-left: 30px; padding-right: 30px;");

        boxes = new LinkedHashMap<>();

        addClass("form-group");

        init();
    }

    private void init() {
        this.add(new HtmlLabel("", label));
        this.add(container);
    }

    public void addCheck(String category, IHtmlCheckbox check) {
        container.add(check);
    }

    public void newBox(String category, IHtmlCheckbox check) {
        if (boxes.containsKey(category)) {
            boxes.get(category).add(check);
        } else {
            LinkedList<IHtmlCheckbox> listBox = new LinkedList<>();
            listBox.add(check);

            boxes.put(category, listBox);
        }
    }

    @Override
    protected void preHtmlRender() {
        super.preHtmlRender();

        fillBoxesInFiledSet();
    }

    private void fillBoxesInFiledSet() {
        if (!boxes.isEmpty()) {
            for (Map.Entry<String, LinkedList<IHtmlCheckbox>> entry : boxes.entrySet()) {
                String key = entry.getKey();
                LinkedList<IHtmlCheckbox> box = entry.getValue();

                HtmlFieldset fieldSet = new HtmlFieldset(key);
                fieldSet.addClass("col-sm-2");
                fieldSet.addClass("ocelot-privileges");

                box.stream().forEach((mercuryCheckBox) -> {
                    fieldSet.add(mercuryCheckBox);
                });

                this.container.add(fieldSet);
            }
        }
    }

}
