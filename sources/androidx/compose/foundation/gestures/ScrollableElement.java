package androidx.compose.foundation.gestures;

import a0.l;
import c2.y0;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import v.e;
import x.a2;
import y.c2;
import y.d2;
import y.g1;
import y.h0;
import y.j2;
import y.o;
import y.s;
import y.t1;
import y.x0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableElement;", "Lc2/y0;", "Ly/c2;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ScrollableElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final d2 f1230b;

    /* renamed from: c, reason: collision with root package name */
    public final g1 f1231c;

    /* renamed from: d, reason: collision with root package name */
    public final a2 f1232d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1233e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1234f;

    /* renamed from: g, reason: collision with root package name */
    public final x0 f1235g;

    /* renamed from: h, reason: collision with root package name */
    public final l f1236h;

    /* renamed from: i, reason: collision with root package name */
    public final o f1237i;

    public ScrollableElement(d2 d2Var, g1 g1Var, a2 a2Var, boolean z10, boolean z11, x0 x0Var, l lVar, o oVar) {
        this.f1230b = d2Var;
        this.f1231c = g1Var;
        this.f1232d = a2Var;
        this.f1233e = z10;
        this.f1234f = z11;
        this.f1235g = x0Var;
        this.f1236h = lVar;
        this.f1237i = oVar;
    }

    @Override // c2.y0
    public final n d() {
        return new c2(this.f1230b, this.f1231c, this.f1232d, this.f1233e, this.f1234f, this.f1235g, this.f1236h, this.f1237i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        if (Intrinsics.a(this.f1230b, scrollableElement.f1230b) && this.f1231c == scrollableElement.f1231c && Intrinsics.a(this.f1232d, scrollableElement.f1232d) && this.f1233e == scrollableElement.f1233e && this.f1234f == scrollableElement.f1234f && Intrinsics.a(this.f1235g, scrollableElement.f1235g) && Intrinsics.a(this.f1236h, scrollableElement.f1236h) && Intrinsics.a(this.f1237i, scrollableElement.f1237i)) {
            return true;
        }
        return false;
    }

    @Override // c2.y0
    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = (this.f1231c.hashCode() + (this.f1230b.hashCode() * 31)) * 31;
        int i12 = 0;
        a2 a2Var = this.f1232d;
        if (a2Var != null) {
            i10 = a2Var.hashCode();
        } else {
            i10 = 0;
        }
        int d10 = e.d(this.f1234f, e.d(this.f1233e, (hashCode + i10) * 31, 31), 31);
        x0 x0Var = this.f1235g;
        if (x0Var != null) {
            i11 = x0Var.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = (d10 + i11) * 31;
        l lVar = this.f1236h;
        if (lVar != null) {
            i12 = lVar.hashCode();
        }
        return this.f1237i.hashCode() + ((i13 + i12) * 31);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        x0 x0Var;
        c2 c2Var = (c2) nVar;
        g1 g1Var = this.f1231c;
        boolean z10 = this.f1233e;
        l lVar = this.f1236h;
        if (c2Var.f40644s != z10) {
            c2Var.f40651z.f41011b = z10;
            c2Var.B.f40609n = z10;
        }
        x0 x0Var2 = this.f1235g;
        if (x0Var2 == null) {
            x0Var = c2Var.f40649x;
        } else {
            x0Var = x0Var2;
        }
        j2 j2Var = c2Var.f40650y;
        d2 d2Var = this.f1230b;
        j2Var.f40796a = d2Var;
        j2Var.f40797b = g1Var;
        a2 a2Var = this.f1232d;
        j2Var.f40798c = a2Var;
        boolean z11 = this.f1234f;
        j2Var.f40799d = z11;
        j2Var.f40800e = x0Var;
        j2Var.f40801f = c2Var.f40648w;
        t1 t1Var = c2Var.C;
        t1Var.f40963u.Y0(t1Var.f40960r, h0.f40748d, g1Var, z10, lVar, t1Var.f40961s, a.f1238a, t1Var.f40962t, false);
        s sVar = c2Var.A;
        sVar.f40922n = g1Var;
        sVar.f40923o = d2Var;
        sVar.f40924p = z11;
        sVar.f40925q = this.f1237i;
        c2Var.f40641p = d2Var;
        c2Var.f40642q = g1Var;
        c2Var.f40643r = a2Var;
        c2Var.f40644s = z10;
        c2Var.f40645t = z11;
        c2Var.f40646u = x0Var2;
        c2Var.f40647v = lVar;
    }
}
