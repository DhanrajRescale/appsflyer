package bv;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g implements i0 {
    @Override // bv.i0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // bv.i0, java.io.Flushable
    public final void flush() {
    }

    @Override // bv.i0
    public final n0 timeout() {
        return n0.NONE;
    }

    @Override // bv.i0
    public final void write(j source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        source.skip(j10);
    }
}
