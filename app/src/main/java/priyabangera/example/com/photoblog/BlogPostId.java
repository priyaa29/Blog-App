package priyabangera.example.com.photoblog;


import android.support.annotation.NonNull;

import com.google.firebase.firestore.Exclude;

/**
 * Created by Priya Bangera123 on 30-03-2018.
 */

public class BlogPostId {

    @Exclude
    public String BlogPostId;

    public <T extends BlogPostId> T withId(@NonNull final String id) {
        this.BlogPostId = id;
        return (T) this;
    }

}
