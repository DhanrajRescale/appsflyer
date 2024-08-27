package oo;

import android.animation.ObjectAnimator;
import java.util.Arrays;
import m.k3;

/* loaded from: classes2.dex */
public final class q extends l.d {

    /* renamed from: j, reason: collision with root package name */
    public static final k3 f30223j = new k3("animationFraction", 15, Float.class);

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f30224d;

    /* renamed from: e, reason: collision with root package name */
    public final v4.b f30225e;

    /* renamed from: f, reason: collision with root package name */
    public final t f30226f;

    /* renamed from: g, reason: collision with root package name */
    public int f30227g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f30228h;

    /* renamed from: i, reason: collision with root package name */
    public float f30229i;

    public q(t tVar) {
        super(3);
        this.f30227g = 1;
        this.f30226f = tVar;
        this.f30225e = new v4.b();
    }

    @Override // l.d
    public final void c() {
        ObjectAnimator objectAnimator = this.f30224d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // l.d
    public final void i() {
        q();
    }

    @Override // l.d
    public final void l(c cVar) {
    }

    @Override // l.d
    public final void m() {
    }

    @Override // l.d
    public final void n() {
        if (this.f30224d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f30223j, s0.g.f34069a, 1.0f);
            this.f30224d = ofFloat;
            ofFloat.setDuration(333L);
            this.f30224d.setInterpolator(null);
            this.f30224d.setRepeatCount(-1);
            this.f30224d.addListener(new m.d(this, 7));
        }
        q();
        this.f30224d.start();
    }

    @Override // l.d
    public final void o() {
    }

    public final void q() {
        this.f30228h = true;
        this.f30227g = 1;
        Arrays.fill((int[]) this.f23561c, pn.e.c(this.f30226f.f30169c[0], ((o) this.f23559a).f30214j));
    }
}
