package androidx.compose.ui.draw;

import a2.l;
import c2.g;
import c2.y0;
import g1.d;
import g1.n;
import k1.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m1.f;
import n1.u;
import q1.b;
import v.e;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Lc2/y0;", "Lk1/j;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final /* data */ class PainterElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final b f1349b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1350c;

    /* renamed from: d, reason: collision with root package name */
    public final d f1351d;

    /* renamed from: e, reason: collision with root package name */
    public final l f1352e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1353f;

    /* renamed from: g, reason: collision with root package name */
    public final u f1354g;

    public PainterElement(b bVar, boolean z10, d dVar, l lVar, float f10, u uVar) {
        this.f1349b = bVar;
        this.f1350c = z10;
        this.f1351d = dVar;
        this.f1352e = lVar;
        this.f1353f = f10;
        this.f1354g = uVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k1.j, g1.n] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f21902n = this.f1349b;
        nVar.f21903o = this.f1350c;
        nVar.f21904p = this.f1351d;
        nVar.f21905q = this.f1352e;
        nVar.f21906r = this.f1353f;
        nVar.f21907s = this.f1354g;
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return Intrinsics.a(this.f1349b, painterElement.f1349b) && this.f1350c == painterElement.f1350c && Intrinsics.a(this.f1351d, painterElement.f1351d) && Intrinsics.a(this.f1352e, painterElement.f1352e) && Float.compare(this.f1353f, painterElement.f1353f) == 0 && Intrinsics.a(this.f1354g, painterElement.f1354g);
    }

    @Override // c2.y0
    public final int hashCode() {
        int hashCode;
        int a10 = e.a(this.f1353f, (this.f1352e.hashCode() + ((this.f1351d.hashCode() + e.d(this.f1350c, this.f1349b.hashCode() * 31, 31)) * 31)) * 31, 31);
        u uVar = this.f1354g;
        if (uVar == null) {
            hashCode = 0;
        } else {
            hashCode = uVar.hashCode();
        }
        return a10 + hashCode;
    }

    @Override // c2.y0
    public final void j(n nVar) {
        boolean z10;
        j jVar = (j) nVar;
        boolean z11 = jVar.f21903o;
        b bVar = this.f1349b;
        boolean z12 = this.f1350c;
        if (z11 == z12 && (!z12 || f.b(jVar.f21902n.h(), bVar.h()))) {
            z10 = false;
        } else {
            z10 = true;
        }
        jVar.f21902n = bVar;
        jVar.f21903o = z12;
        jVar.f21904p = this.f1351d;
        jVar.f21905q = this.f1352e;
        jVar.f21906r = this.f1353f;
        jVar.f21907s = this.f1354g;
        if (z10) {
            g.t(jVar);
        }
        g.s(jVar);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f1349b + ", sizeToIntrinsics=" + this.f1350c + ", alignment=" + this.f1351d + ", contentScale=" + this.f1352e + ", alpha=" + this.f1353f + ", colorFilter=" + this.f1354g + ')';
    }
}
