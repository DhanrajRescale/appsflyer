package m5;

import b5.v;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes.dex */
public final class p extends n {

    /* renamed from: j, reason: collision with root package name */
    public final e5.o f27578j;

    /* renamed from: k, reason: collision with root package name */
    public final e5.o f27579k;

    /* renamed from: l, reason: collision with root package name */
    public final long f27580l;

    public p(j jVar, long j10, long j11, long j12, long j13, long j14, List list, long j15, e5.o oVar, e5.o oVar2, long j16, long j17) {
        super(jVar, j10, j11, j12, j14, list, j15, j16, j17);
        this.f27578j = oVar;
        this.f27579k = oVar2;
        this.f27580l = j13;
    }

    @Override // m5.s
    public final j a(m mVar) {
        e5.o oVar = this.f27578j;
        if (oVar != null) {
            v vVar = mVar.f27564a;
            return new j(0L, -1L, oVar.b(vVar.f3641a, 0L, vVar.f3648h, 0L));
        }
        return this.f27585a;
    }

    @Override // m5.n
    public final long d(long j10) {
        if (this.f27573f != null) {
            return r0.size();
        }
        long j11 = this.f27580l;
        if (j11 != -1) {
            return (j11 - this.f27571d) + 1;
        }
        if (j10 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f27586b));
        BigInteger multiply2 = BigInteger.valueOf(this.f27572e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = mp.a.f27980a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // m5.n
    public final j h(long j10, m mVar) {
        long j11;
        long j12 = this.f27571d;
        List list = this.f27573f;
        if (list != null) {
            j11 = ((q) list.get((int) (j10 - j12))).f27581a;
        } else {
            j11 = (j10 - j12) * this.f27572e;
        }
        long j13 = j11;
        e5.o oVar = this.f27579k;
        v vVar = mVar.f27564a;
        return new j(0L, -1L, oVar.b(vVar.f3641a, j10, vVar.f3648h, j13));
    }
}
