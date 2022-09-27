package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    //DiscussPost是帖子的对象   userId为以后开发个人用户我的主页功能做准备
    //offset：起始行行号   limit：每页最多显示多少条数据
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    //@Param给参数起别名，如果只有一个参数并且在<if>里使用，则必须加别名
    //查询帖子的行数
    int selectDiscussPostsRows(@Param("userId") int userId);

    int insertDiscussPost(DiscussPost discussPost);

    DiscussPost selectDiscussPostById(int id);

    //更新评论数量
    int updateCommentCount(int id,int commentCount);

    int updateType(int id, int type);

    int updateStatus(int id, int status);
}
