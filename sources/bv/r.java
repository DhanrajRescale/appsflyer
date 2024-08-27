package bv;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public abstract class r implements i0 {

    @NotNull
    private final i0 delegate;

    public r(i0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @ut.a
    @NotNull
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final i0 m0deprecated_delegate() {
        return this.delegate;
    }

    @Override // bv.i0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @NotNull
    public final i0 delegate() {
        return this.delegate;
    }

    @Override // bv.i0, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // bv.i0
    @NotNull
    public n0 timeout() {
        return this.delegate.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // bv.i0
    public void write(@NotNull j source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        this.delegate.write(source, j10);
    }
}
