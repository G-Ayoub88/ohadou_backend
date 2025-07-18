//package com.example.ohadou_auto_backend.Service;
//
//import com.example.ohadou_auto_backend.Model.User;
//import com.example.ohadou_auto_backend.Repository.UserRepository;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class CustomerService implements UserDetailsService {
//
//    private UserRepository userRepository;
//
//    public CustomerService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//        User user = userRepository.findByEmail(username);
//        if (user == null) {
//            throw new UsernameNotFoundException("user not found with email: " + username);
//        }
//        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
//
//        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), grantedAuthorities);
//
//    }
//}
