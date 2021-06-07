package com.mysite.core.models.impl;

import com.mysite.core.models.support.Author;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = SlingHttpServletRequest.class,
        adapters = Author.class
)

public class AuthorImpl implements Author {
    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public boolean getIsProfessor() {
        return false;
    }
}
