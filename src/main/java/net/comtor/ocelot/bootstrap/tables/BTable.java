package net.comtor.ocelot.bootstrap.tables;

import java.util.Arrays;
import java.util.List;
import net.comtor.ocelot.html.HtmlTag;
import net.comtor.ocelot.html.tables.HtmlTable;
import net.comtor.ocelot.html.tables.HtmlTd;
import net.comtor.ocelot.html.tables.HtmlTh;
import net.comtor.ocelot.html.tables.HtmlTr;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BTable extends HtmlTable {

    public BTable addHeaders(String... headers) {
        addHeaders(Arrays.asList(headers));
        return this;
    }

    public BTable addHeaders(List<String> headers) {
        HtmlTr tr = new HtmlTr();
        headers.forEach((header) -> {
            tr.add(new HtmlTh(header));
        });
        addFirst(tr);
        return this;
    }

    public BTable addRow(String... celds) {
        HtmlTr tr = new HtmlTr();
        Arrays.asList(celds).forEach((celd) -> {
            tr.add(new HtmlTd(celd));
        });
        add(tr);
        return this;
    }

    public BTable addRow(HtmlTag... tags) {
        HtmlTr tr = new HtmlTr();
        Arrays.asList(tags).forEach((tag) -> {
            tr.add(new HtmlTd(tag));
        });
        add(tr);
        return this;
    }

}
