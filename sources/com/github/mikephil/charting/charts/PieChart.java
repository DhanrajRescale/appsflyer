package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import cn.d;
import cn.h;
import cn.i;
import java.lang.ref.WeakReference;
import okhttp3.HttpUrl;
import s0.g;
import sm.c;
import tm.e;
import um.m;
import w.k;

/* loaded from: classes2.dex */
public class PieChart extends c {
    public final RectF J;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f11056e0;

    /* renamed from: f0, reason: collision with root package name */
    public float[] f11057f0;

    /* renamed from: g0, reason: collision with root package name */
    public float[] f11058g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f11059h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f11060i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f11061j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f11062k0;

    /* renamed from: l0, reason: collision with root package name */
    public CharSequence f11063l0;

    /* renamed from: m0, reason: collision with root package name */
    public final d f11064m0;
    public float n0;

    /* renamed from: o0, reason: collision with root package name */
    public float f11065o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f11066p0;

    /* renamed from: q0, reason: collision with root package name */
    public float f11067q0;

    /* renamed from: r0, reason: collision with root package name */
    public float f11068r0;

    /* renamed from: s0, reason: collision with root package name */
    public float f11069s0;

    public PieChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.F = 270.0f;
        this.G = 270.0f;
        this.H = true;
        this.I = g.f34069a;
        this.J = new RectF();
        this.f11056e0 = true;
        this.f11057f0 = new float[1];
        this.f11058g0 = new float[1];
        this.f11059h0 = true;
        this.f11060i0 = false;
        this.f11061j0 = false;
        this.f11062k0 = false;
        this.f11063l0 = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f11064m0 = d.b(g.f34069a, g.f34069a);
        this.n0 = 50.0f;
        this.f11065o0 = 55.0f;
        this.f11066p0 = true;
        this.f11067q0 = 100.0f;
        this.f11068r0 = 360.0f;
        this.f11069s0 = g.f34069a;
    }

    @Override // sm.b
    public final void b() {
        float f10;
        float f11;
        float f12;
        float min;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        e eVar = this.f34706l;
        i iVar = this.f34713s;
        float f18 = g.f34069a;
        if (eVar != null && eVar.f36180a && !eVar.f36191j) {
            float min2 = Math.min(eVar.f36201t, iVar.f8276c * eVar.f36200s);
            int e10 = k.e(this.f34706l.f36190i);
            if (e10 != 0) {
                if (e10 == 1) {
                    e eVar2 = this.f34706l;
                    int i10 = eVar2.f36188g;
                    if (i10 != 1 && i10 != 3) {
                        f13 = 0.0f;
                    } else if (eVar2.f36189h == 2) {
                        f13 = h.c(13.0f) + min2;
                    } else {
                        f13 = h.c(8.0f) + min2;
                        e eVar3 = this.f34706l;
                        float f19 = eVar3.f36202u + eVar3.f36203v;
                        d center = getCenter();
                        if (this.f34706l.f36188g == 3) {
                            f15 = (getWidth() - f13) + 15.0f;
                        } else {
                            f15 = f13 - 15.0f;
                        }
                        float f20 = f19 + 15.0f;
                        float l10 = l(f15, f20);
                        float radius = getRadius();
                        float m10 = m(f15, f20);
                        d b10 = d.b(g.f34069a, g.f34069a);
                        double d10 = radius;
                        double d11 = m10;
                        b10.f8247b = (float) ((Math.cos(Math.toRadians(d11)) * d10) + center.f8247b);
                        float sin = (float) ((Math.sin(Math.toRadians(d11)) * d10) + center.f8248c);
                        b10.f8248c = sin;
                        float l11 = l(b10.f8247b, sin);
                        float c10 = h.c(5.0f);
                        if (f20 < center.f8248c || getHeight() - f13 <= getWidth()) {
                            if (l10 < l11) {
                                f13 = (l11 - l10) + c10;
                            } else {
                                f13 = 0.0f;
                            }
                        }
                        d.c(center);
                        d.c(b10);
                    }
                    int e11 = k.e(this.f34706l.f36188g);
                    if (e11 != 0) {
                        if (e11 != 1) {
                            if (e11 == 2) {
                                f16 = 0.0f;
                                f17 = 0.0f;
                            }
                            f16 = 0.0f;
                            f13 = 0.0f;
                            f17 = f13;
                        } else {
                            int e12 = k.e(this.f34706l.f36189h);
                            if (e12 != 0) {
                                if (e12 == 2) {
                                    e eVar4 = this.f34706l;
                                    f16 = Math.min(eVar4.f36202u, iVar.f8277d * eVar4.f36200s);
                                    f13 = 0.0f;
                                    f17 = f13;
                                }
                                f16 = 0.0f;
                                f13 = 0.0f;
                                f17 = f13;
                            } else {
                                e eVar5 = this.f34706l;
                                f17 = Math.min(eVar5.f36202u, iVar.f8277d * eVar5.f36200s);
                                f16 = 0.0f;
                                f13 = 0.0f;
                            }
                        }
                    } else {
                        f16 = 0.0f;
                        f17 = 0.0f;
                        f18 = f13;
                        f13 = 0.0f;
                    }
                    float f21 = f17;
                    f14 = f16;
                    min = f21;
                }
                min = 0.0f;
                f13 = 0.0f;
                f14 = f13;
            } else {
                int i11 = this.f34706l.f36189h;
                if (i11 == 1 || i11 == 3) {
                    float requiredLegendOffset = getRequiredLegendOffset();
                    e eVar6 = this.f34706l;
                    min = Math.min(eVar6.f36202u + requiredLegendOffset, iVar.f8277d * eVar6.f36200s);
                    int e13 = k.e(this.f34706l.f36189h);
                    if (e13 != 0) {
                        if (e13 == 2) {
                            f14 = min;
                            min = 0.0f;
                            f13 = 0.0f;
                        }
                    } else {
                        f13 = 0.0f;
                        f14 = f13;
                    }
                }
                min = 0.0f;
                f13 = 0.0f;
                f14 = f13;
            }
            f18 += getRequiredBaseOffset();
            f11 = f13 + getRequiredBaseOffset();
            f10 = min + getRequiredBaseOffset();
            f12 = f14 + getRequiredBaseOffset();
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
            f12 = 0.0f;
        }
        float c11 = h.c(this.I);
        float extraTopOffset = getExtraTopOffset() + f10;
        float extraRightOffset = getExtraRightOffset() + f11;
        float extraBottomOffset = getExtraBottomOffset() + f12;
        float max = Math.max(c11, getExtraLeftOffset() + f18);
        float max2 = Math.max(c11, extraTopOffset);
        float max3 = Math.max(c11, extraRightOffset);
        float max4 = Math.max(c11, Math.max(getRequiredBaseOffset(), extraBottomOffset));
        iVar.f8275b.set(max, max2, iVar.f8276c - max3, iVar.f8277d - max4);
        if (this.f34695a) {
            Log.i("MPAndroidChart", "offsetLeft: " + max + ", offsetTop: " + max2 + ", offsetRight: " + max3 + ", offsetBottom: " + max4);
        }
        if (this.f34696b == null) {
            return;
        }
        float diameter = getDiameter() / 2.0f;
        d centerOffsets = getCenterOffsets();
        float f22 = ((m) this.f34696b).i().f37284v;
        RectF rectF = this.J;
        float f23 = centerOffsets.f8247b;
        float f24 = centerOffsets.f8248c;
        rectF.set((f23 - diameter) + f22, (f24 - diameter) + f22, (f23 + diameter) - f22, (f24 + diameter) - f22);
        d.c(centerOffsets);
    }

    @Override // sm.b
    public final float[] f(wm.c cVar) {
        d centerCircleBox = getCenterCircleBox();
        float radius = getRadius();
        float f10 = (radius / 10.0f) * 3.6f;
        if (this.f11059h0) {
            f10 = (radius - (getHoleRadius() * (radius / 100.0f))) / 2.0f;
        }
        float f11 = radius - f10;
        float rotationAngle = getRotationAngle();
        int i10 = (int) cVar.f39307a;
        float f12 = this.f11057f0[i10] / 2.0f;
        double d10 = f11;
        float f13 = (this.f11058g0[i10] + rotationAngle) - f12;
        this.f34714t.getClass();
        float cos = (float) ((Math.cos(Math.toRadians(f13 * 1.0f)) * d10) + centerCircleBox.f8247b);
        float f14 = (rotationAngle + this.f11058g0[i10]) - f12;
        this.f34714t.getClass();
        float sin = (float) ((Math.sin(Math.toRadians(f14 * 1.0f)) * d10) + centerCircleBox.f8248c);
        d.c(centerCircleBox);
        return new float[]{cos, sin};
    }

    public float[] getAbsoluteAngles() {
        return this.f11058g0;
    }

    public d getCenterCircleBox() {
        RectF rectF = this.J;
        return d.b(rectF.centerX(), rectF.centerY());
    }

    public CharSequence getCenterText() {
        return this.f11063l0;
    }

    public d getCenterTextOffset() {
        d dVar = this.f11064m0;
        return d.b(dVar.f8247b, dVar.f8248c);
    }

    public float getCenterTextRadiusPercent() {
        return this.f11067q0;
    }

    public RectF getCircleBox() {
        return this.J;
    }

    public float[] getDrawAngles() {
        return this.f11057f0;
    }

    public float getHoleRadius() {
        return this.n0;
    }

    public float getMaxAngle() {
        return this.f11068r0;
    }

    public float getMinAngleForSlices() {
        return this.f11069s0;
    }

    @Override // sm.c
    public float getRadius() {
        RectF rectF = this.J;
        if (rectF == null) {
            return g.f34069a;
        }
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    @Override // sm.c
    public float getRequiredBaseOffset() {
        return g.f34069a;
    }

    @Override // sm.c
    public float getRequiredLegendOffset() {
        return this.f34710p.f7152c.getTextSize() * 2.0f;
    }

    public float getTransparentCircleRadius() {
        return this.f11065o0;
    }

    @Override // sm.b
    @Deprecated
    public tm.i getXAxis() {
        throw new RuntimeException("PieChart has no XAxis");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bn.i, bn.d] */
    @Override // sm.c, sm.b
    public final void h() {
        super.h();
        ?? dVar = new bn.d(this.f34714t, this.f34713s);
        dVar.f7181o = new RectF();
        dVar.f7182p = new RectF[]{new RectF(), new RectF(), new RectF()};
        dVar.f7185s = new Path();
        dVar.f7186t = new RectF();
        dVar.f7187u = new Path();
        dVar.f7188v = new Path();
        dVar.f7189w = new RectF();
        dVar.f7173g = this;
        Paint paint = new Paint(1);
        dVar.f7174h = paint;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        dVar.f7175i = paint2;
        paint2.setColor(-1);
        paint2.setStyle(style);
        paint2.setAlpha(105);
        TextPaint textPaint = new TextPaint(1);
        dVar.f7177k = textPaint;
        textPaint.setColor(-16777216);
        textPaint.setTextSize(h.c(12.0f));
        dVar.f7151f.setTextSize(h.c(13.0f));
        dVar.f7151f.setColor(-1);
        Paint paint3 = dVar.f7151f;
        Paint.Align align = Paint.Align.CENTER;
        paint3.setTextAlign(align);
        Paint paint4 = new Paint(1);
        dVar.f7178l = paint4;
        paint4.setColor(-1);
        paint4.setTextAlign(align);
        paint4.setTextSize(h.c(13.0f));
        Paint paint5 = new Paint(1);
        dVar.f7176j = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        this.f34711q = dVar;
        this.f34703i = null;
        this.f34712r = new da.d(this);
    }

    @Override // sm.b, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        bn.d dVar = this.f34711q;
        if (dVar != null && (dVar instanceof bn.i)) {
            bn.i iVar = (bn.i) dVar;
            Canvas canvas = iVar.f7184r;
            if (canvas != null) {
                canvas.setBitmap(null);
                iVar.f7184r = null;
            }
            WeakReference weakReference = iVar.f7183q;
            if (weakReference != null) {
                Bitmap bitmap = (Bitmap) weakReference.get();
                if (bitmap != null) {
                    bitmap.recycle();
                }
                iVar.f7183q.clear();
                iVar.f7183q = null;
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // sm.b, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f34696b == null) {
            return;
        }
        this.f34711q.i(canvas);
        if (k()) {
            this.f34711q.k(canvas, this.f34720z);
        }
        this.f34711q.j(canvas);
        this.f34711q.l(canvas);
        this.f34710p.j(canvas);
        c(canvas);
        d(canvas);
    }

    public void setCenterText(CharSequence charSequence) {
        if (charSequence == null) {
            this.f11063l0 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            this.f11063l0 = charSequence;
        }
    }

    public void setCenterTextColor(int i10) {
        ((bn.i) this.f34711q).f7177k.setColor(i10);
    }

    public void setCenterTextRadiusPercent(float f10) {
        this.f11067q0 = f10;
    }

    public void setCenterTextSize(float f10) {
        ((bn.i) this.f34711q).f7177k.setTextSize(h.c(f10));
    }

    public void setCenterTextSizePixels(float f10) {
        ((bn.i) this.f34711q).f7177k.setTextSize(f10);
    }

    public void setCenterTextTypeface(Typeface typeface) {
        ((bn.i) this.f34711q).f7177k.setTypeface(typeface);
    }

    public void setDrawCenterText(boolean z10) {
        this.f11066p0 = z10;
    }

    public void setDrawEntryLabels(boolean z10) {
        this.f11056e0 = z10;
    }

    public void setDrawHoleEnabled(boolean z10) {
        this.f11059h0 = z10;
    }

    public void setDrawRoundedSlices(boolean z10) {
        this.f11062k0 = z10;
    }

    @Deprecated
    public void setDrawSliceText(boolean z10) {
        this.f11056e0 = z10;
    }

    public void setDrawSlicesUnderHole(boolean z10) {
        this.f11060i0 = z10;
    }

    public void setEntryLabelColor(int i10) {
        ((bn.i) this.f34711q).f7178l.setColor(i10);
    }

    public void setEntryLabelTextSize(float f10) {
        ((bn.i) this.f34711q).f7178l.setTextSize(h.c(f10));
    }

    public void setEntryLabelTypeface(Typeface typeface) {
        ((bn.i) this.f34711q).f7178l.setTypeface(typeface);
    }

    public void setHoleColor(int i10) {
        ((bn.i) this.f34711q).f7174h.setColor(i10);
    }

    public void setHoleRadius(float f10) {
        this.n0 = f10;
    }

    public void setMaxAngle(float f10) {
        if (f10 > 360.0f) {
            f10 = 360.0f;
        }
        if (f10 < 90.0f) {
            f10 = 90.0f;
        }
        this.f11068r0 = f10;
    }

    public void setMinAngleForSlices(float f10) {
        float f11 = this.f11068r0;
        if (f10 > f11 / 2.0f) {
            f10 = f11 / 2.0f;
        } else if (f10 < g.f34069a) {
            f10 = 0.0f;
        }
        this.f11069s0 = f10;
    }

    public void setTransparentCircleAlpha(int i10) {
        ((bn.i) this.f34711q).f7175i.setAlpha(i10);
    }

    public void setTransparentCircleColor(int i10) {
        Paint paint = ((bn.i) this.f34711q).f7175i;
        int alpha = paint.getAlpha();
        paint.setColor(i10);
        paint.setAlpha(alpha);
    }

    public void setTransparentCircleRadius(float f10) {
        this.f11065o0 = f10;
    }

    public void setUsePercentValues(boolean z10) {
        this.f11061j0 = z10;
    }
}
