package m5;

import java.util.List;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: j, reason: collision with root package name */
    public final List f27577j;

    public o(j jVar, long j10, long j11, long j12, long j13, List list, long j14, List list2, long j15, long j16) {
        super(jVar, j10, j11, j12, j13, list, j14, j15, j16);
        this.f27577j = list2;
    }

    @Override // m5.n
    public final long d(long j10) {
        return this.f27577j.size();
    }

    @Override // m5.n
    public final j h(long j10, m mVar) {
        return (j) this.f27577j.get((int) (j10 - this.f27571d));
    }

    @Override // m5.n
    public final boolean i() {
        return true;
    }
}
