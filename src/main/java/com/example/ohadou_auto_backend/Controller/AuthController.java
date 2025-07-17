//package com.example.ohadou_auto_backend.Controller;
//
//import com.example.ohadou_auto_backend.Model.User;
//import com.example.ohadou_auto_backend.Exception.UserException;
//import com.example.ohadou_auto_backend.Repository.UserRepository;
//import com.example.ohadou_auto_backend.Response.AuthResponse;
//import com.example.ohadou_auto_backend.Service.CustomerService;
//import com.example.ohadou_auto_backend.config.JwtProvider;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.example.ohadou_auto_backend.request.LoginRequest;
//
//@RestController
//@RequestMapping("/auth")
//public class AuthController {
//    private  UserRepository userRepository;
//    private JwtProvider jwtProvider;
//    private PasswordEncoder passwordEncoder;
//    private CustomerService customerService;
//
//
//    public AuthController(UserRepository userRepository, JwtProvider jwtProvider, PasswordEncoder passwordEncoder, CustomerService customerService) {
//        this.userRepository = userRepository;
//        this.jwtProvider = jwtProvider;
//        this.passwordEncoder = passwordEncoder;
//        this.customerService = customerService;
//    }
//
//    @PostMapping("/signup")
//    public ResponseEntity<AuthResponse> createUserHandler(@RequestBody User user) throws UserException {
//        String email = user.getEmail();
//        String password = user.getPassword();
//        String firstName = user.getFirstName();
//        String lastName = user.getLastName();
//
//        User isEmailExist = userRepository.findByEmail(email);
//        if (isEmailExist != null) {
//            throw new UserException("Email already exists: " + email);
//        }
//
//
//
//        User createdUser = new User();
//        createdUser.setEmail(email);
//        createdUser.setPassword(passwordEncoder.encode(password));
//        createdUser.setFirstName(firstName);
//        createdUser.setLastName(lastName);
//        User saveUser=userRepository.save(createdUser);
//
//
//        Authentication auth = new UsernamePasswordAuthenticationToken(saveUser.getEmail(),saveUser.getPassword());
//        SecurityContextHolder.getContext().setAuthentication(auth);
//
//        String token =jwtProvider.generateToken(auth);
//
//        AuthResponse authResponse=new AuthResponse(token,"Signup successful");
//        return new ResponseEntity<AuthResponse>(authResponse,HttpStatus.CREATED);
//
//
//    }
//
//
//
//    @PostMapping("/signin")
//    public ResponseEntity<AuthResponse> loginUserHandler(@RequestBody LoginRequest loginRequest){
//    String username = loginRequest.getEmail();
//    String password = loginRequest.getPassword();
//
//    Authentication authentication=authenticate(username,password);
//    SecurityContextHolder.getContext().setAuthentication(authentication);
//
//    String token =jwtProvider.generateToken(authentication);
//    AuthResponse authResponse=new AuthResponse(token,"Login successful");
//        return new ResponseEntity<>(authResponse,HttpStatus.CREATED);
//    }
//
//    private Authentication authenticate(String username, String password) {
//        UserDetails userDetails = customerService.loadUserByUsername(username);
//        if (userDetails == null) {
//            throw new BadCredentialsException("Invalid username");
//        }
//        if (!passwordEncoder.matches(password,userDetails.getPassword())) {
//            throw new BadCredentialsException("Invalid password");
//        }
//        return new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
//    }
//}