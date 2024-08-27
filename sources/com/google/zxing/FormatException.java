package com.google.zxing;

/* loaded from: classes2.dex */
public final class FormatException extends ReaderException {

    /* renamed from: c, reason: collision with root package name */
    public static final FormatException f12011c;

    static {
        FormatException formatException = new FormatException();
        f12011c = formatException;
        formatException.setStackTrace(ReaderException.f12013b);
    }

    private FormatException() {
    }

    public static FormatException a() {
        if (ReaderException.f12012a) {
            return new FormatException();
        }
        return f12011c;
    }
}
