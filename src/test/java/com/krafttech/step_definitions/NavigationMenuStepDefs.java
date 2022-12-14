package com.krafttech.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefs {

    @When("Get the text of dashboard")
    public void get_the_text_of_dashboard() {
        System.out.println("dashboard");
        
    }
    @Then("go to Developers menu and get the text of Developer")
    public void go_to_developers_menu_and_get_the_text_of_developer() {
        System.out.println("text of developer");
    }

    @Then("go to Edit Profile menu and get the text of Edit User Profile")
    public void goToEditProfileMenuAndGetTheTextOfEditUserProfile() {
        System.out.println("text of edit user profile");
    }

    @Then("go to My Profile menu and get the text of User Profile")
    public void goToMyProfileMenuAndGetTheTextOfUserProfile() {
        System.out.println("text of user profile");
    }
}
