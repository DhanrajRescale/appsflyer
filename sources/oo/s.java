package oo;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import m.k3;

/* loaded from: classes2.dex */
public final class s extends l.d {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f30232l = {533, 567, 850, 750};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f30233m = {1267, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, 333, 0};

    /* renamed from: n, reason: collision with root package name */
    public static final k3 f30234n = new k3("animationFraction", 16, Float.class);

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f30235d;

    /* renamed from: e, reason: collision with root package name */
    public ObjectAnimator f30236e;

    /* renamed from: f, reason: collision with root package name */
    public final Interpolator[] f30237f;

    /* renamed from: g, reason: collision with root package name */
    public final t f30238g;

    /* renamed from: h, reason: collision with root package name */
    public int f30239h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f30240i;

    /* renamed from: j, reason: collision with root package name */
    public float f30241j;

    /* renamed from: k, reason: collision with root package name */
    public u7.c f30242k;

    public s(Context context, t tVar) {
        super(2);
        this.f30239h = 0;
        this.f30242k = null;
        this.f30238g = tVar;
        this.f30237f = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // l.d
    public final void c() {
        ObjectAnimator objectAnimator = this.f30235d;
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
        this.f30242k = cVar;
    }

    @Override // l.d
    public final void m() {
        ObjectAnimator objectAnimator = this.f30236e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            c();
            if (((o) this.f23559a).isVisible()) {
                this.f30236e.setFloatValues(this.f30241j, 1.0f);
                this.f30236e.setDuration((1.0f - this.f30241j) * 1800.0f);
                this.f30236e.start();
            }
        }
    }

    @Override // l.d
    public final void n() {
        ObjectAnimator objectAnimator = this.f30235d;
        k3 k3Var = f30234n;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, k3Var, s0.g.f34069a, 1.0f);
            this.f30235d = ofFloat;
            ofFloat.setDuration(1800L);
            this.f30235d.setInterpolator(null);
            this.f30235d.setRepeatCount(-1);
            this.f30235d.addListener(new r(this, 0));
        }
        if (this.f30236e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, k3Var, 1.0f);
            this.f30236e = ofFloat2;
            ofFloat2.setDuration(1800L);
            this.f30236e.setInterpolator(null);
            this.f30236e.addListener(new r(this, 1));
        }
        q();
        this.f30235d.start();
    }

    @Override // l.d
    public final void o() {
        this.f30242k = null;
    }

    public final void q() {
        this.f30239h = 0;
        int c10 = pn.e.c(this.f30238g.f30169c[0], ((o) this.f23559a).f30214j);
        int[] iArr = (int[]) this.f23561c;
        iArr[0] = c10;
        iArr[1] = c10;
    }
}
