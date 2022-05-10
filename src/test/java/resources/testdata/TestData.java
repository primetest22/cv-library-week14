package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

     @DataProvider(name = "jobsearch")
      public Object[][] getData(){

          Object[][] data = new Object[][]{

                  {"Tester","Harrow","up to 5 miles","30000","500000","Per annum","Permanent",
                  "Permanent Tester jobs in Harrow on the Hill"},

                  {"programmer","Glasgow","up to 15 miles","40000","700000","Per annum","Contract",
                          "Contract Programmer jobs in Glasgow"},

                  {"Computer Science","Manchester","up to 7 miles","70000","1000000","Per annum","Permanent",
                          "Permanent Computer Science jobs in Manchester"}
          };
          return data;
      }


}
