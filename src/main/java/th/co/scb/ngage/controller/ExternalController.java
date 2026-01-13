package th.co.scb.ngage.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import th.co.scb.ngage.constant.ApiConstant;
import th.co.scb.ngage.handler.ExternalApiHandler;



@RestController
@RequestMapping(ApiConstant.BASE_URL)
public class ExternalController {

    @Autowired
    private ExternalApiHandler externalApiHandler;

    @GetMapping("/external-api-demo")
    public Object callExternalApiDemo() {
        return externalApiHandler.handleExternalApiDemo();
    }
}
