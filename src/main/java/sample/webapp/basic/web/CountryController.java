package sample.webapp.basic.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * Created by myokoyama on 2015/11/06.
 */
@Controller
@RequestMapping("/country")
public class CountryController {

    @RequestMapping("/input")
    public String input() {
        return "country/input";
    }

    @RequestMapping("/confirm")
    public String confirm() {
        return "country/confirm";
    }

    @RequestMapping("/update")
    public String update() {
        return "redirect:/country/complete";
    }

    @RequestMapping("/complete")
    public String complete() {
        return "country/complete";
    }
}
