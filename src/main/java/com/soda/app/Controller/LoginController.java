package com.soda.app.Controller;

import com.soda.app.Model.Request.LoginFormRequest;
import com.soda.app.Model.Response.LoginFormResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class LoginController {
    @PostMapping("/login")
    public ResponseEntity<LoginFormResponse> Login(@RequestBody LoginFormRequest loginFormRequest){
        System.out.println("UserName : "+loginFormRequest.username);
        System.out.println("Password : "+loginFormRequest.password);

        LoginFormResponse response = new LoginFormResponse();
        response.username = loginFormRequest.username;
        return ResponseEntity.ok(response);

    }
}
