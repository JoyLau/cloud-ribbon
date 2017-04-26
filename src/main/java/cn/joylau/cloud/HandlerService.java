package cn.joylau.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by JoyLau on 4/25/2017.
 * com.joylau.cloud
 */
@Service
public class HandlerService {

    @Autowired
    private RestTemplate restTemplate;

    public String handler() {
        return restTemplate.getForObject("http://eureka-service-info/info",String.class);
    }
}
