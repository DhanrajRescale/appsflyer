package d4;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class o2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f13796a;

    /* renamed from: b, reason: collision with root package name */
    public float f13797b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f13798c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13799d;

    public o2(int i10, Interpolator interpolator, long j10) {
        this.f13796a = i10;
        this.f13798c = interpolator;
        this.f13799d = j10;
    }

    public long a() {
        return this.f13799d;
    }

    public float b() {
        Interpolator interpolator = this.f13798c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f13797b);
        }
        return this.f13797b;
    }

    public int c() {
        return this.f13796a;
    }

    public void d(float f10) {
        this.f13797b = f10;
    }
}
