package bn;

import android.graphics.Paint;
import android.graphics.RectF;
import b4.l;

/* loaded from: classes2.dex */
public abstract class a extends l {

    /* renamed from: c, reason: collision with root package name */
    public final tm.a f7135c;

    /* renamed from: d, reason: collision with root package name */
    public final cn.g f7136d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f7137e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f7138f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f7139g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f7140h;

    public a(cn.i iVar, cn.g gVar, tm.a aVar) {
        super(iVar, 8);
        this.f7136d = gVar;
        this.f7135c = aVar;
        if (iVar != null) {
            this.f7138f = new Paint(1);
            Paint paint = new Paint();
            this.f7137e = paint;
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            paint.setAlpha(90);
            Paint paint2 = new Paint();
            this.f7139g = paint2;
            paint2.setColor(-16777216);
            paint2.setStrokeWidth(1.0f);
            paint2.setStyle(style);
            Paint paint3 = new Paint(1);
            this.f7140h = paint3;
            paint3.setStyle(style);
        }
    }

    public void h(float f10, float f11) {
        cn.i iVar = (cn.i) this.f3178b;
        if (iVar != null && iVar.f8275b.width() > 10.0f) {
            Object obj = this.f3178b;
            cn.i iVar2 = (cn.i) obj;
            float f12 = iVar2.f8283j;
            float f13 = iVar2.f8278e;
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
                float f16 = rectF2.left;
                float f17 = rectF2.bottom;
                cn.c cVar2 = (cn.c) cn.c.f8243d.b();
                cVar2.f8244b = 0.0d;
                cVar2.f8245c = 0.0d;
                gVar.b(f16, f17, cVar2);
                f10 = (float) cVar2.f8245c;
                f11 = (float) cVar.f8245c;
                cn.c.b(cVar);
                cn.c.b(cVar2);
            }
        }
        i(f10, f11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v4, types: [int] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public void i(float f10, float f11) {
        double ceil;
        double floor;
        long j10;
        float f12 = f10;
        tm.a aVar = this.f7135c;
        int i10 = aVar.f36168o;
        double abs = Math.abs(f11 - f12);
        if (i10 != 0 && abs > 0.0d && !Double.isInfinite(abs)) {
            double d10 = cn.h.d(abs / i10);
            if (aVar.f36170q) {
                float f13 = aVar.f36169p;
                if (d10 < f13) {
                    d10 = f13;
                }
            }
            double d11 = cn.h.d(Math.pow(10.0d, (int) Math.log10(d10)));
            if (((int) (d10 / d11)) > 5) {
                d10 = Math.floor(d11 * 10.0d);
            }
            int e10 = aVar.e();
            if (aVar.f36171r) {
                d10 = ((float) abs) / (i10 - 1);
                aVar.f36166m = i10;
                if (aVar.f36164k.length < i10) {
                    aVar.f36164k = new float[i10];
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    aVar.f36164k[i11] = f12;
                    f12 = (float) (f12 + d10);
                }
            } else {
                if (d10 == 0.0d) {
                    ceil = 0.0d;
                } else {
                    ceil = Math.ceil(f12 / d10) * d10;
                }
                if (aVar.e()) {
                    ceil -= d10;
                }
                if (d10 == 0.0d) {
                    floor = 0.0d;
                } else {
                    floor = Math.floor(f11 / d10) * d10;
                    if (floor != Double.POSITIVE_INFINITY) {
                        double d12 = floor + 0.0d;
                        long doubleToRawLongBits = Double.doubleToRawLongBits(d12);
                        if (d12 >= 0.0d) {
                            j10 = 1;
                        } else {
                            j10 = -1;
                        }
                        floor = Double.longBitsToDouble(doubleToRawLongBits + j10);
                    }
                }
                if (d10 != 0.0d) {
                    double d13 = ceil;
                    e10 = e10;
                    while (d13 <= floor) {
                        d13 += d10;
                        e10++;
                    }
                }
                aVar.f36166m = e10;
                if (aVar.f36164k.length < e10) {
                    aVar.f36164k = new float[e10];
                }
                for (int i12 = 0; i12 < e10; i12++) {
                    if (ceil == 0.0d) {
                        ceil = 0.0d;
                    }
                    aVar.f36164k[i12] = (float) ceil;
                    ceil += d10;
                }
                i10 = e10;
            }
            if (d10 < 1.0d) {
                aVar.f36167n = (int) Math.ceil(-Math.log10(d10));
            } else {
                aVar.f36167n = 0;
            }
            if (aVar.e()) {
                if (aVar.f36165l.length < i10) {
                    aVar.f36165l = new float[i10];
                }
                float f14 = ((float) d10) / 2.0f;
                for (int i13 = 0; i13 < i10; i13++) {
                    aVar.f36165l[i13] = aVar.f36164k[i13] + f14;
                }
                return;
            }
            return;
        }
        aVar.f36164k = new float[0];
        aVar.f36165l = new float[0];
        aVar.f36166m = 0;
    }
}
