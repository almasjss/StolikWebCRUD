package com.almasjss.StolikWebCRUD.service;

import com.almasjss.StolikWebCRUD.model.User;
import com.almasjss.StolikWebCRUD.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
@Autowired
    private IUserRepository iUserRepository;

public User saveUser(User user){
    if(user.getId() != null) {
        return iUserRepository.save(user);
    }
    return null;
}

public Page<User> getAllUser(Integer page,Integer size,Boolean enablePagination){
    return iUserRepository.findAll(enablePagination? PageRequest.of(page,size): Pageable.unpaged());
}

public Optional<User> findById(Long id){
    return iUserRepository.findById(id);
}
public void deleteUser(Long id){
    iUserRepository.deleteById(id);
}
public User editUser(User user){
    if(user.getId() != null && iUserRepository.existsById(user.getId())) {
        return iUserRepository.save(user);
    }
    return null;
}
public boolean existById(Long id){
    return  iUserRepository.existsById(id);
}

}
