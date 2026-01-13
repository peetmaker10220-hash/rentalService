
    
package th.co.scb.ngage.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import th.co.scb.ngage.constant.ApiConstant;
import th.co.scb.ngage.handler.UserHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import th.co.scb.ngage.model.common.User;

@RestController
@RequestMapping(ApiConstant.BASE_URL)
public class DbController {

    @Autowired
    private final UserHandler userHandler;

     public DbController(UserHandler userHandler) {
        this.userHandler = userHandler;
    }
    @GetMapping("/users")
    public Object getAllUsers() {
        return userHandler.getAllUsers();
    }

    @PostMapping("/users")
    public Object createUser(@RequestBody User user) {
        return userHandler.saveUser(user);
    }

}

