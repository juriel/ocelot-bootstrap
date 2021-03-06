//package net.comtor.ocelot.bootstrap.advanced.input;
//
//import net.comtor.ocelot.html.HtmlEscapedText;
//import net.comtor.ocelot.html.forms.HtmlFieldset;
//import net.comtor.ocelot.html.forms.HtmlFormElement;
//import net.comtor.ocelot.html.forms.inputs.HtmlInputHidden;
//
///**
// *
// * @author Guido Cafiel
// */
//public class HtmlInputShowField extends HtmlContainerWithMainTag implements HtmlFormElementWrapper {
//
//    private HtmlInputHidden hidden;
//    private final HtmlFieldset fieldset;
//
//    public HtmlInputShowField(String name, String value, String text) {
//        super(new HtmlInputHidden(name, value));
//        hidden = (HtmlInputHidden) getContainerMainTag();
//
//        fieldset = new HtmlFieldset();
//        fieldset.add(new HtmlEscapedText(text));
//    }
//
//    public void setText(String text) {
//        fieldset.removeAll();
//        fieldset.add(new HtmlEscapedText(text));
//    }
//
//    public HtmlFieldset getFieldset() {
//        return fieldset;
//    }
//
//    @Override
//    public void setWrappedHtmlFormElement(HtmlFormElement formElement) {
//        hidden = (HtmlInputHidden) formElement;
//
//    }
//
//    @Override
//    public HtmlFormElement getWrappedHtmlFormElement() {
//        return hidden;
//    }
//
//}
