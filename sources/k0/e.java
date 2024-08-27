package k0;

import com.google.android.gms.common.api.Api;
import i0.l1;
import j2.g0;
import kotlin.jvm.internal.Intrinsics;
import o2.r;
import vt.i0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public String f21835a;

    /* renamed from: b, reason: collision with root package name */
    public g0 f21836b;

    /* renamed from: c, reason: collision with root package name */
    public r f21837c;

    /* renamed from: d, reason: collision with root package name */
    public int f21838d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21839e;

    /* renamed from: f, reason: collision with root package name */
    public int f21840f;

    /* renamed from: g, reason: collision with root package name */
    public int f21841g;

    /* renamed from: i, reason: collision with root package name */
    public w2.b f21843i;

    /* renamed from: j, reason: collision with root package name */
    public j2.a f21844j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f21845k;

    /* renamed from: m, reason: collision with root package name */
    public b f21847m;

    /* renamed from: n, reason: collision with root package name */
    public j2.r f21848n;

    /* renamed from: o, reason: collision with root package name */
    public w2.k f21849o;

    /* renamed from: h, reason: collision with root package name */
    public long f21842h = a.f21807a;

    /* renamed from: l, reason: collision with root package name */
    public long f21846l = hl.f.k(0, 0);

    /* renamed from: p, reason: collision with root package name */
    public long f21850p = hl.f.Q(0, 0, 0, 0);

    /* renamed from: q, reason: collision with root package name */
    public int f21851q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f21852r = -1;

    public e(String str, g0 g0Var, r rVar, int i10, boolean z10, int i11, int i12) {
        this.f21835a = str;
        this.f21836b = g0Var;
        this.f21837c = rVar;
        this.f21838d = i10;
        this.f21839e = z10;
        this.f21840f = i11;
        this.f21841g = i12;
    }

    public final int a(int i10, w2.k kVar) {
        int i11 = this.f21851q;
        int i12 = this.f21852r;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        int q10 = l1.q(b(hl.f.b(0, i10, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER), kVar).b());
        this.f21851q = i10;
        this.f21852r = q10;
        return q10;
    }

    public final j2.a b(long j10, w2.k kVar) {
        int i10;
        j2.r d10 = d(kVar);
        long k02 = al.d.k0(j10, this.f21839e, this.f21838d, d10.c());
        boolean z10 = this.f21839e;
        int i11 = this.f21838d;
        int i12 = this.f21840f;
        if (!z10 && kp.j.N(i11, 2)) {
            i10 = 1;
        } else {
            if (i12 < 1) {
                i12 = 1;
            }
            i10 = i12;
        }
        return new j2.a((r2.c) d10, i10, kp.j.N(this.f21838d, 2), k02);
    }

    public final void c(w2.b bVar) {
        long j10;
        w2.b bVar2 = this.f21843i;
        if (bVar != null) {
            int i10 = a.f21808b;
            j10 = a.a(bVar.b(), bVar.Y());
        } else {
            j10 = a.f21807a;
        }
        if (bVar2 == null) {
            this.f21843i = bVar;
            this.f21842h = j10;
            return;
        }
        if (bVar == null || this.f21842h != j10) {
            this.f21843i = bVar;
            this.f21842h = j10;
            this.f21844j = null;
            this.f21848n = null;
            this.f21849o = null;
            this.f21851q = -1;
            this.f21852r = -1;
            this.f21850p = hl.f.Q(0, 0, 0, 0);
            this.f21846l = hl.f.k(0, 0);
            this.f21845k = false;
        }
    }

    public final j2.r d(w2.k kVar) {
        j2.r rVar = this.f21848n;
        if (rVar == null || kVar != this.f21849o || rVar.a()) {
            this.f21849o = kVar;
            String str = this.f21835a;
            g0 M0 = hl.f.M0(this.f21836b, kVar);
            w2.b bVar = this.f21843i;
            Intrinsics.c(bVar);
            r rVar2 = this.f21837c;
            i0 i0Var = i0.f38321a;
            rVar = new r2.c(M0, rVar2, bVar, str, i0Var, i0Var);
        }
        this.f21848n = rVar;
        return rVar;
    }
}
