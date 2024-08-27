package com.google.android.recaptcha.internal;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzfi extends IOException {
    public zzfi() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzfi(String str, Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th2);
    }

    public zzfi(Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
    }
}
