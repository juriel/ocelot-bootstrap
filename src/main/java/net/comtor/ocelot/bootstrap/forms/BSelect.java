package net.comtor.ocelot.bootstrap.forms;

import net.comtor.ocelot.bootstrap.decorators.BootstrapFormElement;
import net.comtor.ocelot.html.forms.HtmlOption;
import net.comtor.ocelot.html.forms.HtmlSelect;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BSelect extends BootstrapFormElement<HtmlSelect> {

    public BSelect(String label, String nameAndId, String help, String error) {
        super(label, new HtmlSelect(nameAndId), help, error);

        getInput().setId(nameAndId);
    }

    public BSelect(String label, String nameAndId, String help) {
        this(label, nameAndId, help, null);
    }

    public BSelect(String label, String nameAndId) {
        this(label, nameAndId, null);
    }

    public BSelect addOption(String value, String label) {
        getInput().addOption(value, label);

        return this;
    }

    public BSelect addOption(String value, String label, boolean selected) {
        getInput().addOption(value, label, true);

        return this;
    }

    public BSelect addOption(HtmlOption optionTag) {
        getInput().addOption(optionTag);

        return this;
    }
}
