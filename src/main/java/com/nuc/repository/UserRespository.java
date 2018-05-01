package com.nuc.repository;

import com.nuc.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 描述:
 *
 * @author 闫文强
 * @create 2018-05-01 21:50
 */

//继承JpaRepository来完成对数据库的操作
public interface UserRespository extends JpaRepository<User,Integer> {

}