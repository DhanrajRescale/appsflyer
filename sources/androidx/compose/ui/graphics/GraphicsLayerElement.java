package androidx.compose.ui.graphics;

import c2.g;
import c2.i1;
import c2.y0;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n1.b1;
import n1.s0;
import n1.t;
import n1.x0;
import t.g0;
import ut.t;
import v.e;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Lc2/y0;", "Ln1/y0;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final /* data */ class GraphicsLayerElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f1369b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1370c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1371d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1372e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1373f;

    /* renamed from: g, reason: collision with root package name */
    public final float f1374g;

    /* renamed from: h, reason: collision with root package name */
    public final float f1375h;

    /* renamed from: i, reason: collision with root package name */
    public final float f1376i;

    /* renamed from: j, reason: collision with root package name */
    public final float f1377j;

    /* renamed from: k, reason: collision with root package name */
    public final float f1378k;

    /* renamed from: l, reason: collision with root package name */
    public final long f1379l;

    /* renamed from: m, reason: collision with root package name */
    public final x0 f1380m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1381n;

    /* renamed from: o, reason: collision with root package name */
    public final long f1382o;

    /* renamed from: p, reason: collision with root package name */
    public final long f1383p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1384q;

    public GraphicsLayerElement(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, x0 x0Var, boolean z10, long j11, long j12, int i10) {
        this.f1369b = f10;
        this.f1370c = f11;
        this.f1371d = f12;
        this.f1372e = f13;
        this.f1373f = f14;
        this.f1374g = f15;
        this.f1375h = f16;
        this.f1376i = f17;
        this.f1377j = f18;
        this.f1378k = f19;
        this.f1379l = j10;
        this.f1380m = x0Var;
        this.f1381n = z10;
        this.f1382o = j11;
        this.f1383p = j12;
        this.f1384q = i10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g1.n, n1.y0, java.lang.Object] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f28208n = this.f1369b;
        nVar.f28209o = this.f1370c;
        nVar.f28210p = this.f1371d;
        nVar.f28211q = this.f1372e;
        nVar.f28212r = this.f1373f;
        nVar.f28213s = this.f1374g;
        nVar.f28214t = this.f1375h;
        nVar.f28215u = this.f1376i;
        nVar.f28216v = this.f1377j;
        nVar.f28217w = this.f1378k;
        nVar.f28218x = this.f1379l;
        nVar.f28219y = this.f1380m;
        nVar.f28220z = this.f1381n;
        nVar.A = this.f1382o;
        nVar.B = this.f1383p;
        nVar.C = this.f1384q;
        nVar.D = new g0(nVar, 23);
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        if (Float.compare(this.f1369b, graphicsLayerElement.f1369b) != 0 || Float.compare(this.f1370c, graphicsLayerElement.f1370c) != 0 || Float.compare(this.f1371d, graphicsLayerElement.f1371d) != 0 || Float.compare(this.f1372e, graphicsLayerElement.f1372e) != 0 || Float.compare(this.f1373f, graphicsLayerElement.f1373f) != 0 || Float.compare(this.f1374g, graphicsLayerElement.f1374g) != 0 || Float.compare(this.f1375h, graphicsLayerElement.f1375h) != 0 || Float.compare(this.f1376i, graphicsLayerElement.f1376i) != 0 || Float.compare(this.f1377j, graphicsLayerElement.f1377j) != 0 || Float.compare(this.f1378k, graphicsLayerElement.f1378k) != 0) {
            return false;
        }
        int i10 = b1.f28121c;
        if (this.f1379l == graphicsLayerElement.f1379l && Intrinsics.a(this.f1380m, graphicsLayerElement.f1380m) && this.f1381n == graphicsLayerElement.f1381n && Intrinsics.a(null, null) && t.d(this.f1382o, graphicsLayerElement.f1382o) && t.d(this.f1383p, graphicsLayerElement.f1383p) && s0.c(this.f1384q, graphicsLayerElement.f1384q)) {
            return true;
        }
        return false;
    }

    @Override // c2.y0
    public final int hashCode() {
        int a10 = e.a(this.f1378k, e.a(this.f1377j, e.a(this.f1376i, e.a(this.f1375h, e.a(this.f1374g, e.a(this.f1373f, e.a(this.f1372e, e.a(this.f1371d, e.a(this.f1370c, Float.hashCode(this.f1369b) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i10 = b1.f28121c;
        int d10 = e.d(this.f1381n, (this.f1380m.hashCode() + e.c(this.f1379l, a10, 31)) * 31, 961);
        int i11 = t.f28178j;
        t.Companion companion = ut.t.INSTANCE;
        return Integer.hashCode(this.f1384q) + e.c(this.f1383p, e.c(this.f1382o, d10, 31), 31);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        n1.y0 y0Var = (n1.y0) nVar;
        y0Var.f28208n = this.f1369b;
        y0Var.f28209o = this.f1370c;
        y0Var.f28210p = this.f1371d;
        y0Var.f28211q = this.f1372e;
        y0Var.f28212r = this.f1373f;
        y0Var.f28213s = this.f1374g;
        y0Var.f28214t = this.f1375h;
        y0Var.f28215u = this.f1376i;
        y0Var.f28216v = this.f1377j;
        y0Var.f28217w = this.f1378k;
        y0Var.f28218x = this.f1379l;
        y0Var.f28219y = this.f1380m;
        y0Var.f28220z = this.f1381n;
        y0Var.A = this.f1382o;
        y0Var.B = this.f1383p;
        y0Var.C = this.f1384q;
        i1 i1Var = g.x(y0Var, 2).f7722l;
        if (i1Var != null) {
            i1Var.p1(y0Var.D, true);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb2.append(this.f1369b);
        sb2.append(", scaleY=");
        sb2.append(this.f1370c);
        sb2.append(", alpha=");
        sb2.append(this.f1371d);
        sb2.append(", translationX=");
        sb2.append(this.f1372e);
        sb2.append(", translationY=");
        sb2.append(this.f1373f);
        sb2.append(", shadowElevation=");
        sb2.append(this.f1374g);
        sb2.append(", rotationX=");
        sb2.append(this.f1375h);
        sb2.append(", rotationY=");
        sb2.append(this.f1376i);
        sb2.append(", rotationZ=");
        sb2.append(this.f1377j);
        sb2.append(", cameraDistance=");
        sb2.append(this.f1378k);
        sb2.append(", transformOrigin=");
        sb2.append((Object) b1.a(this.f1379l));
        sb2.append(", shape=");
        sb2.append(this.f1380m);
        sb2.append(", clip=");
        sb2.append(this.f1381n);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        e.t(this.f1382o, sb2, ", spotShadowColor=");
        sb2.append((Object) n1.t.j(this.f1383p));
        sb2.append(", compositingStrategy=");
        sb2.append((Object) ("CompositingStrategy(value=" + this.f1384q + ')'));
        sb2.append(')');
        return sb2.toString();
    }
}
