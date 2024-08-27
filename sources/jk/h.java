package jk;

import ak.p;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import rk.k;
import xj.o;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final wj.a f21439a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f21440b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f21441c;

    /* renamed from: d, reason: collision with root package name */
    public final com.bumptech.glide.h f21442d;

    /* renamed from: e, reason: collision with root package name */
    public final bk.d f21443e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21444f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21445g;

    /* renamed from: h, reason: collision with root package name */
    public com.bumptech.glide.g f21446h;

    /* renamed from: i, reason: collision with root package name */
    public e f21447i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f21448j;

    /* renamed from: k, reason: collision with root package name */
    public e f21449k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f21450l;

    /* renamed from: m, reason: collision with root package name */
    public e f21451m;

    /* renamed from: n, reason: collision with root package name */
    public int f21452n;

    /* renamed from: o, reason: collision with root package name */
    public int f21453o;

    /* renamed from: p, reason: collision with root package name */
    public int f21454p;

    public h(com.bumptech.glide.b bVar, wj.e eVar, int i10, int i11, gk.a aVar, Bitmap bitmap) {
        bk.d dVar = bVar.f10778a;
        com.bumptech.glide.d dVar2 = bVar.f10780c;
        com.bumptech.glide.h e10 = com.bumptech.glide.b.e(dVar2.getBaseContext());
        com.bumptech.glide.g w10 = com.bumptech.glide.b.e(dVar2.getBaseContext()).j().w(((nk.e) ((nk.e) ((nk.e) new nk.a().f(p.f555a)).u()).q()).k(i10, i11));
        this.f21441c = new ArrayList();
        this.f21442d = e10;
        Handler handler = new Handler(Looper.getMainLooper(), new g(this, 0));
        this.f21443e = dVar;
        this.f21440b = handler;
        this.f21446h = w10;
        this.f21439a = eVar;
        c(aVar, bitmap);
    }

    public final void a() {
        int i10;
        int i11;
        if (this.f21444f && !this.f21445g) {
            e eVar = this.f21451m;
            if (eVar != null) {
                this.f21451m = null;
                b(eVar);
                return;
            }
            this.f21445g = true;
            wj.a aVar = this.f21439a;
            wj.e eVar2 = (wj.e) aVar;
            wj.c cVar = eVar2.f39134l;
            int i12 = cVar.f39110c;
            if (i12 > 0 && (i11 = eVar2.f39133k) >= 0) {
                if (i11 >= 0 && i11 < i12) {
                    i10 = ((wj.b) cVar.f39112e.get(i11)).f39105i;
                } else {
                    i10 = -1;
                }
            } else {
                i10 = 0;
            }
            long uptimeMillis = SystemClock.uptimeMillis() + i10;
            int i13 = (eVar2.f39133k + 1) % eVar2.f39134l.f39110c;
            eVar2.f39133k = i13;
            this.f21449k = new e(this.f21440b, i13, uptimeMillis);
            com.bumptech.glide.g w10 = this.f21446h.w((nk.e) new nk.a().p(new qk.b(Double.valueOf(Math.random()))));
            w10.F = aVar;
            w10.J = true;
            w10.A(this.f21449k);
        }
    }

    public final void b(e eVar) {
        int i10;
        this.f21445g = false;
        boolean z10 = this.f21448j;
        Handler handler = this.f21440b;
        if (z10) {
            handler.obtainMessage(2, eVar).sendToTarget();
            return;
        }
        if (!this.f21444f) {
            this.f21451m = eVar;
            return;
        }
        if (eVar.f21436g != null) {
            Bitmap bitmap = this.f21450l;
            if (bitmap != null) {
                this.f21443e.b(bitmap);
                this.f21450l = null;
            }
            e eVar2 = this.f21447i;
            this.f21447i = eVar;
            ArrayList arrayList = this.f21441c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) ((f) arrayList.get(size));
                Object callback = cVar.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    cVar.stop();
                    cVar.invalidateSelf();
                } else {
                    cVar.invalidateSelf();
                    e eVar3 = cVar.f21422a.f21421a.f21447i;
                    if (eVar3 != null) {
                        i10 = eVar3.f21434e;
                    } else {
                        i10 = -1;
                    }
                    if (i10 == ((wj.e) r5.f21439a).f39134l.f39110c - 1) {
                        cVar.f21427f++;
                    }
                    int i11 = cVar.f21428g;
                    if (i11 != -1 && cVar.f21427f >= i11) {
                        cVar.stop();
                    }
                }
            }
            if (eVar2 != null) {
                handler.obtainMessage(2, eVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(o oVar, Bitmap bitmap) {
        if (oVar != null) {
            if (bitmap != null) {
                this.f21450l = bitmap;
                this.f21446h = this.f21446h.w(new nk.a().t(oVar, true));
                this.f21452n = k.c(bitmap);
                this.f21453o = bitmap.getWidth();
                this.f21454p = bitmap.getHeight();
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }
}
