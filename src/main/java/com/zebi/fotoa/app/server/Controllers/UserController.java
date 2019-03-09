package com.zebi.fotoa.app.server.Controllers;

import com.zebi.fotoa.app.server.Components.UserComponent;
import com.zebi.fotoa.app.server.Entities.User;
import com.zebi.fotoa.app.server.Exceptions.ObjectAlreadyExists;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/users")
@Api(value = "/users")
public class UserController {

    private UserComponent userComponent;

    @Autowired
    public UserController(UserComponent userComponent) {
        this.userComponent = userComponent;
    }

    @ApiOperation(
            value = "Fetch all users",
            response = User.class,
            responseContainer = "List"
    )
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "All users data fetched successfully"),
            @ApiResponse(code = 500, message = "Internal Server error")
    })

    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.status(HttpStatus.OK).body(this.userComponent.getUsers());
    }

    @ApiOperation(
            value = "Save a user",
            response = HttpStatus.class
    )
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "User saved successfully."),
            @ApiResponse(code = 500, message = "Internal Server error.")
    })

    public ResponseEntity<String> saveUser(@ApiParam(name = "user") User user) throws IOException, ObjectAlreadyExists {
        this.userComponent.saveUser(user);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }
}
