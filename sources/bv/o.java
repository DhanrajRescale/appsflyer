package bv;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final w f7374a;

    /* renamed from: b, reason: collision with root package name */
    public long f7375b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7376c;

    public o(w fileHandle, long j10) {
        Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
        this.f7374a = fileHandle;
        this.f7375b = j10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7376c) {
            return;
        }
        this.f7376c = true;
        w wVar = this.f7374a;
        ReentrantLock reentrantLock = wVar.f7402c;
        reentrantLock.lock();
        try {
            int i10 = wVar.f7401b - 1;
            wVar.f7401b = i10;
            if (i10 == 0 && wVar.f7400a) {
                Unit unit = Unit.f23355a;
                synchronized (wVar) {
                    wVar.f7403d.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bv.k0
    public final long read(j sink, long j10) {
        long j11;
        long j12;
        long j13;
        int i10;
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i11 = 1;
        if (!this.f7376c) {
            w wVar = this.f7374a;
            long j14 = this.f7375b;
            wVar.getClass();
            if (j10 >= 0) {
                long j15 = j10 + j14;
                long j16 = j14;
                while (true) {
                    if (j16 < j15) {
                        f0 R = sink.R(i11);
                        byte[] array = R.f7343a;
                        int i12 = R.f7345c;
                        j11 = j14;
                        int min = (int) Math.min(j15 - j16, 8192 - i12);
                        synchronized (wVar) {
                            Intrinsics.checkNotNullParameter(array, "array");
                            wVar.f7403d.seek(j16);
                            i10 = 0;
                            while (true) {
                                if (i10 >= min) {
                                    break;
                                }
                                int read = wVar.f7403d.read(array, i12, min - i10);
                                if (read == -1) {
                                    if (i10 == 0) {
                                        i10 = -1;
                                    }
                                } else {
                                    i10 += read;
                                }
                            }
                        }
                        if (i10 == -1) {
                            if (R.f7344b == R.f7345c) {
                                sink.f7364a = R.a();
                                g0.a(R);
                            }
                            if (j11 == j16) {
                                j13 = -1;
                                j12 = -1;
                            }
                        } else {
                            R.f7345c += i10;
                            long j17 = i10;
                            j16 += j17;
                            sink.f7365b += j17;
                            j14 = j11;
                            i11 = 1;
                        }
                    } else {
                        j11 = j14;
                        break;
                    }
                }
                j12 = j16 - j11;
                j13 = -1;
                if (j12 != j13) {
                    this.f7375b += j12;
                }
                return j12;
            }
            throw new IllegalArgumentException(nn.d.j("byteCount < 0: ", j10).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // bv.k0
    public final n0 timeout() {
        return n0.NONE;
    }
}
