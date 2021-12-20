package isi.tn.service;



import java.util.List;

import isi.tn.model.User;
import isi.tn.model.UserDto;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(long id);
    User findOne(String username);

    User findById(Long id);
}
