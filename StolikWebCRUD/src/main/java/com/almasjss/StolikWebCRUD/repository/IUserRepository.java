package com.almasjss.StolikWebCRUD.repository;

import com.almasjss.StolikWebCRUD.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {


}
