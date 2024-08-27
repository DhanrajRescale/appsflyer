package i5;

import android.os.SystemClock;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.List;

/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: t, reason: collision with root package name */
    public static final r5.w f19361t = new b5.o0(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final b5.i1 f19362a;

    /* renamed from: b, reason: collision with root package name */
    public final r5.w f19363b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19364c;

    /* renamed from: d, reason: collision with root package name */
    public final long f19365d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19366e;

    /* renamed from: f, reason: collision with root package name */
    public final ExoPlaybackException f19367f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f19368g;

    /* renamed from: h, reason: collision with root package name */
    public final r5.e1 f19369h;

    /* renamed from: i, reason: collision with root package name */
    public final u5.w f19370i;

    /* renamed from: j, reason: collision with root package name */
    public final List f19371j;

    /* renamed from: k, reason: collision with root package name */
    public final r5.w f19372k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f19373l;

    /* renamed from: m, reason: collision with root package name */
    public final int f19374m;

    /* renamed from: n, reason: collision with root package name */
    public final b5.u0 f19375n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f19376o;

    /* renamed from: p, reason: collision with root package name */
    public volatile long f19377p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f19378q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f19379r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f19380s;

    public b1(b5.i1 i1Var, r5.w wVar, long j10, long j11, int i10, ExoPlaybackException exoPlaybackException, boolean z10, r5.e1 e1Var, u5.w wVar2, List list, r5.w wVar3, boolean z11, int i11, b5.u0 u0Var, long j12, long j13, long j14, long j15, boolean z12) {
        this.f19362a = i1Var;
        this.f19363b = wVar;
        this.f19364c = j10;
        this.f19365d = j11;
        this.f19366e = i10;
        this.f19367f = exoPlaybackException;
        this.f19368g = z10;
        this.f19369h = e1Var;
        this.f19370i = wVar2;
        this.f19371j = list;
        this.f19372k = wVar3;
        this.f19373l = z11;
        this.f19374m = i11;
        this.f19375n = u0Var;
        this.f19377p = j12;
        this.f19378q = j13;
        this.f19379r = j14;
        this.f19380s = j15;
        this.f19376o = z12;
    }

    public static b1 i(u5.w wVar) {
        b5.f1 f1Var = b5.i1.f3357a;
        r5.w wVar2 = f19361t;
        return new b1(f1Var, wVar2, -9223372036854775807L, 0L, 1, null, false, r5.e1.f33145d, wVar, lp.j1.f24998e, wVar2, false, 0, b5.u0.f3616d, 0L, 0L, 0L, 0L, false);
    }

    public final b1 a() {
        return new b1(this.f19362a, this.f19363b, this.f19364c, this.f19365d, this.f19366e, this.f19367f, this.f19368g, this.f19369h, this.f19370i, this.f19371j, this.f19372k, this.f19373l, this.f19374m, this.f19375n, this.f19377p, this.f19378q, j(), SystemClock.elapsedRealtime(), this.f19376o);
    }

    public final b1 b(r5.w wVar) {
        return new b1(this.f19362a, this.f19363b, this.f19364c, this.f19365d, this.f19366e, this.f19367f, this.f19368g, this.f19369h, this.f19370i, this.f19371j, wVar, this.f19373l, this.f19374m, this.f19375n, this.f19377p, this.f19378q, this.f19379r, this.f19380s, this.f19376o);
    }

    public final b1 c(r5.w wVar, long j10, long j11, long j12, long j13, r5.e1 e1Var, u5.w wVar2, List list) {
        return new b1(this.f19362a, wVar, j11, j12, this.f19366e, this.f19367f, this.f19368g, e1Var, wVar2, list, this.f19372k, this.f19373l, this.f19374m, this.f19375n, this.f19377p, j13, j10, SystemClock.elapsedRealtime(), this.f19376o);
    }

    public final b1 d(int i10, boolean z10) {
        return new b1(this.f19362a, this.f19363b, this.f19364c, this.f19365d, this.f19366e, this.f19367f, this.f19368g, this.f19369h, this.f19370i, this.f19371j, this.f19372k, z10, i10, this.f19375n, this.f19377p, this.f19378q, this.f19379r, this.f19380s, this.f19376o);
    }

    public final b1 e(ExoPlaybackException exoPlaybackException) {
        return new b1(this.f19362a, this.f19363b, this.f19364c, this.f19365d, this.f19366e, exoPlaybackException, this.f19368g, this.f19369h, this.f19370i, this.f19371j, this.f19372k, this.f19373l, this.f19374m, this.f19375n, this.f19377p, this.f19378q, this.f19379r, this.f19380s, this.f19376o);
    }

    public final b1 f(b5.u0 u0Var) {
        return new b1(this.f19362a, this.f19363b, this.f19364c, this.f19365d, this.f19366e, this.f19367f, this.f19368g, this.f19369h, this.f19370i, this.f19371j, this.f19372k, this.f19373l, this.f19374m, u0Var, this.f19377p, this.f19378q, this.f19379r, this.f19380s, this.f19376o);
    }

    public final b1 g(int i10) {
        return new b1(this.f19362a, this.f19363b, this.f19364c, this.f19365d, i10, this.f19367f, this.f19368g, this.f19369h, this.f19370i, this.f19371j, this.f19372k, this.f19373l, this.f19374m, this.f19375n, this.f19377p, this.f19378q, this.f19379r, this.f19380s, this.f19376o);
    }

    public final b1 h(b5.i1 i1Var) {
        return new b1(i1Var, this.f19363b, this.f19364c, this.f19365d, this.f19366e, this.f19367f, this.f19368g, this.f19369h, this.f19370i, this.f19371j, this.f19372k, this.f19373l, this.f19374m, this.f19375n, this.f19377p, this.f19378q, this.f19379r, this.f19380s, this.f19376o);
    }

    public final long j() {
        long j10;
        long j11;
        if (!k()) {
            return this.f19379r;
        }
        do {
            j10 = this.f19380s;
            j11 = this.f19379r;
        } while (j10 != this.f19380s);
        return e5.x.F(e5.x.P(j11) + (((float) (SystemClock.elapsedRealtime() - j10)) * this.f19375n.f3617a));
    }

    public final boolean k() {
        return this.f19366e == 3 && this.f19373l && this.f19374m == 0;
    }
}
