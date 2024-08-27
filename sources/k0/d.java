package k0;

import com.google.android.gms.common.api.Api;
import i0.l1;
import j2.d0;
import j2.e0;
import j2.g0;
import j2.l;
import j2.n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o2.r;
import vt.i0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public j2.e f21819a;

    /* renamed from: b, reason: collision with root package name */
    public g0 f21820b;

    /* renamed from: c, reason: collision with root package name */
    public r f21821c;

    /* renamed from: d, reason: collision with root package name */
    public int f21822d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21823e;

    /* renamed from: f, reason: collision with root package name */
    public int f21824f;

    /* renamed from: g, reason: collision with root package name */
    public int f21825g;

    /* renamed from: h, reason: collision with root package name */
    public List f21826h;

    /* renamed from: i, reason: collision with root package name */
    public b f21827i;

    /* renamed from: k, reason: collision with root package name */
    public w2.b f21829k;

    /* renamed from: l, reason: collision with root package name */
    public n f21830l;

    /* renamed from: m, reason: collision with root package name */
    public w2.k f21831m;

    /* renamed from: n, reason: collision with root package name */
    public e0 f21832n;

    /* renamed from: j, reason: collision with root package name */
    public long f21828j = a.f21807a;

    /* renamed from: o, reason: collision with root package name */
    public int f21833o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f21834p = -1;

    public d(j2.e eVar, g0 g0Var, r rVar, int i10, boolean z10, int i11, int i12, List list) {
        this.f21819a = eVar;
        this.f21820b = g0Var;
        this.f21821c = rVar;
        this.f21822d = i10;
        this.f21823e = z10;
        this.f21824f = i11;
        this.f21825g = i12;
        this.f21826h = list;
    }

    public final int a(int i10, w2.k kVar) {
        int i11 = this.f21833o;
        int i12 = this.f21834p;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        int q10 = l1.q(b(hl.f.b(0, i10, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER), kVar).f20734e);
        this.f21833o = i10;
        this.f21834p = q10;
        return q10;
    }

    public final l b(long j10, w2.k kVar) {
        n d10 = d(kVar);
        long k02 = al.d.k0(j10, this.f21823e, this.f21822d, d10.c());
        boolean z10 = this.f21823e;
        int i10 = this.f21822d;
        int i11 = this.f21824f;
        int i12 = 1;
        if (z10 || !kp.j.N(i10, 2)) {
            if (i11 < 1) {
                i11 = 1;
            }
            i12 = i11;
        }
        return new l(d10, k02, i12, kp.j.N(this.f21822d, 2));
    }

    public final void c(w2.b bVar) {
        long j10;
        w2.b bVar2 = this.f21829k;
        if (bVar != null) {
            int i10 = a.f21808b;
            j10 = a.a(bVar.b(), bVar.Y());
        } else {
            j10 = a.f21807a;
        }
        if (bVar2 == null) {
            this.f21829k = bVar;
            this.f21828j = j10;
        } else if (bVar == null || this.f21828j != j10) {
            this.f21829k = bVar;
            this.f21828j = j10;
            this.f21830l = null;
            this.f21832n = null;
        }
    }

    public final n d(w2.k kVar) {
        n nVar = this.f21830l;
        if (nVar == null || kVar != this.f21831m || nVar.a()) {
            this.f21831m = kVar;
            j2.e eVar = this.f21819a;
            g0 M0 = hl.f.M0(this.f21820b, kVar);
            w2.b bVar = this.f21829k;
            Intrinsics.c(bVar);
            r rVar = this.f21821c;
            List list = this.f21826h;
            if (list == null) {
                list = i0.f38321a;
            }
            nVar = new n(eVar, M0, list, bVar, rVar);
        }
        this.f21830l = nVar;
        return nVar;
    }

    public final e0 e(w2.k kVar, long j10, l lVar) {
        float min = Math.min(lVar.f20730a.c(), lVar.f20733d);
        j2.e eVar = this.f21819a;
        g0 g0Var = this.f21820b;
        List list = this.f21826h;
        if (list == null) {
            list = i0.f38321a;
        }
        int i10 = this.f21824f;
        boolean z10 = this.f21823e;
        int i11 = this.f21822d;
        w2.b bVar = this.f21829k;
        Intrinsics.c(bVar);
        return new e0(new d0(eVar, g0Var, list, i10, z10, i11, bVar, kVar, this.f21821c, j10), lVar, hl.f.I(j10, hl.f.k(l1.q(min), l1.q(lVar.f20734e))));
    }
}
