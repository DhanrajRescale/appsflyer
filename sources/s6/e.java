package s6;

import h5.g;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e extends g implements b {

    /* renamed from: d, reason: collision with root package name */
    public b f34313d;

    /* renamed from: e, reason: collision with root package name */
    public long f34314e;

    @Override // s6.b
    public final int a(long j10) {
        b bVar = this.f34313d;
        bVar.getClass();
        return bVar.a(j10 - this.f34314e);
    }

    @Override // s6.b
    public final long b(int i10) {
        b bVar = this.f34313d;
        bVar.getClass();
        return bVar.b(i10) + this.f34314e;
    }

    @Override // s6.b
    public final List c(long j10) {
        b bVar = this.f34313d;
        bVar.getClass();
        return bVar.c(j10 - this.f34314e);
    }

    @Override // s6.b
    public final int d() {
        b bVar = this.f34313d;
        bVar.getClass();
        return bVar.d();
    }

    public final void j(long j10, b bVar, long j11) {
        this.f18008c = j10;
        this.f34313d = bVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f34314e = j10;
    }
}
