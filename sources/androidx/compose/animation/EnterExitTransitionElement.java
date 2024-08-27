package androidx.compose.animation;

import c2.y0;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import v.a0;
import v.g0;
import v.h0;
import v.i0;
import w.o1;
import w.u1;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionElement;", "Lc2/y0;", "Lv/g0;", "animation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final /* data */ class EnterExitTransitionElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final u1 f1158b;

    /* renamed from: c, reason: collision with root package name */
    public final o1 f1159c;

    /* renamed from: d, reason: collision with root package name */
    public final o1 f1160d;

    /* renamed from: e, reason: collision with root package name */
    public final o1 f1161e;

    /* renamed from: f, reason: collision with root package name */
    public final h0 f1162f;

    /* renamed from: g, reason: collision with root package name */
    public final i0 f1163g;

    /* renamed from: h, reason: collision with root package name */
    public final a0 f1164h;

    public EnterExitTransitionElement(u1 u1Var, o1 o1Var, o1 o1Var2, o1 o1Var3, h0 h0Var, i0 i0Var, a0 a0Var) {
        this.f1158b = u1Var;
        this.f1159c = o1Var;
        this.f1160d = o1Var2;
        this.f1161e = o1Var3;
        this.f1162f = h0Var;
        this.f1163g = i0Var;
        this.f1164h = a0Var;
    }

    @Override // c2.y0
    public final n d() {
        return new g0(this.f1158b, this.f1159c, this.f1160d, this.f1161e, this.f1162f, this.f1163g, this.f1164h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return Intrinsics.a(this.f1158b, enterExitTransitionElement.f1158b) && Intrinsics.a(this.f1159c, enterExitTransitionElement.f1159c) && Intrinsics.a(this.f1160d, enterExitTransitionElement.f1160d) && Intrinsics.a(this.f1161e, enterExitTransitionElement.f1161e) && Intrinsics.a(this.f1162f, enterExitTransitionElement.f1162f) && Intrinsics.a(this.f1163g, enterExitTransitionElement.f1163g) && Intrinsics.a(this.f1164h, enterExitTransitionElement.f1164h);
    }

    @Override // c2.y0
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.f1158b.hashCode() * 31;
        int i10 = 0;
        o1 o1Var = this.f1159c;
        if (o1Var == null) {
            hashCode = 0;
        } else {
            hashCode = o1Var.hashCode();
        }
        int i11 = (hashCode3 + hashCode) * 31;
        o1 o1Var2 = this.f1160d;
        if (o1Var2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = o1Var2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        o1 o1Var3 = this.f1161e;
        if (o1Var3 != null) {
            i10 = o1Var3.hashCode();
        }
        return this.f1164h.hashCode() + ((this.f1163g.f37532a.hashCode() + ((this.f1162f.f37527a.hashCode() + ((i12 + i10) * 31)) * 31)) * 31);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        g0 g0Var = (g0) nVar;
        g0Var.f37504n = this.f1158b;
        g0Var.f37505o = this.f1159c;
        g0Var.f37506p = this.f1160d;
        g0Var.f37507q = this.f1161e;
        g0Var.f37508r = this.f1162f;
        g0Var.f37509s = this.f1163g;
        g0Var.f37510t = this.f1164h;
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.f1158b + ", sizeAnimation=" + this.f1159c + ", offsetAnimation=" + this.f1160d + ", slideAnimation=" + this.f1161e + ", enter=" + this.f1162f + ", exit=" + this.f1163g + ", graphicsLayerBlock=" + this.f1164h + ')';
    }
}
