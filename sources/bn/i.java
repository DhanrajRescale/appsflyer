package bn;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.github.mikephil.charting.charts.PieChart;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import um.m;
import um.n;
import um.o;

/* loaded from: classes2.dex */
public final class i extends d {

    /* renamed from: g, reason: collision with root package name */
    public PieChart f7173g;

    /* renamed from: h, reason: collision with root package name */
    public Paint f7174h;

    /* renamed from: i, reason: collision with root package name */
    public Paint f7175i;

    /* renamed from: j, reason: collision with root package name */
    public Paint f7176j;

    /* renamed from: k, reason: collision with root package name */
    public TextPaint f7177k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f7178l;

    /* renamed from: m, reason: collision with root package name */
    public StaticLayout f7179m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f7180n;

    /* renamed from: o, reason: collision with root package name */
    public RectF f7181o;

    /* renamed from: p, reason: collision with root package name */
    public RectF[] f7182p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f7183q;

    /* renamed from: r, reason: collision with root package name */
    public Canvas f7184r;

    /* renamed from: s, reason: collision with root package name */
    public Path f7185s;

    /* renamed from: t, reason: collision with root package name */
    public RectF f7186t;

    /* renamed from: u, reason: collision with root package name */
    public Path f7187u;

    /* renamed from: v, reason: collision with root package name */
    public Path f7188v;

    /* renamed from: w, reason: collision with root package name */
    public RectF f7189w;

    public static float n(cn.d dVar, float f10, float f11, float f12, float f13, float f14, float f15) {
        double d10 = (f14 + f15) * 0.017453292f;
        float cos = (((float) Math.cos(d10)) * f10) + dVar.f8247b;
        float sin = (((float) Math.sin(d10)) * f10) + dVar.f8248c;
        double d11 = ((f15 / 2.0f) + f14) * 0.017453292f;
        float cos2 = (((float) Math.cos(d11)) * f10) + dVar.f8247b;
        float sin2 = (((float) Math.sin(d11)) * f10) + dVar.f8248c;
        return (float) ((f10 - ((float) (Math.tan(((180.0d - f11) / 2.0d) * 0.017453292519943295d) * (Math.sqrt(Math.pow(sin - f13, 2.0d) + Math.pow(cos - f12, 2.0d)) / 2.0d)))) - Math.sqrt(Math.pow(sin2 - ((sin + f13) / 2.0f), 2.0d) + Math.pow(cos2 - ((cos + f12) / 2.0f), 2.0d)));
    }

