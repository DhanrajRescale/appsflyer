package oo;

import android.animation.ObjectAnimator;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import m.k3;

/* loaded from: classes2.dex */
public final class h extends l.d {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f30179l = {0, 1350, 2700, 4050};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f30180m = {667, 2017, 3367, 4717};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f30181n = {CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, 2350, 3700, 5050};

    /* renamed from: o, reason: collision with root package name */
    public static final k3 f30182o;

    /* renamed from: p, reason: collision with root package name */
    public static final k3 f30183p;

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f30184d;

    /* renamed from: e, reason: collision with root package name */
    public ObjectAnimator f30185e;

    /* renamed from: f, reason: collision with root package name */
    public final v4.b f30186f;

    /* renamed from: g, reason: collision with root package name */
    public final i f30187g;

    /* renamed from: h, reason: collision with root package name */
    public int f30188h;

    /* renamed from: i, reason: collision with root package name */
    public float f30189i;

    /* renamed from: j, reason: collision with root package name */
    public float f30190j;

    /* renamed from: k, reason: collision with root package name */
    public u7.c f30191k;

    static {
        Class<Float> cls = Float.class;
        f30182o = new k3("animationFraction", 12, cls);
        f30183p = new k3("completeEndFraction", 13, cls);
    }

    public h(i iVar) {
        super(1);
        this.f30188h = 0;
        this.f30191k = null;
        this.f30187g = iVar;
        this.f30186f = new v4.b();
    }

    @Override // l.d
    public final void c() {
        ObjectAnimator objectAnimator = this.f30184d;
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
        this.f30191k = cVar;
    }

    @Override // l.d
    public final void m() {
        ObjectAnimator objectAnimator = this.f30185e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (((o) this.f23559a).isVisible()) {
                this.f30185e.start();
            } else {
                c();
            }
        }
    }

    @Override // l.d
    public final void n() {
        if (this.f30184d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f30182o, s0.g.f34069a, 1.0f);
            this.f30184d = ofFloat;
            ofFloat.setDuration(5400L);
            this.f30184d.setInterpolator(null);
            this.f30184d.setRepeatCount(-1);
            this.f30184d.addListener(new g(this, 0));
        }
        if (this.f30185e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f30183p, s0.g.f34069a, 1.0f);
            this.f30185e = ofFloat2;
            ofFloat2.setDuration(333L);
            this.f30185e.setInterpolator(this.f30186f);
            this.f30185e.addListener(new g(this, 1));
        }
        q();
        this.f30184d.start();
    }

    @Override // l.d
    public final void o() {
        this.f30191k = null;
    }

    public final void q() {
        this.f30188h = 0;
        ((int[]) this.f23561c)[0] = pn.e.c(this.f30187g.f30169c[0], ((o) this.f23559a).f30214j);
        this.f30190j = s0.g.f34069a;
    }
}
