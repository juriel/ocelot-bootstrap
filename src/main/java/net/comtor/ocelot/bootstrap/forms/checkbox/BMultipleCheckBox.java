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
    private int columnSize;
    private String nameAndId;
    private HtmlDiv container;
    private Map<String, LinkedList<IHtmlCheckbox>> boxes;

    public BMultipleCheckBox(String labelText, String nameAndId, int columnSize) {
        this.label = labelText;
        this.nameAndId = nameAndId;
        this.columnSize = columnSize;

        container = new HtmlDiv(this.nameAndId);
        container.addClass("-inline");
        container.addClass("row");
        container.setStyle("padding-left: 30px; padding-right: 30px;");

        boxes = new LinkedHashMap<>();

        addClass("form-group");

        init();
    }

    public BMultipleCheckBox(String labelText, String nameAndId) {
        this(labelText, nameAndId, 0);
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

            if (check != null) {
                listBox.add(check);
            }

            boxes.put(category, listBox);
        }
    }

    @Override
    protected void preHtmlRender() {
        super.preHtmlRender();

        fillBoxesInFiledSet();
    }

    public void setColumnSize(int columnSize) {
        this.columnSize = columnSize;
    }

    private int calculateColumnSize() {
        if (columnSize > 12) {
            return 12;
        }

        if (columnSize < 0) {
            return 1;
        }

        if (boxes.isEmpty()) {
            return 12;
        }

        if (columnSize == 0) {
            columnSize = Math.floorDiv(columnSize, boxes.size());

            if (columnSize < 1) {
                columnSize = 1;
            }
        }

        return columnSize;
    }

    private void fillBoxesInFiledSet() {
        if (!boxes.isEmpty()) {
            int columns = calculateColumnSize();

            for (Map.Entry<String, LinkedList<IHtmlCheckbox>> entry : boxes.entrySet()) {
                String id = entry.getKey()
                        .toLowerCase()
                        .replace(" ", "_")
                        .replace("á", "a")
                        .replace("é", "e")
                        .replace("í", "i")
                        .replace("ó", "o")
                        .replace("ú", "u")
                        .replace("ñ", "n")
                        + "_fieldset";

                HtmlFieldset fieldSet = new HtmlFieldset(entry.getKey());
                fieldSet.addClass("col-sm-" + columns);
                fieldSet.addClass("ocelot-privileges");
                fieldSet.setId(id);

                entry.getValue().stream().forEach((checkbox) -> fieldSet.add(checkbox));

                this.container.add(fieldSet);
            }
        }
    }

}
