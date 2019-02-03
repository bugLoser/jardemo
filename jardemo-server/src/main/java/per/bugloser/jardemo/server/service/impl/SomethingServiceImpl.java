package per.bugloser.jardemo.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import per.bugloser.jardemo.server.domain.Something;
import per.bugloser.jardemo.server.reposiroty.SomethingRepository;
import per.bugloser.jardemo.server.service.SomethingService;

import java.util.List;

@Transactional(readOnly=true)
@Service
public class SomethingServiceImpl implements SomethingService {
    @Autowired
    private SomethingRepository somethingRepository;

    public List<Something> findAll(){
        return somethingRepository.findAll();
    }
}
