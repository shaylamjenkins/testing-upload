package io.matty.wrike.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WrikeUsers {

    @JsonProperty("id")
    private String id;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("type")
    private String type;
    @JsonProperty("profiles")
    private List<WrikeUsersProfiles> profiles;
    @JsonProperty("avatarUrl")
    private String avatarUrl;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("deleted")
    private boolean deleted;
    @JsonProperty("me")
    private boolean me;
    @JsonProperty("memberIds")
    private List<String> memberIds;
    @JsonProperty("metadata")
    private List<String> metadata;
    @JsonProperty("myTeam")
    private boolean myTeam;
    @JsonProperty("companyName")
    private String companyName;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("location")
    private String location;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<WrikeUsersProfiles> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<WrikeUsersProfiles> profiles) {
        this.profiles = profiles;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean isMe() {
        return me;
    }

    public void setMe(boolean me) {
        this.me = me;
    }

    public List<String> getMemberIds() {
        return memberIds;
    }

    public void setMemberIds(List<String> memberIds) {
        this.memberIds = memberIds;
    }

    public List<String> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<String> metadata) {
        this.metadata = metadata;
    }

    public boolean isMyTeam() {
        return myTeam;
    }

    public void setMyTeam(boolean myTeam) {
        this.myTeam = myTeam;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
