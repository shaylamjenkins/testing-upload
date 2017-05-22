package io.matty.wrike.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WrikeTasksDate {

    @JsonProperty("type")
    private String type;
    @JsonProperty("number")
    private int number;
    @JsonProperty("start")
    private String start;
    @JsonProperty("due")
    private String due;
    @JsonProperty("workOnWeekends")
    private boolean workOnWeekends;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
    }

    public boolean isWorkOnWeekends() {
        return workOnWeekends;
    }

    public void setWorkOnWeekends(boolean workOnWeekends) {
        this.workOnWeekends = workOnWeekends;
    }
}
