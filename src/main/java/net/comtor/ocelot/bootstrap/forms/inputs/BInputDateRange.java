package net.comtor.ocelot.bootstrap.forms.inputs;

import java.text.SimpleDateFormat;
import java.util.Date;
import net.comtor.ocelot.html.styles.HtmlDiv;

/**
 *
 * @author Guido Cafiel
 */
public class BInputDateRange extends HtmlDiv {

    BInputDate start;
    BInputDate end;

    public BInputDateRange(String startName, String startLabel, String endName, String endLabel) {
        initComponent(startName, startLabel, endName, endLabel, false);
    }

    public BInputDateRange(String startName, String startLabel, String endName, String endLabel, boolean required) {
        initComponent(startName, startLabel, endName, endLabel, required);
    }

    private void initComponent(String startName, String startLabel, String endName, String endLabel, boolean required) {
        addClass("row");
        start = new BInputDate(startName, startLabel);
        start.addAttribute("max-range", endName);
        start.getDiv().addClass("col-sm-6");

        end = new BInputDate(endName, endLabel);
        end.addAttribute("min-range", startName);
        end.getDiv().addClass("col-sm-6");

        if (required) {
            start.addAttribute("required", "");
            end.addAttribute("required", "");
        }

        add(start).add(end);

    }

    public BInputDateRange required() {
        start.required();
        end.required();
        return this;
    }

    public BInputDateRange setValues(Date startDate, Date endDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        start.setValue(sdf.format(startDate));
        end.setValue(sdf.format(endDate));
        return this;
    }

    public BInputDateRange setValues(String startDate, String endDate) {
        start.setValue(startDate);
        end.setValue(endDate);
        return this;
    }

    public BInputDate getStart() {
        return start;
    }

    public BInputDate getEnd() {
        return end;
    }

}
