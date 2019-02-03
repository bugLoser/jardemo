package per.bugloser.jardemo.core.security.service;

import per.bugloser.jardemo.core.security.domain.Resource;

import java.util.List;

public interface ResourceService {
    List<Resource> findAll();
}
