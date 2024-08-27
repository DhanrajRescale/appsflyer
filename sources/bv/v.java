package bv;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final l f7396a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f7397b;

    /* renamed from: c, reason: collision with root package name */
    public int f7398c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7399d;

    public v(e0 source, Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f7396a = source;
        this.f7397b = inflater;
    }

    public final long a(j sink, long j10) {
        Inflater inflater = this.f7397b;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 >= 0) {
            if (!this.f7399d) {
                if (j10 == 0) {
                    return 0L;
                }
                try {
                    f0 R = sink.R(1);
                    int min = (int) Math.min(j10, 8192 - R.f7345c);
                    boolean needsInput = inflater.needsInput();
                    l lVar = this.f7396a;
                    if (needsInput && !lVar.p()) {
                        f0 f0Var = lVar.h().f7364a;
                        Intrinsics.c(f0Var);
                        int i10 = f0Var.f7345c;
                        int i11 = f0Var.f7344b;
                        int i12 = i10 - i11;
                        this.f7398c = i12;
                        inflater.setInput(f0Var.f7343a, i11, i12);
                    }
                    int inflate = inflater.inflate(R.f7343a, R.f7345c, min);
                    int i13 = this.f7398c;
                    if (i13 != 0) {
                        int remaining = i13 - inflater.getRemaining();
                        this.f7398c -= remaining;
                        lVar.skip(remaining);
                    }
                    if (inflate > 0) {
                        R.f7345c += inflate;
                        long j11 = inflate;
                        sink.f7365b += j11;
                        return j11;
                    }
                    if (R.f7344b == R.f7345c) {
                        sink.f7364a = R.a();
                        g0.a(R);
                    }
                    return 0L;
                } catch (DataFormatException e10) {
                    throw new IOException(e10);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(nn.d.j("byteCount < 0: ", j10).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7399d) {
            return;
        }
        this.f7397b.end();
        this.f7399d = true;
        this.f7396a.close();
    }

    @Override // bv.k0
    public final long read(j sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            long a10 = a(sink, j10);
            if (a10 > 0) {
                return a10;
            }
            Inflater inflater = this.f7397b;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f7396a.p());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // bv.k0
    public final n0 timeout() {
        return this.f7396a.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(k0 source, Inflater inflater) {
        this(hl.f.v(source), inflater);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
    }
}
