package com.bumptech.glide.load;

/* loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    UNKNOWN(false);


    /* renamed from: a, reason: collision with root package name */
    public final boolean f10831a;

    ImageHeaderParser$ImageType(boolean z10) {
        this.f10831a = z10;
    }

    public boolean hasAlpha() {
        return this.f10831a;
    }
}
