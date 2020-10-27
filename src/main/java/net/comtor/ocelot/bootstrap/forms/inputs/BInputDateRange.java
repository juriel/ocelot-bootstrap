package net.comtor.ocelot.bootstrap.forms.inputs;

import java.text.SimpleDateFormat;
import net.comtor.ocelot.html.styles.HtmlDiv;

/**
 *
 * @author Guido Cafiel
 * @author juandiego@comtor.net
 * @since 1.8
 * @version Dec 13, 2019
 */
public class BInputDateRange extends HtmlDiv {

    private BInputDate startDate;
    private BInputDate endDate;

    public BInputDateRange(String startDateLabel, String startDateName, String endDateLabel, String endDateName, boolean required) {
        init(startDateLabel, startDateName, endDateLabel, endDateName, required);
    }

    public BInputDateRange(String startDateLabel, String startDateName, String endDateLabel, String endDateName) {
        this(startDateLabel, startDateName, endDateLabel, endDateName, false);
    }

    private void init(String startDateLabel, String startDateName, String endDateLabel, String endDateName, boolean required) {
        addClass("row");

        startDate = new BInputDate(startDateLabel, startDateName);
        startDate.addAttribute("max-range", endDateName);
        startDate.getMainContainer().addClass("col-sm-6");

        if (required) {
            startDate.required();
        }

        add(startDate);

        endDate = new BInputDate(endDateLabel, endDateName);
        endDate.addAttribute("min-range", startDateName);
        endDate.getMainContainer().addClass("col-sm-6");

        if (required) {
            endDate.required();
        }

        add(endDate);
    }

    public BInputDateRange required() {
        startDate.required();
        endDate.required();

        return this;
    }

    public BInputDateRange setValues(java.util.Date startDate, java.util.Date endDate) {
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        this.startDate.setValue(sdf.format(startDate));
        this.endDate.setValue(sdf.format(endDate));

        return this;
    }

    public BInputDateRange setValues(String startDate, String endDate) {
        this.startDate.setValue(startDate);
        this.endDate.setValue(endDate);

        return this;
    }

    public BInputDate getStartDate() {
        return startDate;
    }

    public BInputDate getEndDate() {
        return endDate;
    }

}
