package pl.sda.currencyclient;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CurrencyControler {

    @GetMapping("/currency")
    public String getCurrency(){
        return "currency";
    }
}
