package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class k0 extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1728a;

    /* renamed from: b, reason: collision with root package name */
    public final View f1729b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1730c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1731d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1732e;

    public k0(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f1732e = true;
        this.f1728a = viewGroup;
        this.f1729b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j10, Transformation transformation) {
        this.f1732e = true;
        if (this.f1730c) {
            return !this.f1731d;
        }
        if (!super.getTransformation(j10, transformation)) {
            this.f1730c = true;
            d4.g0.a(this.f1728a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.f1730c;
        ViewGroup viewGroup = this.f1728a;
        if (!z10 && this.f1732e) {
            this.f1732e = false;
            viewGroup.post(this);
        } else {
            viewGroup.endViewTransition(this.f1729b);
            this.f1731d = true;
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j10, Transformation transformation, float f10) {
        this.f1732e = true;
        if (this.f1730c) {
            return !this.f1731d;
        }
        if (!super.getTransformation(j10, transformation, f10)) {
            this.f1730c = true;
            d4.g0.a(this.f1728a, this);
        }
        return true;
    }
}
