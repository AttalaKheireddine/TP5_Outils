
import java.security.Principal;
package com.telly.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframeimport rg.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.telly.dao.FormValidationGroup;
import com.telly.dao.Reserve;
import com.telly.service.ReserveService;

@Controler

class UserController {
    @RequestMapping("/createaccount")
    public String createAccount(Model model, Principal principal) {

        model.addAttribute("user", new User());

        return "createaccount";
    }

    @RequestMapping(value = "/createuser", method = RequestMethod.POST)
    public String createUser(@Validated(FormValidationGroup.class) User user, BindingResult result) {

        if (result.hasErrors()) {
            return "createaccount";
        }

        user.setAuthority("ROLE_USER");
        user.setEnabled(true);

        userService.create(user);

        return "home";

    }

    @RequestMapping("/login")
    public String showLogin() {
        return "login";
    }

    @RequestMapping("/loggedout")
    public String showLogout() {
        return "loggedout";
    }

    Reserv

    public String createReserveBook(@Validated(FormValidationGroup.class) Reserve reserve, BindingResult result, Principal principal) {
		
		if (result.hasErrors()) {
			return "reservebus";
		}
		
		String username = principal.getName();
		reserve.getU
    	

    
    	
            

        
             }

    ublic String

    getReserveBook(@Validated
        

        String username = principal.getN

        List<Reserve> reserves = reserveService.getReserves(username);
		model.addAttribute("reserves", reserves);
		Sys

    
		return "home";

	}
}