    @Override // bn.d
    public final void i(Canvas canvas) {
        Bitmap bitmap;
        PieChart pieChart;
        Iterator it;
        int i10;
        float f10;
        int i11;
        float f11;
        Iterator it2;
        PieChart pieChart2;
        float f12;
        float f13;
        boolean z10;
        float f14;
        n nVar;
        float f15;
        int i12;
        boolean z11;
        float[] fArr;
        int i13;
        int i14;
        RectF rectF;
        float f16;
        float f17;
        float f18;
        cn.d dVar;
        Paint paint;
        int i15;
        RectF rectF2;
        int i16;
        float f19;
        float f20;
        cn.d dVar2;
        int i17;
        RectF rectF3;
        int i18;
        float f21;
        float f22;
        i iVar = this;
        cn.i iVar2 = (cn.i) iVar.f3178b;
        int i19 = (int) iVar2.f8276c;
        int i20 = (int) iVar2.f8277d;
        WeakReference weakReference = iVar.f7183q;
        if (weakReference == null) {
            bitmap = null;
        } else {
            bitmap = (Bitmap) weakReference.get();
        }
        if (bitmap == null || bitmap.getWidth() != i19 || bitmap.getHeight() != i20) {
            if (i19 > 0 && i20 > 0) {
                bitmap = Bitmap.createBitmap(i19, i20, Bitmap.Config.ARGB_4444);
                iVar.f7183q = new WeakReference(bitmap);
                iVar.f7184r = new Canvas(bitmap);
            } else {
                return;
            }
        }
        int i21 = 0;
        bitmap.eraseColor(0);
        PieChart pieChart3 = iVar.f7173g;
        Iterator it3 = ((m) pieChart3.getData()).f37256i.iterator();
        while (it3.hasNext()) {
            n nVar2 = (n) it3.next();
            if (nVar2.f37271o && nVar2.f37272p.size() > 0) {
                float rotationAngle = pieChart3.getRotationAngle();
                iVar.f7148c.getClass();
                RectF circleBox = pieChart3.getCircleBox();
                int size = nVar2.f37272p.size();
                float[] drawAngles = pieChart3.getDrawAngles();
                cn.d centerCircleBox = pieChart3.getCenterCircleBox();
                float radius = pieChart3.getRadius();
                if (pieChart3.f11059h0 && !pieChart3.f11060i0) {
                    i10 = 1;
                } else {
                    i10 = i21;
                }
                if (i10 != 0) {
                    f10 = (pieChart3.getHoleRadius() / 100.0f) * radius;
                } else {
                    f10 = 0.0f;
                }
                float holeRadius = (radius - ((pieChart3.getHoleRadius() * radius) / 100.0f)) / 2.0f;
                RectF rectF4 = new RectF();
                if (i10 != 0 && pieChart3.f11062k0) {
                    i11 = 1;
                } else {
                    i11 = i21;
                }
                int i22 = i21;
                int i23 = i22;
                while (i22 < size) {
                    if (Math.abs(((o) nVar2.g(i22)).f37246a) > cn.h.f8267d) {
                        i23++;
                    }
                    i22++;
                }
                if (i23 <= 1) {
                    f11 = 0.0f;
                } else {
                    f11 = nVar2.f37283u;
                }
                float f23 = 0.0f;
                int i24 = 0;
                while (i24 < size) {
                    float f24 = drawAngles[i24];
                    if (Math.abs(nVar2.g(i24).a()) <= cn.h.f8267d) {
                        f12 = (f24 * 1.0f) + f23;
                        f13 = f11;
                        pieChart2 = pieChart3;
                        it2 = it3;
                    } else {
                        if (!pieChart3.k()) {
                            pieChart2 = pieChart3;
                            it2 = it3;
                        } else {
                            it2 = it3;
                            int i25 = 0;
                            while (true) {
                                wm.c[] cVarArr = pieChart3.f34720z;
                                pieChart2 = pieChart3;
                                if (i25 >= cVarArr.length) {
                                    break;
                                }
                                if (((int) cVarArr[i25].f39307a) == i24) {
                                    if (i11 == 0) {
                                        f12 = (f24 * 1.0f) + f23;
                                        f13 = f11;
                                    }
                                } else {
                                    i25++;
                                    pieChart3 = pieChart2;
                                }
                            }
                        }
                        if (f11 > s0.g.f34069a && f24 <= 180.0f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Paint paint2 = iVar.f7149d;
                        paint2.setColor(nVar2.e(i24));
                        if (i23 == 1) {
                            f14 = 0.0f;
                        } else {
                            f14 = f11 / (radius * 0.017453292f);
                        }
                        float f25 = (((f14 / 2.0f) + f23) * 1.0f) + rotationAngle;
                        float f26 = (f24 - f14) * 1.0f;
                        if (f26 < s0.g.f34069a) {
                            nVar = nVar2;
                            i12 = size;
                            f15 = 0.0f;
                        } else {
                            nVar = nVar2;
                            f15 = f26;
                            i12 = size;
                        }
                        Path path = iVar.f7185s;
                        path.reset();
                        if (i11 != 0) {
                            fArr = drawAngles;
                            float f27 = radius - holeRadius;
                            i13 = i24;
                            i14 = i23;
                            double d10 = f25 * 0.017453292f;
                            f13 = f11;
                            z11 = z10;
                            float cos = (((float) Math.cos(d10)) * f27) + centerCircleBox.f8247b;
                            float sin = (f27 * ((float) Math.sin(d10))) + centerCircleBox.f8248c;
                            rectF4.set(cos - holeRadius, sin - holeRadius, cos + holeRadius, sin + holeRadius);
                        } else {
                            f13 = f11;
                            z11 = z10;
                            fArr = drawAngles;
                            i13 = i24;
                            i14 = i23;
                        }
                        double d11 = f25 * 0.017453292f;
                        float f28 = f10;
                        float cos2 = (((float) Math.cos(d11)) * radius) + centerCircleBox.f8247b;
                        float sin2 = (((float) Math.sin(d11)) * radius) + centerCircleBox.f8248c;
                        if (f15 >= 360.0f && f15 % 360.0f <= cn.h.f8267d) {
                            path.addCircle(centerCircleBox.f8247b, centerCircleBox.f8248c, radius, Path.Direction.CW);
                        } else {
                            if (i11 != 0) {
                                path.arcTo(rectF4, f25 + 180.0f, -180.0f);
                            }
                            path.arcTo(circleBox, f25, f15);
                        }
                        RectF rectF5 = iVar.f7186t;
                        float f29 = centerCircleBox.f8247b;
                        rectF = circleBox;
                        float f30 = centerCircleBox.f8248c;
                        RectF rectF6 = rectF4;
                        rectF5.set(f29 - f28, f30 - f28, f29 + f28, f30 + f28);
                        if (i10 != 0) {
                            if (f28 <= s0.g.f34069a && !z11) {
                                f16 = f28;
                                f17 = rotationAngle;
                                f18 = radius;
                                dVar = centerCircleBox;
                                paint = paint2;
                                i15 = i14;
                                rectF2 = rectF6;
                                f19 = 360.0f;
                                i16 = i13;
                            } else {
                                if (z11) {
                                    i17 = i14;
                                    i16 = i13;
                                    rectF2 = rectF6;
                                    f16 = f28;
                                    rectF3 = rectF5;
                                    paint = paint2;
                                    i18 = 1;
                                    f18 = radius;
                                    dVar2 = centerCircleBox;
                                    float n10 = n(centerCircleBox, radius, f24 * 1.0f, cos2, sin2, f25, f15);
                                    if (n10 < s0.g.f34069a) {
                                        n10 = -n10;
                                    }
                                    f21 = Math.max(f16, n10);
                                } else {
                                    f16 = f28;
                                    f18 = radius;
                                    dVar2 = centerCircleBox;
                                    paint = paint2;
                                    i17 = i14;
                                    rectF2 = rectF6;
                                    i16 = i13;
                                    rectF3 = rectF5;
                                    i18 = 1;
                                    f21 = f16;
                                }
                                if (i17 != i18 && f21 != s0.g.f34069a) {
                                    f22 = f13 / (f21 * 0.017453292f);
                                } else {
                                    f22 = 0.0f;
                                }
                                float f31 = (((f22 / 2.0f) + f23) * 1.0f) + rotationAngle;
                                float f32 = (f24 - f22) * 1.0f;
                                if (f32 < s0.g.f34069a) {
                                    f32 = 0.0f;
                                }
                                float f33 = f31 + f32;
                                if (f15 >= 360.0f && f15 % 360.0f <= cn.h.f8267d) {
                                    path.addCircle(dVar2.f8247b, dVar2.f8248c, f21, Path.Direction.CCW);
                                    i15 = i17;
                                    f17 = rotationAngle;
                                } else {
                                    if (i11 != 0) {
                                        float f34 = f18 - holeRadius;
                                        double d12 = 0.017453292f * f33;
                                        i15 = i17;
                                        float cos3 = (((float) Math.cos(d12)) * f34) + dVar2.f8247b;
                                        float sin3 = (f34 * ((float) Math.sin(d12))) + dVar2.f8248c;
                                        rectF2.set(cos3 - holeRadius, sin3 - holeRadius, cos3 + holeRadius, sin3 + holeRadius);
                                        path.arcTo(rectF2, f33, 180.0f);
                                        f17 = rotationAngle;
                                    } else {
                                        i15 = i17;
                                        double d13 = 0.017453292f * f33;
                                        f17 = rotationAngle;
                                        path.lineTo((((float) Math.cos(d13)) * f21) + dVar2.f8247b, (f21 * ((float) Math.sin(d13))) + dVar2.f8248c);
                                    }
                                    path.arcTo(rectF3, f33, -f32);
                                }
                                dVar = dVar2;
                                path.close();
                                f20 = f16;
                                iVar = this;
                                iVar.f7184r.drawPath(path, paint);
                                f12 = (f24 * 1.0f) + f23;
                                f23 = f12;
                                i24 = i16 + 1;
                                centerCircleBox = dVar;
                                rotationAngle = f17;
                                rectF4 = rectF2;
                                f10 = f20;
                                size = i12;
                                it3 = it2;
                                pieChart3 = pieChart2;
                                nVar2 = nVar;
                                radius = f18;
                                f11 = f13;
                                circleBox = rectF;
                                i23 = i15;
                                drawAngles = fArr;
                            }
                        } else {
                            f16 = f28;
                            f17 = rotationAngle;
                            f18 = radius;
                            dVar = centerCircleBox;
                            paint = paint2;
                            i15 = i14;
                            rectF2 = rectF6;
                            i16 = i13;
                            f19 = 360.0f;
                        }
                        if (f15 % f19 > cn.h.f8267d) {
                            if (z11) {
                                float f35 = (f15 / 2.0f) + f25;
                                float n11 = n(dVar, f18, f24 * 1.0f, cos2, sin2, f25, f15);
                                double d14 = f35 * 0.017453292f;
                                path.lineTo((((float) Math.cos(d14)) * n11) + dVar.f8247b, (n11 * ((float) Math.sin(d14))) + dVar.f8248c);
                            } else {
                                path.lineTo(dVar.f8247b, dVar.f8248c);
                            }
                        }
                        path.close();
                        f20 = f16;
                        iVar = this;
                        iVar.f7184r.drawPath(path, paint);
                        f12 = (f24 * 1.0f) + f23;
                        f23 = f12;
                        i24 = i16 + 1;
                        centerCircleBox = dVar;
                        rotationAngle = f17;
                        rectF4 = rectF2;
                        f10 = f20;
                        size = i12;
                        it3 = it2;
                        pieChart3 = pieChart2;
                        nVar2 = nVar;
                        radius = f18;
                        f11 = f13;
                        circleBox = rectF;
                        i23 = i15;
                        drawAngles = fArr;
                    }
                    nVar = nVar2;
                    f17 = rotationAngle;
                    rectF = circleBox;
                    i12 = size;
                    fArr = drawAngles;
                    i16 = i24;
                    i15 = i23;
                    rectF2 = rectF4;
                    f20 = f10;
                    f18 = radius;
                    dVar = centerCircleBox;
                    f23 = f12;
                    i24 = i16 + 1;
                    centerCircleBox = dVar;
                    rotationAngle = f17;
                    rectF4 = rectF2;
                    f10 = f20;
                    size = i12;
                    it3 = it2;
                    pieChart3 = pieChart2;
                    nVar2 = nVar;
                    radius = f18;
                    f11 = f13;
                    circleBox = rectF;
                    i23 = i15;
                    drawAngles = fArr;
                }
                pieChart = pieChart3;
                it = it3;
                cn.d.c(centerCircleBox);
            } else {
                pieChart = pieChart3;
                it = it3;
            }
            it3 = it;
            pieChart3 = pieChart;
            i21 = 0;
        }
    }

    @Override // bn.d
    public final void j(Canvas canvas) {
        float radius;
        RectF rectF;
        PieChart pieChart = this.f7173g;
        if (pieChart.f11059h0 && this.f7184r != null) {
            float radius2 = pieChart.getRadius();
            float holeRadius = (pieChart.getHoleRadius() / 100.0f) * radius2;
            cn.d centerCircleBox = pieChart.getCenterCircleBox();
            Paint paint = this.f7174h;
            if (Color.alpha(paint.getColor()) > 0) {
                this.f7184r.drawCircle(centerCircleBox.f8247b, centerCircleBox.f8248c, holeRadius, paint);
            }
            Paint paint2 = this.f7175i;
            if (Color.alpha(paint2.getColor()) > 0 && pieChart.getTransparentCircleRadius() > pieChart.getHoleRadius()) {
                int alpha = paint2.getAlpha();
                float transparentCircleRadius = (pieChart.getTransparentCircleRadius() / 100.0f) * radius2;
                this.f7148c.getClass();
                paint2.setAlpha((int) (alpha * 1.0f * 1.0f));
                Path path = this.f7187u;
                path.reset();
                path.addCircle(centerCircleBox.f8247b, centerCircleBox.f8248c, transparentCircleRadius, Path.Direction.CW);
                path.addCircle(centerCircleBox.f8247b, centerCircleBox.f8248c, holeRadius, Path.Direction.CCW);
                this.f7184r.drawPath(path, paint2);
                paint2.setAlpha(alpha);
            }
            cn.d.c(centerCircleBox);
        }
        canvas.drawBitmap((Bitmap) this.f7183q.get(), s0.g.f34069a, s0.g.f34069a, (Paint) null);
        CharSequence centerText = pieChart.getCenterText();
        if (pieChart.f11066p0 && centerText != null) {
            cn.d centerCircleBox2 = pieChart.getCenterCircleBox();
            cn.d centerTextOffset = pieChart.getCenterTextOffset();
            float f10 = centerCircleBox2.f8247b + centerTextOffset.f8247b;
            float f11 = centerCircleBox2.f8248c + centerTextOffset.f8248c;
            if (pieChart.f11059h0 && !pieChart.f11060i0) {
                radius = (pieChart.getHoleRadius() / 100.0f) * pieChart.getRadius();
            } else {
                radius = pieChart.getRadius();
            }
            RectF[] rectFArr = this.f7182p;
            RectF rectF2 = rectFArr[0];
            rectF2.left = f10 - radius;
            rectF2.top = f11 - radius;
            rectF2.right = f10 + radius;
            rectF2.bottom = f11 + radius;
            RectF rectF3 = rectFArr[1];
            rectF3.set(rectF2);
            float centerTextRadiusPercent = pieChart.getCenterTextRadiusPercent() / 100.0f;
            if (centerTextRadiusPercent > 0.0d) {
                rectF3.inset((rectF3.width() - (rectF3.width() * centerTextRadiusPercent)) / 2.0f, (rectF3.height() - (rectF3.height() * centerTextRadiusPercent)) / 2.0f);
            }
            boolean equals = centerText.equals(this.f7180n);
            RectF rectF4 = this.f7181o;
            if (equals && rectF3.equals(rectF4)) {
                rectF = rectF2;
            } else {
                rectF4.set(rectF3);
                this.f7180n = centerText;
                rectF = rectF2;
                this.f7179m = new StaticLayout(centerText, 0, centerText.length(), this.f7177k, (int) Math.max(Math.ceil(rectF4.width()), 1.0d), Layout.Alignment.ALIGN_CENTER, 1.0f, s0.g.f34069a, false);
            }
            float height = this.f7179m.getHeight();
            canvas.save();
            Path path2 = this.f7188v;
            path2.reset();
            path2.addOval(rectF, Path.Direction.CW);
            canvas.clipPath(path2);
            canvas.translate(rectF3.left, ((rectF3.height() - height) / 2.0f) + rectF3.top);
            this.f7179m.draw(canvas);
            canvas.restore();
            cn.d.c(centerCircleBox2);
            cn.d.c(centerTextOffset);
        }
    }

    @Override // bn.d
    public final void k(Canvas canvas, wm.c[] cVarArr) {
        boolean z10;
        float f10;
        n nVar;
        float f11;
        int i10;
        float f12;
        boolean z11;
        float f13;
        float f14;
        PieChart pieChart;
        float[] fArr;
        float[] fArr2;
        Paint paint;
        int i11;
        boolean z12;
        int i12;
        float f15;
        cn.d dVar;
        int i13;
        Paint paint2;
        RectF rectF;
        float f16;
        float f17;
        int i14;
        float f18;
        float f19;
        wm.c[] cVarArr2 = cVarArr;
        PieChart pieChart2 = this.f7173g;
        if (pieChart2.f11059h0 && !pieChart2.f11060i0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && pieChart2.f11062k0) {
            return;
        }
        this.f7148c.getClass();
        float rotationAngle = pieChart2.getRotationAngle();
        float[] drawAngles = pieChart2.getDrawAngles();
        float[] absoluteAngles = pieChart2.getAbsoluteAngles();
        cn.d centerCircleBox = pieChart2.getCenterCircleBox();
        float radius = pieChart2.getRadius();
        if (z10) {
            f10 = (pieChart2.getHoleRadius() / 100.0f) * radius;
        } else {
            f10 = 0.0f;
        }
        RectF rectF2 = this.f7189w;
        rectF2.set(s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a);
        int i15 = 0;
        while (i15 < cVarArr2.length) {
            int i16 = (int) cVarArr2[i15].f39307a;
            if (i16 < drawAngles.length) {
                m mVar = (m) pieChart2.getData();
                if (cVarArr2[i15].f39311e == 0) {
                    nVar = mVar.i();
                } else {
                    mVar.getClass();
                    nVar = null;
                }
                if (nVar != null && nVar.f37261e) {
                    int size = nVar.f37272p.size();
                    int i17 = 0;
                    for (int i18 = 0; i18 < size; i18++) {
                        if (Math.abs(((o) nVar.g(i18)).f37246a) > cn.h.f8267d) {
                            i17++;
                        }
                    }
                    if (i16 == 0) {
                        i10 = 1;
                        f11 = s0.g.f34069a;
                    } else {
                        f11 = absoluteAngles[i16 - 1] * 1.0f;
                        i10 = 1;
                    }
                    if (i17 <= i10) {
                        f12 = s0.g.f34069a;
                    } else {
                        f12 = nVar.f37283u;
                    }
                    float f20 = drawAngles[i16];
                    float f21 = nVar.f37284v;
                    float f22 = radius + f21;
                    rectF2.set(pieChart2.getCircleBox());
                    float f23 = -f21;
                    rectF2.inset(f23, f23);
                    if (f12 > s0.g.f34069a && f20 <= 180.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Paint paint3 = this.f7149d;
                    paint3.setColor(nVar.e(i16));
                    if (i17 == 1) {
                        f13 = s0.g.f34069a;
                    } else {
                        f13 = f12 / (radius * 0.017453292f);
                    }
                    if (i17 == 1) {
                        f14 = s0.g.f34069a;
                    } else {
                        f14 = f12 / (f22 * 0.017453292f);
                    }
                    float f24 = (((f13 / 2.0f) + f11) * 1.0f) + rotationAngle;
                    float f25 = (f20 - f13) * 1.0f;
                    if (f25 < s0.g.f34069a) {
                        f25 = 0.0f;
                    }
                    float f26 = (((f14 / 2.0f) + f11) * 1.0f) + rotationAngle;
                    float f27 = (f20 - f14) * 1.0f;
                    if (f27 < s0.g.f34069a) {
                        pieChart = pieChart2;
                        f27 = 0.0f;
                    } else {
                        pieChart = pieChart2;
                    }
                    Path path = this.f7185s;
                    path.reset();
                    if (f25 >= 360.0f && f25 % 360.0f <= cn.h.f8267d) {
                        fArr = drawAngles;
                        path.addCircle(centerCircleBox.f8247b, centerCircleBox.f8248c, f22, Path.Direction.CW);
                        i12 = i17;
                        fArr2 = absoluteAngles;
                        paint = paint3;
                        i11 = i15;
                        z12 = z10;
                    } else {
                        fArr = drawAngles;
                        fArr2 = absoluteAngles;
                        paint = paint3;
                        i11 = i15;
                        double d10 = f26 * 0.017453292f;
                        z12 = z10;
                        i12 = i17;
                        path.moveTo((((float) Math.cos(d10)) * f22) + centerCircleBox.f8247b, (f22 * ((float) Math.sin(d10))) + centerCircleBox.f8248c);
                        path.arcTo(rectF2, f26, f27);
                    }
                    if (z11) {
                        double d11 = f24 * 0.017453292f;
                        float cos = centerCircleBox.f8247b + (((float) Math.cos(d11)) * radius);
                        float sin = (((float) Math.sin(d11)) * radius) + centerCircleBox.f8248c;
                        paint2 = paint;
                        i13 = i11;
                        rectF = rectF2;
                        f15 = f10;
                        dVar = centerCircleBox;
                        f16 = n(centerCircleBox, radius, f20 * 1.0f, cos, sin, f24, f25);
                    } else {
                        f15 = f10;
                        dVar = centerCircleBox;
                        i13 = i11;
                        paint2 = paint;
                        rectF = rectF2;
                        f16 = s0.g.f34069a;
                    }
                    RectF rectF3 = this.f7186t;
                    float f28 = dVar.f8247b;
                    float f29 = dVar.f8248c;
                    rectF3.set(f28 - f15, f29 - f15, f28 + f15, f29 + f15);
                    if (!z12 || (f15 <= s0.g.f34069a && !z11)) {
                        f17 = rotationAngle;
                        i14 = i13;
                        if (f25 % 360.0f > cn.h.f8267d) {
                            if (z11) {
                                double d12 = 0.017453292f * ((f25 / 2.0f) + f24);
                                path.lineTo((((float) Math.cos(d12)) * f16) + dVar.f8247b, (f16 * ((float) Math.sin(d12))) + dVar.f8248c);
                            } else {
                                path.lineTo(dVar.f8247b, dVar.f8248c);
                            }
                        }
                    } else {
                        if (z11) {
                            if (f16 < s0.g.f34069a) {
                                f16 = -f16;
                            }
                            f18 = Math.max(f15, f16);
                        } else {
                            f18 = f15;
                        }
                        if (i12 != 1 && f18 != s0.g.f34069a) {
                            f19 = f12 / (f18 * 0.017453292f);
                        } else {
                            f19 = s0.g.f34069a;
                        }
                        float f30 = (((f19 / 2.0f) + f11) * 1.0f) + rotationAngle;
                        float f31 = (f20 - f19) * 1.0f;
                        if (f31 < s0.g.f34069a) {
                            f31 = 0.0f;
                        }
                        float f32 = f30 + f31;
                        if (f25 >= 360.0f && f25 % 360.0f <= cn.h.f8267d) {
                            path.addCircle(dVar.f8247b, dVar.f8248c, f18, Path.Direction.CCW);
                            f17 = rotationAngle;
                            i14 = i13;
                        } else {
                            double d13 = 0.017453292f * f32;
                            f17 = rotationAngle;
                            i14 = i13;
                            path.lineTo((((float) Math.cos(d13)) * f18) + dVar.f8247b, (f18 * ((float) Math.sin(d13))) + dVar.f8248c);
                            path.arcTo(rectF3, f32, -f31);
                        }
                    }
                    path.close();
                    this.f7184r.drawPath(path, paint2);
                    i15 = i14 + 1;
                    cVarArr2 = cVarArr;
                    f10 = f15;
                    z10 = z12;
                    rotationAngle = f17;
                    pieChart2 = pieChart;
                    drawAngles = fArr;
                    absoluteAngles = fArr2;
                    rectF2 = rectF;
                    centerCircleBox = dVar;
                }
            }
            pieChart = pieChart2;
            fArr = drawAngles;
            fArr2 = absoluteAngles;
            i14 = i15;
            rectF = rectF2;
            dVar = centerCircleBox;
            z12 = z10;
            f17 = rotationAngle;
            f15 = f10;
            i15 = i14 + 1;
            cVarArr2 = cVarArr;
            f10 = f15;
            z10 = z12;
            rotationAngle = f17;
            pieChart2 = pieChart;
            drawAngles = fArr;
            absoluteAngles = fArr2;
            rectF2 = rectF;
            centerCircleBox = dVar;
        }
        cn.d.c(centerCircleBox);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02dd  */
    @Override // bn.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(android.graphics.Canvas r53) {
        /*
            Method dump skipped, instructions count: 968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bn.i.l(android.graphics.Canvas):void");
    }

    @Override // bn.d
    public final void m() {
    }
}
