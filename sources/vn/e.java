package vn;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public long f38188a;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f38190c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f38191d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f38192e = 1;

    /* renamed from: b, reason: collision with root package name */
    public long f38189b = 150;

    public e(long j10) {
        this.f38188a = j10;
    }

    public final void a(ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay(this.f38188a);
        objectAnimator.setDuration(this.f38189b);
        objectAnimator.setInterpolator(b());
        objectAnimator.setRepeatCount(this.f38191d);
        objectAnimator.setRepeatMode(this.f38192e);
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f38190c;
        if (timeInterpolator == null) {
            return a.f38181b;
        }
        return timeInterpolator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f38188a != eVar.f38188a || this.f38189b != eVar.f38189b || this.f38191d != eVar.f38191d || this.f38192e != eVar.f38192e) {
            return false;
        }
        return b().getClass().equals(eVar.b().getClass());
    }

    public final int hashCode() {
        long j10 = this.f38188a;
        long j11 = this.f38189b;
        return ((((b().getClass().hashCode() + (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31)) * 31) + this.f38191d) * 31) + this.f38192e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(e.class.getName());
        sb2.append(UrlTreeKt.componentParamPrefixChar);
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f38188a);
        sb2.append(" duration: ");
        sb2.append(this.f38189b);
        sb2.append(" interpolator: ");
        sb2.append(b().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f38191d);
        sb2.append(" repeatMode: ");
        return nn.d.m(sb2, this.f38192e, "}\n");
    }
}
