//package StepDefinitions;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//import java.util.List;
//
//public class DataTableDemo {
//    @When("I type the following names")
//    public void i_type_the_following_names(DataTable dataTable) {
//        List<List<String>> rows = dataTable.asLists(String.class);
//        for (List<String> columns : rows) {
//            System.out.println(columns.get(0) + "" + columns.get(1));
//        }
//    }
//
//
//    @And("I click on OK button")
//    public void i_click_on_ok_button() {
//        System.out.println("clicked ok");
//    }
//
//    @Then("I should see some Java")
//    public void i_should_see_some_java() {
//        System.out.println("Java");
//    }
//}