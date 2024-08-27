package bv;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public abstract class s implements k0 {

    @NotNull
    private final k0 delegate;

    public s(k0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @ut.a
    @NotNull
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final k0 m1deprecated_delegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @NotNull
    public final k0 delegate() {
        return this.delegate;
    }

    @Override // bv.k0
    public long read(@NotNull j sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return this.delegate.read(sink, j10);
    }

    @Override // bv.k0
    @NotNull
    public n0 timeout() {
        return this.delegate.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
