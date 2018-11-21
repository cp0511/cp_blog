package com.cp.pojo;

import java.util.Date;

public class BlogTags {
	
    private Integer tagId;
    private String tagName;
    private Date createTime;
    private Integer isDelete;
    
    public BlogTags() {
        super();
    }
    
    public BlogTags(Integer tagId,String tagName,Date createTime,Integer isDelete) {
        super();
        this.tagId = tagId;
        this.tagName = tagName;
        this.createTime = createTime;
        this.isDelete = isDelete;
    }
    
    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
 	
 	public String toString(Integer tagId,String tagName,Date createTime,Integer isDelete) {
        return "BlogTags:【this.tagId:"+tagId+",this.tagName:"+tagName+",this.createTime:"+createTime+",this.isDelete:"+isDelete+"】";
    }
    
    public static class BlogTagsBuilder{
 	   
	    private Integer tagId;
	    private String tagName;
	    private Date createTime;
	    private Integer isDelete;

 	    public String toString(){
 	    	 return "BlogTags.BlogTagsBuilder:【this.tagId:"+tagId+",this.tagName:"+tagName+",this.createTime:"+createTime+",this.isDelete:"+isDelete+"】";
 	    }

 	    public BlogTags build(){
 	      return new BlogTags(tagId,tagName,createTime,isDelete);
 	    }

 	    public BlogTagsBuilder tagId(Integer tagId){
 	      this.tagId = tagId;
 	      return this;
 	    }
 	    
 	    public BlogTagsBuilder tagName(String tagName){
 	      this.tagName = tagName;
 	      return this;
 	    }
 	    
 	    public BlogTagsBuilder createTime(Date createTime){
 	      this.createTime = createTime;
 	      return this;
 	    }
 	    
 	    public BlogTagsBuilder isDelete(Integer isDelete){
 	      this.isDelete = isDelete;
 	      return this;
 	    }
 	    
 	  }

 	  public static BlogTags.BlogTagsBuilder builder(){
 	    return new BlogTags.BlogTagsBuilder();
 	  }
}