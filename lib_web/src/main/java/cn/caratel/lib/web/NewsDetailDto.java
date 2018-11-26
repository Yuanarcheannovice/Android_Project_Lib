package cn.caratel.lib.web;

/**
 * Created by xz on 2018/4/25.
 * 动态详情
 */

public class NewsDetailDto {
    /**
     * 动态Id
     */
    private String newsId;
    /**
     * 引标
     */
    private String leadTitle;
    /**
     * 主标题
     */
    private String newsTitle;
    /**
     * 副标
     */
    private String newsTime;
    /**
     * 动态发布时间
     */
    private String  subTitle;
    /**
     * 动态详情
     富文本，包含html

     */
    private String newsContent;

    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId;
    }

    public String getLeadTitle() {
        return leadTitle;
    }

    public void setLeadTitle(String leadTitle) {
        this.leadTitle = leadTitle;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(String newsTime) {
        this.newsTime = newsTime;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }
}
