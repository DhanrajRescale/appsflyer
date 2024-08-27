package bn;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class k extends a {

    /* renamed from: i, reason: collision with root package name */
    public final tm.j f7198i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f7199j;

    /* renamed from: k, reason: collision with root package name */
    public final Path f7200k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f7201l;

    /* renamed from: m, reason: collision with root package name */
    public float[] f7202m;

    /* renamed from: n, reason: collision with root package name */
    public final Path f7203n;

    /* renamed from: o, reason: collision with root package name */
    public final RectF f7204o;

    /* renamed from: p, reason: collision with root package name */
    public final Path f7205p;

    /* renamed from: q, reason: collision with root package name */
    public final float[] f7206q;

    /* renamed from: r, reason: collision with root package name */
    public final RectF f7207r;

    public k(cn.i iVar, tm.j jVar, cn.g gVar) {
        super(iVar, gVar, jVar);
        this.f7200k = new Path();
        this.f7201l = new RectF();
        this.f7202m = new float[2];
        this.f7203n = new Path();
        this.f7204o = new RectF();
        this.f7205p = new Path();
        this.f7206q = new float[2];
        this.f7207r = new RectF();
        this.f7198i = jVar;
        if (((cn.i) this.f3178b) != null) {
            this.f7138f.setColor(-16777216);
            this.f7138f.setTextSize(cn.h.c(10.0f));
            Paint paint = new Paint(1);
            this.f7199j = paint;
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            paint.setStyle(Paint.Style.STROKE);
        }
    }

    public final float[] j() {
        int length = this.f7202m.length;
        tm.j jVar = this.f7198i;
        int i10 = jVar.f36166m;
        if (length != i10 * 2) {
            this.f7202m = new float[i10 * 2];
        }
        float[] fArr = this.f7202m;
        for (int i11 = 0; i11 < fArr.length; i11 += 2) {
            fArr[i11 + 1] = jVar.f36164k[i11 / 2];
        }
        this.f7136d.e(fArr);
        return fArr;
    }

    public final void k(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        int i10;
        String str;
        tm.j jVar = this.f7198i;
        if (jVar.f36180a && jVar.f36174u) {
            float[] j10 = j();
            Paint paint = this.f7138f;
            paint.setTypeface(null);
            paint.setTextSize(jVar.f36183d);
            paint.setColor(jVar.f36184e);
            float f13 = jVar.f36181b;
            float a10 = (cn.h.a(paint, "A") / 2.5f) + jVar.f36182c;
            int i11 = jVar.O;
            int i12 = jVar.N;
            if (i11 == 1) {
                if (i12 == 1) {
                    paint.setTextAlign(Paint.Align.RIGHT);
                    f10 = ((cn.i) this.f3178b).f8275b.left;
                    f12 = f10 - f13;
                } else {
                    paint.setTextAlign(Paint.Align.LEFT);
                    f11 = ((cn.i) this.f3178b).f8275b.left;
                    f12 = f11 + f13;
                }
            } else if (i12 == 1) {
                paint.setTextAlign(Paint.Align.LEFT);
                f11 = ((cn.i) this.f3178b).f8275b.right;
                f12 = f11 + f13;
            } else {
                paint.setTextAlign(Paint.Align.RIGHT);
                f10 = ((cn.i) this.f3178b).f8275b.right;
                f12 = f10 - f13;
            }
            if (jVar.H) {
                i10 = jVar.f36166m;
            } else {
                i10 = jVar.f36166m - 1;
            }
            for (int i13 = !jVar.G ? 1 : 0; i13 < i10; i13++) {
                if (i13 >= 0 && i13 < jVar.f36164k.length) {
                    str = jVar.d().a(jVar.f36164k[i13]);
                } else {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                canvas.drawText(str, f12, j10[(i13 * 2) + 1] + a10, paint);
            }
        }
    }

    public final void l(Canvas canvas) {
        tm.j jVar = this.f7198i;
        if (jVar.f36180a && jVar.f36173t) {
            Paint paint = this.f7139g;
            paint.setColor(jVar.f36162i);
            paint.setStrokeWidth(jVar.f36163j);
            if (jVar.O == 1) {
                RectF rectF = ((cn.i) this.f3178b).f8275b;
                float f10 = rectF.left;
                canvas.drawLine(f10, rectF.top, f10, rectF.bottom, paint);
            } else {
                RectF rectF2 = ((cn.i) this.f3178b).f8275b;
                float f11 = rectF2.right;
                canvas.drawLine(f11, rectF2.top, f11, rectF2.bottom, paint);
            }
        }
    }

    public final void m(Canvas canvas) {
        tm.j jVar = this.f7198i;
        if (!jVar.f36180a) {
            return;
        }
        if (jVar.f36172s) {
            int save = canvas.save();
            RectF rectF = this.f7201l;
            rectF.set(((cn.i) this.f3178b).f8275b);
            rectF.inset(s0.g.f34069a, -this.f7135c.f36161h);
            canvas.clipRect(rectF);
            float[] j10 = j();
            Paint paint = this.f7137e;
            paint.setColor(jVar.f36160g);
            paint.setStrokeWidth(jVar.f36161h);
            paint.setPathEffect(null);
            Path path = this.f7200k;
            path.reset();
            for (int i10 = 0; i10 < j10.length; i10 += 2) {
                int i11 = i10 + 1;
                path.moveTo(((cn.i) this.f3178b).f8275b.left, j10[i11]);
                path.lineTo(((cn.i) this.f3178b).f8275b.right, j10[i11]);
                canvas.drawPath(path, paint);
                path.reset();
            }
            canvas.restoreToCount(save);
        }
        if (jVar.I) {
            int save2 = canvas.save();
            RectF rectF2 = this.f7204o;
            rectF2.set(((cn.i) this.f3178b).f8275b);
            rectF2.inset(s0.g.f34069a, -jVar.K);
            canvas.clipRect(rectF2);
            cn.c a10 = this.f7136d.a(s0.g.f34069a, s0.g.f34069a);
            Paint paint2 = this.f7199j;
            paint2.setColor(jVar.J);
            paint2.setStrokeWidth(jVar.K);
            Path path2 = this.f7203n;
            path2.reset();
            path2.moveTo(((cn.i) this.f3178b).f8275b.left, (float) a10.f8245c);
            path2.lineTo(((cn.i) this.f3178b).f8275b.right, (float) a10.f8245c);
            canvas.drawPath(path2, paint2);
            canvas.restoreToCount(save2);
        }
    }

    public final void n(Canvas canvas) {
        ArrayList arrayList = this.f7198i.f36176w;
        if (arrayList != null && arrayList.size() > 0) {
            float[] fArr = this.f7206q;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            Path path = this.f7205p;
            path.reset();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                tm.g gVar = (tm.g) arrayList.get(i10);
                if (gVar.f36180a) {
                    int save = canvas.save();
                    RectF rectF = this.f7207r;
                    rectF.set(((cn.i) this.f3178b).f8275b);
                    rectF.inset(s0.g.f34069a, -gVar.f36215g);
                    canvas.clipRect(rectF);
                    Paint paint = this.f7140h;
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setColor(gVar.f36216h);
                    paint.setStrokeWidth(gVar.f36215g);
                    paint.setPathEffect(gVar.f36219k);
                    fArr[1] = gVar.f36214f;
                    this.f7136d.e(fArr);
                    path.moveTo(((cn.i) this.f3178b).f8275b.left, fArr[1]);
                    path.lineTo(((cn.i) this.f3178b).f8275b.right, fArr[1]);
                    canvas.drawPath(path, paint);
                    path.reset();
                    String str = gVar.f36218j;
                    if (str != null && !str.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
                        paint.setStyle(gVar.f36217i);
                        paint.setPathEffect(null);
                        paint.setColor(gVar.f36184e);
                        paint.setTypeface(null);
                        paint.setStrokeWidth(0.5f);
                        paint.setTextSize(gVar.f36183d);
                        float a10 = cn.h.a(paint, str);
                        float c10 = cn.h.c(4.0f) + gVar.f36181b;
                        float f10 = gVar.f36215g + a10 + gVar.f36182c;
                        int i11 = gVar.f36220l;
                        if (i11 == 3) {
                            paint.setTextAlign(Paint.Align.RIGHT);
                            canvas.drawText(str, ((cn.i) this.f3178b).f8275b.right - c10, (fArr[1] - f10) + a10, paint);
                        } else if (i11 == 4) {
                            paint.setTextAlign(Paint.Align.RIGHT);
                            canvas.drawText(str, ((cn.i) this.f3178b).f8275b.right - c10, fArr[1] + f10, paint);
                        } else if (i11 == 1) {
                            paint.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(str, ((cn.i) this.f3178b).f8275b.left + c10, (fArr[1] - f10) + a10, paint);
                        } else {
                            paint.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(str, ((cn.i) this.f3178b).f8275b.left + c10, fArr[1] + f10, paint);
                        }
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
    }
}
