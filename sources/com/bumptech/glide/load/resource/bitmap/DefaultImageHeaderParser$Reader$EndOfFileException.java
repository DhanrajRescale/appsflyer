package com.bumptech.glide.load.resource.bitmap;

import java.io.IOException;

/* loaded from: classes.dex */
public final class DefaultImageHeaderParser$Reader$EndOfFileException extends IOException {
    private static final long serialVersionUID = 1;

    public DefaultImageHeaderParser$Reader$EndOfFileException() {
        super("Unexpectedly reached end of a file");
    }
}
