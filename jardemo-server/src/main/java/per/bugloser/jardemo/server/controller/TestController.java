package per.bugloser.jardemo.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import per.bugloser.jardemo.core.security.domain.Resource;
import per.bugloser.jardemo.core.security.service.ResourceService;
import per.bugloser.jardemo.server.domain.Something;
import per.bugloser.jardemo.server.service.SomethingService;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private ResourceService resourceService;
    @Autowired
    private SomethingService somethingService;

    @GetMapping("/resource")
    public List<Resource> getResource(){
        return resourceService.findAll();
    }

    @GetMapping("/something")
    public List<Something> getSomething(){
        return somethingService.findAll();
    }
}
