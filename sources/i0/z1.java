package i0;

import java.util.List;

/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public final j2.e f19292a;

    /* renamed from: b, reason: collision with root package name */
    public final j2.g0 f19293b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19294c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19295d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19296e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19297f;

    /* renamed from: g, reason: collision with root package name */
    public final w2.b f19298g;

    /* renamed from: h, reason: collision with root package name */
    public final o2.r f19299h;

    /* renamed from: i, reason: collision with root package name */
    public final List f19300i;

    /* renamed from: j, reason: collision with root package name */
    public j2.n f19301j;

    /* renamed from: k, reason: collision with root package name */
    public w2.k f19302k;

    public z1(j2.e eVar, j2.g0 g0Var, int i10, int i11, boolean z10, int i12, w2.b bVar, o2.r rVar, List list) {
        this.f19292a = eVar;
        this.f19293b = g0Var;
        this.f19294c = i10;
        this.f19295d = i11;
        this.f19296e = z10;
        this.f19297f = i12;
        this.f19298g = bVar;
        this.f19299h = rVar;
        this.f19300i = list;
        if (i10 > 0) {
            if (i11 > 0) {
                if (i11 <= i10) {
                    return;
                } else {
                    throw new IllegalArgumentException("minLines greater than maxLines".toString());
                }
            }
            throw new IllegalArgumentException("no minLines".toString());
        }
        throw new IllegalArgumentException("no maxLines".toString());
    }

    public final void a(w2.k kVar) {
        j2.n nVar = this.f19301j;
        if (nVar == null || kVar != this.f19302k || nVar.a()) {
            this.f19302k = kVar;
            nVar = new j2.n(this.f19292a, hl.f.M0(this.f19293b, kVar), this.f19300i, this.f19298g, this.f19299h);
        }
        this.f19301j = nVar;
    }
}
