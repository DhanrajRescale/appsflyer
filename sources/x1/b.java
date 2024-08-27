package x1;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class b extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public static final b f39826a = new CancellationException();

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(h0.f39856b);
        return this;
    }
}
