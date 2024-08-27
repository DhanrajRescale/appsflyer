package p4;

import android.os.Looper;
import android.util.AndroidRuntimeException;

/* loaded from: classes.dex */
public final class k extends h {

    /* renamed from: t, reason: collision with root package name */
    public l f30660t;

    /* renamed from: u, reason: collision with root package name */
    public float f30661u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f30662v;

    public k(Object obj, oo.j jVar) {
        super(obj, jVar);
        this.f30660t = null;
        this.f30661u = Float.MAX_VALUE;
        this.f30662v = false;
    }

    @Override // p4.h
    public final void d() {
        l lVar = this.f30660t;
        if (lVar != null) {
            double d10 = (float) lVar.f30671i;
            if (d10 <= Float.MAX_VALUE) {
                if (d10 >= this.f30651g) {
                    double abs = Math.abs(this.f30653i * 0.75f);
                    lVar.f30666d = abs;
                    lVar.f30667e = abs * 62.5d;
                    super.d();
                    return;
                }
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }

    @Override // p4.h
    public final boolean e(long j10) {
        if (this.f30662v) {
            float f10 = this.f30661u;
            if (f10 != Float.MAX_VALUE) {
                this.f30660t.f30671i = f10;
                this.f30661u = Float.MAX_VALUE;
            }
            this.f30646b = (float) this.f30660t.f30671i;
            this.f30645a = s0.g.f34069a;
            this.f30662v = false;
            return true;
        }
        if (this.f30661u != Float.MAX_VALUE) {
            l lVar = this.f30660t;
            double d10 = lVar.f30671i;
            long j11 = j10 / 2;
            e c10 = lVar.c(this.f30646b, this.f30645a, j11);
            l lVar2 = this.f30660t;
            lVar2.f30671i = this.f30661u;
            this.f30661u = Float.MAX_VALUE;
            e c11 = lVar2.c(c10.f30635a, c10.f30636b, j11);
            this.f30646b = c11.f30635a;
            this.f30645a = c11.f30636b;
        } else {
            e c12 = this.f30660t.c(this.f30646b, this.f30645a, j10);
            this.f30646b = c12.f30635a;
            this.f30645a = c12.f30636b;
        }
        float max = Math.max(this.f30646b, this.f30651g);
        this.f30646b = max;
        this.f30646b = Math.min(max, Float.MAX_VALUE);
        float f11 = this.f30645a;
        l lVar3 = this.f30660t;
        lVar3.getClass();
        if (Math.abs(f11) >= lVar3.f30667e || Math.abs(r1 - ((float) lVar3.f30671i)) >= lVar3.f30666d) {
            return false;
        }
        this.f30646b = (float) this.f30660t.f30671i;
        this.f30645a = s0.g.f34069a;
        return true;
    }

    public final void f(float f10) {
        if (this.f30650f) {
            this.f30661u = f10;
            return;
        }
        if (this.f30660t == null) {
            this.f30660t = new l(f10);
        }
        this.f30660t.f30671i = f10;
        d();
    }

    public final void g() {
        if (this.f30660t.f30664b > 0.0d) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f30650f) {
                    this.f30662v = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
    }
}
