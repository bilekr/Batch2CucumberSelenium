package com.krafttech.step_definitions;

import com.krafttech.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("\tThis is coming from Before Method");
        // her senaryo öncesinde çalışır

//        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        Driver.get().manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario){
        System.out.println("\tThis is coming from After Method");
        // her senaryo sonrasında çalışır

        if(scenario.isFailed()){ // hata durumunda screenhot alma
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        Driver.closeDriver();
    }
    @Before ("@db") // @db tagı ile tanımlı senaryodan önce calısır
    public void setUpDb(){
        System.out.println("\tConnecting DB");
        // @db tagı ile tanımlı senaryo öncesinde çalışır
    }

    @After ("@db") // @db tagı ile tanımlı senaryodan sonra calısır
    public void tearDownDb(){
        System.out.println("\tDisconnecting DB");
        // @db tagı ile tanımlı  senaryo sonrasında çalışır
    }

}
