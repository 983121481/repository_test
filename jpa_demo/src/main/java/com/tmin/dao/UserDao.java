package com.tmin.dao;

import com.tmin.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author
 * @date 2021-01-21 16:36
 */
@Repository
public interface UserDao extends JpaRepository<User,Integer> {
}
