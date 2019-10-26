//package net.comtor.ocelot.bootstrap.forms;
//
//import net.comtor.ocelot.bootstrap.decorators.BootstrapFormElement;
//import net.comtor.ocelot.html.forms.HtmlFieldset;
//import net.comtor.ocelot.html.forms.HtmlFormElement;
//import net.comtor.ocelot.html.forms.inputs.HtmlInputHidden;
//import org.apache.commons.lang3.StringUtils;
//
///**
// *
// * @author Guido Cafiel
// */
//public class BShowField extends BootstrapFormElement {
//
//    HtmlInputHidden htmlHidden;
//    HtmlFieldset fieldset;
//
//    public BShowField(String name, String label, String hidden, String visible) {
//        super(name + "_visible", label, new HtmlFieldset());
//        fieldset = (HtmlFieldset) getFormElement();
//        fieldset.addData(visible);
//        fieldset.setStyle("background-color: #D8D8D8");
//        htmlHidden = new HtmlInputHidden(name, hidden);
//        htmlHidden.setId(name);
//
//    }
//
//    public BShowField(String name, String label, String visible) {
//        super(name + "_visible", label, new HtmlFieldset());
//        fieldset = (HtmlFieldset) getFormElement();
//        fieldset.addData(visible);
//        fieldset.setStyle("background-color: #D8D8D8");
//    }
//
//    public BShowField(String label, String visible) {
//        this("", label, visible);
//        fieldset.addData(visible);
//    }
//
//    public BShowField setValues(String hidden, String visible) {
//        fieldset.addData(visible);
//        if (htmlHidden == null) {
//            htmlHidden = new HtmlInputHidden(StringUtils.replace(getFormElement().getName(), "_visible", ""), hidden);
//        }
//        htmlHidden.setValue(hidden);
//        return this;
//    }
//
//    @Override
//    public HtmlFormElement required() {
//        super.required();
//        htmlHidden.required();
//        return this;
//    }
//
//    @Override
//    protected void preHtmlRender() {
//        if (htmlHidden != null) {
//            getDiv().add(htmlHidden);
//        }
//        super.preHtmlRender();
//    }
//
//}
