package bv;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7337a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7338b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7339c;

    public e(InputStream input, n0 timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f7338b = input;
        this.f7339c = timeout;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i10 = this.f7337a;
        Object obj = this.f7338b;
        switch (i10) {
            case 0:
                f fVar = (f) obj;
                k0 k0Var = (k0) this.f7339c;
                fVar.enter();
                try {
                    k0Var.close();
                    Unit unit = Unit.f23355a;
                    if (!fVar.exit()) {
                        return;
                    } else {
                        throw fVar.access$newTimeoutException(null);
                    }
                } catch (IOException e10) {
                    if (!fVar.exit()) {
                        throw e10;
                    }
                    throw fVar.access$newTimeoutException(e10);
                } finally {
                    fVar.exit();
                }
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // bv.k0
    public final long read(j sink, long j10) {
        int i10 = this.f7337a;
        Object obj = this.f7338b;
        Object obj2 = this.f7339c;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(sink, "sink");
                f fVar = (f) obj;
                k0 k0Var = (k0) obj2;
                fVar.enter();
                try {
                    long read = k0Var.read(sink, j10);
                    if (!fVar.exit()) {
                        return read;
                    }
                    throw fVar.access$newTimeoutException(null);
                } catch (IOException e10) {
                    if (!fVar.exit()) {
                        throw e10;
                    }
                    throw fVar.access$newTimeoutException(e10);
                } finally {
                    fVar.exit();
                }
            default:
                Intrinsics.checkNotNullParameter(sink, "sink");
                if (j10 == 0) {
                    return 0L;
                }
                if (j10 >= 0) {
                    try {
                        ((n0) obj2).throwIfReached();
                        f0 R = sink.R(1);
                        int read2 = ((InputStream) obj).read(R.f7343a, R.f7345c, (int) Math.min(j10, 8192 - R.f7345c));
                        if (read2 == -1) {
                            if (R.f7344b == R.f7345c) {
                                sink.f7364a = R.a();
                                g0.a(R);
                            }
                            return -1L;
                        }
                        R.f7345c += read2;
                        long j11 = read2;
                        sink.f7365b += j11;
                        return j11;
                    } catch (AssertionError e11) {
                        if (hl.f.v0(e11)) {
                            throw new IOException(e11);
                        }
                        throw e11;
                    }
                }
                throw new IllegalArgumentException(nn.d.j("byteCount < 0: ", j10).toString());
        }
    }

    @Override // bv.k0
    public final n0 timeout() {
        switch (this.f7337a) {
            case 0:
                return (f) this.f7338b;
            default:
                return (n0) this.f7339c;
        }
    }

    public final String toString() {
        switch (this.f7337a) {
            case 0:
                return "AsyncTimeout.source(" + ((k0) this.f7339c) + ')';
            default:
                return "source(" + ((InputStream) this.f7338b) + ')';
        }
    }

    public e(f fVar, k0 k0Var) {
        this.f7338b = fVar;
        this.f7339c = k0Var;
    }
}
