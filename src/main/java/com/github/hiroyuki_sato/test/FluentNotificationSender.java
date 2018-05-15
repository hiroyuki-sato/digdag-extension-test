package com.github.hiroyuki_sato.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import io.digdag.client.config.Config;
import io.digdag.spi.Notification;
import io.digdag.spi.NotificationException;
import io.digdag.spi.NotificationSender;

import java.util.Locale;

public class FluentNotificationSender implements NotificationSender
{
    @Inject
    public FluentNotificationSender(Config systemConfig, ObjectMapper mapper){
    }

    @Override
    public void sendNotification(Notification notification)
            throws NotificationException
    {
        int i = 0;

        if( i == 0 ){
            System.out.println(String.format(Locale.ENGLISH,"--> %s",notification.getMessage()));
        } else {
            throw new NotificationException("test");
        }


    }

}