package ModuleTemplatePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends AbstractCaffeineBeverage {

    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        return answer.toLowerCase().equals("y");
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like to add some condiments?(y/n)");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.err.println("IO error:" + e);
        }
        if (answer == null) {
            return "n";
        }
        return answer;
    }

}
