package org.jpos.q2;

import javax.management.Notification;
import javax.management.NotificationListener;

public class QServerManager implements NotificationListener {
    Q2 q2;
    Q2.QEntry qentry;

    QServerManager(Q2 q2) {
        this.q2 = q2;
        q2.getLog().info("initialized server manager");
    }

    @Override
    public void handleNotification(Notification notification, Object handback) {
        qentry = (Q2.QEntry) handback;
        q2.getLog().info("got notification");
        q2.getLog().info(notification.getMessage());
        q2.getLog().info(qentry.getXmlDeployName());
    }
}
