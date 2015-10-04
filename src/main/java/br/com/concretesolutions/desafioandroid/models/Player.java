package br.com.concretesolutions.desafioandroid.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Created by alvaro on 25/09/2015.
 */
public class Player {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("followers_count")
    @Expose
    private Integer followersCount;
    @SerializedName("draftees_count")
    @Expose
    private Integer drafteesCount;
    @SerializedName("likes_count")
    @Expose
    private Integer likesCount;
    @SerializedName("likes_received_count")
    @Expose
    private Integer likesReceivedCount;
    @SerializedName("comments_count")
    @Expose
    private Integer commentsCount;
    @SerializedName("comments_received_count")
    @Expose
    private Integer commentsReceivedCount;
    @SerializedName("rebounds_count")
    @Expose
    private Integer reboundsCount;
    @SerializedName("rebounds_received_count")
    @Expose
    private Integer reboundsReceivedCount;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("avatar_url")
    @Expose
    private String avatarUrl;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("twitter_screen_name")
    @Expose
    private Object twitterScreenName;
    @SerializedName("website_url")
    @Expose
    private Object websiteUrl;
    @SerializedName("drafted_by_player_id")
    @Expose
    private Integer draftedByPlayerId;
    @SerializedName("shots_count")
    @Expose
    private Integer shotsCount;
    @SerializedName("following_count")
    @Expose
    private Integer followingCount;
    @SerializedName("created_at")
    @Expose
    private String createdAt;

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The location
     */
    public String getLocation() {
        return location;
    }

    /**
     *
     * @param location
     * The location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @return
     * The followersCount
     */
    public Integer getFollowersCount() {
        return followersCount;
    }

    /**
     *
     * @param followersCount
     * The followers_count
     */
    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    /**
     *
     * @return
     * The drafteesCount
     */
    public Integer getDrafteesCount() {
        return drafteesCount;
    }

    /**
     *
     * @param drafteesCount
     * The draftees_count
     */
    public void setDrafteesCount(Integer drafteesCount) {
        this.drafteesCount = drafteesCount;
    }

    /**
     *
     * @return
     * The likesCount
     */
    public Integer getLikesCount() {
        return likesCount;
    }

    /**
     *
     * @param likesCount
     * The likes_count
     */
    public void setLikesCount(Integer likesCount) {
        this.likesCount = likesCount;
    }

    /**
     *
     * @return
     * The likesReceivedCount
     */
    public Integer getLikesReceivedCount() {
        return likesReceivedCount;
    }

    /**
     *
     * @param likesReceivedCount
     * The likes_received_count
     */
    public void setLikesReceivedCount(Integer likesReceivedCount) {
        this.likesReceivedCount = likesReceivedCount;
    }

    /**
     *
     * @return
     * The commentsCount
     */
    public Integer getCommentsCount() {
        return commentsCount;
    }

    /**
     *
     * @param commentsCount
     * The comments_count
     */
    public void setCommentsCount(Integer commentsCount) {
        this.commentsCount = commentsCount;
    }

    /**
     *
     * @return
     * The commentsReceivedCount
     */
    public Integer getCommentsReceivedCount() {
        return commentsReceivedCount;
    }

    /**
     *
     * @param commentsReceivedCount
     * The comments_received_count
     */
    public void setCommentsReceivedCount(Integer commentsReceivedCount) {
        this.commentsReceivedCount = commentsReceivedCount;
    }

    /**
     *
     * @return
     * The reboundsCount
     */
    public Integer getReboundsCount() {
        return reboundsCount;
    }

    /**
     *
     * @param reboundsCount
     * The rebounds_count
     */
    public void setReboundsCount(Integer reboundsCount) {
        this.reboundsCount = reboundsCount;
    }

    /**
     *
     * @return
     * The reboundsReceivedCount
     */
    public Integer getReboundsReceivedCount() {
        return reboundsReceivedCount;
    }

    /**
     *
     * @param reboundsReceivedCount
     * The rebounds_received_count
     */
    public void setReboundsReceivedCount(Integer reboundsReceivedCount) {
        this.reboundsReceivedCount = reboundsReceivedCount;
    }

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The avatarUrl
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     *
     * @param avatarUrl
     * The avatar_url
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     *
     * @return
     * The username
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     * The username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return
     * The twitterScreenName
     */
    public Object getTwitterScreenName() {
        return twitterScreenName;
    }

    /**
     *
     * @param twitterScreenName
     * The twitter_screen_name
     */
    public void setTwitterScreenName(Object twitterScreenName) {
        this.twitterScreenName = twitterScreenName;
    }

    /**
     *
     * @return
     * The websiteUrl
     */
    public Object getWebsiteUrl() {
        return websiteUrl;
    }

    /**
     *
     * @param websiteUrl
     * The website_url
     */
    public void setWebsiteUrl(Object websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    /**
     *
     * @return
     * The draftedByPlayerId
     */
    public Integer getDraftedByPlayerId() {
        return draftedByPlayerId;
    }

    /**
     *
     * @param draftedByPlayerId
     * The drafted_by_player_id
     */
    public void setDraftedByPlayerId(Integer draftedByPlayerId) {
        this.draftedByPlayerId = draftedByPlayerId;
    }

    /**
     *
     * @return
     * The shotsCount
     */
    public Integer getShotsCount() {
        return shotsCount;
    }

    /**
     *
     * @param shotsCount
     * The shots_count
     */
    public void setShotsCount(Integer shotsCount) {
        this.shotsCount = shotsCount;
    }

    /**
     *
     * @return
     * The followingCount
     */
    public Integer getFollowingCount() {
        return followingCount;
    }

    /**
     *
     * @param followingCount
     * The following_count
     */
    public void setFollowingCount(Integer followingCount) {
        this.followingCount = followingCount;
    }

    /**
     *
     * @return
     * The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     *
     * @param createdAt
     * The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

}
