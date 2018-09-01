package MyFirstProject.myfirstproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class UserController {

    private ArrayList<User> users;

    public UserController() {
        this.users = new ArrayList<User>();
        for(int i = 0; i < 10; i++) {
            this.users.add(new User(i, "Name: " + i, (int)(Math.random()*100)));
        }
    }

    @GetMapping("/users")
    public ArrayList<User> getUsers() {
        return this.users;
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id){
        return this.users.get(id);
    }
}
