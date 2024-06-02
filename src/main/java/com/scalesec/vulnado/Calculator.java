/*
#Added a Java File for Demostration of code Coverage Percentage update on SonarCloud Dashboard
#By AOITSECURITYTEAM
*/

public class Calculator {
    public int addition(String arguments) {
        int sum = 0;
        for (String add : arguments.split("\\+"))
            sum += Integer.valueOf(add);
            return sum;
    }
}