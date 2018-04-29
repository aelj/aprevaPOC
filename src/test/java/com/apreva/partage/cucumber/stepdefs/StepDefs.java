package com.apreva.partage.cucumber.stepdefs;

import com.apreva.partage.AprevaPocApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = AprevaPocApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
