package h3;

import g3.k;

/* loaded from: classes.dex */
public final class g implements d, g3.h {

    /* renamed from: a, reason: collision with root package name */
    public final k f17943a;

    /* renamed from: b, reason: collision with root package name */
    public int f17944b;

    /* renamed from: c, reason: collision with root package name */
    public j3.h f17945c;

    /* renamed from: d, reason: collision with root package name */
    public int f17946d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f17947e = -1;

    /* renamed from: f, reason: collision with root package name */
    public float f17948f = s0.g.f34069a;

    /* renamed from: g, reason: collision with root package name */
    public Object f17949g;

    public g(k kVar) {
        this.f17943a = kVar;
    }

    @Override // h3.d, g3.h
    public final void a() {
        this.f17945c.X(this.f17944b);
        int i10 = this.f17946d;
        if (i10 != -1) {
            j3.h hVar = this.f17945c;
            if (i10 > -1) {
                hVar.f20920s0 = -1.0f;
                hVar.f20921t0 = i10;
                hVar.f20922u0 = -1;
                return;
            }
            hVar.getClass();
            return;
        }
        int i11 = this.f17947e;
        if (i11 != -1) {
            j3.h hVar2 = this.f17945c;
            if (i11 > -1) {
                hVar2.f20920s0 = -1.0f;
                hVar2.f20921t0 = -1;
                hVar2.f20922u0 = i11;
                return;
            }
            hVar2.getClass();
            return;
        }
        j3.h hVar3 = this.f17945c;
        float f10 = this.f17948f;
        if (f10 > -1.0f) {
            hVar3.f20920s0 = f10;
            hVar3.f20921t0 = -1;
            hVar3.f20922u0 = -1;
            return;
        }
        hVar3.getClass();
    }

    @Override // g3.h
    public final void b(j3.d dVar) {
        if (dVar instanceof j3.h) {
            this.f17945c = (j3.h) dVar;
        } else {
            this.f17945c = null;
        }
    }

    @Override // g3.h
    public final j3.d c() {
        if (this.f17945c == null) {
            this.f17945c = new j3.h();
        }
        return this.f17945c;
    }

    @Override // g3.h
    public final d d() {
        return null;
    }

    @Override // g3.h
    public final Object getKey() {
        return this.f17949g;
    }
}
