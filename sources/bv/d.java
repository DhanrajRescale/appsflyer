package bv;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7331a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7332b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7333c;

    public d(OutputStream out, n0 timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f7332b = out;
        this.f7333c = timeout;
    }

    @Override // bv.i0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i10 = this.f7331a;
        Object obj = this.f7332b;
        switch (i10) {
            case 0:
                f fVar = (f) obj;
                i0 i0Var = (i0) this.f7333c;
                fVar.enter();
                try {
                    i0Var.close();
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
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // bv.i0, java.io.Flushable
    public final void flush() {
        int i10 = this.f7331a;
        Object obj = this.f7332b;
        switch (i10) {
            case 0:
                f fVar = (f) obj;
                i0 i0Var = (i0) this.f7333c;
                fVar.enter();
                try {
                    i0Var.flush();
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
                ((OutputStream) obj).flush();
                return;
        }
    }

    @Override // bv.i0
    public final n0 timeout() {
        switch (this.f7331a) {
            case 0:
                return (f) this.f7332b;
            default:
                return (n0) this.f7333c;
        }
    }

    public final String toString() {
        switch (this.f7331a) {
            case 0:
                return "AsyncTimeout.sink(" + ((i0) this.f7333c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f7332b) + ')';
        }
    }

    @Override // bv.i0
    public final void write(j source, long j10) {
        int i10 = this.f7331a;
        Object obj = this.f7332b;
        Object obj2 = this.f7333c;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(source, "source");
                b.b(source.f7365b, 0L, j10);
                while (j10 > 0) {
                    f0 f0Var = source.f7364a;
                    Intrinsics.c(f0Var);
                    long j11 = 0;
                    while (true) {
                        if (j11 < 65536) {
                            j11 += f0Var.f7345c - f0Var.f7344b;
                            if (j11 >= j10) {
                                j11 = j10;
                            } else {
                                f0Var = f0Var.f7348f;
                                Intrinsics.c(f0Var);
                            }
                        }
                    }
                    f fVar = (f) obj;
                    i0 i0Var = (i0) obj2;
                    fVar.enter();
                    try {
                        i0Var.write(source, j11);
                        Unit unit = Unit.f23355a;
                        if (!fVar.exit()) {
                            j10 -= j11;
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
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(source, "source");
                b.b(source.f7365b, 0L, j10);
                while (j10 > 0) {
                    ((n0) obj2).throwIfReached();
                    f0 f0Var2 = source.f7364a;
                    Intrinsics.c(f0Var2);
                    int min = (int) Math.min(j10, f0Var2.f7345c - f0Var2.f7344b);
                    ((OutputStream) obj).write(f0Var2.f7343a, f0Var2.f7344b, min);
                    int i11 = f0Var2.f7344b + min;
                    f0Var2.f7344b = i11;
                    long j12 = min;
                    j10 -= j12;
                    source.f7365b -= j12;
                    if (i11 == f0Var2.f7345c) {
                        source.f7364a = f0Var2.a();
                        g0.a(f0Var2);
                    }
                }
                return;
        }
    }

    public d(f fVar, i0 i0Var) {
        this.f7332b = fVar;
        this.f7333c = i0Var;
    }
}
