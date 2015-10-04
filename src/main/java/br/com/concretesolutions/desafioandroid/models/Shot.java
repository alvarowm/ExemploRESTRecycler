package br.com.concretesolutions.desafioandroid.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alvaro on 25/09/2015.
 */
public class Shot {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("likes_count")
    @Expose
    private Integer likesCount;
    @SerializedName("comments_count")
    @Expose
    private Integer commentsCount;
    @SerializedName("rebounds_count")
    @Expose
    private Integer reboundsCount;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("short_url")
    @Expose
    private String shortUrl;
    @SerializedName("views_count")
    @Expose
    private Integer viewsCount;
    @SerializedName("rebound_source_id")
    @Expose
    private Object reboundSourceId;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("image_teaser_url")
    @Expose
    private String imageTeaserUrl;
    @SerializedName("image_400_url")
    @Expose
    private String image400Url;
    @SerializedName("player")
    @Expose
    private Player player;
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
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The height
     */
    public Integer getHeight() {
        return height;
    }

    /**
     *
     * @param height
     * The height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     *
     * @return
     * The width
     */
    public Integer getWidth() {
        return width;
    }

    /**
     *
     * @param width
     * The width
     */
    public void setWidth(Integer width) {
        this.width = width;
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
     * The shortUrl
     */
    public String getShortUrl() {
        return shortUrl;
    }

    /**
     *
     * @param shortUrl
     * The short_url
     */
    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    /**
     *
     * @return
     * The viewsCount
     */
    public Integer getViewsCount() {
        return viewsCount;
    }

    /**
     *
     * @param viewsCount
     * The views_count
     */
    public void setViewsCount(Integer viewsCount) {
        this.viewsCount = viewsCount;
    }

    /**
     *
     * @return
     * The reboundSourceId
     */
    public Object getReboundSourceId() {
        return reboundSourceId;
    }

    /**
     *
     * @param reboundSourceId
     * The rebound_source_id
     */
    public void setReboundSourceId(Object reboundSourceId) {
        this.reboundSourceId = reboundSourceId;
    }

    /**
     *
     * @return
     * The imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     *
     * @param imageUrl
     * The image_url
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     *
     * @return
     * The imageTeaserUrl
     */
    public String getImageTeaserUrl() {
        return imageTeaserUrl;
    }

    /**
     *
     * @param imageTeaserUrl
     * The image_teaser_url
     */
    public void setImageTeaserUrl(String imageTeaserUrl) {
        this.imageTeaserUrl = imageTeaserUrl;
    }

    /**
     *
     * @return
     * The image400Url
     */
    public String getImage400Url() {
        return image400Url;
    }

    /**
     *
     * @param image400Url
     * The image_400_url
     */
    public void setImage400Url(String image400Url) {
        this.image400Url = image400Url;
    }

    /**
     *
     * @return
     * The player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     *
     * @param player
     * The player
     */
    public void setPlayer(Player player) {
        this.player = player;
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
