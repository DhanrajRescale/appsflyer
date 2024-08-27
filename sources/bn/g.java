package bn;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p2.m;

/* loaded from: classes2.dex */
public final class g extends h {

    /* renamed from: i, reason: collision with root package name */
    public xm.d f7161i;

    /* renamed from: j, reason: collision with root package name */
    public Paint f7162j;

    /* renamed from: k, reason: collision with root package name */
    public WeakReference f7163k;

    /* renamed from: l, reason: collision with root package name */
    public Canvas f7164l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap.Config f7165m;

    /* renamed from: n, reason: collision with root package name */
    public Path f7166n;

    /* renamed from: o, reason: collision with root package name */
    public Path f7167o;

    /* renamed from: p, reason: collision with root package name */
    public float[] f7168p;

    /* renamed from: q, reason: collision with root package name */
    public Path f7169q;

    /* renamed from: r, reason: collision with root package name */
    public HashMap f7170r;

    /* renamed from: s, reason: collision with root package name */
    public float[] f7171s;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r2v8, types: [p2.m] */
    /* JADX WARN: Type inference failed for: r9v5, types: [xm.d] */
    @Override // bn.d
    public final void i(Canvas canvas) {
        Bitmap bitmap;
        PathEffect pathEffect;
        Bitmap bitmap2;
        boolean z10;
        xm.d dVar;
        Iterator it;
        xm.d dVar2;
        Path path;
        boolean z11;
        int i10;
        int i11;
        xm.d dVar3;
        char c10;
        int i12;
        boolean z12;
        cn.i iVar = (cn.i) this.f3178b;
        int i13 = (int) iVar.f8276c;
        int i14 = (int) iVar.f8277d;
        WeakReference weakReference = this.f7163k;
        PathEffect pathEffect2 = null;
        if (weakReference == null) {
            bitmap = null;
        } else {
            bitmap = (Bitmap) weakReference.get();
        }
        if (bitmap == null || bitmap.getWidth() != i13 || bitmap.getHeight() != i14) {
            if (i13 > 0 && i14 > 0) {
                bitmap = Bitmap.createBitmap(i13, i14, this.f7165m);
                this.f7163k = new WeakReference(bitmap);
                this.f7164l = new Canvas(bitmap);
            } else {
                return;
            }
        }
        Bitmap bitmap3 = bitmap;
        boolean z13 = false;
        bitmap3.eraseColor(0);
        xm.d dVar4 = this.f7161i;
        Iterator it2 = dVar4.getLineData().f37256i.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            Paint paint = this.f7149d;
            if (hasNext) {
                um.k kVar = (um.k) it2.next();
                if (kVar.f37271o && kVar.f37272p.size() >= 1) {
                    paint.setStrokeWidth(kVar.C);
                    paint.setPathEffect(pathEffect2);
                    int e10 = w.k.e(kVar.E);
                    Path path2 = this.f7167o;
                    Path path3 = this.f7166n;
                    ?? r22 = this.f7147g;
                    qm.a aVar = this.f7148c;
                    if (e10 != 2) {
                        if (e10 != 3) {
                            int size = kVar.f37272p.size();
                            if (kVar.E == 2) {
                                z11 = true;
                            } else {
                                z11 = z13;
                            }
                            if (z11) {
                                i10 = 4;
                            } else {
                                i10 = 2;
                            }
                            cn.g m10 = ((sm.a) dVar4).m(kVar.f37260d);
                            aVar.getClass();
                            paint.setStyle(Paint.Style.STROKE);
                            r22.g(dVar4, kVar);
                            if (kVar.D && size > 0) {
                                Path path4 = this.f7169q;
                                int i15 = r22.f30589b;
                                int i16 = r22.f30591d + i15;
                                int i17 = 0;
                                while (true) {
                                    it = it2;
                                    int i18 = (i17 * 128) + i15;
                                    int i19 = i15;
                                    int i20 = i18 + 128;
                                    if (i20 > i16) {
                                        i20 = i16;
                                    }
                                    if (i18 <= i20) {
                                        i12 = i16;
                                        kVar.K.getClass();
                                        float i21 = ll.e.i(kVar, dVar4);
                                        bitmap2 = bitmap3;
                                        dVar3 = dVar4;
                                        if (kVar.E == 2) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        path4.reset();
                                        um.i g10 = kVar.g(i18);
                                        i11 = size;
                                        path4.moveTo(g10.b(), i21);
                                        path4.lineTo(g10.b(), g10.a() * 1.0f);
                                        int i22 = i18 + 1;
                                        um.i iVar2 = g10;
                                        um.i iVar3 = null;
                                        while (i22 <= i20) {
                                            iVar3 = kVar.g(i22);
                                            boolean z14 = z12;
                                            if (z12) {
                                                path4.lineTo(iVar3.b(), iVar2.a() * 1.0f);
                                            }
                                            path4.lineTo(iVar3.b(), iVar3.a() * 1.0f);
                                            i22++;
                                            iVar2 = iVar3;
                                            z12 = z14;
                                        }
                                        if (iVar3 != null) {
                                            path4.lineTo(iVar3.b(), i21);
                                        }
                                        path4.close();
                                        m10.c(path4);
                                        Drawable drawable = kVar.A;
                                        if (drawable != null) {
                                            o(canvas, path4, drawable);
                                        } else {
                                            int i23 = (kVar.f37282z & 16777215) | (kVar.B << 24);
                                            DisplayMetrics displayMetrics = cn.h.f8264a;
                                            int save = canvas.save();
                                            canvas.clipPath(path4);
                                            canvas.drawColor(i23);
                                            canvas.restoreToCount(save);
                                        }
                                    } else {
                                        i11 = size;
                                        i12 = i16;
                                        bitmap2 = bitmap3;
                                        dVar3 = dVar4;
                                    }
                                    i17++;
                                    if (i18 > i20) {
                                        break;
                                    }
                                    i15 = i19;
                                    i16 = i12;
                                    it2 = it;
                                    bitmap3 = bitmap2;
                                    dVar4 = dVar3;
                                    size = i11;
                                }
                            } else {
                                i11 = size;
                                bitmap2 = bitmap3;
                                dVar3 = dVar4;
                                it = it2;
                            }
                            if (kVar.f37257a.size() > 1) {
                                int i24 = i10 * 2;
                                if (this.f7168p.length <= i24) {
                                    this.f7168p = new float[i10 * 4];
                                }
                                for (int i25 = r22.f30589b; i25 <= r22.f30591d + r22.f30589b; i25++) {
                                    um.i g11 = kVar.g(i25);
                                    if (g11 != null) {
                                        this.f7168p[0] = g11.b();
                                        this.f7168p[1] = g11.a() * 1.0f;
                                        if (i25 < r22.f30590c) {
                                            um.i g12 = kVar.g(i25 + 1);
                                            if (g12 == null) {
                                                break;
                                            }
                                            if (z11) {
                                                this.f7168p[2] = g12.b();
                                                float[] fArr = this.f7168p;
                                                float f10 = fArr[1];
                                                fArr[3] = f10;
                                                fArr[4] = fArr[2];
                                                fArr[5] = f10;
                                                fArr[6] = g12.b();
                                                this.f7168p[7] = g12.a() * 1.0f;
                                            } else {
                                                this.f7168p[2] = g12.b();
                                                this.f7168p[3] = g12.a() * 1.0f;
                                            }
                                            c10 = 0;
                                        } else {
                                            float[] fArr2 = this.f7168p;
                                            c10 = 0;
                                            fArr2[2] = fArr2[0];
                                            fArr2[3] = fArr2[1];
                                        }
                                        m10.e(this.f7168p);
                                        if (!((cn.i) this.f3178b).c(this.f7168p[c10])) {
                                            break;
                                        }
                                        if (((cn.i) this.f3178b).b(this.f7168p[2])) {
                                            Object obj = this.f3178b;
                                            if (((cn.i) obj).f8275b.top > this.f7168p[1]) {
                                                if (((cn.i) obj).f8275b.bottom < ((int) (r9[3] * 100.0f)) / 100.0f) {
                                                }
                                            }
                                            paint.setColor(kVar.e(i25));
                                            canvas.drawLines(this.f7168p, 0, i24, paint);
                                        }
                                    }
                                }
                            } else {
                                int i26 = i11 * i10;
                                if (this.f7168p.length < Math.max(i26, i10) * 2) {
                                    this.f7168p = new float[Math.max(i26, i10) * 4];
                                }
                                if (kVar.g(r22.f30589b) != null) {
                                    int i27 = 0;
                                    for (int i28 = r22.f30589b; i28 <= r22.f30591d + r22.f30589b; i28++) {
                                        um.i g13 = kVar.g(i28 == 0 ? 0 : i28 - 1);
                                        um.i g14 = kVar.g(i28);
                                        if (g13 != null && g14 != null) {
                                            this.f7168p[i27] = g13.b();
                                            int i29 = i27 + 2;
                                            this.f7168p[i27 + 1] = g13.a() * 1.0f;
                                            if (z11) {
                                                this.f7168p[i29] = g14.b();
                                                this.f7168p[i27 + 3] = g13.a() * 1.0f;
                                                this.f7168p[i27 + 4] = g14.b();
                                                i29 = i27 + 6;
                                                this.f7168p[i27 + 5] = g13.a() * 1.0f;
                                            }
                                            this.f7168p[i29] = g14.b();
                                            this.f7168p[i29 + 1] = g14.a() * 1.0f;
                                            i27 = i29 + 2;
                                        }
                                    }
                                    if (i27 > 0) {
                                        m10.e(this.f7168p);
                                        int max = Math.max((r22.f30591d + 1) * i10, i10) * 2;
                                        paint.setColor(((Integer) kVar.f37257a.get(0)).intValue());
                                        canvas.drawLines(this.f7168p, 0, max, paint);
                                    }
                                }
                            }
                            paint.setPathEffect(null);
                            dVar2 = dVar3;
                        } else {
                            bitmap2 = bitmap3;
                            ?? r25 = dVar4;
                            it = it2;
                            aVar.getClass();
                            cn.g m11 = ((sm.a) r25).m(kVar.f37260d);
                            xm.d dVar5 = r25;
                            r22.g(dVar5, kVar);
                            path3.reset();
                            if (r22.f30591d >= 1) {
                                um.i g15 = kVar.g(r22.f30589b);
                                path3.moveTo(g15.b(), g15.a() * 1.0f);
                                int i30 = r22.f30589b + 1;
                                while (i30 <= r22.f30591d + r22.f30589b) {
                                    um.i g16 = kVar.g(i30);
                                    float b10 = ((g16.b() - g15.b()) / 2.0f) + g15.b();
                                    path3.cubicTo(b10, g15.a() * 1.0f, b10, g16.a() * 1.0f, g16.b(), g16.a() * 1.0f);
                                    i30++;
                                    g15 = g16;
                                }
                            }
                            if (kVar.D) {
                                path2.reset();
                                path2.addPath(path3);
                                path = path3;
                                p(this.f7164l, kVar, path2, m11, this.f7147g);
                            } else {
                                path = path3;
                            }
                            paint.setColor(((Integer) kVar.f37257a.get(0)).intValue());
                            paint.setStyle(Paint.Style.STROKE);
                            m11.c(path);
                            this.f7164l.drawPath(path, paint);
                            paint.setPathEffect(null);
                            dVar2 = dVar5;
                        }
                    } else {
                        bitmap2 = bitmap3;
                        ?? r92 = dVar4;
                        it = it2;
                        aVar.getClass();
                        cn.g m12 = ((sm.a) r92).m(kVar.f37260d);
                        r22.g(r92, kVar);
                        path3.reset();
                        if (r22.f30591d >= 1) {
                            int i31 = r22.f30589b;
                            um.i g17 = kVar.g(Math.max(i31 - 1, 0));
                            um.i g18 = kVar.g(Math.max(i31, 0));
                            dVar2 = r92;
                            if (g18 != null) {
                                path3.moveTo(g18.b(), g18.a() * 1.0f);
                                int i32 = -1;
                                int i33 = r22.f30589b + 1;
                                um.i iVar4 = g18;
                                m mVar = r22;
                                while (i33 <= mVar.f30591d + mVar.f30589b) {
                                    if (i32 != i33) {
                                        g18 = kVar.g(i33);
                                    }
                                    int i34 = i33 + 1;
                                    if (i34 < kVar.f37272p.size()) {
                                        i33 = i34;
                                    }
                                    um.i g19 = kVar.g(i33);
                                    float b11 = g18.b() - g17.b();
                                    m mVar2 = mVar;
                                    float f11 = kVar.J;
                                    path3.cubicTo(iVar4.b() + (b11 * f11), (iVar4.a() + ((g18.a() - g17.a()) * f11)) * 1.0f, g18.b() - ((g19.b() - iVar4.b()) * f11), (g18.a() - ((g19.a() - iVar4.a()) * f11)) * 1.0f, g18.b(), g18.a() * 1.0f);
                                    g17 = iVar4;
                                    mVar = mVar2;
                                    iVar4 = g18;
                                    g18 = g19;
                                    i32 = i33;
                                    i33 = i34;
                                }
                            }
                        }
                        if (kVar.D) {
                            path2.reset();
                            path2.addPath(path3);
                            p(this.f7164l, kVar, path2, m12, this.f7147g);
                        }
                        z10 = false;
                        paint.setColor(((Integer) kVar.f37257a.get(0)).intValue());
                        paint.setStyle(Paint.Style.STROKE);
                        m12.c(path3);
                        this.f7164l.drawPath(path3, paint);
                        pathEffect = null;
                        paint.setPathEffect(null);
                        dVar = r92;
                        paint.setPathEffect(pathEffect);
                    }
                    pathEffect = null;
                    z10 = false;
                    dVar = dVar2;
                    paint.setPathEffect(pathEffect);
                } else {
                    pathEffect = pathEffect2;
                    bitmap2 = bitmap3;
                    z10 = z13;
                    dVar = dVar4;
                    it = it2;
                }
                pathEffect2 = pathEffect;
                z13 = z10;
                dVar4 = dVar;
                it2 = it;
                bitmap3 = bitmap2;
            } else {
                canvas.drawBitmap(bitmap3, s0.g.f34069a, s0.g.f34069a, paint);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0121  */
    @Override // bn.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bn.g.j(android.graphics.Canvas):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bn.d
    public final void k(Canvas canvas, wm.c[] cVarArr) {
        xm.d dVar = this.f7161i;
        um.j lineData = dVar.getLineData();
        for (wm.c cVar : cVarArr) {
            um.k kVar = (um.k) lineData.b(cVar.f39311e);
            if (kVar != null && kVar.f37261e) {
                um.i h10 = kVar.h(cVar.f39307a, cVar.f39308b, 3);
                if (n(h10, kVar)) {
                    cn.g m10 = ((sm.a) dVar).m(kVar.f37260d);
                    float b10 = h10.b();
                    float a10 = h10.a();
                    this.f7148c.getClass();
                    cn.c a11 = m10.a(b10, a10 * 1.0f);
                    float f10 = (float) a11.f8244b;
                    float f11 = (float) a11.f8245c;
                    cVar.f39314h = f10;
                    cVar.f39315i = f11;
                    this.f7150e.setColor(kVar.f37245u);
                    this.f7150e.setStrokeWidth(kVar.f37280x);
                    this.f7150e.setPathEffect(kVar.f37281y);
                    if (kVar.f37278v) {
                        this.f7172h.reset();
                        this.f7172h.moveTo(f10, ((cn.i) this.f3178b).f8275b.top);
                        this.f7172h.lineTo(f10, ((cn.i) this.f3178b).f8275b.bottom);
                        canvas.drawPath(this.f7172h, this.f7150e);
                    }
                    if (kVar.f37279w) {
                        this.f7172h.reset();
                        this.f7172h.moveTo(((cn.i) this.f3178b).f8275b.left, f11);
                        this.f7172h.lineTo(((cn.i) this.f3178b).f8275b.right, f11);
                        canvas.drawPath(this.f7172h, this.f7150e);
                    }
                }
            }
        }
    }

    @Override // bn.d
    public final void l(Canvas canvas) {
        xm.d dVar;
        xm.d dVar2;
        xm.d dVar3 = this.f7161i;
        if (dVar3.getData().d() < dVar3.getMaxVisibleCount() * ((cn.i) this.f3178b).f8282i) {
            List list = dVar3.getLineData().f37256i;
            int i10 = 0;
            while (i10 < list.size()) {
                um.k kVar = (um.k) list.get(i10);
                if (!kVar.f37271o || ((!kVar.f37267k && !kVar.f37268l) || kVar.f37272p.size() < 1)) {
                    dVar = dVar3;
                } else {
                    h(kVar);
                    cn.g m10 = ((sm.a) dVar3).m(kVar.f37260d);
                    int i11 = (int) (kVar.H * 1.75f);
                    if (!kVar.L) {
                        i11 /= 2;
                    }
                    m mVar = this.f7147g;
                    mVar.g(dVar3, kVar);
                    this.f7148c.getClass();
                    int i12 = mVar.f30589b;
                    int i13 = (((int) ((mVar.f30590c - i12) * 1.0f)) + 1) * 2;
                    if (m10.f8260d.length != i13) {
                        m10.f8260d = new float[i13];
                    }
                    float[] fArr = m10.f8260d;
                    for (int i14 = 0; i14 < i13; i14 += 2) {
                        um.i g10 = kVar.g((i14 / 2) + i12);
                        if (g10 != null) {
                            fArr[i14] = g10.b();
                            fArr[i14 + 1] = g10.a() * 1.0f;
                        } else {
                            fArr[i14] = 0.0f;
                            fArr[i14 + 1] = 0.0f;
                        }
                    }
                    Matrix matrix = m10.f8263g;
                    matrix.set(m10.f8257a);
                    matrix.postConcat(m10.f8259c.f8274a);
                    matrix.postConcat(m10.f8258b);
                    matrix.mapPoints(fArr);
                    vm.c cVar = kVar.f37262f;
                    if (cVar == null) {
                        cVar = cn.h.f8271h;
                    }
                    cn.d dVar4 = kVar.f37269m;
                    cn.d dVar5 = (cn.d) cn.d.f8246d.b();
                    float f10 = dVar4.f8247b;
                    dVar5.f8247b = f10;
                    dVar5.f8248c = dVar4.f8248c;
                    dVar5.f8247b = cn.h.c(f10);
                    dVar5.f8248c = cn.h.c(dVar5.f8248c);
                    int i15 = 0;
                    while (i15 < fArr.length) {
                        float f11 = fArr[i15];
                        float f12 = fArr[i15 + 1];
                        if (!((cn.i) this.f3178b).c(f11)) {
                            break;
                        }
                        if (!((cn.i) this.f3178b).b(f11) || !((cn.i) this.f3178b).d(f12)) {
                            dVar2 = dVar3;
                        } else {
                            int i16 = i15 / 2;
                            um.i g11 = kVar.g(mVar.f30589b + i16);
                            if (kVar.f37267k) {
                                cVar.getClass();
                                dVar2 = dVar3;
                                int j10 = kVar.j(i16);
                                Paint paint = this.f7151f;
                                paint.setColor(j10);
                                canvas.drawText(cVar.a(g11.a()), f11, f12 - i11, paint);
                            } else {
                                dVar2 = dVar3;
                            }
                            g11.getClass();
                        }
                        i15 += 2;
                        dVar3 = dVar2;
                    }
                    dVar = dVar3;
                    cn.d.c(dVar5);
                }
                i10++;
                dVar3 = dVar;
            }
        }
    }

    @Override // bn.d
    public final void m() {
    }

    public final void p(Canvas canvas, um.k kVar, Path path, cn.g gVar, m mVar) {
        ll.e eVar = kVar.K;
        xm.d dVar = this.f7161i;
        eVar.getClass();
        float i10 = ll.e.i(kVar, dVar);
        path.lineTo(kVar.g(mVar.f30589b + mVar.f30591d).b(), i10);
        path.lineTo(kVar.g(mVar.f30589b).b(), i10);
        path.close();
        gVar.c(path);
        Drawable drawable = kVar.A;
        if (drawable != null) {
            o(canvas, path, drawable);
            return;
        }
        int i11 = (kVar.B << 24) | (kVar.f37282z & 16777215);
        DisplayMetrics displayMetrics = cn.h.f8264a;
        int save = canvas.save();
        canvas.clipPath(path);
        canvas.drawColor(i11);
        canvas.restoreToCount(save);
    }
}
