package d2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class s2 implements v1 {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f13634g = true;

    /* renamed from: a, reason: collision with root package name */
    public final RenderNode f13635a;

    /* renamed from: b, reason: collision with root package name */
    public int f13636b;

    /* renamed from: c, reason: collision with root package name */
    public int f13637c;

    /* renamed from: d, reason: collision with root package name */
    public int f13638d;

    /* renamed from: e, reason: collision with root package name */
    public int f13639e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13640f;

    public s2(a0 a0Var) {
        RenderNode create = RenderNode.create("Compose", a0Var);
        this.f13635a = create;
        if (f13634g) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                y2 y2Var = y2.f13690a;
                y2Var.c(create, y2Var.a(create));
                y2Var.d(create, y2Var.b(create));
            }
            x2.f13682a.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            f13634g = false;
        }
    }

    @Override // d2.v1
    public final int A() {
        return this.f13637c;
    }

    @Override // d2.v1
    public final void B(float f10) {
        this.f13635a.setScaleX(f10);
    }

    @Override // d2.v1
    public final void C(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            y2.f13690a.c(this.f13635a, i10);
        }
    }

    @Override // d2.v1
    public final void D(float f10) {
        this.f13635a.setTranslationX(f10);
    }

    @Override // d2.v1
    public final int E() {
        return this.f13638d;
    }

    @Override // d2.v1
    public final boolean F() {
        return this.f13635a.getClipToOutline();
    }

    @Override // d2.v1
    public final void G(boolean z10) {
        this.f13635a.setClipToOutline(z10);
    }

    @Override // d2.v1
    public final void H(float f10) {
        this.f13635a.setCameraDistance(-f10);
    }

    @Override // d2.v1
    public final void I(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            y2.f13690a.d(this.f13635a, i10);
        }
    }

    @Override // d2.v1
    public final void J(float f10) {
        this.f13635a.setRotationX(f10);
    }

    @Override // d2.v1
    public final void K(Matrix matrix) {
        this.f13635a.getMatrix(matrix);
    }

    @Override // d2.v1
    public final float L() {
        return this.f13635a.getElevation();
    }

    @Override // d2.v1
    public final int a() {
        return this.f13639e - this.f13637c;
    }

    @Override // d2.v1
    public final int b() {
        return this.f13638d - this.f13636b;
    }

    @Override // d2.v1
    public final float c() {
        return this.f13635a.getAlpha();
    }

    @Override // d2.v1
    public final void d(float f10) {
        this.f13635a.setRotationY(f10);
    }

    @Override // d2.v1
    public final void e(int i10) {
        this.f13636b += i10;
        this.f13638d += i10;
        this.f13635a.offsetLeftAndRight(i10);
    }

    @Override // d2.v1
    public final int f() {
        return this.f13639e;
    }

    @Override // d2.v1
    public final void g() {
    }

    @Override // d2.v1
    public final void h(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f13635a);
    }

    @Override // d2.v1
    public final int i() {
        return this.f13636b;
    }

    @Override // d2.v1
    public final void j(float f10) {
        this.f13635a.setRotation(f10);
    }

    @Override // d2.v1
    public final void k(float f10) {
        this.f13635a.setPivotX(f10);
    }

    @Override // d2.v1
    public final void l(float f10) {
        this.f13635a.setTranslationY(f10);
    }

    @Override // d2.v1
    public final void m(boolean z10) {
        this.f13640f = z10;
        this.f13635a.setClipToBounds(z10);
    }

    @Override // d2.v1
    public final boolean n(int i10, int i11, int i12, int i13) {
        this.f13636b = i10;
        this.f13637c = i11;
        this.f13638d = i12;
        this.f13639e = i13;
        return this.f13635a.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // d2.v1
    public final void o() {
        x2.f13682a.a(this.f13635a);
    }

    @Override // d2.v1
    public final void p(e.l lVar, n1.p0 p0Var, Function1 function1) {
        int b10 = b();
        int a10 = a();
        RenderNode renderNode = this.f13635a;
        DisplayListCanvas start = renderNode.start(b10, a10);
        Canvas v10 = lVar.L().v();
        lVar.L().w((Canvas) start);
        n1.c L = lVar.L();
        if (p0Var != null) {
            L.h();
            n1.r.p(L, p0Var);
        }
        function1.invoke(L);
        if (p0Var != null) {
            L.s();
        }
        lVar.L().w(v10);
        renderNode.end(start);
    }

    @Override // d2.v1
    public final void q(float f10) {
        this.f13635a.setPivotY(f10);
    }

    @Override // d2.v1
    public final void r(float f10) {
        this.f13635a.setScaleY(f10);
    }

    @Override // d2.v1
    public final void s(float f10) {
        this.f13635a.setElevation(f10);
    }

    @Override // d2.v1
    public final void t(int i10) {
        this.f13637c += i10;
        this.f13639e += i10;
        this.f13635a.offsetTopAndBottom(i10);
    }

    @Override // d2.v1
    public final void u(int i10) {
        boolean c10 = n1.s0.c(i10, 1);
        RenderNode renderNode = this.f13635a;
        if (c10) {
            renderNode.setLayerType(2);
            renderNode.setHasOverlappingRendering(true);
        } else if (n1.s0.c(i10, 2)) {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // d2.v1
    public final boolean v() {
        return this.f13635a.isValid();
    }

    @Override // d2.v1
    public final void w(Outline outline) {
        this.f13635a.setOutline(outline);
    }

    @Override // d2.v1
    public final boolean x() {
        return this.f13635a.setHasOverlappingRendering(true);
    }

    @Override // d2.v1
    public final void y(float f10) {
        this.f13635a.setAlpha(f10);
    }

    @Override // d2.v1
    public final boolean z() {
        return this.f13640f;
    }
}
