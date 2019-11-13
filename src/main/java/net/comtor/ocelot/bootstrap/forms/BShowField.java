package net.comtor.ocelot.bootstrap.forms;


import net.comtor.html.advanced.LabelInputHelpError;
import net.comtor.ocelot.html.HtmlContainer;
import net.comtor.ocelot.html.IHtmlTag;
import net.comtor.ocelot.html.forms.HtmlFieldset;
import net.comtor.ocelot.html.forms.inputs.HtmlInputHidden;

//package net.comtor.ocelot.bootstrap.forms;
//
//import net.comtor.ocelot.bootstrap.decorators.BootstrapFormElement;
//import net.comtor.ocelot.html.forms.HtmlFieldset;
//import net.comtor.ocelot.html.forms.HtmlFormElement;
//import net.comtor.ocelot.html.forms.inputs.HtmlInputHidden;
//import org.apache.commons.lang3.StringUtils;
//
public class BShowField extends HtmlContainer implements LabelInputHelpError<HtmlInputHidden> {
//  <div class="form-group">
//    <label for="exampleInputEmail1">Email address</label>
//    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
//    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
//  </div>
    HtmlInputHidden hidden;

    public BShowField(String name, String label, String hidden, String visible) {
        this.hidden = new HtmlInputHidden(name, hidden);
        add(this.hidden);
        HtmlFieldset fieldset = new HtmlFieldset(label);
        add(fieldset);

    }

    @Override
    public HtmlInputHidden getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLabel(String label) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getLabel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setHelp(String label) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getHelp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setError(String label) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getError() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IHtmlTag addAttribute(String name, String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAttribute(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IHtmlTag removeAttribute(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IHtmlTag setClass(String myClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IHtmlTag removeClass(String myClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IHtmlTag addClass(String myClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IHtmlTag setStyle(String style) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IHtmlTag setAccessKey(String accessKey) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

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
