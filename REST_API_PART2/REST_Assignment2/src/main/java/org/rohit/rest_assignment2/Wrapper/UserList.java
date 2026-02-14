package org.rohit.rest_assignment2.Wrapper;


import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import org.rohit.rest_assignment2.Model.User;


@JacksonXmlRootElement(localName = "users")
public class UserList {

    private List<User> user;

    public UserList(List<User> user) {
        this.user = user;
    }

    public List<User> getUser() {
        return user;
    }

    public User findUser(int id){
        return user.get(id);
    }
}

