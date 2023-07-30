package dev.muriloabranches.admin.catalogo.domain.exceptions;

import dev.muriloabranches.admin.catalogo.domain.validation.handler.Notification;

public class NotificationException extends DomainException {

    public NotificationException(final String aMessage, final Notification notification) {
        super(aMessage, notification.getErrors());
    }
}
