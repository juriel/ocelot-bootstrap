package net.comtor.ocelot.bootstrap.layout;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import net.comtor.ocelot.bootstrap.decorators.BootstrapFormElement;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BRow extends BLayout {

    List<BootstrapFormElement> elementList;

    public BRow() {
        elementList = new LinkedList<>();
        addClass("row");
    }

    public BRow addDinamic(BootstrapFormElement... elements) throws Exception {
        if (!elementList.isEmpty()) {
            throw new Exception("El BRow ya contiene objetos, use el método addTag "
                    + "para agregar mas elementos de forma asincrona.");
        }

        elementList.addAll(Arrays.asList(elements));

        if (elementList.size() > 12) {
            throw new IndexOutOfBoundsException("El BRow no puede conter mas de "
                    + "12 elementos.");
        }

        addClasses(elementList);

        return this;
    }

    private void addClasses(List<BootstrapFormElement> elementList) {
        getContentObjects();

        int columns = Math.floorDiv(12, elementList.size());

        if (columns < 1) {
            columns = 1;
        }

        for (BootstrapFormElement element : elementList) {
            element.getDiv().addClass("col-sm-" + columns);
            add(element);
        }

    }

}
