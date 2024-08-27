package cv;

import bv.j;
import bv.k0;
import bv.s;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d extends s {

    /* renamed from: a, reason: collision with root package name */
    public final long f13086a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13087b;

    /* renamed from: c, reason: collision with root package name */
    public long f13088c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k0 delegate, long j10, boolean z10) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f13086a = j10;
        this.f13087b = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, bv.j] */
    @Override // bv.s, bv.k0
    public final long read(j sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j11 = this.f13088c;
        long j12 = this.f13086a;
        if (j11 > j12) {
            j10 = 0;
        } else if (this.f13087b) {
            long j13 = j12 - j11;
            if (j13 == 0) {
                return -1L;
            }
            j10 = Math.min(j10, j13);
        }
        long read = super.read(sink, j10);
        if (read != -1) {
            this.f13088c += read;
        }
        long j14 = this.f13088c;
        if ((j14 < j12 && read == -1) || j14 > j12) {
            if (read > 0 && j14 > j12) {
                long j15 = sink.f7365b - (j14 - j12);
                ?? obj = new Object();
                obj.s(sink);
                sink.write(obj, j15);
                obj.a();
            }
            throw new IOException("expected " + j12 + " bytes but got " + this.f13088c);
        }
        return read;
    }
}
