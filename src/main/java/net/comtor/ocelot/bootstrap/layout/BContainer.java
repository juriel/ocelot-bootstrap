package net.comtor.ocelot.bootstrap.layout;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BContainer extends BLayout {

    boolean isFluid;

    public BContainer() {
        isFluid = false;
    }

    public BContainer(boolean isFluid) {
        this.isFluid = isFluid;
    }

    @Override
    protected void preHtmlRender() {
        if (isFluid) {
            addClass("container-fluid");
        } else {
            addClass("container");
        }
    }

}
