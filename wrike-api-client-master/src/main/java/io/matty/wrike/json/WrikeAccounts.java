package io.matty.wrike.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WrikeAccounts {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("dateFormat")
    private String dateFormat;
    @JsonProperty("firstDayOfWeek")
    private String firstDayOfWeek;
    @JsonProperty("workDays")
    private List<String> workDays;
    @JsonProperty("rootFolderId")
    private String rootFolderId;
    @JsonProperty("recycleBinId")
    private String recycleBinId;
    @JsonProperty("createdDate")
    private String createdDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getFirstDayOfWeek() {
        return firstDayOfWeek;
    }

    public void setFirstDayOfWeek(String firstDayOfWeek) {
        this.firstDayOfWeek = firstDayOfWeek;
    }

    public List<String> getWorkDays() {
        return workDays;
    }

    public void setWorkDays(List<String> workDays) {
        this.workDays = workDays;
    }

    public String getRootFolderId() {
        return rootFolderId;
    }

    public void setRootFolderId(String rootFolderId) {
        this.rootFolderId = rootFolderId;
    }

    public String getRecycleBinId() {
        return recycleBinId;
    }

    public void setRecycleBinId(String recycleBinId) {
        this.recycleBinId = recycleBinId;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
}
