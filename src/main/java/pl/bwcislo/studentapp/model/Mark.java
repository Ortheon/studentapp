package pl.bwcislo.studentapp.model;

import javax.persistence.Entity;

@Entity
public class Mark extends BaseEntity {
    private String markName;
    private String mark;

    public String getMarkName() {
        return markName;
    }

    public void setMarkName(String markName) {
        this.markName = markName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
