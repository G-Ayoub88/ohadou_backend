package Service;

import Model.User;
import Exception.UserException;
import jdk.jshell.spi.ExecutionControl;

public interface UserService {

    public User findById(Long id) throws UserException;

    public User findUserProfileByJwt(String jwt)throws UserException;
}
