package th.co.scb.ngage.service.externalAPI;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import th.co.scb.ngage.repository.externalAPI.ExternalApiRepository;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class IsAllowCreateExternal {


    @Autowired
    private ExternalApiRepository externalApiRepository;

    public Object isAllowCreateExternal() {
        return externalApiRepository.callExternalApi();
    }
}