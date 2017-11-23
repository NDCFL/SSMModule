package com.fz.dao;

import com.fz.vo.UserVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/9/13.
 */
@Repository
public interface UserDAO extends  BaseDAO<UserVo> {
    int checkReg(String acc);
    int checkLogin(String acc);
    void updatePwd(@Param("id") long id, @Param("pwd") String pwd);
    String getPassword(long id);
}
