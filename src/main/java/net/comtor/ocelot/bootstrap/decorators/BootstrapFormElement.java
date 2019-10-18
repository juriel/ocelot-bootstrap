package net.comtor.ocelot.bootstrap.decorators;

import net.comtor.ocelot.html.HtmlContainerWithMainTag;
import net.comtor.ocelot.html.formatting.HtmlSmall;
import net.comtor.ocelot.html.forms.HtmlFormElement;
import net.comtor.ocelot.html.forms.HtmlFormElementWrapper;
import net.comtor.ocelot.html.forms.HtmlLabel;
import net.comtor.ocelot.html.styles.HtmlDiv;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BootstrapFormElement extends HtmlContainerWithMainTag implements HtmlFormElementWrapper {

    private HtmlDiv formgroup;
    private HtmlDiv formElementContainer;
    private HtmlLabel label;
    private HtmlFormElement formElement;
    private HtmlSmall smallMessages;
    private HtmlSmall errors;

    public BootstrapFormElement(String name, String label, HtmlFormElement formElement) {
        super(formElement);
        formElement = (HtmlFormElement) getContainerMainTag();
        setWrappedHtmlFormElement(formElement);

        formgroup = new HtmlDiv();
        this.label = new HtmlLabel();
        this.label.addData(label);
        this.label.setForInput(name);
        this.smallMessages = new HtmlSmall();
        this.errors = new HtmlSmall();
        errors.setId(StringUtils.replace(name, "_visible", "") + "_errors");
        errors.addClass("error_small");
        errors.setStyle("color:red");

        this.formElement = formElement;
        this.formElement.setId(getName()).setName(getName()).addClass("form-control");
        formgroup.addClass("form-group");
        getLabel().addClass("form-label");
        //formgroup.addTag(getLabel()).addData(html);

        this.formElement.setName(name);
        this.formElement.setId(StringUtils.replace(name, ".", "_"));
        this.formgroup.add(this.label);
        formElementContainer = new HtmlDiv();
        formElementContainer.add(formElement);
        this.formgroup.add(formElementContainer);
        add(formgroup);
    }

    public HtmlDiv getFormElementContainer() {
        return formElementContainer;
    }

    @Override
    protected void preHtmlRender() {
        this.formgroup.add(smallMessages);
        this.formgroup.add(errors);
        super.preHtmlRender();
    }

    final public HtmlFormElement getFormElement() {
        return formElement;
    }

    final public HtmlDiv getDiv() {
        return formgroup;
    }

    final public HtmlLabel getLabel() {
        return label;
    }

    public String getName() {
        return formElement.getName();
    }

    public String getSmallMessage() {
        return smallMessages.getText();
    }

    public void setSmallMessage(String smallMessage) {
        this.smallMessages.setText(smallMessage);
    }

    @Override
    final public void setWrappedHtmlFormElement(HtmlFormElement formElement) {
        this.formElement = formElement;
    }

    @Override
    final public HtmlFormElement getWrappedHtmlFormElement() {
        return formElement;
    }
}
