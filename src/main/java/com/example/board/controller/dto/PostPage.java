package com.example.board.controller.dto;

import com.example.board.model.Post;
import com.example.board.model.PostComment;
import com.example.board.model.PostFile;

import java.util.List;

public class PostPage {
    private int pageSize;
    private int pageNo;
    private int totalCount;
    private List<Post> posts;
    private List<PostComment> postsComment;
    private List<PostFile> postsFile;

    public int getTotalPage () {
        int totalPage = totalCount / pageSize;
        if (totalCount % pageSize > 0) {
            return totalPage + 1;
        }
        return totalPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }
    public void setPageNo(int pageNo) {
        this.pageNo = Math.max(pageNo, 1);
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<PostComment> getPostsComment() {
        return postsComment;
    }

    public void setPostsComment(List<PostComment> postsComment) {
        this.postsComment = postsComment;
    }

    public List<PostFile> getPostsFile() {
        return postsFile;
    }

    public void setPostsFile(List<PostFile> postsFile) {
        this.postsFile = postsFile;
    }

}
