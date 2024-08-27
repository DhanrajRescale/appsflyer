package u7;

import android.graphics.Paint;

/* loaded from: classes.dex */
public final class i extends l {

    /* renamed from: e, reason: collision with root package name */
    public l0.j f36915e;

    /* renamed from: f, reason: collision with root package name */
    public float f36916f;

    /* renamed from: g, reason: collision with root package name */
    public l0.j f36917g;

    /* renamed from: h, reason: collision with root package name */
    public float f36918h;

    /* renamed from: i, reason: collision with root package name */
    public float f36919i;

    /* renamed from: j, reason: collision with root package name */
    public float f36920j;

    /* renamed from: k, reason: collision with root package name */
    public float f36921k;

    /* renamed from: l, reason: collision with root package name */
    public float f36922l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Cap f36923m;

    /* renamed from: n, reason: collision with root package name */
    public Paint.Join f36924n;

    /* renamed from: o, reason: collision with root package name */
    public float f36925o;

    @Override // u7.k
    public final boolean a() {
        if (!this.f36917g.i() && !this.f36915e.i()) {
            return false;
        }
        return true;
    }

    @Override // u7.k
    public final boolean b(int[] iArr) {
        return this.f36915e.r(iArr) | this.f36917g.r(iArr);
    }

    public float getFillAlpha() {
        return this.f36919i;
    }

    public int getFillColor() {
        return this.f36917g.f23773a;
    }

    public float getStrokeAlpha() {
        return this.f36918h;
    }

    public int getStrokeColor() {
        return this.f36915e.f23773a;
    }

    public float getStrokeWidth() {
        return this.f36916f;
    }

    public float getTrimPathEnd() {
        return this.f36921k;
    }

    public float getTrimPathOffset() {
        return this.f36922l;
    }

    public float getTrimPathStart() {
        return this.f36920j;
    }

    public void setFillAlpha(float f10) {
        this.f36919i = f10;
    }

    public void setFillColor(int i10) {
        this.f36917g.f23773a = i10;
    }

    public void setStrokeAlpha(float f10) {
        this.f36918h = f10;
    }

    public void setStrokeColor(int i10) {
        this.f36915e.f23773a = i10;
    }

    public void setStrokeWidth(float f10) {
        this.f36916f = f10;
    }

    public void setTrimPathEnd(float f10) {
        this.f36921k = f10;
    }

    public void setTrimPathOffset(float f10) {
        this.f36922l = f10;
    }

    public void setTrimPathStart(float f10) {
        this.f36920j = f10;
    }
}
