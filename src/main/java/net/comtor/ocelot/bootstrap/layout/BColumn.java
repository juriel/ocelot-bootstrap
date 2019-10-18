package net.comtor.ocelot.bootstrap.layout;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BColumn extends BLayout {

    int size;

    public BColumn(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    protected void preHtmlRender() {
        super.preHtmlRender();
        addClass("col-sm-" + size);

    }

}
