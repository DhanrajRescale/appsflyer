package ws;

import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import oo.j;
import p4.k;
import p4.l;

/* loaded from: classes2.dex */
public final class e implements f {

    /* renamed from: i, reason: collision with root package name */
    public static final ObjectAnimator f39422i;

    /* renamed from: j, reason: collision with root package name */
    public static final j f39423j;

    /* renamed from: k, reason: collision with root package name */
    public static final l f39424k;

    /* renamed from: a, reason: collision with root package name */
    public final d f39425a;

    /* renamed from: b, reason: collision with root package name */
    public final View f39426b;

    /* renamed from: c, reason: collision with root package name */
    public final float f39427c;

    /* renamed from: d, reason: collision with root package name */
    public final float f39428d;

    /* renamed from: e, reason: collision with root package name */
    public final float f39429e;

    /* renamed from: f, reason: collision with root package name */
    public final k f39430f;

    /* renamed from: g, reason: collision with root package name */
    public final p4.j f39431g;

    /* renamed from: h, reason: collision with root package name */
    public final ObjectAnimator f39432h;

    static {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.setProperty(View.TRANSLATION_X);
        objectAnimator.setInterpolator(null);
        objectAnimator.setDuration(0L);
        f39422i = objectAnimator;
        f39423j = new j(1);
        l lVar = new l();
        lVar.b(50.0f);
        lVar.a();
        f39424k = lVar;
    }

    public e(vs.b bVar, float f10, float f11, float f12) {
        k kVar = new k(bVar, f39423j);
        kVar.f30660t = f39424k;
        p4.j jVar = new p4.j(bVar, p4.h.f30642q);
        jVar.f30659t.f30656a = -12.599999f;
        ObjectAnimator animator = f39422i;
        Intrinsics.e(animator, "animator");
        this.f39426b = bVar;
        this.f39427c = f10;
        this.f39428d = f11;
        this.f39429e = f12;
        this.f39430f = kVar;
        this.f39431g = jVar;
        this.f39432h = animator;
        this.f39425a = new d(this, 0);
        animator.setTarget(bVar);
    }

    @Override // ws.f
    public final void a(float f10) {
        e();
        float[] fArr = {this.f39426b.getTranslationX() + f10};
        ObjectAnimator objectAnimator = this.f39432h;
        objectAnimator.setFloatValues(fArr);
        objectAnimator.start();
    }

    @Override // ws.f
    public final void b() {
        Rect f10 = f();
        if (this.f39427c < f10.left || f10.right < this.f39428d) {
            d(f10, s0.g.f34069a);
        }
    }

    @Override // ws.f
    public final void c(float f10) {
        e();
        p4.j jVar = this.f39431g;
        if (!jVar.f30650f) {
            ArrayList arrayList = jVar.f30655k;
            d dVar = this.f39425a;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            jVar.f30645a = f10;
            jVar.d();
            return;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public final void d(Rect rect, float f10) {
        View view = this.f39426b;
        float scaleX = view.getScaleX();
        float f11 = this.f39429e;
        if (f11 >= scaleX) {
            f11 = 1.0f;
            if (view.getScaleX() >= 1.0f) {
                f11 = view.getScaleX();
            }
        }
        float width = ((view.getWidth() * f11) - view.getWidth()) / 2;
        float f12 = rect.left;
        float f13 = this.f39427c;
        k kVar = this.f39430f;
        if (f13 < f12) {
            e();
            kVar.f30645a = f10;
            kVar.f(f13 + width);
            return;
        }
        float f14 = rect.right;
        float f15 = this.f39428d;
        if (f14 < f15) {
            e();
            kVar.f30645a = f10;
            kVar.f((f15 - view.getWidth()) - width);
        }
    }

    public final void e() {
        this.f39432h.cancel();
        this.f39430f.a();
        p4.j jVar = this.f39431g;
        jVar.a();
        ArrayList arrayList = jVar.f30655k;
        int indexOf = arrayList.indexOf(this.f39425a);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
    }

    public final Rect f() {
        Rect rect;
        Rect rect2 = new Rect();
        View view = this.f39426b;
        view.getHitRect(rect2);
        float scaleX = view.getScaleX();
        float f10 = this.f39429e;
        if (f10 < scaleX) {
            float f11 = 2;
            int height = (int) ((rect2.height() - ((f10 / view.getScaleY()) * rect2.height())) / f11);
            int width = (int) ((rect2.width() - ((f10 / view.getScaleY()) * rect2.width())) / f11);
            rect = new Rect(rect2.left + width, rect2.top + height, rect2.right - width, rect2.bottom - height);
        } else if (view.getScaleX() < 1.0f) {
            int height2 = (view.getHeight() - rect2.height()) / 2;
            int width2 = (view.getWidth() - rect2.width()) / 2;
            rect = new Rect(rect2.left + width2, rect2.top + height2, rect2.right - width2, rect2.bottom - height2);
        } else {
            return rect2;
        }
        return rect;
    }
}
