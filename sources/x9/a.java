package x9;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import j9.i;
import s0.g;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final i f40114a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f40115b;

    /* renamed from: c, reason: collision with root package name */
    public Object f40116c;

    /* renamed from: d, reason: collision with root package name */
    public final Interpolator f40117d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator f40118e;

    /* renamed from: f, reason: collision with root package name */
    public final Interpolator f40119f;

    /* renamed from: g, reason: collision with root package name */
    public final float f40120g;

    /* renamed from: h, reason: collision with root package name */
    public Float f40121h;

    /* renamed from: i, reason: collision with root package name */
    public float f40122i;

    /* renamed from: j, reason: collision with root package name */
    public float f40123j;

    /* renamed from: k, reason: collision with root package name */
    public int f40124k;

    /* renamed from: l, reason: collision with root package name */
    public int f40125l;

    /* renamed from: m, reason: collision with root package name */
    public float f40126m;

    /* renamed from: n, reason: collision with root package name */
    public float f40127n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f40128o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f40129p;

    public a(i iVar, Object obj, Object obj2, Interpolator interpolator, float f10, Float f11) {
        this.f40122i = -3987645.8f;
        this.f40123j = -3987645.8f;
        this.f40124k = 784923401;
        this.f40125l = 784923401;
        this.f40126m = Float.MIN_VALUE;
        this.f40127n = Float.MIN_VALUE;
        this.f40128o = null;
        this.f40129p = null;
        this.f40114a = iVar;
        this.f40115b = obj;
        this.f40116c = obj2;
        this.f40117d = interpolator;
        this.f40118e = null;
        this.f40119f = null;
        this.f40120g = f10;
        this.f40121h = f11;
    }

    public final float a() {
        i iVar = this.f40114a;
        if (iVar == null) {
            return 1.0f;
        }
        if (this.f40127n == Float.MIN_VALUE) {
            if (this.f40121h == null) {
                this.f40127n = 1.0f;
            } else {
                this.f40127n = ((this.f40121h.floatValue() - this.f40120g) / (iVar.f21177l - iVar.f21176k)) + b();
            }
        }
        return this.f40127n;
    }

    public final float b() {
        i iVar = this.f40114a;
        if (iVar == null) {
            return g.f34069a;
        }
        if (this.f40126m == Float.MIN_VALUE) {
            float f10 = iVar.f21176k;
            this.f40126m = (this.f40120g - f10) / (iVar.f21177l - f10);
        }
        return this.f40126m;
    }

    public final boolean c() {
        return this.f40117d == null && this.f40118e == null && this.f40119f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f40115b + ", endValue=" + this.f40116c + ", startFrame=" + this.f40120g + ", endFrame=" + this.f40121h + ", interpolator=" + this.f40117d + UrlTreeKt.componentParamSuffixChar;
    }

    public a(i iVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f10) {
        this.f40122i = -3987645.8f;
        this.f40123j = -3987645.8f;
        this.f40124k = 784923401;
        this.f40125l = 784923401;
        this.f40126m = Float.MIN_VALUE;
        this.f40127n = Float.MIN_VALUE;
        this.f40128o = null;
        this.f40129p = null;
        this.f40114a = iVar;
        this.f40115b = obj;
        this.f40116c = obj2;
        this.f40117d = null;
        this.f40118e = interpolator;
        this.f40119f = interpolator2;
        this.f40120g = f10;
        this.f40121h = null;
    }

    public a(i iVar, PointF pointF, PointF pointF2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.f40122i = -3987645.8f;
        this.f40123j = -3987645.8f;
        this.f40124k = 784923401;
        this.f40125l = 784923401;
        this.f40126m = Float.MIN_VALUE;
        this.f40127n = Float.MIN_VALUE;
        this.f40128o = null;
        this.f40129p = null;
        this.f40114a = iVar;
        this.f40115b = pointF;
        this.f40116c = pointF2;
        this.f40117d = interpolator;
        this.f40118e = interpolator2;
        this.f40119f = interpolator3;
        this.f40120g = f10;
        this.f40121h = f11;
    }

    public a(Object obj) {
        this.f40122i = -3987645.8f;
        this.f40123j = -3987645.8f;
        this.f40124k = 784923401;
        this.f40125l = 784923401;
        this.f40126m = Float.MIN_VALUE;
        this.f40127n = Float.MIN_VALUE;
        this.f40128o = null;
        this.f40129p = null;
        this.f40114a = null;
        this.f40115b = obj;
        this.f40116c = obj;
        this.f40117d = null;
        this.f40118e = null;
        this.f40119f = null;
        this.f40120g = Float.MIN_VALUE;
        this.f40121h = Float.valueOf(Float.MAX_VALUE);
    }

    public a(r9.c cVar, r9.c cVar2) {
        this.f40122i = -3987645.8f;
        this.f40123j = -3987645.8f;
        this.f40124k = 784923401;
        this.f40125l = 784923401;
        this.f40126m = Float.MIN_VALUE;
        this.f40127n = Float.MIN_VALUE;
        this.f40128o = null;
        this.f40129p = null;
        this.f40114a = null;
        this.f40115b = cVar;
        this.f40116c = cVar2;
        this.f40117d = null;
        this.f40118e = null;
        this.f40119f = null;
        this.f40120g = Float.MIN_VALUE;
        this.f40121h = Float.valueOf(Float.MAX_VALUE);
    }
}
