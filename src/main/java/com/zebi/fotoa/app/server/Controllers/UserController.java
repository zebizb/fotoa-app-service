package com.zebi.fotoa.app.server.Controllers;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.zebi.fotoa.app.server.Components.UserComponent;
import com.zebi.fotoa.app.server.Entities.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "All users data fetched successfully"),
            @ApiResponse(code = 500, message = "Internal Server error")
    })

    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.status(HttpStatus.OK).body(this.userComponent.getUsers());
    }

}
