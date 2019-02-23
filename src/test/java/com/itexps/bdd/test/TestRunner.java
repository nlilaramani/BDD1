     /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.bdd.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 *
 * @author Owner
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/java/features",
  glue="StepDefs",
  format={"pretty","html:test-output","json:jsson-output/cucumber.json","junit:junit_xml/cucumber.xml"},
   dryRun=false,
   monochrome=true,
   strict=true)
  
public class TestRunner {
  
}
                                                                                        