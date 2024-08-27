package bn;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import java.util.ArrayList;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class j extends a {

    /* renamed from: i, reason: collision with root package name */
    public tm.i f7190i;

    /* renamed from: j, reason: collision with root package name */
    public Path f7191j;

    /* renamed from: k, reason: collision with root package name */
    public float[] f7192k;

    /* renamed from: l, reason: collision with root package name */
    public RectF f7193l;

    /* renamed from: m, reason: collision with root package name */
    public float[] f7194m;

    /* renamed from: n, reason: collision with root package name */
    public RectF f7195n;

    /* renamed from: o, reason: collision with root package name */
    public float[] f7196o;

    /* renamed from: p, reason: collision with root package name */
    public Path f7197p;

    @Override // bn.a
    public final void h(float f10, float f11) {
        if (((cn.i) this.f3178b).f8275b.width() > 10.0f) {
            Object obj = this.f3178b;
            cn.i iVar = (cn.i) obj;
            float f12 = iVar.f8282i;
            float f13 = iVar.f8280g;
            if (f12 > f13 || f13 > 1.0f) {
                RectF rectF = ((cn.i) obj).f8275b;
                float f14 = rectF.left;
                float f15 = rectF.top;
                cn.g gVar = this.f7136d;
                gVar.getClass();
                cn.c cVar = (cn.c) cn.c.f8243d.b();
                cVar.f8244b = 0.0d;
                cVar.f8245c = 0.0d;
                gVar.b(f14, f15, cVar);
                RectF rectF2 = ((cn.i) this.f3178b).f8275b;
                float f16 = rectF2.right;
                float f17 = rectF2.top;
                cn.c cVar2 = (cn.c) cn.c.f8243d.b();
                cVar2.f8244b = 0.0d;
                cVar2.f8245c = 0.0d;
                gVar.b(f16, f17, cVar2);
                f10 = (float) cVar.f8244b;
                f11 = (float) cVar2.f8244b;
                cn.c.b(cVar);
                cn.c.b(cVar2);
            }
        }
        i(f10, f11);
    }

    @Override // bn.a
    public final void i(float f10, float f11) {
        super.i(f10, f11);
        tm.i iVar = this.f7190i;
        String c10 = iVar.c();
        Paint paint = this.f7138f;
        paint.setTypeface(null);
        paint.setTextSize(iVar.f36183d);
        cn.b b10 = cn.h.b(paint, c10);
        float f12 = b10.f8241b;
        float a10 = cn.h.a(paint, "Q");
        double d10 = s0.g.f34069a;
        cn.b b11 = cn.b.b(Math.abs(((float) Math.sin(d10)) * a10) + Math.abs(((float) Math.cos(d10)) * f12), Math.abs(((float) Math.cos(d10)) * a10) + Math.abs(((float) Math.sin(d10)) * f12));
        Math.round(f12);
        Math.round(a10);
        Math.round(b11.f8241b);
        iVar.G = Math.round(b11.f8242c);
        cn.b.f8240d.c(b11);
        cn.b.f8240d.c(b10);
    }

    public final void j(Canvas canvas, float f10, cn.d dVar) {
        tm.i iVar = this.f7190i;
        iVar.getClass();
        boolean e10 = iVar.e();
        int i10 = iVar.f36166m * 2;
        float[] fArr = new float[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12 += 2) {
            if (e10) {
                fArr[i12] = iVar.f36165l[i12 / 2];
            } else {
                fArr[i12] = iVar.f36164k[i12 / 2];
            }
        }
        this.f7136d.e(fArr);
        int i13 = 0;
        while (i13 < i10) {
            float f11 = fArr[i13];
            cn.i iVar2 = (cn.i) this.f3178b;
            if (iVar2.b(f11) && iVar2.c(f11)) {
                int i14 = i13 / 2;
                String a10 = iVar.d().a(iVar.f36164k[i14]);
                boolean z10 = iVar.H;
                Paint paint = this.f7138f;
                if (z10) {
                    int i15 = iVar.f36166m;
                    if (i14 == i15 - 1 && i15 > 1) {
                        DisplayMetrics displayMetrics = cn.h.f8264a;
                        float measureText = (int) paint.measureText(a10);
                        Object obj = this.f3178b;
                        cn.i iVar3 = (cn.i) obj;
                        if (measureText > (iVar3.f8276c - iVar3.f8275b.right) * 2.0f && f11 + measureText > ((cn.i) obj).f8276c) {
                            f11 -= measureText / 2.0f;
                        }
                    } else if (i13 == 0) {
                        DisplayMetrics displayMetrics2 = cn.h.f8264a;
                        f11 += ((int) paint.measureText(a10)) / 2.0f;
                    }
                }
                Paint.FontMetrics fontMetrics = cn.h.f8273j;
                float fontMetrics2 = paint.getFontMetrics(fontMetrics);
                paint.getTextBounds(a10, i11, a10.length(), cn.h.f8272i);
                float f12 = s0.g.f34069a - r13.left;
                float f13 = (-fontMetrics.ascent) + s0.g.f34069a;
                Paint.Align textAlign = paint.getTextAlign();
                paint.setTextAlign(Paint.Align.LEFT);
                if (dVar.f8247b != s0.g.f34069a || dVar.f8248c != s0.g.f34069a) {
                    f12 -= r13.width() * dVar.f8247b;
                    f13 -= fontMetrics2 * dVar.f8248c;
                }
                canvas.drawText(a10, f12 + f11, f13 + f10, paint);
                paint.setTextAlign(textAlign);
            }
            i13 += 2;
            i11 = 0;
        }
    }

    public final void k(Canvas canvas) {
        tm.i iVar = this.f7190i;
        if (iVar.f36172s && iVar.f36180a) {
            int save = canvas.save();
            RectF rectF = this.f7193l;
            rectF.set(((cn.i) this.f3178b).f8275b);
            tm.a aVar = this.f7135c;
            rectF.inset(-aVar.f36161h, s0.g.f34069a);
            canvas.clipRect(rectF);
            if (this.f7192k.length != aVar.f36166m * 2) {
                this.f7192k = new float[iVar.f36166m * 2];
            }
            float[] fArr = this.f7192k;
            for (int i10 = 0; i10 < fArr.length; i10 += 2) {
                float[] fArr2 = iVar.f36164k;
                int i11 = i10 / 2;
                fArr[i10] = fArr2[i11];
                fArr[i10 + 1] = fArr2[i11];
            }
            this.f7136d.e(fArr);
            Paint paint = this.f7137e;
            paint.setColor(iVar.f36160g);
            paint.setStrokeWidth(iVar.f36161h);
            paint.setPathEffect(null);
            Path path = this.f7191j;
            path.reset();
            for (int i12 = 0; i12 < fArr.length; i12 += 2) {
                float f10 = fArr[i12];
                float f11 = fArr[i12 + 1];
                path.moveTo(f10, ((cn.i) this.f3178b).f8275b.bottom);
                path.lineTo(f10, ((cn.i) this.f3178b).f8275b.top);
                canvas.drawPath(path, paint);
                path.reset();
            }
            canvas.restoreToCount(save);
        }
    }

    public final void l(Canvas canvas) {
        ArrayList arrayList = this.f7190i.f36176w;
        if (arrayList != null && arrayList.size() > 0) {
            float[] fArr = this.f7194m;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                tm.g gVar = (tm.g) arrayList.get(i10);
                if (gVar.f36180a) {
                    int save = canvas.save();
                    RectF rectF = this.f7195n;
                    rectF.set(((cn.i) this.f3178b).f8275b);
                    rectF.inset(-gVar.f36215g, s0.g.f34069a);
                    canvas.clipRect(rectF);
                    fArr[0] = gVar.f36214f;
                    fArr[1] = 0.0f;
                    this.f7136d.e(fArr);
                    float f10 = fArr[0];
                    float[] fArr2 = this.f7196o;
                    fArr2[0] = f10;
                    RectF rectF2 = ((cn.i) this.f3178b).f8275b;
                    fArr2[1] = rectF2.top;
                    fArr2[2] = fArr[0];
                    fArr2[3] = rectF2.bottom;
                    Path path = this.f7197p;
                    path.reset();
                    path.moveTo(fArr2[0], fArr2[1]);
                    path.lineTo(fArr2[2], fArr2[3]);
                    Paint paint = this.f7140h;
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setColor(gVar.f36216h);
                    paint.setStrokeWidth(gVar.f36215g);
                    paint.setPathEffect(gVar.f36219k);
                    canvas.drawPath(path, paint);
                    float f11 = gVar.f36182c + 2.0f;
                    String str = gVar.f36218j;
                    if (str != null && !str.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
                        paint.setStyle(gVar.f36217i);
                        paint.setPathEffect(null);
                        paint.setColor(gVar.f36184e);
                        paint.setStrokeWidth(0.5f);
                        paint.setTextSize(gVar.f36183d);
                        float f12 = gVar.f36215g + gVar.f36181b;
                        int i11 = gVar.f36220l;
                        if (i11 == 3) {
                            float a10 = cn.h.a(paint, str);
                            paint.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(str, fArr[0] + f12, ((cn.i) this.f3178b).f8275b.top + f11 + a10, paint);
                        } else if (i11 == 4) {
                            paint.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(str, fArr[0] + f12, ((cn.i) this.f3178b).f8275b.bottom - f11, paint);
                        } else if (i11 == 1) {
                            paint.setTextAlign(Paint.Align.RIGHT);
                            canvas.drawText(str, fArr[0] - f12, ((cn.i) this.f3178b).f8275b.top + f11 + cn.h.a(paint, str), paint);
                        } else {
                            paint.setTextAlign(Paint.Align.RIGHT);
                            canvas.drawText(str, fArr[0] - f12, ((cn.i) this.f3178b).f8275b.bottom - f11, paint);
                        }
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
    }
}
