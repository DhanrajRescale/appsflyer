package k7;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final class h0 implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f22376a;

    /* renamed from: b, reason: collision with root package name */
    public final float f22377b;

    /* renamed from: c, reason: collision with root package name */
    public final float f22378c;

    /* renamed from: d, reason: collision with root package name */
    public final float f22379d;

    /* renamed from: e, reason: collision with root package name */
    public final y1 f22380e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22381f;

    /* renamed from: g, reason: collision with root package name */
    public final ValueAnimator f22382g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22383h;

    /* renamed from: i, reason: collision with root package name */
    public float f22384i;

    /* renamed from: j, reason: collision with root package name */
    public float f22385j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f22386k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f22387l = false;

    /* renamed from: m, reason: collision with root package name */
    public float f22388m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f22389n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y1 f22390o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k0 f22391p;

    public h0(k0 k0Var, y1 y1Var, int i10, float f10, float f11, float f12, float f13, int i11, y1 y1Var2) {
        this.f22391p = k0Var;
        this.f22389n = i11;
        this.f22390o = y1Var2;
        this.f22381f = i10;
        this.f22380e = y1Var;
        this.f22376a = f10;
        this.f22377b = f11;
        this.f22378c = f12;
        this.f22379d = f13;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s0.g.f34069a, 1.0f);
        this.f22382g = ofFloat;
        ofFloat.addUpdateListener(new a0(this, 1));
        ofFloat.setTarget(y1Var.f22629a);
        ofFloat.addListener(this);
        this.f22388m = s0.g.f34069a;
    }

    public final void a(Animator animator) {
        if (!this.f22387l) {
            this.f22380e.r(true);
        }
        this.f22387l = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f22388m = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (this.f22386k) {
            return;
        }
        int i10 = this.f22389n;
        y1 y1Var = this.f22390o;
        k0 k0Var = this.f22391p;
        if (i10 <= 0) {
            k0Var.f22449m.getClass();
            i0.a(y1Var);
        } else {
            k0Var.f22437a.add(y1Var.f22629a);
            this.f22383h = true;
            if (i10 > 0) {
                k0Var.f22454r.post(new b.d(k0Var, this, i10, 6));
            }
        }
        View view = k0Var.f22459w;
        View view2 = y1Var.f22629a;
        if (view == view2) {
            k0Var.s(view2);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final /* bridge */ /* synthetic */ void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final /* bridge */ /* synthetic */ void onAnimationStart(Animator animator) {
    }
}
