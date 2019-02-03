package per.bugloser.jardemo.test;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import per.bugloser.jardemo.core.security.domain.Resource;
import per.bugloser.jardemo.core.security.service.ResourceService;
import per.bugloser.jardemo.server.Application;
import per.bugloser.jardemo.server.domain.Something;
import per.bugloser.jardemo.server.service.SomethingService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class TransactionTest {
    @Autowired
    private ResourceService resourceService;
    @Autowired
    private SomethingService somethingService;

    @Test
    public void testResourceService(){
        Assertions.assertThat(resourceService.findAll())
                .hasSize(1)
                .flatExtracting(Resource::getId)
                .first().isEqualTo(1);
    }

    @Test
    public void testSomethingService(){
        Assertions.assertThat(somethingService.findAll())
                .hasSize(1)
                .flatExtracting(Something::getId)
                .first().isEqualTo(1);
    }
}
