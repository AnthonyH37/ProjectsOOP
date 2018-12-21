/**
 * Author: Anthony Horvath Date: 12/11/2018 Description: Will allow the user to input their full
 *
 * <p>name and then create a user id of their first initial and surname
 */
import java.util.Scanner;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class EmployeeInfo {

  private StringBuilder name;

  private String code;

  private Scanner in = new Scanner(System.in, "UTF-8");

  private String deptId;

  private Pattern p = Pattern.compile("^[A-Z][a-z]{3}[1-9]{2}$");

  EmployeeInfo() {

    setName();

    setDeptId();
  }

  StringBuilder getName() {

    return this.name;
  }

  private String getCode() {

    return this.code;
  }

  // The setName method is called from the constructor which will use inputName to get

  // a full employee name as input.

  private void setName() {

    StringBuilder testName = new StringBuilder(inputName());

    if (checkName(testName)) {

      this.name = testName;

      createEmployeeCode(testName);

    } else {

      this.name = testName;

      this.code = "guest";
    }
  }

  // createEmployeeCode takes the first initial from the first

  // name and add it to the full surname to create the code

  private void createEmployeeCode(StringBuilder name) {

    this.code = name.charAt(0) + name.substring(name.indexOf(" ") + 1);
  }

  private String inputName() {

    System.out.println("Please enter your first and last name:");

    return in.nextLine();
  }

  // check if the name has a space in it

  private boolean checkName(StringBuilder name) {

    if (name.indexOf(" ") > 0) {

      return (name.indexOf(" ", name.indexOf(" ") + 1) == -1);

    } else return false;
  }

  private String getDeptId() {

    System.out.println("Please enter the department ID:");

    return in.nextLine();
  }

  // setDeptId calls getDeptId to retrieve ID from user before validId is used to check the input

  // If the pattern matches, ID is set to deptId or a default value of None01 will be assigned

  private void setDeptId() {

    String id = getDeptId();

    if (validId(id)) {

      this.deptId = id;

    } else {

      this.deptId = "None01";
    }
  }

  private String getId() {

    return this.deptId;
  }

  // uses a matcher to test if ID matches the pattern

  private boolean validId(String id) {

    Matcher matcher = p.matcher(id);

    return matcher.matches();
  }

  private String reverseString(String id) {

    if (id.isEmpty()) {

      return id;

    } else {

      return reverseString(id.substring(1)) + id.charAt(0);
    }
  }

  @Override
  public String toString() {

    return "Employee Code: " + getCode() + "\n" + "Department Number: " + getId();
  }
}
