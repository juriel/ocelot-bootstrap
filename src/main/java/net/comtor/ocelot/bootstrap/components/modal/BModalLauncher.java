package net.comtor.ocelot.bootstrap.components.modal;

import net.comtor.ocelot.bootstrap.commons.BColor;
import net.comtor.ocelot.bootstrap.forms.buttons.BButton;
import net.comtor.ocelot.html.HtmlTag;
import net.comtor.ocelot.html.IHtmlTag;
import net.comtor.ocelot.html.formatting.HtmlSmall;
import net.comtor.ocelot.html.forms.HtmlFieldset;
import net.comtor.ocelot.html.forms.HtmlLabel;
import net.comtor.ocelot.html.forms.inputs.HtmlInputHidden;
import net.comtor.ocelot.html.styles.HtmlDiv;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BModalLauncher extends HtmlDiv {

    private HtmlFieldset fieldSetValue;
    private HtmlInputHidden hidden;
    private HtmlSmall errors;
    private HtmlSmall small;
    private String label;
    private String name;
    private String urlEndpoint;

    private String buttonStyle;
    private String buttonIcon;
    private boolean onlyIcon;
    private String buttonText;

    public BModalLauncher(String label, String name, String text, String urlEndpoint) {
        this(label, name, text, urlEndpoint, null);
    }

    public BModalLauncher(String label, String name, String text, String urlEndpoint, String icon) {
        fieldSetValue = new HtmlFieldset();
        this.label = label;
        this.name = name;
        fieldSetValue.addEscapedText(text);
        this.urlEndpoint = urlEndpoint + "/" + name;
        hidden = new HtmlInputHidden();
        errors = new HtmlSmall();

        buttonStyle = BColor.SECONDARY;
        if (icon == null) {
            buttonIcon = "fas fa-search";
        } else {
            buttonIcon = icon;
        }
        onlyIcon = true;
        buttonText = "";
    }

    public void setDesign(String style, String icon) {
        this.buttonStyle = style;
        this.buttonIcon = icon;
    }

    public void setButtonValue(String text) {
        this.buttonText = text;
        this.onlyIcon = false;
    }

    @Override
    protected void preHtmlRender() {

        this.addClass("form-group");

        HtmlLabel fieldLabel = new HtmlLabel();
        fieldLabel.addEscapedText(label);
        this.add(fieldLabel);

        HtmlDiv contentDiv = new HtmlDiv();
        contentDiv.setStyle("height:36px");

        fieldSetValue.addClass("form-control-galileo");
        fieldSetValue.setId(name + "_visible");

        BButton modalOpennerButton = new BButton(BColor.PRIMARY, "");
        modalOpennerButton.addClass(buttonIcon);
        modalOpennerButton.addAttribute("data-toggle", "modal");
        modalOpennerButton.addAttribute("data-target", "#myModal");
        modalOpennerButton.addAttribute("type", "button");
        modalOpennerButton.addAttribute("endpoint", urlEndpoint);
        modalOpennerButton.onClick("launchRestMethod(this);");
        modalOpennerButton.setStyle("float:right");

        contentDiv.add(modalOpennerButton);
        contentDiv.add(fieldSetValue);

        this.add(contentDiv);

        if (small != null) {
            this.add(small);
        }

        errors.setId(name + "_hidden_errors");
        errors.addClass("error_small");
        errors.setStyle("color:red");
        this.add(errors);

    }

    public HtmlTag addRequired() {
        hidden.addAttribute("required", "true");
        return this;
    }

    public IHtmlTag setFieldSetValueId(String id) {
        fieldSetValue.setId(id);
        return this;
    }

    public void setSmall(String text) {
        this.small = new HtmlSmall(text);
    }

}
