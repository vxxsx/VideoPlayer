package com.example.videoplayer;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VideoBean {

    @SerializedName("count")
    private Integer count;
    @SerializedName("total")
    private Integer total;
    @SerializedName("nextPageUrl")
    private String nextPageUrl;
    @SerializedName("adExist")
    private Boolean adExist;
    @SerializedName("date")
    private Long date;
    @SerializedName("nextPublishTime")
    private Long nextPublishTime;
    @SerializedName("dialog")
    private Object dialog;
    @SerializedName("topIssue")
    private Object topIssue;
    @SerializedName("refreshCount")
    private Integer refreshCount;
    @SerializedName("lastStartId")
    private Integer lastStartId;
    @SerializedName("itemList")
    private List<ItemListDTO> itemList;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getNextPageUrl() {
        return nextPageUrl;
    }

    public void setNextPageUrl(String nextPageUrl) {
        this.nextPageUrl = nextPageUrl;
    }

    public Boolean isAdExist() {
        return adExist;
    }

    public void setAdExist(Boolean adExist) {
        this.adExist = adExist;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public Long getNextPublishTime() {
        return nextPublishTime;
    }

    public void setNextPublishTime(Long nextPublishTime) {
        this.nextPublishTime = nextPublishTime;
    }

    public Object getDialog() {
        return dialog;
    }

    public void setDialog(Object dialog) {
        this.dialog = dialog;
    }

    public Object getTopIssue() {
        return topIssue;
    }

    public void setTopIssue(Object topIssue) {
        this.topIssue = topIssue;
    }

    public Integer getRefreshCount() {
        return refreshCount;
    }

    public void setRefreshCount(Integer refreshCount) {
        this.refreshCount = refreshCount;
    }

    public Integer getLastStartId() {
        return lastStartId;
    }

    public void setLastStartId(Integer lastStartId) {
        this.lastStartId = lastStartId;
    }

    public List<ItemListDTO> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemListDTO> itemList) {
        this.itemList = itemList;
    }

    public static class ItemListDTO {
        @SerializedName("type")
        private String type;
        @SerializedName("data")
        private DataDTO data;
        @SerializedName("trackingData")
        private Object trackingData;
        @SerializedName("tag")
        private Object tag;
        @SerializedName("id")
        private Integer id;
        @SerializedName("adIndex")
        private Integer adIndex;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public DataDTO getData() {
            return data;
        }

        public void setData(DataDTO data) {
            this.data = data;
        }

        public Object getTrackingData() {
            return trackingData;
        }

        public void setTrackingData(Object trackingData) {
            this.trackingData = trackingData;
        }

        public Object getTag() {
            return tag;
        }

        public void setTag(Object tag) {
            this.tag = tag;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getAdIndex() {
            return adIndex;
        }

        public void setAdIndex(Integer adIndex) {
            this.adIndex = adIndex;
        }

        public static class DataDTO {
            @SerializedName("dataType")
            private String dataType;
            @SerializedName("id")
            private Integer id;
            @SerializedName("title")
            private String title;
            @SerializedName("description")
            private String description;
            @SerializedName("library")
            private String library;
            @SerializedName("consumption")
            private ConsumptionDTO consumption;
            @SerializedName("resourceType")
            private String resourceType;
            @SerializedName("slogan")
            private String slogan;
            @SerializedName("provider")
            private ProviderDTO provider;
            @SerializedName("category")
            private String category;
            @SerializedName("author")
            private AuthorDTO author;
            @SerializedName("cover")
            private CoverDTO cover;
            @SerializedName("playUrl")
            private String playUrl;
            @SerializedName("thumbPlayUrl")
            private String thumbPlayUrl;
            @SerializedName("duration")
            private Integer duration;
            @SerializedName("webUrl")
            private WebUrlDTO webUrl;
            @SerializedName("releaseTime")
            private Long releaseTime;
            @SerializedName("campaign")
            private Object campaign;
            @SerializedName("waterMarks")
            private Object waterMarks;
            @SerializedName("ad")
            private Boolean ad;
            @SerializedName("adTrack")
            private Object adTrack;
            @SerializedName("type")
            private String type;
            @SerializedName("titlePgc")
            private String titlePgc;
            @SerializedName("descriptionPgc")
            private String descriptionPgc;
            @SerializedName("remark")
            private String remark;
            @SerializedName("ifLimitVideo")
            private Boolean ifLimitVideo;
            @SerializedName("searchWeight")
            private Integer searchWeight;
            @SerializedName("brandWebsiteInfo")
            private Object brandWebsiteInfo;
            @SerializedName("videoPosterBean")
            private Object videoPosterBean;
            @SerializedName("idx")
            private Integer idx;
            @SerializedName("shareAdTrack")
            private Object shareAdTrack;
            @SerializedName("favoriteAdTrack")
            private Object favoriteAdTrack;
            @SerializedName("webAdTrack")
            private Object webAdTrack;
            @SerializedName("date")
            private Long date;
            @SerializedName("promotion")
            private Object promotion;
            @SerializedName("label")
            private Object label;
            @SerializedName("descriptionEditor")
            private String descriptionEditor;
            @SerializedName("collected")
            private Boolean collected;
            @SerializedName("reallyCollected")
            private Boolean reallyCollected;
            @SerializedName("played")
            private Boolean played;
            @SerializedName("lastViewTime")
            private Object lastViewTime;
            @SerializedName("playlists")
            private Object playlists;
            @SerializedName("src")
            private Object src;
            @SerializedName("recallSource")
            private Object recallSource;


            @SerializedName("tags")
            private List<TagsDTO> tags;
            @SerializedName("playInfo")
            private List<PlayInfoDTO> playInfo;
            @SerializedName("labelList")
            private List<?> labelList;
            @SerializedName("subtitles")
            private List<?> subtitles;

            public String getDataType() {
                return dataType;
            }

            public void setDataType(String dataType) {
                this.dataType = dataType;
            }

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
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

            public String getLibrary() {
                return library;
            }

            public void setLibrary(String library) {
                this.library = library;
            }

            public ConsumptionDTO getConsumption() {
                return consumption;
            }

            public void setConsumption(ConsumptionDTO consumption) {
                this.consumption = consumption;
            }

            public String getResourceType() {
                return resourceType;
            }

            public void setResourceType(String resourceType) {
                this.resourceType = resourceType;
            }

            public String getSlogan() {
                return slogan;
            }

            public void setSlogan(String slogan) {
                this.slogan = slogan;
            }

            public ProviderDTO getProvider() {
                return provider;
            }

            public void setProvider(ProviderDTO provider) {
                this.provider = provider;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public AuthorDTO getAuthor() {
                return author;
            }

            public void setAuthor(AuthorDTO author) {
                this.author = author;
            }

            public CoverDTO getCover() {
                return cover;
            }

            public void setCover(CoverDTO cover) {
                this.cover = cover;
            }

            public String getPlayUrl() {
                return playUrl;
            }

            public void setPlayUrl(String playUrl) {
                this.playUrl = playUrl;
            }

            public String getThumbPlayUrl() {
                return thumbPlayUrl;
            }

            public void setThumbPlayUrl(String thumbPlayUrl) {
                this.thumbPlayUrl = thumbPlayUrl;
            }

            public Integer getDuration() {
                return duration;
            }

            public void setDuration(Integer duration) {
                this.duration = duration;
            }

            public WebUrlDTO getWebUrl() {
                return webUrl;
            }

            public void setWebUrl(WebUrlDTO webUrl) {
                this.webUrl = webUrl;
            }

            public Long getReleaseTime() {
                return releaseTime;
            }

            public void setReleaseTime(Long releaseTime) {
                this.releaseTime = releaseTime;
            }

            public Object getCampaign() {
                return campaign;
            }

            public void setCampaign(Object campaign) {
                this.campaign = campaign;
            }

            public Object getWaterMarks() {
                return waterMarks;
            }

            public void setWaterMarks(Object waterMarks) {
                this.waterMarks = waterMarks;
            }

            public Boolean isAd() {
                return ad;
            }

            public void setAd(Boolean ad) {
                this.ad = ad;
            }

            public Object getAdTrack() {
                return adTrack;
            }

            public void setAdTrack(Object adTrack) {
                this.adTrack = adTrack;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getTitlePgc() {
                return titlePgc;
            }

            public void setTitlePgc(String titlePgc) {
                this.titlePgc = titlePgc;
            }

            public String getDescriptionPgc() {
                return descriptionPgc;
            }

            public void setDescriptionPgc(String descriptionPgc) {
                this.descriptionPgc = descriptionPgc;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public Boolean isIfLimitVideo() {
                return ifLimitVideo;
            }

            public void setIfLimitVideo(Boolean ifLimitVideo) {
                this.ifLimitVideo = ifLimitVideo;
            }

            public Integer getSearchWeight() {
                return searchWeight;
            }

            public void setSearchWeight(Integer searchWeight) {
                this.searchWeight = searchWeight;
            }

            public Object getBrandWebsiteInfo() {
                return brandWebsiteInfo;
            }

            public void setBrandWebsiteInfo(Object brandWebsiteInfo) {
                this.brandWebsiteInfo = brandWebsiteInfo;
            }

            public Object getVideoPosterBean() {
                return videoPosterBean;
            }

            public void setVideoPosterBean(Object videoPosterBean) {
                this.videoPosterBean = videoPosterBean;
            }

            public Integer getIdx() {
                return idx;
            }

            public void setIdx(Integer idx) {
                this.idx = idx;
            }

            public Object getShareAdTrack() {
                return shareAdTrack;
            }

            public void setShareAdTrack(Object shareAdTrack) {
                this.shareAdTrack = shareAdTrack;
            }

            public Object getFavoriteAdTrack() {
                return favoriteAdTrack;
            }

            public void setFavoriteAdTrack(Object favoriteAdTrack) {
                this.favoriteAdTrack = favoriteAdTrack;
            }

            public Object getWebAdTrack() {
                return webAdTrack;
            }

            public void setWebAdTrack(Object webAdTrack) {
                this.webAdTrack = webAdTrack;
            }

            public Long getDate() {
                return date;
            }

            public void setDate(Long date) {
                this.date = date;
            }

            public Object getPromotion() {
                return promotion;
            }

            public void setPromotion(Object promotion) {
                this.promotion = promotion;
            }

            public Object getLabel() {
                return label;
            }

            public void setLabel(Object label) {
                this.label = label;
            }

            public String getDescriptionEditor() {
                return descriptionEditor;
            }

            public void setDescriptionEditor(String descriptionEditor) {
                this.descriptionEditor = descriptionEditor;
            }

            public Boolean isCollected() {
                return collected;
            }

            public void setCollected(Boolean collected) {
                this.collected = collected;
            }

            public Boolean isReallyCollected() {
                return reallyCollected;
            }

            public void setReallyCollected(Boolean reallyCollected) {
                this.reallyCollected = reallyCollected;
            }

            public Boolean isPlayed() {
                return played;
            }

            public void setPlayed(Boolean played) {
                this.played = played;
            }

            public Object getLastViewTime() {
                return lastViewTime;
            }

            public void setLastViewTime(Object lastViewTime) {
                this.lastViewTime = lastViewTime;
            }

            public Object getPlaylists() {
                return playlists;
            }

            public void setPlaylists(Object playlists) {
                this.playlists = playlists;
            }

            public Object getSrc() {
                return src;
            }

            public void setSrc(Object src) {
                this.src = src;
            }

            public Object getRecallSource() {
                return recallSource;
            }

            public void setRecallSource(Object recallSource) {
                this.recallSource = recallSource;
            }





            public List<TagsDTO> getTags() {
                return tags;
            }

            public void setTags(List<TagsDTO> tags) {
                this.tags = tags;
            }

            public List<PlayInfoDTO> getPlayInfo() {
                return playInfo;
            }

            public void setPlayInfo(List<PlayInfoDTO> playInfo) {
                this.playInfo = playInfo;
            }

            public List<?> getLabelList() {
                return labelList;
            }

            public void setLabelList(List<?> labelList) {
                this.labelList = labelList;
            }

            public List<?> getSubtitles() {
                return subtitles;
            }

            public void setSubtitles(List<?> subtitles) {
                this.subtitles = subtitles;
            }

            public static class ConsumptionDTO {
                @SerializedName("collectionCount")
                private Integer collectionCount;
                @SerializedName("shareCount")
                private Integer shareCount;
                @SerializedName("replyCount")
                private Integer replyCount;
                @SerializedName("realCollectionCount")
                private Integer realCollectionCount;

                public Integer getCollectionCount() {
                    return collectionCount;
                }

                public void setCollectionCount(Integer collectionCount) {
                    this.collectionCount = collectionCount;
                }

                public Integer getShareCount() {
                    return shareCount;
                }

                public void setShareCount(Integer shareCount) {
                    this.shareCount = shareCount;
                }

                public Integer getReplyCount() {
                    return replyCount;
                }

                public void setReplyCount(Integer replyCount) {
                    this.replyCount = replyCount;
                }

                public Integer getRealCollectionCount() {
                    return realCollectionCount;
                }

                public void setRealCollectionCount(Integer realCollectionCount) {
                    this.realCollectionCount = realCollectionCount;
                }
            }

            public static class ProviderDTO {
                @SerializedName("name")
                private String name;
                @SerializedName("alias")
                private String alias;
                @SerializedName("icon")
                private String icon;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getAlias() {
                    return alias;
                }

                public void setAlias(String alias) {
                    this.alias = alias;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }
            }

            public static class AuthorDTO {
                @SerializedName("id")
                private Integer id;
                @SerializedName("icon")
                private String icon;
                @SerializedName("name")
                private String name;
                @SerializedName("description")
                private String description;
                @SerializedName("link")
                private String link;
                @SerializedName("latestReleaseTime")
                private Long latestReleaseTime;
                @SerializedName("videoNum")
                private Integer videoNum;
                @SerializedName("adTrack")
                private Object adTrack;
                @SerializedName("follow")
                private FollowDTO follow;
                @SerializedName("shield")
                private ShieldDTO shield;
                @SerializedName("approvedNotReadyVideoCount")
                private Integer approvedNotReadyVideoCount;
                @SerializedName("ifPgc")
                private Boolean ifPgc;
                @SerializedName("recSort")
                private Integer recSort;
                @SerializedName("expert")
                private Boolean expert;

                public Integer getId() {
                    return id;
                }

                public void setId(Integer id) {
                    this.id = id;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getLink() {
                    return link;
                }

                public void setLink(String link) {
                    this.link = link;
                }

                public Long getLatestReleaseTime() {
                    return latestReleaseTime;
                }

                public void setLatestReleaseTime(Long latestReleaseTime) {
                    this.latestReleaseTime = latestReleaseTime;
                }

                public Integer getVideoNum() {
                    return videoNum;
                }

                public void setVideoNum(Integer videoNum) {
                    this.videoNum = videoNum;
                }

                public Object getAdTrack() {
                    return adTrack;
                }

                public void setAdTrack(Object adTrack) {
                    this.adTrack = adTrack;
                }

                public FollowDTO getFollow() {
                    return follow;
                }

                public void setFollow(FollowDTO follow) {
                    this.follow = follow;
                }

                public ShieldDTO getShield() {
                    return shield;
                }

                public void setShield(ShieldDTO shield) {
                    this.shield = shield;
                }

                public Integer getApprovedNotReadyVideoCount() {
                    return approvedNotReadyVideoCount;
                }

                public void setApprovedNotReadyVideoCount(Integer approvedNotReadyVideoCount) {
                    this.approvedNotReadyVideoCount = approvedNotReadyVideoCount;
                }

                public Boolean isIfPgc() {
                    return ifPgc;
                }

                public void setIfPgc(Boolean ifPgc) {
                    this.ifPgc = ifPgc;
                }

                public Integer getRecSort() {
                    return recSort;
                }

                public void setRecSort(Integer recSort) {
                    this.recSort = recSort;
                }

                public Boolean isExpert() {
                    return expert;
                }

                public void setExpert(Boolean expert) {
                    this.expert = expert;
                }

                public static class FollowDTO {
                    @SerializedName("itemType")
                    private String itemType;
                    @SerializedName("itemId")
                    private Integer itemId;
                    @SerializedName("followed")
                    private Boolean followed;

                    public String getItemType() {
                        return itemType;
                    }

                    public void setItemType(String itemType) {
                        this.itemType = itemType;
                    }

                    public Integer getItemId() {
                        return itemId;
                    }

                    public void setItemId(Integer itemId) {
                        this.itemId = itemId;
                    }

                    public Boolean isFollowed() {
                        return followed;
                    }

                    public void setFollowed(Boolean followed) {
                        this.followed = followed;
                    }
                }

                public static class ShieldDTO {
                    @SerializedName("itemType")
                    private String itemType;
                    @SerializedName("itemId")
                    private Integer itemId;
                    @SerializedName("shielded")
                    private Boolean shielded;

                    public String getItemType() {
                        return itemType;
                    }

                    public void setItemType(String itemType) {
                        this.itemType = itemType;
                    }

                    public Integer getItemId() {
                        return itemId;
                    }

                    public void setItemId(Integer itemId) {
                        this.itemId = itemId;
                    }

                    public Boolean isShielded() {
                        return shielded;
                    }

                    public void setShielded(Boolean shielded) {
                        this.shielded = shielded;
                    }
                }
            }

            public static class CoverDTO {
                @SerializedName("feed")
                private String feed;
                @SerializedName("detail")
                private String detail;
                @SerializedName("blurred")
                private String blurred;
                @SerializedName("sharing")
                private Object sharing;
                @SerializedName("homepage")
                private String homepage;

                public String getFeed() {
                    return feed;
                }

                public void setFeed(String feed) {
                    this.feed = feed;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getBlurred() {
                    return blurred;
                }

                public void setBlurred(String blurred) {
                    this.blurred = blurred;
                }

                public Object getSharing() {
                    return sharing;
                }

                public void setSharing(Object sharing) {
                    this.sharing = sharing;
                }

                public String getHomepage() {
                    return homepage;
                }

                public void setHomepage(String homepage) {
                    this.homepage = homepage;
                }
            }

            public static class WebUrlDTO {
                @SerializedName("raw")
                private String raw;
                @SerializedName("forWeibo")
                private String forWeibo;

                public String getRaw() {
                    return raw;
                }

                public void setRaw(String raw) {
                    this.raw = raw;
                }

                public String getForWeibo() {
                    return forWeibo;
                }

                public void setForWeibo(String forWeibo) {
                    this.forWeibo = forWeibo;
                }
            }

            public static class TagsDTO {
                @SerializedName("id")
                private Integer id;
                @SerializedName("name")
                private String name;
                @SerializedName("actionUrl")
                private String actionUrl;
                @SerializedName("adTrack")
                private Object adTrack;
                @SerializedName("desc")
                private String desc;
                @SerializedName("bgPicture")
                private String bgPicture;
                @SerializedName("headerImage")
                private String headerImage;
                @SerializedName("tagRecType")
                private String tagRecType;
                @SerializedName("childTagList")
                private Object childTagList;
                @SerializedName("childTagIdList")
                private Object childTagIdList;
                @SerializedName("haveReward")
                private Boolean haveReward;
                @SerializedName("ifNewest")
                private Boolean ifNewest;
                @SerializedName("newestEndTime")
                private Object newestEndTime;
                @SerializedName("communityIndex")
                private Integer communityIndex;

                public Integer getId() {
                    return id;
                }

                public void setId(Integer id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getActionUrl() {
                    return actionUrl;
                }

                public void setActionUrl(String actionUrl) {
                    this.actionUrl = actionUrl;
                }

                public Object getAdTrack() {
                    return adTrack;
                }

                public void setAdTrack(Object adTrack) {
                    this.adTrack = adTrack;
                }

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getBgPicture() {
                    return bgPicture;
                }

                public void setBgPicture(String bgPicture) {
                    this.bgPicture = bgPicture;
                }

                public String getHeaderImage() {
                    return headerImage;
                }

                public void setHeaderImage(String headerImage) {
                    this.headerImage = headerImage;
                }

                public String getTagRecType() {
                    return tagRecType;
                }

                public void setTagRecType(String tagRecType) {
                    this.tagRecType = tagRecType;
                }

                public Object getChildTagList() {
                    return childTagList;
                }

                public void setChildTagList(Object childTagList) {
                    this.childTagList = childTagList;
                }

                public Object getChildTagIdList() {
                    return childTagIdList;
                }

                public void setChildTagIdList(Object childTagIdList) {
                    this.childTagIdList = childTagIdList;
                }

                public Boolean isHaveReward() {
                    return haveReward;
                }

                public void setHaveReward(Boolean haveReward) {
                    this.haveReward = haveReward;
                }

                public Boolean isIfNewest() {
                    return ifNewest;
                }

                public void setIfNewest(Boolean ifNewest) {
                    this.ifNewest = ifNewest;
                }

                public Object getNewestEndTime() {
                    return newestEndTime;
                }

                public void setNewestEndTime(Object newestEndTime) {
                    this.newestEndTime = newestEndTime;
                }

                public Integer getCommunityIndex() {
                    return communityIndex;
                }

                public void setCommunityIndex(Integer communityIndex) {
                    this.communityIndex = communityIndex;
                }
            }

            public static class PlayInfoDTO {
                @SerializedName("height")
                private Integer height;
                @SerializedName("width")
                private Integer width;
                @SerializedName("name")
                private String name;
                @SerializedName("type")
                private String type;
                @SerializedName("url")
                private String url;
                @SerializedName("urlList")
                private List<UrlListDTO> urlList;

                public Integer getHeight() {
                    return height;
                }

                public void setHeight(Integer height) {
                    this.height = height;
                }

                public Integer getWidth() {
                    return width;
                }

                public void setWidth(Integer width) {
                    this.width = width;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public List<UrlListDTO> getUrlList() {
                    return urlList;
                }

                public void setUrlList(List<UrlListDTO> urlList) {
                    this.urlList = urlList;
                }

                public static class UrlListDTO {
                    @SerializedName("name")
                    private String name;
                    @SerializedName("url")
                    private String url;
                    @SerializedName("size")
                    private Integer size;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public Integer getSize() {
                        return size;
                    }

                    public void setSize(Integer size) {
                        this.size = size;
                    }
                }
            }
        }
    }
}
