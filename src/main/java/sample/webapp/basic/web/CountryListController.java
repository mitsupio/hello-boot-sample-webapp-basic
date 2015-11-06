package sample.webapp.basic.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * Created by myokoyama on 2015/11/06.
 */
@Controller
@RequestMapping("/countryList")
public class CountryListController {

    @RequestMapping
    public String index() {
        return "countryList";
    }
}
