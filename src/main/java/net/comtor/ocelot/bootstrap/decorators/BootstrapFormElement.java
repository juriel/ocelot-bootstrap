package net.comtor.ocelot.bootstrap.decorators;

import net.comtor.html.advanced.LabelInputHelpError;
import net.comtor.ocelot.html.HtmlContainer;
import net.comtor.ocelot.html.HtmlEscapedText;
import net.comtor.ocelot.html.HtmlObject;
import net.comtor.ocelot.html.IHtmlTag;
import net.comtor.ocelot.html.formatting.HtmlSmall;
import net.comtor.ocelot.html.forms.HtmlFormElement;
import net.comtor.ocelot.html.forms.HtmlLabel;
import net.comtor.ocelot.html.styles.HtmlDiv;

/**
 *
 * @author Guido A. Cafiel Vellojin
 * @param <INPUT>
 */
public class BootstrapFormElement<INPUT extends HtmlFormElement> extends HtmlContainer implements LabelInputHelpError<INPUT> {
//  <div class="form-group">
//    <label for="exampleInputEmail1">Email address</label>
//    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
//    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
//  </div>

    private HtmlDiv formgroup;
    private HtmlLabel label;
    private INPUT formElement;

    private HtmlSmall helpSmall;
    private HtmlSmall errorsSmall;

    public BootstrapFormElement(String labelStr, INPUT formElement, String helpStr, String errorStr) {
        formgroup = new HtmlDiv();
        formgroup.addClass("form-group");
        String formId = formElement.getId();

        if (formId == null) {
            formId = formElement.getName();
            if (formId == null) {
                throw new RuntimeException("Form Element requires id [" + labelStr + "] " + formElement);
            }
        }
        label = new HtmlLabel(formId, labelStr);
        this.formElement = formElement;
        this.formElement.addClass("form-control");

        helpSmall = new HtmlSmall();
        helpSmall.addClass("form-text").addClass("text-muted");
        if (helpStr != null) {
            helpSmall.addEscapedText(helpStr);
        }

        errorsSmall = new HtmlSmall();
        errorsSmall.setId(formId + "_errors").addClass("error_small");
        if (errorStr != null) {
            errorsSmall.addEscapedText(errorStr);
        }

        formgroup.add(label);
        formgroup.add(this.formElement);
        formgroup.add(helpSmall);
        formgroup.add(errorsSmall);
        add(formgroup);

    }

    public BootstrapFormElement(String labelStr, INPUT formElement, String help) {
        this(labelStr, formElement, help, null);
    }

    public BootstrapFormElement(String labelStr, INPUT formElement) {
        this(labelStr, formElement, null);
    }

    @Override
    final public INPUT getInput() {
        return formElement;
    }

    @Override
    public void setLabel(String label) {
        this.label.removeAll();
        this.label.addEscapedText(label);
    }

    @Override
    public String getLabel() {
        HtmlObject t = label.getFirst();
        if (t != null && t instanceof HtmlEscapedText) {
            HtmlEscapedText tt = (HtmlEscapedText) t;
            return tt.getText();
        }
        return null;

    }

    @Override
    public void setHelp(String help) {
        helpSmall.removeAll();
        helpSmall.addEscapedText(help);
    }

    @Override
    public String getHelp() {
        HtmlObject t = helpSmall.getFirst();
        if (t != null && t instanceof HtmlEscapedText) {
            HtmlEscapedText tt = (HtmlEscapedText) t;
            return tt.getText();
        }
        return null;
    }

    @Override
    public void setError(String errorStr) {
        helpSmall.removeAll();
        helpSmall.addEscapedText(errorStr);
    }

    @Override
    public String getError() {
        HtmlObject t = errorsSmall.getFirst();
        if (t != null && t instanceof HtmlEscapedText) {
            HtmlEscapedText tt = (HtmlEscapedText) t;
            return tt.getText();
        }
        return null;
    }

    @Override
    public IHtmlTag addAttribute(String name, String value) {
        formElement.addAttribute(name, value);
        return this;
    }

    @Override
    public String getAttribute(String name) {
        return formElement.getAttribute(name);
    }

    @Override
    public IHtmlTag removeAttribute(String key) {
        formElement.removeAttribute(key);
        return this;
    }

    @Override
    public IHtmlTag setClass(String myClass) {
        formElement.setClass(myClass);
        return this;

    }

    @Override
    public IHtmlTag removeClass(String myClass) {
        formElement.removeClass(myClass);
        return this;
    }

    @Override
    public IHtmlTag addClass(String myClass) {
        formElement.addClass(myClass);
        return this;
    }

    @Override
    public IHtmlTag setStyle(String style) {
        formElement.setStyle(style);
        return this;
    }

    @Override
    public IHtmlTag setAccessKey(String accessKey) {
        formElement.setAccessKey(accessKey);
        return this;
    }

}
