package bn;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.github.mikephil.charting.charts.BarChart;
import java.util.List;

/* loaded from: classes2.dex */
public final class b extends c {

    /* renamed from: h, reason: collision with root package name */
    public xm.a f7141h;

    /* renamed from: i, reason: collision with root package name */
    public RectF f7142i;

    /* renamed from: j, reason: collision with root package name */
    public rm.a[] f7143j;

    /* renamed from: k, reason: collision with root package name */
    public Paint f7144k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f7145l;

    /* renamed from: m, reason: collision with root package name */
    public RectF f7146m;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bn.d
    public final void i(Canvas canvas) {
        tm.j jVar;
        float[] fArr;
        boolean z10;
        float f10;
        float f11;
        float f12;
        xm.a aVar = this.f7141h;
        um.a barData = aVar.getBarData();
        for (int i10 = 0; i10 < barData.c(); i10++) {
            um.b bVar = (um.b) barData.b(i10);
            if (bVar.f37271o) {
                sm.a aVar2 = (sm.a) aVar;
                cn.g m10 = aVar2.m(bVar.f37260d);
                Paint paint = this.f7145l;
                paint.setColor(bVar.f37242x);
                paint.setStrokeWidth(cn.h.c(s0.g.f34069a));
                this.f7148c.getClass();
                if (((BarChart) aVar).F0) {
                    Paint paint2 = this.f7144k;
                    paint2.setColor(bVar.f37241w);
                    float f13 = aVar.getBarData().f37239j / 2.0f;
                    int min = Math.min((int) Math.ceil(bVar.f37272p.size() * 1.0f), bVar.f37272p.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        float f14 = ((um.c) bVar.g(i11)).f37277c;
                        RectF rectF = this.f7146m;
                        rectF.left = f14 - f13;
                        rectF.right = f14 + f13;
                        m10.f8257a.mapRect(rectF);
                        m10.f8259c.f8274a.mapRect(rectF);
                        m10.f8258b.mapRect(rectF);
                        if (((cn.i) this.f3178b).b(rectF.right)) {
                            if (!((cn.i) this.f3178b).c(rectF.left)) {
                                break;
                            }
                            RectF rectF2 = ((cn.i) this.f3178b).f8275b;
                            rectF.top = rectF2.top;
                            rectF.bottom = rectF2.bottom;
                            canvas.drawRect(rectF, paint2);
                        }
                    }
                }
                rm.a aVar3 = this.f7143j[i10];
                aVar3.f33958c = 1.0f;
                aVar3.f33959d = 1.0f;
                if (bVar.f37260d == 1) {
                    jVar = aVar2.f34684p0;
                } else {
                    jVar = aVar2.f34685q0;
                }
                jVar.getClass();
                aVar3.f33960e = false;
                aVar3.f33961f = aVar.getBarData().f37239j;
                float size = bVar.f37272p.size() * aVar3.f33958c;
                float f15 = aVar3.f33961f / 2.0f;
                int i12 = 0;
                while (true) {
                    float f16 = i12;
                    fArr = aVar3.f33957b;
                    if (f16 >= size) {
                        break;
                    }
                    um.c cVar = (um.c) bVar.g(i12);
                    if (cVar != null) {
                        float f17 = cVar.f37277c;
                        float f18 = cVar.f37246a;
                        float f19 = f17 - f15;
                        float f20 = f17 + f15;
                        if (aVar3.f33960e) {
                            f10 = s0.g.f34069a;
                            if (f18 >= s0.g.f34069a) {
                                f12 = f18;
                            } else {
                                f12 = 0.0f;
                            }
                            if (f18 > s0.g.f34069a) {
                                f18 = 0.0f;
                            }
                        } else {
                            f10 = s0.g.f34069a;
                            if (f18 >= s0.g.f34069a) {
                                f11 = f18;
                            } else {
                                f11 = 0.0f;
                            }
                            if (f18 > s0.g.f34069a) {
                                f18 = 0.0f;
                            }
                            float f21 = f11;
                            f12 = f18;
                            f18 = f21;
                        }
                        if (f18 > f10) {
                            f18 *= aVar3.f33959d;
                        } else {
                            f12 *= aVar3.f33959d;
                        }
                        int i13 = aVar3.f33956a;
                        fArr[i13] = f19;
                        fArr[i13 + 1] = f18;
                        fArr[i13 + 2] = f20;
                        aVar3.f33956a = i13 + 4;
                        fArr[i13 + 3] = f12;
                    }
                    i12++;
                }
                aVar3.f33956a = 0;
                m10.e(fArr);
                if (bVar.f37257a.size() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Paint paint3 = this.f7149d;
                if (z10) {
                    paint3.setColor(((Integer) bVar.f37257a.get(0)).intValue());
                }
                for (int i14 = 0; i14 < fArr.length; i14 += 4) {
                    int i15 = i14 + 2;
                    if (((cn.i) this.f3178b).b(fArr[i15])) {
                        if (!((cn.i) this.f3178b).c(fArr[i14])) {
                            break;
                        }
                        if (!z10) {
                            paint3.setColor(bVar.e(i14 / 4));
                        }
                        canvas.drawRect(fArr[i14], fArr[i14 + 1], fArr[i15], fArr[i14 + 3], paint3);
                    }
                }
            }
        }
    }

    @Override // bn.d
    public final void j(Canvas canvas) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bn.d
    public final void k(Canvas canvas, wm.c[] cVarArr) {
        xm.a aVar = this.f7141h;
        um.a barData = aVar.getBarData();
        for (wm.c cVar : cVarArr) {
            um.b bVar = (um.b) barData.b(cVar.f39311e);
            if (bVar != null && bVar.f37261e) {
                um.i iVar = (um.c) bVar.h(cVar.f39307a, cVar.f39308b, 3);
                if (n(iVar, bVar)) {
                    cn.g m10 = ((sm.a) aVar).m(bVar.f37260d);
                    this.f7150e.setColor(bVar.f37245u);
                    this.f7150e.setAlpha(bVar.f37243y);
                    if (cVar.f39312f >= 0) {
                        iVar.getClass();
                    }
                    float f10 = iVar.f37246a;
                    float f11 = iVar.f37277c;
                    float f12 = barData.f37239j / 2.0f;
                    float f13 = f11 - f12;
                    float f14 = f11 + f12;
                    RectF rectF = this.f7142i;
                    rectF.set(f13, f10, f14, s0.g.f34069a);
                    this.f7148c.getClass();
                    m10.getClass();
                    rectF.top *= 1.0f;
                    rectF.bottom *= 1.0f;
                    m10.f8257a.mapRect(rectF);
                    m10.f8259c.f8274a.mapRect(rectF);
                    m10.f8258b.mapRect(rectF);
                    float centerX = rectF.centerX();
                    float f15 = rectF.top;
                    cVar.f39314h = centerX;
                    cVar.f39315i = f15;
                    canvas.drawRect(rectF, this.f7150e);
                }
            }
        }
    }

    @Override // bn.d
    public final void l(Canvas canvas) {
        xm.a aVar;
        List list;
        float f10;
        boolean z10;
        tm.j jVar;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z11;
        float f15;
        xm.a aVar2 = this.f7141h;
        if (aVar2.getData().d() < aVar2.getMaxVisibleCount() * ((cn.i) this.f3178b).f8282i) {
            List list2 = aVar2.getBarData().f37256i;
            float c10 = cn.h.c(4.5f);
            boolean z12 = ((BarChart) aVar2).E0;
            int i10 = 0;
            while (i10 < aVar2.getBarData().c()) {
                um.b bVar = (um.b) list2.get(i10);
                if (!bVar.f37271o || (!bVar.f37267k && !bVar.f37268l)) {
                    aVar = aVar2;
                    list = list2;
                    f10 = c10;
                    z10 = z12;
                } else {
                    h(bVar);
                    sm.a aVar3 = (sm.a) aVar2;
                    boolean z13 = true;
                    if (bVar.f37260d == 1) {
                        jVar = aVar3.f34684p0;
                    } else {
                        jVar = aVar3.f34685q0;
                    }
                    jVar.getClass();
                    float a10 = cn.h.a(this.f7151f, "8");
                    if (z12) {
                        f11 = -c10;
                    } else {
                        f11 = a10 + c10;
                    }
                    if (z12) {
                        f12 = a10 + c10;
                    } else {
                        f12 = -c10;
                    }
                    rm.a aVar4 = this.f7143j[i10];
                    this.f7148c.getClass();
                    vm.c cVar = bVar.f37262f;
                    if (cVar == null) {
                        cVar = cn.h.f8271h;
                    }
                    cn.d dVar = bVar.f37269m;
                    cn.d dVar2 = (cn.d) cn.d.f8246d.b();
                    float f16 = dVar.f8247b;
                    dVar2.f8247b = f16;
                    dVar2.f8248c = dVar.f8248c;
                    dVar2.f8247b = cn.h.c(f16);
                    dVar2.f8248c = cn.h.c(dVar2.f8248c);
                    if (bVar.f37240v <= 1) {
                        z13 = false;
                    }
                    if (!z13) {
                        int i11 = 0;
                        while (true) {
                            float f17 = i11;
                            float[] fArr = aVar4.f33957b;
                            aVar = aVar2;
                            if (f17 >= fArr.length * 1.0f) {
                                break;
                            }
                            float f18 = (fArr[i11] + fArr[i11 + 2]) / 2.0f;
                            if (!((cn.i) this.f3178b).c(f18)) {
                                break;
                            }
                            int i12 = i11 + 1;
                            List list3 = list2;
                            if (!((cn.i) this.f3178b).d(fArr[i12]) || !((cn.i) this.f3178b).b(f18)) {
                                f14 = c10;
                                z11 = z12;
                            } else {
                                int i13 = i11 / 4;
                                um.c cVar2 = (um.c) bVar.g(i13);
                                f14 = c10;
                                float f19 = cVar2.f37246a;
                                z11 = z12;
                                if (bVar.f37267k) {
                                    cVar.getClass();
                                    String a11 = cVar.a(cVar2.f37246a);
                                    if (f19 >= s0.g.f34069a) {
                                        f15 = fArr[i12] + f11;
                                    } else {
                                        f15 = fArr[i11 + 3] + f12;
                                    }
                                    int j10 = bVar.j(i13);
                                    Paint paint = this.f7151f;
                                    paint.setColor(j10);
                                    canvas.drawText(a11, f18, f15, paint);
                                }
                            }
                            i11 += 4;
                            aVar2 = aVar;
                            list2 = list3;
                            c10 = f14;
                            z12 = z11;
                        }
                        list = list2;
                        f10 = c10;
                        z10 = z12;
                    } else {
                        aVar = aVar2;
                        list = list2;
                        f10 = c10;
                        z10 = z12;
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < bVar.f37272p.size() * 1.0f) {
                            um.c cVar3 = (um.c) bVar.g(i14);
                            cVar3.getClass();
                            float[] fArr2 = aVar4.f33957b;
                            float f20 = (fArr2[i15] + fArr2[i15 + 2]) / 2.0f;
                            int j11 = bVar.j(i14);
                            if (!((cn.i) this.f3178b).c(f20)) {
                                break;
                            }
                            cn.i iVar = (cn.i) this.f3178b;
                            int i16 = i15 + 1;
                            float[] fArr3 = aVar4.f33957b;
                            float f21 = f12;
                            if (iVar.d(fArr3[i16]) && ((cn.i) this.f3178b).b(f20)) {
                                if (bVar.f37267k) {
                                    cVar.getClass();
                                    String a12 = cVar.a(cVar3.f37246a);
                                    float f22 = fArr3[i16];
                                    if (cVar3.f37246a >= s0.g.f34069a) {
                                        f13 = f11;
                                    } else {
                                        f13 = f21;
                                    }
                                    float f23 = f22 + f13;
                                    Paint paint2 = this.f7151f;
                                    paint2.setColor(j11);
                                    canvas.drawText(a12, f20, f23, paint2);
                                }
                                i15 += 4;
                                i14++;
                            }
                            f12 = f21;
                        }
                    }
                    cn.d.c(dVar2);
                }
                i10++;
                aVar2 = aVar;
                list2 = list;
                c10 = f10;
                z12 = z10;
            }
        }
    }

    @Override // bn.d
    public final void m() {
        um.a barData = this.f7141h.getBarData();
        this.f7143j = new rm.a[barData.c()];
        for (int i10 = 0; i10 < this.f7143j.length; i10++) {
            um.b bVar = (um.b) barData.b(i10);
            rm.a[] aVarArr = this.f7143j;
            int size = bVar.f37272p.size() * 4;
            int i11 = bVar.f37240v;
            boolean z10 = true;
            if (i11 <= 1) {
                i11 = 1;
            }
            int i12 = size * i11;
            barData.c();
            if (bVar.f37240v <= 1) {
                z10 = false;
            }
            aVarArr[i10] = new rm.a(i12, z10);
        }
    }
}
