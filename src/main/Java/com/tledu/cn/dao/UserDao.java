package com.tledu.cn.dao;

import com.tledu.cn.pojo.Answer;
import com.tledu.cn.pojo.Classify;
import com.tledu.cn.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author:17
 * Date:2021-01-20 11:13
 * Description:<描述>
 */
@Mapper
public interface UserDao {
    int registerUser(User user);
    List<User> selectUser(User user);  //查看 acc 是否存在，防止acc 重复
    User userLogin(User user);
    List<User> selectUserAccPhone(User user); //查看是否存在 acc ，phone 一致的用户，一致，后续用于更改密码
    int changePwd(User user);
    int upLoadImage(User user);

    List<Classify> selectClassify(Classify classify); //查看 分类名 是否存在
    int addClassify(Classify classify);
    int deleteClassify(Classify classify);
    List<Classify> getClassifyInfo(Classify classify);

    List<Answer> selectAnswer(Answer answer);//查看 题目名 是否存在
    Classify selectClassifyID(Answer answer);
    int addAnswer(Answer answer);
    int deleteAnswer(Answer answer);
    int modifyAnswer(Answer answer);
    List<Answer> getTopicInfo(String uId);
    Answer getAnswerById(Answer answer);


}


