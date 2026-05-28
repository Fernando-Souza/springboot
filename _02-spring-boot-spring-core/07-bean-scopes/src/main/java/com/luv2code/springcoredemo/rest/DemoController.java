package com.luv2code.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springcoredemo.common.Coach;


@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;
    private Coach anotherCoach;

    public DemoController(
                @Qualifier("cricketCoach") Coach theCoach,
                @Qualifier("cricketCoach") Coach theAnotherCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

    

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }
//Quando em modo SINGLETON os dois objetos CricketCoach são os mesmos, logo alterar a
//propriedade de um tambem altera a de outro. O mesmo não ocorre se o escolpo for PROTOTIPO
    @GetMapping("/teste")
    public String getMethodName() {
        myCoach.setName("joão");
        return myCoach.getName();//PROTOTIPO
        //return anotherCoach.getName();SINGLETON
    }
    
}






