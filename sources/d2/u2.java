package d2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class u2 implements v1 {

    /* renamed from: a, reason: collision with root package name */
    public final RenderNode f13648a = t2.f();

    @Override // d2.v1
    public final int A() {
        int top;
        top = this.f13648a.getTop();
        return top;
    }

    @Override // d2.v1
    public final void B(float f10) {
        this.f13648a.setScaleX(f10);
    }

    @Override // d2.v1
    public final void C(int i10) {
        this.f13648a.setAmbientShadowColor(i10);
    }

    @Override // d2.v1
    public final void D(float f10) {
        this.f13648a.setTranslationX(f10);
    }

    @Override // d2.v1
    public final int E() {
        int right;
        right = this.f13648a.getRight();
        return right;
    }

    @Override // d2.v1
    public final boolean F() {
        boolean clipToOutline;
        clipToOutline = this.f13648a.getClipToOutline();
        return clipToOutline;
    }

    @Override // d2.v1
    public final void G(boolean z10) {
        this.f13648a.setClipToOutline(z10);
    }

    @Override // d2.v1
    public final void H(float f10) {
        this.f13648a.setCameraDistance(f10);
    }

    @Override // d2.v1
    public final void I(int i10) {
        this.f13648a.setSpotShadowColor(i10);
    }

    @Override // d2.v1
    public final void J(float f10) {
        this.f13648a.setRotationX(f10);
    }

    @Override // d2.v1
    public final void K(Matrix matrix) {
        this.f13648a.getMatrix(matrix);
    }

    @Override // d2.v1
    public final float L() {
        float elevation;
        elevation = this.f13648a.getElevation();
        return elevation;
    }

    @Override // d2.v1
    public final int a() {
        int height;
        height = this.f13648a.getHeight();
        return height;
    }

    @Override // d2.v1
    public final int b() {
        int width;
        width = this.f13648a.getWidth();
        return width;
    }

    @Override // d2.v1
    public final float c() {
        float alpha;
        alpha = this.f13648a.getAlpha();
        return alpha;
    }

    @Override // d2.v1
    public final void d(float f10) {
        this.f13648a.setRotationY(f10);
    }

    @Override // d2.v1
    public final void e(int i10) {
        this.f13648a.offsetLeftAndRight(i10);
    }

    @Override // d2.v1
    public final int f() {
        int bottom;
        bottom = this.f13648a.getBottom();
        return bottom;
    }

    @Override // d2.v1
    public final void g() {
        if (Build.VERSION.SDK_INT >= 31) {
            v2.f13653a.a(this.f13648a, null);
        }
    }

    @Override // d2.v1
    public final void h(Canvas canvas) {
        canvas.drawRenderNode(this.f13648a);
    }

    @Override // d2.v1
    public final int i() {
        int left;
        left = this.f13648a.getLeft();
        return left;
    }

    @Override // d2.v1
    public final void j(float f10) {
        this.f13648a.setRotationZ(f10);
    }

    @Override // d2.v1
    public final void k(float f10) {
        this.f13648a.setPivotX(f10);
    }

    @Override // d2.v1
    public final void l(float f10) {
        this.f13648a.setTranslationY(f10);
    }

    @Override // d2.v1
    public final void m(boolean z10) {
        this.f13648a.setClipToBounds(z10);
    }

    @Override // d2.v1
    public final boolean n(int i10, int i11, int i12, int i13) {
        boolean position;
        position = this.f13648a.setPosition(i10, i11, i12, i13);
        return position;
    }

    @Override // d2.v1
    public final void o() {
        this.f13648a.discardDisplayList();
    }

    @Override // d2.v1
    public final void p(e.l lVar, n1.p0 p0Var, Function1 function1) {
        RecordingCanvas beginRecording;
        RenderNode renderNode = this.f13648a;
        beginRecording = renderNode.beginRecording();
        n1.c cVar = (n1.c) lVar.f14641b;
        Canvas canvas = cVar.f28123a;
        cVar.f28123a = beginRecording;
        if (p0Var != null) {
            cVar.h();
            cVar.u(p0Var, 1);
        }
        function1.invoke(cVar);
        if (p0Var != null) {
            cVar.s();
        }
        ((n1.c) lVar.f14641b).f28123a = canvas;
        renderNode.endRecording();
    }

    @Override // d2.v1
    public final void q(float f10) {
        this.f13648a.setPivotY(f10);
    }

    @Override // d2.v1
    public final void r(float f10) {
        this.f13648a.setScaleY(f10);
    }

    @Override // d2.v1
    public final void s(float f10) {
        this.f13648a.setElevation(f10);
    }

    @Override // d2.v1
    public final void t(int i10) {
        this.f13648a.offsetTopAndBottom(i10);
    }

    @Override // d2.v1
    public final void u(int i10) {
        boolean c10 = n1.s0.c(i10, 1);
        RenderNode renderNode = this.f13648a;
        if (c10) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (n1.s0.c(i10, 2)) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // d2.v1
    public final boolean v() {
        boolean hasDisplayList;
        hasDisplayList = this.f13648a.hasDisplayList();
        return hasDisplayList;
    }

    @Override // d2.v1
    public final void w(Outline outline) {
        this.f13648a.setOutline(outline);
    }

    @Override // d2.v1
    public final boolean x() {
        boolean hasOverlappingRendering;
        hasOverlappingRendering = this.f13648a.setHasOverlappingRendering(true);
        return hasOverlappingRendering;
    }

    @Override // d2.v1
    public final void y(float f10) {
        this.f13648a.setAlpha(f10);
    }

    @Override // d2.v1
    public final boolean z() {
        boolean clipToBounds;
        clipToBounds = this.f13648a.getClipToBounds();
        return clipToBounds;
    }
}
