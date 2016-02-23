/* DO NOT EDIT */
/* This file was generated from shared_links.babel */

package com.dropbox.core.v2.sharing;

import com.dropbox.core.json.JsonReadException;
import com.dropbox.core.json.JsonReader;
import com.dropbox.core.json.JsonWriter;
import com.dropbox.core.v2.files.LookupError;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;

public final class ListSharedLinksError {
    // union ListSharedLinksError

    /**
     * Discriminating tag type for {@link ListSharedLinksError}.
     */
    public enum Tag {
        PATH, // LookupError
        /**
         * Indicates that the cursor has been invalidated. Call {@link
         * DbxSharing#listSharedLinks()} to obtain a new cursor.
         */
        RESET,
        OTHER; // *catch_all
    }

    private static final java.util.HashMap<String, Tag> VALUES_;
    static {
        VALUES_ = new java.util.HashMap<String, Tag>();
        VALUES_.put("path", Tag.PATH);
        VALUES_.put("reset", Tag.RESET);
        VALUES_.put("other", Tag.OTHER);
    }

    public static final ListSharedLinksError RESET = new ListSharedLinksError(Tag.RESET, null);
    public static final ListSharedLinksError OTHER = new ListSharedLinksError(Tag.OTHER, null);

    private final Tag tag;
    private final LookupError pathValue;

    /**
     *
     * @param tag  Discriminating tag for this instance.
     */
    private ListSharedLinksError(Tag tag, LookupError pathValue) {
        this.tag = tag;
        this.pathValue = pathValue;
    }

    /**
     * Returns the tag for this instance.
     *
     * <p> This class is a tagged union.  Tagged unions instances are always
     * associated to a specific tag.  Callers are recommended to use the tag
     * value in a {@code switch} statement to determine how to properly handle
     * this {@code ListSharedLinksError}. </p>
     *
     * @return the tag for this instance.
     */
    public Tag tag() {
        return tag;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link Tag#PATH},
     * {@code false} otherwise.
     *
     * @return {@code true} if this insta5Bnce is tagged as {@link Tag#PATH},
     *     {@code false} otherwise.
     */
    public boolean isPath() {
        return this.tag == Tag.PATH;
    }

    /**
     * Returns an instance of {@code ListSharedLinksError} that has its tag set
     * to {@link Tag#PATH}.
     *
     * @param value  {@link ListSharedLinksError#path} value to assign to this
     *     instance.
     *
     * @return Instance of {@code ListSharedLinksError} with its tag set to
     *     {@link Tag#PATH}.
     *
     * @throws IllegalArgumentException  if {@code value} is {@code null}.
     */
    public static ListSharedLinksError path(LookupError value) {
        if (value == null) {
            throw new IllegalArgumentException("Value is null");
        }
        return new ListSharedLinksError(Tag.PATH, value);
    }

    /**
     * This instance must be tagged as {@link Tag#PATH}.
     *
     * @return The {@link ListSharedLinksError#path} value associated with this
     *     instance if {@link #isPath} is {@code true}.
     *
     * @throws IllegalStateException  If {@link #isPath} is {@code false}.
     */
    public LookupError getPathValue() {
        if (this.tag != Tag.PATH) {
            throw new IllegalStateException("Invalid tag: required Tag.PATH, but was Tag." + tag.name());
        }
        return pathValue;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link Tag#RESET},
     * {@code false} otherwise.
     *
     * @return {@code true} if this insta5Bnce is tagged as {@link Tag#RESET},
     *     {@code false} otherwise.
     */
    public boolean isReset() {
        return this.tag == Tag.RESET;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link Tag#OTHER},
     * {@code false} otherwise.
     *
     * @return {@code true} if this insta5Bnce is tagged as {@link Tag#OTHER},
     *     {@code false} otherwise.
     */
    public boolean isOther() {
        return this.tag == Tag.OTHER;
    }

    @Override
    public int hashCode() {
        int hash = java.util.Arrays.hashCode(new Object [] {
            tag,
            pathValue
        });
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        else if (obj instanceof ListSharedLinksError) {
            ListSharedLinksError other = (ListSharedLinksError) obj;
            if (this.tag != other.tag) {
                return false;
            }
            switch (tag) {
                case PATH:
                    return (this.pathValue == other.pathValue) || (this.pathValue.equals(other.pathValue));
                case RESET:
                    return true;
                case OTHER:
                    return true;
                default:
                    return false;
            }
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return _JSON_WRITER.writeToString(this, false);
    }

    public String toStringMultiline() {
        return _JSON_WRITER.writeToString(this, true);
    }

    public String toJson(Boolean longForm) {
        return _JSON_WRITER.writeToString(this, longForm);
    }

    public static ListSharedLinksError fromJson(String s) throws JsonReadException {
        return _JSON_READER.readFully(s);
    }

    public static final JsonWriter<ListSharedLinksError> _JSON_WRITER = new JsonWriter<ListSharedLinksError>() {
        public final void write(ListSharedLinksError x, JsonGenerator g) throws IOException {
            switch (x.tag) {
                case PATH:
                    g.writeStartObject();
                    g.writeFieldName(".tag");
                    g.writeString("path");
                    g.writeFieldName("path");
                    LookupError._JSON_WRITER.write(x.getPathValue(), g);
                    g.writeEndObject();
                    break;
                case RESET:
                    g.writeStartObject();
                    g.writeFieldName(".tag");
                    g.writeString("reset");
                    g.writeEndObject();
                    break;
                case OTHER:
                    g.writeStartObject();
                    g.writeFieldName(".tag");
                    g.writeString("other");
                    g.writeEndObject();
                    break;
            }
        }
    };

    public static final JsonReader<ListSharedLinksError> _JSON_READER = new JsonReader<ListSharedLinksError>() {

        public final ListSharedLinksError read(JsonParser parser) throws IOException, JsonReadException {
            if (parser.getCurrentToken() == JsonToken.VALUE_STRING) {
                String text = parser.getText();
                parser.nextToken();
                Tag tag = VALUES_.get(text);
                if (tag == null) {
                    return ListSharedLinksError.OTHER;
                }
                switch (tag) {
                    case RESET: return ListSharedLinksError.RESET;
                    case OTHER: return ListSharedLinksError.OTHER;
                }
                throw new JsonReadException("Tag " + tag + " requires a value", parser.getTokenLocation());
            }
            JsonReader.expectObjectStart(parser);
            String[] tags = readTags(parser);
            assert tags != null && tags.length == 1;
            String text = tags[0];
            Tag tag = VALUES_.get(text);
            ListSharedLinksError value = null;
            if (tag != null) {
                switch (tag) {
                    case PATH: {
                        LookupError v = null;
                        assert parser.getCurrentToken() == JsonToken.FIELD_NAME;
                        text = parser.getText();
                        assert tags[0].equals(text);
                        parser.nextToken();
                        v = LookupError._JSON_READER
                            .readField(parser, "path", v);
                        value = ListSharedLinksError.path(v);
                        break;
                    }
                    case RESET: {
                        value = ListSharedLinksError.RESET;
                        break;
                    }
                    case OTHER: {
                        value = ListSharedLinksError.OTHER;
                        break;
                    }
                }
            }
            JsonReader.expectObjectEnd(parser);
            if (value == null) {
                return ListSharedLinksError.OTHER;
            }
            return value;
        }

    };
}
