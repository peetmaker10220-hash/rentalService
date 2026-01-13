package th.co.scb.ngage.handler;

import org.springframework.stereotype.Component;
import th.co.scb.ngage.service.externalAPI.IsAllowCreateExternal;

@Component
public class ExternalApiHandler {
    private final IsAllowCreateExternal isAllowCreateExternal;

    public ExternalApiHandler(IsAllowCreateExternal isAllowCreateExternal) {
        this.isAllowCreateExternal = isAllowCreateExternal;
    }

    public Object handleExternalApiDemo() {
        return isAllowCreateExternal.isAllowCreateExternal();
    }
}
