package com.google.firebase.crashlytics.internal.stacktrace;

/* loaded from: classes2.dex */
public class TrimmedThrowableData {
    public final TrimmedThrowableData cause;
    public final String className;
    public final String localizedMessage;
    public final StackTraceElement[] stacktrace;

    public TrimmedThrowableData(Throwable th2, StackTraceTrimmingStrategy stackTraceTrimmingStrategy) {
        TrimmedThrowableData trimmedThrowableData;
        this.localizedMessage = th2.getLocalizedMessage();
        this.className = th2.getClass().getName();
        this.stacktrace = stackTraceTrimmingStrategy.getTrimmedStackTrace(th2.getStackTrace());
        Throwable cause = th2.getCause();
        if (cause != null) {
            trimmedThrowableData = new TrimmedThrowableData(cause, stackTraceTrimmingStrategy);
        } else {
            trimmedThrowableData = null;
        }
        this.cause = trimmedThrowableData;
    }
}
