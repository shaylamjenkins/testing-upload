package io.matty.wrike.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WrikeTimelogs {

    @JsonProperty("id")
    private String id;
    @JsonProperty("taskId")
    private String taskId;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("hours")
    private int hours;
    @JsonProperty("createdDate")
    private String createdDate;
    @JsonProperty("trackedDate")
    private String trackedDate;
    @JsonProperty("comment")
    private String comment;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getTrackedDate() {
        return trackedDate;
    }

    public void setTrackedDate(String trackedDate) {
        this.trackedDate = trackedDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
