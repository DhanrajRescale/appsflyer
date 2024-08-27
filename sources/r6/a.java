package r6;

import java.math.BigInteger;
import z5.x;
import z5.y;
import z5.z;

/* loaded from: classes.dex */
public final class a implements y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f33346a;

    public a(b bVar) {
        this.f33346a = bVar;
    }

    @Override // z5.y
    public final boolean c() {
        return true;
    }

    @Override // z5.y
    public final x h(long j10) {
        b bVar = this.f33346a;
        BigInteger valueOf = BigInteger.valueOf((bVar.f33350d.f33391i * j10) / 1000000);
        long j11 = bVar.f33349c;
        long j12 = bVar.f33348b;
        z zVar = new z(j10, e5.x.j((valueOf.multiply(BigInteger.valueOf(j11 - j12)).divide(BigInteger.valueOf(bVar.f33352f)).longValue() + j12) - 30000, bVar.f33348b, j11 - 1));
        return new x(zVar, zVar);
    }

    @Override // z5.y
    public final long i() {
        return (this.f33346a.f33352f * 1000000) / r0.f33350d.f33391i;
    }
}
