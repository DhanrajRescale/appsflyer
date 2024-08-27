package bv;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final k f7371a;

    /* renamed from: b, reason: collision with root package name */
    public final Deflater f7372b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7373c;

    public n(j sink, Deflater deflater) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        d0 sink2 = hl.f.u(sink);
        Intrinsics.checkNotNullParameter(sink2, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.f7371a = sink2;
        this.f7372b = deflater;
    }

    public final void a(boolean z10) {
        f0 R;
        int deflate;
        k kVar = this.f7371a;
        j h10 = kVar.h();
        while (true) {
            R = h10.R(1);
            Deflater deflater = this.f7372b;
            byte[] bArr = R.f7343a;
            if (z10) {
                try {
                    int i10 = R.f7345c;
                    deflate = deflater.deflate(bArr, i10, 8192 - i10, 2);
                } catch (NullPointerException e10) {
                    throw new IOException("Deflater already closed", e10);
                }
            } else {
                int i11 = R.f7345c;
                deflate = deflater.deflate(bArr, i11, 8192 - i11);
            }
            if (deflate > 0) {
                R.f7345c += deflate;
                h10.f7365b += deflate;
                kVar.t();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (R.f7344b == R.f7345c) {
            h10.f7364a = R.a();
            g0.a(R);
        }
    }

    @Override // bv.i0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Deflater deflater = this.f7372b;
        if (this.f7373c) {
            return;
        }
        try {
            deflater.finish();
            a(false);
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            deflater.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f7371a.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f7373c = true;
        if (th == null) {
        } else {
            throw th;
        }
    }

    @Override // bv.i0, java.io.Flushable
    public final void flush() {
        a(true);
        this.f7371a.flush();
    }

    @Override // bv.i0
    public final n0 timeout() {
        return this.f7371a.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.f7371a + ')';
    }

    @Override // bv.i0
    public final void write(j source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        b.b(source.f7365b, 0L, j10);
        while (j10 > 0) {
            f0 f0Var = source.f7364a;
            Intrinsics.c(f0Var);
            int min = (int) Math.min(j10, f0Var.f7345c - f0Var.f7344b);
            this.f7372b.setInput(f0Var.f7343a, f0Var.f7344b, min);
            a(false);
            long j11 = min;
            source.f7365b -= j11;
            int i10 = f0Var.f7344b + min;
            f0Var.f7344b = i10;
            if (i10 == f0Var.f7345c) {
                source.f7364a = f0Var.a();
                g0.a(f0Var);
            }
            j10 -= j11;
        }
    }
}
