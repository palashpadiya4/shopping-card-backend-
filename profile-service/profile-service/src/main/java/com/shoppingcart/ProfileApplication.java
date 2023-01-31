package com.shoppingcart;

import com.shoppingcart.model.Role;
import com.shoppingcart.model.User;
import com.shoppingcart.model.UserRole;
import com.shoppingcart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ProfileApplication implements CommandLineRunner {

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;



    public static void main(String[] args) {
        SpringApplication.run( ProfileApplication.class, args);


    }

    @Override
    public void run(String... args) throws Exception {


            System.out.println("starting code");

//		User user = new User ( );
//	user.setFirstName ( "Palash" );
//	user.setLastName ( "Padiya" );
//user.setUsername ( "palash" );
//		user.setPassword ( this.bCryptPasswordEncoder.encode ( "abc" ) );
//	user.setEmail ( "palash@gmail.com" );
//  user.setPhone(" 987654321" );
//
//	Role role1=new Role (  );
//	role1.setRoleId (  10L);
//		role1.setRoleName ("Admin" );
//
//		Set<UserRole> userRoleset= new HashSet<> (  );
//	UserRole userRole =new UserRole ();
//		userRole.setRole(role1);
//	userRole.setUser(user);
//	userRoleset.add(userRole);
//
//		User user1= this.userService.createUser ( user,userRoleset );
//	System.out.println ( user1.getUsername () );
//

 }


    }



