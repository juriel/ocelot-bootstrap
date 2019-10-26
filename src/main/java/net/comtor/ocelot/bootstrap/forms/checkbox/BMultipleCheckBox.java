//package net.comtor.ocelot.bootstrap.forms.checkbox;
//
//import java.util.LinkedHashMap;
//import java.util.LinkedList;
//import java.util.Map;
//import net.comtor.ocelot.html.forms.HtmlFieldset;
//import net.comtor.ocelot.html.forms.HtmlLabel;
//import net.comtor.ocelot.html.styles.HtmlDiv;
//
///**
// *
// * @author Guido Cafiel
// */
//public class BMultipleCheckBox extends HtmlDiv {
//
//    private String label;
//    public static final String STYLE_INLINE = "checkbox-inline";
//    public static final String STYLE_NORMAL = "checkbox";
//    private String style;
//    private String name;
//    private HtmlDiv myDiv;
//    private Map<String, LinkedList<BCheckBox>> boxes;
//
//    public BMultipleCheckBox(String name, String label, String style) {
//        this.style = style;
//        this.label = label;
//        this.name = name;
//        myDiv = new HtmlDiv();
//        myDiv.addClass("-inline");
//        boxes = new LinkedHashMap<>();
//        myDiv.addClass("row");
//        myDiv.setStyle("padding-left:30px;padding-right:30px");
//        this.addClass("form-group");
//        init();
//    }
//
//    private void init() {
//        HtmlLabel myLabel = new HtmlLabel();
//        myLabel.addData(label);
//        this.add(myLabel);
//        this.add(myDiv);
//
//    }
//
//    public void addCheck(BCheckBox check) {
//        myDiv.add(check);
//    }
//
//    public void addCheck(String label, String value) {
//        BCheckBox box = new BCheckBox(name, label, value, style, false);
//        box.setClass("col-sm-3");
//        myDiv.add(box);
//    }
//
//    public void addCheck(String label, String value, boolean checked) {
//        BCheckBox box = new BCheckBox(name, label, value, style, checked);
//        box.setClass("col-sm-3");
//        myDiv.add(box);
//    }
//
//    public void addCheck(String label, String value, String category) {
//        myDiv.removeClass("form-check");
//        myDiv.removeClass("form-check-inline");
//        newBox(category, new BCheckBox(name, label, value, style, false));
//    }
//
//    public void addCheck(String label, String value, String category, boolean checked) {
//        newBox(category, new BCheckBox(name, label, value, style, checked));
//    }
//
//    private void newBox(String category, BCheckBox check) {
//        if (boxes.containsKey(category)) {
//            boxes.get(category).add(check);
//        } else {
//            LinkedList<BCheckBox> listBox = new LinkedList<>();
//            listBox.add(check);
//            boxes.put(category, listBox);
//        }
//    }
//
//    private void fillBoxesInFiledSet() {
//
//        if (!boxes.isEmpty()) {
//            for (Map.Entry<String, LinkedList<BCheckBox>> entry : boxes.entrySet()) {
//                String key = entry.getKey();
//                LinkedList<BCheckBox> box = entry.getValue();
//
//                HtmlFieldset fieldSet = new HtmlFieldset(key);
//                fieldSet.addClass("col-sm-2");
//                fieldSet.addClass("ocelot-privileges");
//
//                for (BCheckBox mercuryCheckBox : box) {
//                    fieldSet.add(mercuryCheckBox);
//                }
//
//                this.myDiv.add(fieldSet);
//
//            }
//        }
//    }
//
//    @Override
//    protected void preHtmlRender() {
//        super.preHtmlRender();
//        fillBoxesInFiledSet();
//    }
//
//}
