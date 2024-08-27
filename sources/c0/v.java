package c0;

import com.google.android.gms.common.api.Api;
import java.util.List;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final p f7593a;

    /* renamed from: b, reason: collision with root package name */
    public final d0.z f7594b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7595c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f7596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0.z f7597e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7598f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7599g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g1.b f7600h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g1.c f7601i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f7602j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7603k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f7604l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f7605m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m0 f7606n;

    public v(long j10, boolean z10, p pVar, d0.z zVar, int i10, int i11, g1.b bVar, g1.c cVar, boolean z11, int i12, int i13, long j11, m0 m0Var) {
        int i14;
        this.f7596d = z10;
        this.f7597e = zVar;
        this.f7598f = i10;
        this.f7599g = i11;
        this.f7600h = bVar;
        this.f7601i = cVar;
        this.f7602j = z11;
        this.f7603k = i12;
        this.f7604l = i13;
        this.f7605m = j11;
        this.f7606n = m0Var;
        this.f7593a = pVar;
        this.f7594b = zVar;
        int i15 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (z10) {
            i14 = w2.a.h(j10);
        } else {
            i14 = Integer.MAX_VALUE;
        }
        this.f7595c = hl.f.c(i14, z10 ? i15 : w2.a.g(j10), 5);
    }

    public final b0 a(int i10) {
        int i11;
        p pVar = this.f7593a;
        Object a10 = pVar.a(i10);
        Object d10 = pVar.d(i10);
        List a11 = ((d0.a0) this.f7594b).a(i10, this.f7595c);
        if (i10 == this.f7598f - 1) {
            i11 = 0;
        } else {
            i11 = this.f7599g;
        }
        return new b0(i10, a11, this.f7596d, this.f7600h, this.f7601i, ((d0.a0) this.f7597e).f13136b.getLayoutDirection(), this.f7602j, this.f7603k, this.f7604l, i11, this.f7605m, a10, d10, this.f7606n.f7542m);
    }
}
