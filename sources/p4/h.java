package p4;

import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class h implements a {

    /* renamed from: l, reason: collision with root package name */
    public static final d f30637l = new d(8);

    /* renamed from: m, reason: collision with root package name */
    public static final d f30638m = new d(9);

    /* renamed from: n, reason: collision with root package name */
    public static final d f30639n = new d(10);

    /* renamed from: o, reason: collision with root package name */
    public static final d f30640o = new d(11);

    /* renamed from: p, reason: collision with root package name */
    public static final d f30641p = new d(12);

    /* renamed from: q, reason: collision with root package name */
    public static final d f30642q = new d(13);

    /* renamed from: r, reason: collision with root package name */
    public static final d f30643r = new d(0);

    /* renamed from: s, reason: collision with root package name */
    public static final d f30644s = new d(2);

    /* renamed from: d, reason: collision with root package name */
    public final Object f30648d;

    /* renamed from: e, reason: collision with root package name */
    public final vl.b f30649e;

    /* renamed from: i, reason: collision with root package name */
    public final float f30653i;

    /* renamed from: a, reason: collision with root package name */
    public float f30645a = s0.g.f34069a;

    /* renamed from: b, reason: collision with root package name */
    public float f30646b = Float.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30647c = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30650f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float f30651g = -3.4028235E38f;

    /* renamed from: h, reason: collision with root package name */
    public long f30652h = 0;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f30654j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f30655k = new ArrayList();

    public h(Object obj, vl.b bVar) {
        this.f30648d = obj;
        this.f30649e = bVar;
        if (bVar != f30639n && bVar != f30640o && bVar != f30641p) {
            if (bVar == f30644s) {
                this.f30653i = 0.00390625f;
                return;
            } else if (bVar != f30637l && bVar != f30638m) {
                this.f30653i = 1.0f;
                return;
            } else {
                this.f30653i = 0.00390625f;
                return;
            }
        }
        this.f30653i = 0.1f;
    }

    public final void a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f30650f) {
                b();
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }

    public final void b() {
        int i10 = 0;
        this.f30650f = false;
        ThreadLocal threadLocal = c.f30628f;
        if (threadLocal.get() == null) {
            threadLocal.set(new c());
        }
        c cVar = (c) threadLocal.get();
        cVar.f30629a.remove(this);
        ArrayList arrayList = cVar.f30630b;
        int indexOf = arrayList.indexOf(this);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
            cVar.f30633e = true;
        }
        this.f30652h = 0L;
        this.f30647c = false;
        while (true) {
            ArrayList arrayList2 = this.f30654j;
            if (i10 < arrayList2.size()) {
                if (arrayList2.get(i10) == null) {
                    i10++;
                } else {
                    a3.a.u(arrayList2.get(i10));
                    throw null;
                }
            } else {
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    if (arrayList2.get(size) == null) {
                        arrayList2.remove(size);
                    }
                }
                return;
            }
        }
    }

    public final void c(float f10) {
        this.f30649e.m0(f10, this.f30648d);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f30655k;
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) != null) {
                    f fVar = (f) arrayList.get(i10);
                    float f11 = this.f30645a;
                    ws.d dVar = (ws.d) fVar;
                    int i11 = dVar.f39420a;
                    ws.f fVar2 = dVar.f39421b;
                    switch (i11) {
                        case 0:
                            ws.e eVar = (ws.e) fVar2;
                            Rect f12 = eVar.f();
                            if (eVar.f39427c < f12.left || f12.right < eVar.f39428d) {
                                eVar.d(f12, f11);
                                break;
                            } else {
                                break;
                            }
                        default:
                            ws.i iVar = (ws.i) fVar2;
                            ObjectAnimator objectAnimator = ws.i.f39439i;
                            Rect f13 = iVar.f();
                            if (iVar.f39444c < f13.top || f13.bottom < iVar.f39445d) {
                                iVar.d(f13, f11);
                                break;
                            } else {
                                break;
                            }
                    }
                }
                i10++;
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
        }
    }

    public void d() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            boolean z10 = this.f30650f;
            if (!z10 && !z10) {
                this.f30650f = true;
                if (!this.f30647c) {
                    this.f30646b = this.f30649e.E(this.f30648d);
                }
                float f10 = this.f30646b;
                if (f10 <= Float.MAX_VALUE && f10 >= this.f30651g) {
                    ThreadLocal threadLocal = c.f30628f;
                    if (threadLocal.get() == null) {
                        threadLocal.set(new c());
                    }
                    c cVar = (c) threadLocal.get();
                    ArrayList arrayList = cVar.f30630b;
                    if (arrayList.size() == 0) {
                        if (cVar.f30632d == null) {
                            cVar.f30632d = new b(cVar.f30631c);
                        }
                        cVar.f30632d.h();
                    }
                    if (!arrayList.contains(this)) {
                        arrayList.add(this);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }

    public abstract boolean e(long j10);
}
