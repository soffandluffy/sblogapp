package com.soffan.blogapp;

import com.google.firebase.firestore.Exclude;

import androidx.annotation.NonNull;

class BlogPostId {

    @Exclude
    public String BlogPostId;

    public <T extends BlogPostId> T withId(@NonNull final String id) {
        this.BlogPostId = id;
        return (T) this;
    }

}
