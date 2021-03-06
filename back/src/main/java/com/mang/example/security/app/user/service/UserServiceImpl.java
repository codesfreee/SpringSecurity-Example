package com.mang.example.security.app.user.service;

import com.mang.example.security.app.user.model.UserVO;
import com.mang.example.security.app.user.repository.UserRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service("userService")
public class UserServiceImpl implements UserService {

    @NonNull
    private UserRepository userRepository;

    @Override
    public UserVO signUp(UserVO userVO) {
        return userRepository.save(userVO);
    }

    @Override
    public Optional<UserVO> findByEmail(String userEmail) {
        return userRepository.findByUserEmail(userEmail);
    }

    @Override
    public List<UserVO> findAll() {
        return userRepository.findAll();
    }
}
