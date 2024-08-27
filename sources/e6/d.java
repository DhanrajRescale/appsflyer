package e6;

import z5.x;
import z5.y;
import z5.z;

/* loaded from: classes.dex */
public final class d implements y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f15079a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f15080b;

    public d(e eVar, y yVar) {
        this.f15080b = eVar;
        this.f15079a = yVar;
    }

    @Override // z5.y
    public final boolean c() {
        return this.f15079a.c();
    }

    @Override // z5.y
    public final x h(long j10) {
        x h10 = this.f15079a.h(j10);
        z zVar = h10.f42138a;
        long j11 = zVar.f42141a;
        long j12 = zVar.f42142b;
        long j13 = this.f15080b.f15081a;
        z zVar2 = new z(j11, j12 + j13);
        z zVar3 = h10.f42139b;
        return new x(zVar2, new z(zVar3.f42141a, zVar3.f42142b + j13));
    }

    @Override // z5.y
    public final long i() {
        return this.f15079a.i();
    }
}
