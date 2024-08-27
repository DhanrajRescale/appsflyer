package sm;

import an.g;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import cn.d;
import cn.h;
import com.github.mikephil.charting.charts.PieChart;
import java.util.ArrayList;
import java.util.List;
import um.m;
import um.n;
import um.o;

/* loaded from: classes2.dex */
public abstract class c extends b {
    public float F;
    public float G;
    public boolean H;
    public float I;

    @Override // android.view.View
    public final void computeScroll() {
        an.b bVar = this.f34708n;
        if (bVar instanceof g) {
            g gVar = (g) bVar;
            if (gVar.f793i != s0.g.f34069a) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float f10 = gVar.f793i;
                b bVar2 = gVar.f786d;
                c cVar = (c) bVar2;
                gVar.f793i = cVar.getDragDecelerationFrictionCoef() * f10;
                cVar.setRotationAngle((gVar.f793i * (((float) (currentAnimationTimeMillis - gVar.f792h)) / 1000.0f)) + cVar.getRotationAngle());
                gVar.f792h = currentAnimationTimeMillis;
                if (Math.abs(gVar.f793i) >= 0.001d) {
                    DisplayMetrics displayMetrics = h.f8264a;
                    bVar2.postInvalidateOnAnimation();
                } else {
                    gVar.f793i = s0.g.f34069a;
                }
            }
        }
    }

    public float getDiameter() {
        RectF rectF = this.f34713s.f8275b;
        rectF.left = getExtraLeftOffset() + rectF.left;
        rectF.top = getExtraTopOffset() + rectF.top;
        rectF.right -= getExtraRightOffset();
        rectF.bottom -= getExtraBottomOffset();
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // sm.b, xm.c
    public int getMaxVisibleCount() {
        return this.f34696b.d();
    }

    public float getMinOffset() {
        return this.I;
    }

    public abstract float getRadius();

    public float getRawRotationAngle() {
        return this.G;
    }

    public abstract float getRequiredBaseOffset();

    public abstract float getRequiredLegendOffset();

    public float getRotationAngle() {
        return this.F;
    }

    @Override // sm.b, xm.c
    public float getYChartMax() {
        return s0.g.f34069a;
    }

    @Override // sm.b, xm.c
    public float getYChartMin() {
        return s0.g.f34069a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [an.g, an.b] */
    @Override // sm.b
    public void h() {
        super.h();
        ?? bVar = new an.b(this);
        bVar.f789e = d.b(s0.g.f34069a, s0.g.f34069a);
        bVar.f790f = s0.g.f34069a;
        bVar.f791g = new ArrayList();
        bVar.f792h = 0L;
        bVar.f793i = s0.g.f34069a;
        this.f34708n = bVar;
    }

    @Override // sm.b
    public final void i() {
        boolean z10;
        float f10;
        if (this.f34696b == null) {
            return;
        }
        PieChart pieChart = (PieChart) this;
        int d10 = ((m) pieChart.f34696b).d();
        if (pieChart.f11057f0.length != d10) {
            pieChart.f11057f0 = new float[d10];
        } else {
            for (int i10 = 0; i10 < d10; i10++) {
                pieChart.f11057f0[i10] = 0.0f;
            }
        }
        if (pieChart.f11058g0.length != d10) {
            pieChart.f11058g0 = new float[d10];
        } else {
            for (int i11 = 0; i11 < d10; i11++) {
                pieChart.f11058g0[i11] = 0.0f;
            }
        }
        float j10 = ((m) pieChart.f34696b).j();
        List list = ((m) pieChart.f34696b).f37256i;
        float f11 = pieChart.f11069s0;
        if (f11 != s0.g.f34069a && d10 * f11 <= pieChart.f11068r0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float[] fArr = new float[d10];
        float f12 = 0.0f;
        float f13 = 0.0f;
        int i12 = 0;
        for (int i13 = 0; i13 < ((m) pieChart.f34696b).c(); i13++) {
            n nVar = (n) list.get(i13);
            int i14 = 0;
            while (i14 < nVar.f37272p.size()) {
                float abs = (Math.abs(((o) nVar.g(i14)).f37246a) / j10) * pieChart.f11068r0;
                if (z10) {
                    float f14 = pieChart.f11069s0;
                    f10 = j10;
                    float f15 = abs - f14;
                    if (f15 <= s0.g.f34069a) {
                        fArr[i12] = f14;
                        f12 += -f15;
                    } else {
                        fArr[i12] = abs;
                        f13 += f15;
                    }
                } else {
                    f10 = j10;
                }
                pieChart.f11057f0[i12] = abs;
                if (i12 == 0) {
                    pieChart.f11058g0[i12] = abs;
                } else {
                    float[] fArr2 = pieChart.f11058g0;
                    fArr2[i12] = fArr2[i12 - 1] + abs;
                }
                i12++;
                i14++;
                j10 = f10;
            }
        }
        if (z10) {
            for (int i15 = 0; i15 < d10; i15++) {
                float f16 = fArr[i15];
                float f17 = f16 - (((f16 - pieChart.f11069s0) / f13) * f12);
                fArr[i15] = f17;
                if (i15 == 0) {
                    pieChart.f11058g0[0] = fArr[0];
                } else {
                    float[] fArr3 = pieChart.f11058g0;
                    fArr3[i15] = fArr3[i15 - 1] + f17;
                }
            }
            pieChart.f11057f0 = fArr;
        }
        if (this.f34706l != null) {
            this.f34710p.h(this.f34696b);
        }
        b();
    }

    public final float l(float f10, float f11) {
        float f12;
        float f13;
        d centerOffsets = getCenterOffsets();
        float f14 = centerOffsets.f8247b;
        if (f10 > f14) {
            f12 = f10 - f14;
        } else {
            f12 = f14 - f10;
        }
        float f15 = centerOffsets.f8248c;
        if (f11 > f15) {
            f13 = f11 - f15;
        } else {
            f13 = f15 - f11;
        }
        float sqrt = (float) Math.sqrt(Math.pow(f13, 2.0d) + Math.pow(f12, 2.0d));
        d.c(centerOffsets);
        return sqrt;
    }

    public final float m(float f10, float f11) {
        d centerOffsets = getCenterOffsets();
        double d10 = f10 - centerOffsets.f8247b;
        double d11 = f11 - centerOffsets.f8248c;
        float degrees = (float) Math.toDegrees(Math.acos(d11 / Math.sqrt((d11 * d11) + (d10 * d10))));
        if (f10 > centerOffsets.f8247b) {
            degrees = 360.0f - degrees;
        }
        float f12 = degrees + 90.0f;
        if (f12 > 360.0f) {
            f12 -= 360.0f;
        }
        d.c(centerOffsets);
        return f12;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        an.b bVar;
        if (this.f34704j && (bVar = this.f34708n) != null) {
            return bVar.onTouch(this, motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setMinOffset(float f10) {
        this.I = f10;
    }

    public void setRotationAngle(float f10) {
        this.G = f10;
        DisplayMetrics displayMetrics = h.f8264a;
        while (f10 < s0.g.f34069a) {
            f10 += 360.0f;
        }
        this.F = f10 % 360.0f;
    }

    public void setRotationEnabled(boolean z10) {
        this.H = z10;
    }
}
