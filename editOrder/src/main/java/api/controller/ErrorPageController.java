package api.controller;

import org.apache.log4j.Logger;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorPageController implements ErrorController {

//    private Logger log = Logger.getLogger(ErrorPageController.class);

    @RequestMapping("/error")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Error HandlerErrorNotFoundUrl() {

//        log.error("Invalid Url");

        return new Error(HttpStatus.NOT_FOUND.value(),
                HttpStatus.NOT_FOUND.getReasonPhrase(),
                "API_NOT_FOUND");
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
