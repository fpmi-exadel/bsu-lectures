package org.exadel.bsu.tasks.second.midtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Simple index page controller serving hello.jsp file 
 */
@Controller
public class IndexController {

    /**
     * Simply serves hello.jsp
     * @return view with name 'hello'
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String handleRequest() {
        return "hello";
    }

}
