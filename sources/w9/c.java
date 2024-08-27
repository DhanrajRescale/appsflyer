package w9;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.os.Build;
import android.view.Choreographer;
import j9.i;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kp.j;
import s0.g;

/* loaded from: classes.dex */
public final class c extends ValueAnimator implements Choreographer.FrameCallback {

    /* renamed from: l, reason: collision with root package name */
    public i f38887l;

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArraySet f38876a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet f38877b = new CopyOnWriteArraySet();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArraySet f38878c = new CopyOnWriteArraySet();

    /* renamed from: d, reason: collision with root package name */
    public float f38879d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public boolean f38880e = false;

    /* renamed from: f, reason: collision with root package name */
    public long f38881f = 0;

    /* renamed from: g, reason: collision with root package name */
    public float f38882g = g.f34069a;

    /* renamed from: h, reason: collision with root package name */
    public float f38883h = g.f34069a;

    /* renamed from: i, reason: collision with root package name */
    public int f38884i = 0;

    /* renamed from: j, reason: collision with root package name */
    public float f38885j = -2.1474836E9f;

    /* renamed from: k, reason: collision with root package name */
    public float f38886k = 2.1474836E9f;

    /* renamed from: m, reason: collision with root package name */
    public boolean f38888m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f38889n = false;

    @Override // android.animation.Animator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f38877b.add(animatorListener);
    }

    @Override // android.animation.Animator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f38878c.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f38876a.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f38877b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        i(h());
        m(true);
    }

    public final float d() {
        i iVar = this.f38887l;
        if (iVar == null) {
            return g.f34069a;
        }
        float f10 = this.f38883h;
        float f11 = iVar.f21176k;
        return (f10 - f11) / (iVar.f21177l - f11);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        float f10;
        float e10;
        boolean z10 = false;
        if (this.f38888m) {
            m(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        i iVar = this.f38887l;
        if (iVar != null && this.f38888m) {
            long j11 = this.f38881f;
            long j12 = 0;
            if (j11 != 0) {
                j12 = j10 - j11;
            }
            float abs = ((float) j12) / ((1.0E9f / iVar.f21178m) / Math.abs(this.f38879d));
            float f11 = this.f38882g;
            if (h()) {
                abs = -abs;
            }
            float f12 = f11 + abs;
            float f13 = f();
            float e11 = e();
            PointF pointF = e.f38891a;
            if (f12 >= f13 && f12 <= e11) {
                z10 = true;
            }
            boolean z11 = !z10;
            float f14 = this.f38882g;
            float b10 = e.b(f12, f(), e());
            this.f38882g = b10;
            if (this.f38889n) {
                b10 = (float) Math.floor(b10);
            }
            this.f38883h = b10;
            this.f38881f = j10;
            if (!this.f38889n || this.f38882g != f14) {
                j();
            }
            if (z11) {
                if (getRepeatCount() != -1 && this.f38884i >= getRepeatCount()) {
                    if (this.f38879d < g.f34069a) {
                        e10 = f();
                    } else {
                        e10 = e();
                    }
                    this.f38882g = e10;
                    this.f38883h = e10;
                    m(true);
                    i(h());
                } else {
                    Iterator it = this.f38877b.iterator();
                    while (it.hasNext()) {
                        ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                    }
                    this.f38884i++;
                    if (getRepeatMode() == 2) {
                        this.f38880e = !this.f38880e;
                        this.f38879d = -this.f38879d;
                    } else {
                        if (h()) {
                            f10 = e();
                        } else {
                            f10 = f();
                        }
                        this.f38882g = f10;
                        this.f38883h = f10;
                    }
                    this.f38881f = j10;
                }
            }
            if (this.f38887l != null) {
                float f15 = this.f38883h;
                if (f15 < this.f38885j || f15 > this.f38886k) {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f38885j), Float.valueOf(this.f38886k), Float.valueOf(this.f38883h)));
                }
            }
            j.M();
        }
    }

    public final float e() {
        i iVar = this.f38887l;
        if (iVar == null) {
            return g.f34069a;
        }
        float f10 = this.f38886k;
        if (f10 == 2.1474836E9f) {
            return iVar.f21177l;
        }
        return f10;
    }

    public final float f() {
        i iVar = this.f38887l;
        if (iVar == null) {
            return g.f34069a;
        }
        float f10 = this.f38885j;
        if (f10 == -2.1474836E9f) {
            return iVar.f21176k;
        }
        return f10;
    }

    public final long g() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float f10;
        float e10;
        float f11;
        if (this.f38887l == null) {
            return g.f34069a;
        }
        if (h()) {
            f10 = e() - this.f38883h;
            e10 = e();
            f11 = f();
        } else {
            f10 = this.f38883h - f();
            e10 = e();
            f11 = f();
        }
        return f10 / (e10 - f11);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(d());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        if (this.f38887l == null) {
            return 0L;
        }
        return r0.b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ long getStartDelay() {
        g();
        throw null;
    }

    public final boolean h() {
        return this.f38879d < g.f34069a;
    }

    public final void i(boolean z10) {
        Iterator it = this.f38877b.iterator();
        while (it.hasNext()) {
            Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z10);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f38888m;
    }

    public final void j() {
        Iterator it = this.f38876a.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    @Override // android.animation.Animator
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void removeAllListeners() {
        this.f38877b.clear();
    }

    @Override // android.animation.ValueAnimator
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void removeAllUpdateListeners() {
        this.f38876a.clear();
    }

    public final void m(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.f38888m = false;
        }
    }

    @Override // android.animation.Animator
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f38877b.remove(animatorListener);
    }

    @Override // android.animation.Animator
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f38878c.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f38876a.remove(animatorUpdateListener);
    }

    public final ValueAnimator q(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    public final void r(float f10) {
        if (this.f38882g == f10) {
            return;
        }
        float b10 = e.b(f10, f(), e());
        this.f38882g = b10;
        if (this.f38889n) {
            b10 = (float) Math.floor(b10);
        }
        this.f38883h = b10;
        this.f38881f = 0L;
        j();
    }

    public final void s(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j10) {
        q(j10);
        throw null;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ void setInterpolator(TimeInterpolator timeInterpolator) {
        s(timeInterpolator);
        throw null;
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 != 2 && this.f38880e) {
            this.f38880e = false;
            this.f38879d = -this.f38879d;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ void setStartDelay(long j10) {
        u(j10);
        throw null;
    }

    public final void t(float f10, float f11) {
        float f12;
        float f13;
        if (f10 <= f11) {
            i iVar = this.f38887l;
            if (iVar == null) {
                f12 = -3.4028235E38f;
            } else {
                f12 = iVar.f21176k;
            }
            if (iVar == null) {
                f13 = Float.MAX_VALUE;
            } else {
                f13 = iVar.f21177l;
            }
            float b10 = e.b(f10, f12, f13);
            float b11 = e.b(f11, f12, f13);
            if (b10 != this.f38885j || b11 != this.f38886k) {
                this.f38885j = b10;
                this.f38886k = b11;
                r((int) e.b(this.f38883h, b10, b11));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
    }

    public final void u(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ ValueAnimator setDuration(long j10) {
        q(j10);
        throw null;
    }
}
