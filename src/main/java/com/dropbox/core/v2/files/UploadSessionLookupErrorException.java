/* DO NOT EDIT */
/* This file was generated from files.babel */

package com.dropbox.core.v2.files;

import com.dropbox.core.DbxApiException;
import com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link
 * UploadSessionLookupError} error.
 */
public class UploadSessionLookupErrorException extends DbxApiException {

    /**
     * The error reported by {@link DbxFiles#uploadSessionAppend(String,long)}.
     */
    public final UploadSessionLookupError errorValue;

    public UploadSessionLookupErrorException(String requestId, LocalizedText userMessage, UploadSessionLookupError errorValue) {
        super(requestId, userMessage, buildMessage("upload_session/append", userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}
