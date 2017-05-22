package io.matty.wrike.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WrikeTasks {

    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("briefDescription")
    private String briefDescription;
    @JsonProperty("parentIds")
    private List<String> parentIds;
    @JsonProperty("sharedIds")
    private List<String> sharedIds;
    @JsonProperty("responsibleIds")
    private List<String> responsibleIds;
    @JsonProperty("status")
    private String status;
    @JsonProperty("importance")
    private String importance;
    @JsonProperty("createdDate")
    private String createdDate;
    @JsonProperty("updatedDate")
    private String updatedDate;
    @JsonProperty("completedDate")
    private String completedDate;
    @JsonProperty("dates")
    private WrikeTasksDate dates;
    @JsonProperty("scope")
    private String scope;
    @JsonProperty("authorIds")
    private List<String> authorIds;
    @JsonProperty("accountId")
    private String accountId;
    @JsonProperty("customStatusId")
    private String customStatusId;
    @JsonProperty("hasAttachments")
    private boolean hasAttachments;
    @JsonProperty("permalink")
    private String permalink;
    @JsonProperty("priority")
    private String priority;
    @JsonProperty("followedByMe")
    private boolean followedByme;
    @JsonProperty("followerIds")
    private List<String> followerIds;
    // override rights
    @JsonProperty("recurrent")
    private boolean recurrent;
    @JsonProperty("superTaskIds")
    private List<String> superTaskIds;
    @JsonProperty("subTaskIds")
    private List<String> subTaskIds;
    @JsonProperty("dependencyIds")
    private List<String> dependencyIds;
    @JsonProperty("metadata")
    private List<String> metadata;
    @JsonProperty("customFields")
    private List<String> customFields;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBriefDescription() {
        return briefDescription;
    }

    public void setBriefDescription(String briefDescription) {
        this.briefDescription = briefDescription;
    }

    public List<String> getParentIds() {
        return parentIds;
    }

    public void setParentIds(List<String> parentIds) {
        this.parentIds = parentIds;
    }

    public List<String> getSharedIds() {
        return sharedIds;
    }

    public void setSharedIds(List<String> sharedIds) {
        this.sharedIds = sharedIds;
    }

    public List<String> getResponsibleIds() {
        return responsibleIds;
    }

    public void setResponsibleIds(List<String> responsibleIds) {
        this.responsibleIds = responsibleIds;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(String completedDate) {
        this.completedDate = completedDate;
    }

    public WrikeTasksDate getDates() {
        return dates;
    }

    public void setDates(WrikeTasksDate dates) {
        this.dates = dates;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public List<String> getAuthorIds() {
        return authorIds;
    }

    public void setAuthorIds(List<String> authorIds) {
        this.authorIds = authorIds;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getCustomStatusId() {
        return customStatusId;
    }

    public void setCustomStatusId(String customStatusId) {
        this.customStatusId = customStatusId;
    }

    public boolean isHasAttachments() {
        return hasAttachments;
    }

    public void setHasAttachments(boolean hasAttachments) {
        this.hasAttachments = hasAttachments;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public boolean isFollowedByme() {
        return followedByme;
    }

    public void setFollowedByme(boolean followedByme) {
        this.followedByme = followedByme;
    }

    public List<String> getFollowerIds() {
        return followerIds;
    }

    public void setFollowerIds(List<String> followerIds) {
        this.followerIds = followerIds;
    }

    public boolean isRecurrent() {
        return recurrent;
    }

    public void setRecurrent(boolean recurrent) {
        this.recurrent = recurrent;
    }

    public List<String> getSuperTaskIds() {
        return superTaskIds;
    }

    public void setSuperTaskIds(List<String> superTaskIds) {
        this.superTaskIds = superTaskIds;
    }

    public List<String> getSubTaskIds() {
        return subTaskIds;
    }

    public void setSubTaskIds(List<String> subTaskIds) {
        this.subTaskIds = subTaskIds;
    }

    public List<String> getDependencyIds() {
        return dependencyIds;
    }

    public void setDependencyIds(List<String> dependencyIds) {
        this.dependencyIds = dependencyIds;
    }

    public List<String> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<String> metadata) {
        this.metadata = metadata;
    }

    public List<String> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<String> customFields) {
        this.customFields = customFields;
    }
}
