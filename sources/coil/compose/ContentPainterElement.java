package coil.compose;

import a2.l;
import c2.g;
import c2.y0;
import g1.d;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m1.f;
import n1.u;
import q1.b;
import v.e;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil/compose/ContentPainterElement;", "Lc2/y0;", "Lo8/u;", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final /* data */ class ContentPainterElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final b f8315b;

    /* renamed from: c, reason: collision with root package name */
    public final d f8316c;

    /* renamed from: d, reason: collision with root package name */
    public final l f8317d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8318e;

    /* renamed from: f, reason: collision with root package name */
    public final u f8319f;

    public ContentPainterElement(b bVar, d dVar, l lVar, float f10, u uVar) {
        this.f8315b = bVar;
        this.f8316c = dVar;
        this.f8317d = lVar;
        this.f8318e = f10;
        this.f8319f = uVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o8.u, g1.n] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f29839n = this.f8315b;
        nVar.f29840o = this.f8316c;
        nVar.f29841p = this.f8317d;
        nVar.f29842q = this.f8318e;
        nVar.f29843r = this.f8319f;
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
        return Intrinsics.a(this.f8315b, contentPainterElement.f8315b) && Intrinsics.a(this.f8316c, contentPainterElement.f8316c) && Intrinsics.a(this.f8317d, contentPainterElement.f8317d) && Float.compare(this.f8318e, contentPainterElement.f8318e) == 0 && Intrinsics.a(this.f8319f, contentPainterElement.f8319f);
    }

    @Override // c2.y0
    public final int hashCode() {
        int hashCode;
        int a10 = e.a(this.f8318e, (this.f8317d.hashCode() + ((this.f8316c.hashCode() + (this.f8315b.hashCode() * 31)) * 31)) * 31, 31);
        u uVar = this.f8319f;
        if (uVar == null) {
            hashCode = 0;
        } else {
            hashCode = uVar.hashCode();
        }
        return a10 + hashCode;
    }

    @Override // c2.y0
    public final void j(n nVar) {
        o8.u uVar = (o8.u) nVar;
        long h10 = uVar.f29839n.h();
        b bVar = this.f8315b;
        boolean z10 = !f.b(h10, bVar.h());
        uVar.f29839n = bVar;
        uVar.f29840o = this.f8316c;
        uVar.f29841p = this.f8317d;
        uVar.f29842q = this.f8318e;
        uVar.f29843r = this.f8319f;
        if (z10) {
            g.t(uVar);
        }
        g.s(uVar);
    }

    public final String toString() {
        return "ContentPainterElement(painter=" + this.f8315b + ", alignment=" + this.f8316c + ", contentScale=" + this.f8317d + ", alpha=" + this.f8318e + ", colorFilter=" + this.f8319f + ')';
    }
}
