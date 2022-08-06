package com.muravskyi.java_design_patterns_and_architecture.com.muravskyi.designpatterns.mvc;

import com.muravskyi.java_design_patterns_and_architecture.com.muravskyi.designpatterns.mvc.controller.Controller;
import com.muravskyi.java_design_patterns_and_architecture.com.muravskyi.designpatterns.mvc.model.Model;
import com.muravskyi.java_design_patterns_and_architecture.com.muravskyi.designpatterns.mvc.view.View;
import javax.swing.SwingUtilities;

public class Application {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(Application::runApp);

    }

    public static void runApp() {
        Model model = new Model();
        View view = new View(model);
        Controller controller = new Controller(view, model);

        view.setLoginListener(controller);
    }

}
