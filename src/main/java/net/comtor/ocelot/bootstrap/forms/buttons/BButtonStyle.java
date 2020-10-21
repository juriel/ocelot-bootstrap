package net.comtor.ocelot.bootstrap.forms.buttons;

/**
 * Enumeración con estilos Bootstrap para botones
 * @author juandiego@comtor.net
 * @since 1.8
 * @version Oct 21, 2020
 */
public enum BButtonStyle {

    PRIMARY("btn-primary"),
    SECONDARY("btn-secondary"),
    DEFAULT("btn-default"),
    SUCCESS("btn-success"),
    WARNING("btn-warning"),
    INFO("btn-info"),
    DANGER("btn-danger"),
    DARK("btn-dark"),
    LINK("btn-link");

    private final String style;

    private BButtonStyle(String style) {
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

}
