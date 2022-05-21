package com.gmail.arthurstrokov.app;

import com.gmail.arthurstrokov.service.Countable;
import com.gmail.arthurstrokov.service.TrackTime;
import org.springframework.stereotype.Service;

@Service
public class AppService {
    @TrackTime
    @Countable
    public void appMethod() {
        System.out.println("app method");
    }
}
