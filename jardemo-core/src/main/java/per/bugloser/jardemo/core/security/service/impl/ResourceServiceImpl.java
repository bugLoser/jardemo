package per.bugloser.jardemo.core.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import per.bugloser.jardemo.core.security.domain.Resource;
import per.bugloser.jardemo.core.security.reposiroty.ResourceRepository;
import per.bugloser.jardemo.core.security.service.ResourceService;

import java.util.List;

@Transactional(readOnly=true)
@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private ResourceRepository resourceRepository;

    @Override
    public List<Resource> findAll(){
        return resourceRepository.findAll();
    }
}
