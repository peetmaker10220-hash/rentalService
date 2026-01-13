package th.co.scb.ngage.handler;

import org.springframework.stereotype.Component;
import th.co.scb.ngage.service.UserService;
import th.co.scb.ngage.model.common.User;

@Component
public class UserHandler {
    private final UserService userService;

    public UserHandler(UserService userService) {
        this.userService = userService;
    }

    public Object getAllUsers() {
        return userService.getAllUsers();
    }

    public Object saveUser(User user) {
        return userService.saveUser(user);
    }
}
