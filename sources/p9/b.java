package p9;

import android.graphics.PointF;
import w.k;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f30771a;

    /* renamed from: b, reason: collision with root package name */
    public String f30772b;

    /* renamed from: c, reason: collision with root package name */
    public float f30773c;

    /* renamed from: d, reason: collision with root package name */
    public int f30774d;

    /* renamed from: e, reason: collision with root package name */
    public int f30775e;

    /* renamed from: f, reason: collision with root package name */
    public float f30776f;

    /* renamed from: g, reason: collision with root package name */
    public float f30777g;

    /* renamed from: h, reason: collision with root package name */
    public int f30778h;

    /* renamed from: i, reason: collision with root package name */
    public int f30779i;

    /* renamed from: j, reason: collision with root package name */
    public float f30780j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f30781k;

    /* renamed from: l, reason: collision with root package name */
    public PointF f30782l;

    /* renamed from: m, reason: collision with root package name */
    public PointF f30783m;

    public final int hashCode() {
        int e10 = ((k.e(this.f30774d) + (((int) (jr.h.g(this.f30772b, this.f30771a.hashCode() * 31, 31) + this.f30773c)) * 31)) * 31) + this.f30775e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f30776f);
        return (((e10 * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f30778h;
    }
}
