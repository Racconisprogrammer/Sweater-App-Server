package com.farkhod.sweater.domain.util;

import com.farkhod.sweater.domain.User;

public abstract class MessageHelper {
    public static String getAuthorName(User author) {
        return author != null ? author.getUsername() : "<none>";
    }
}
