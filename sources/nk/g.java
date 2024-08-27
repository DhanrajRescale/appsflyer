package nk;

import ak.e0;
import ak.k;
import ak.r;
import ak.v;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import androidx.work.u;
import bl.j;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import okhttp3.HttpUrl;
import y3.i;

/* loaded from: classes.dex */
public final class g implements b, ok.f, f {
    public static final boolean D = Log.isLoggable("Request", 2);
    public boolean A;
    public final RuntimeException B;
    public int C;

    /* renamed from: a, reason: collision with root package name */
    public final String f28793a;

    /* renamed from: b, reason: collision with root package name */
    public final sk.e f28794b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f28795c;

    /* renamed from: d, reason: collision with root package name */
    public final d f28796d;

    /* renamed from: e, reason: collision with root package name */
    public final c f28797e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f28798f;

    /* renamed from: g, reason: collision with root package name */
    public final com.bumptech.glide.d f28799g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f28800h;

    /* renamed from: i, reason: collision with root package name */
    public final Class f28801i;

    /* renamed from: j, reason: collision with root package name */
    public final a f28802j;

    /* renamed from: k, reason: collision with root package name */
    public final int f28803k;

    /* renamed from: l, reason: collision with root package name */
    public final int f28804l;

    /* renamed from: m, reason: collision with root package name */
    public final com.bumptech.glide.e f28805m;

    /* renamed from: n, reason: collision with root package name */
    public final ok.g f28806n;

    /* renamed from: o, reason: collision with root package name */
    public final List f28807o;

    /* renamed from: p, reason: collision with root package name */
    public final u f28808p;

    /* renamed from: q, reason: collision with root package name */
    public final Executor f28809q;

    /* renamed from: r, reason: collision with root package name */
    public e0 f28810r;

    /* renamed from: s, reason: collision with root package name */
    public k f28811s;

    /* renamed from: t, reason: collision with root package name */
    public long f28812t;

    /* renamed from: u, reason: collision with root package name */
    public volatile r f28813u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f28814v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f28815w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f28816x;

    /* renamed from: y, reason: collision with root package name */
    public int f28817y;

    /* renamed from: z, reason: collision with root package name */
    public int f28818z;

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, sk.e] */
    public g(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class cls, a aVar, int i10, int i11, com.bumptech.glide.e eVar, ok.g gVar, ArrayList arrayList, h hVar, r rVar, u uVar, i iVar) {
        String str;
        if (D) {
            str = String.valueOf(hashCode());
        } else {
            str = null;
        }
        this.f28793a = str;
        this.f28794b = new Object();
        this.f28795c = obj;
        this.f28798f = context;
        this.f28799g = dVar;
        this.f28800h = obj2;
        this.f28801i = cls;
        this.f28802j = aVar;
        this.f28803k = i10;
        this.f28804l = i11;
        this.f28805m = eVar;
        this.f28806n = gVar;
        this.f28796d = null;
        this.f28807o = arrayList;
        this.f28797e = hVar;
        this.f28813u = rVar;
        this.f28808p = uVar;
        this.f28809q = iVar;
        this.C = 1;
        if (this.B == null && dVar.f10808h) {
            this.B = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // nk.b
    public final boolean a() {
        boolean z10;
        synchronized (this.f28795c) {
            if (this.C == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // nk.b
    public final boolean b(b bVar) {
        int i10;
        int i11;
        Object obj;
        Class cls;
        a aVar;
        com.bumptech.glide.e eVar;
        int i12;
        int i13;
        int i14;
        Object obj2;
        Class cls2;
        a aVar2;
        com.bumptech.glide.e eVar2;
        int i15;
        if (!(bVar instanceof g)) {
            return false;
        }
        synchronized (this.f28795c) {
            try {
                i10 = this.f28803k;
                i11 = this.f28804l;
                obj = this.f28800h;
                cls = this.f28801i;
                aVar = this.f28802j;
                eVar = this.f28805m;
                List list = this.f28807o;
                if (list != null) {
                    i12 = list.size();
                } else {
                    i12 = 0;
                }
            } finally {
            }
        }
        g gVar = (g) bVar;
        synchronized (gVar.f28795c) {
            try {
                i13 = gVar.f28803k;
                i14 = gVar.f28804l;
                obj2 = gVar.f28800h;
                cls2 = gVar.f28801i;
                aVar2 = gVar.f28802j;
                eVar2 = gVar.f28805m;
                List list2 = gVar.f28807o;
                if (list2 != null) {
                    i15 = list2.size();
                } else {
                    i15 = 0;
                }
            } finally {
            }
        }
        if (i10 == i13 && i11 == i14) {
            char[] cArr = rk.k.f33950a;
            if (obj != null ? obj.equals(obj2) : obj2 == null) {
                if (cls.equals(cls2) && aVar.equals(aVar2) && eVar == eVar2 && i12 == i15) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void c() {
        if (!this.A) {
            this.f28794b.a();
            this.f28806n.d(this);
            k kVar = this.f28811s;
            if (kVar != null) {
                synchronized (((r) kVar.f519c)) {
                    ((v) kVar.f517a).h((f) kVar.f518b);
                }
                this.f28811s = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    @Override // nk.b
    public final void clear() {
        synchronized (this.f28795c) {
            try {
                if (!this.A) {
                    this.f28794b.a();
                    if (this.C == 6) {
                        return;
                    }
                    c();
                    e0 e0Var = this.f28810r;
                    if (e0Var != null) {
                        this.f28810r = null;
                    } else {
                        e0Var = null;
                    }
                    c cVar = this.f28797e;
                    if (cVar == null || ((h) cVar).i(this)) {
                        this.f28806n.h(e());
                    }
                    this.C = 6;
                    if (e0Var != null) {
                        this.f28813u.getClass();
                        r.f(e0Var);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // nk.b
    public final void d() {
        synchronized (this.f28795c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Drawable e() {
        int i10;
        if (this.f28815w == null) {
            a aVar = this.f28802j;
            Drawable drawable = aVar.f28773g;
            this.f28815w = drawable;
            if (drawable == null && (i10 = aVar.f28774h) > 0) {
                this.f28815w = j(i10);
            }
        }
        return this.f28815w;
    }

    @Override // nk.b
    public final boolean f() {
        boolean z10;
        synchronized (this.f28795c) {
            if (this.C == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // nk.b
    public final void g() {
        c cVar;
        int i10;
        synchronized (this.f28795c) {
            try {
                if (!this.A) {
                    this.f28794b.a();
                    int i11 = rk.f.f33941b;
                    this.f28812t = SystemClock.elapsedRealtimeNanos();
                    int i12 = 3;
                    if (this.f28800h == null) {
                        if (rk.k.h(this.f28803k, this.f28804l)) {
                            this.f28817y = this.f28803k;
                            this.f28818z = this.f28804l;
                        }
                        if (this.f28816x == null) {
                            a aVar = this.f28802j;
                            Drawable drawable = aVar.f28781o;
                            this.f28816x = drawable;
                            if (drawable == null && (i10 = aVar.f28782p) > 0) {
                                this.f28816x = j(i10);
                            }
                        }
                        if (this.f28816x == null) {
                            i12 = 5;
                        }
                        l(new GlideException("Received null model"), i12);
                        return;
                    }
                    int i13 = this.C;
                    if (i13 != 2) {
                        if (i13 == 4) {
                            n(xj.a.f40290e, this.f28810r);
                            return;
                        }
                        this.C = 3;
                        if (rk.k.h(this.f28803k, this.f28804l)) {
                            o(this.f28803k, this.f28804l);
                        } else {
                            this.f28806n.b(this);
                        }
                        int i14 = this.C;
                        if ((i14 == 2 || i14 == 3) && ((cVar = this.f28797e) == null || ((h) cVar).e(this))) {
                            this.f28806n.f(e());
                        }
                        if (D) {
                            k("finished run method in " + rk.f.a(this.f28812t));
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // nk.b
    public final boolean h() {
        boolean z10;
        synchronized (this.f28795c) {
            if (this.C == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean i() {
        c cVar = this.f28797e;
        if (cVar != null && cVar.c().a()) {
            return false;
        }
        return true;
    }

    @Override // nk.b
    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f28795c) {
            int i10 = this.C;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    public final Drawable j(int i10) {
        Resources.Theme theme = this.f28802j.f28787u;
        if (theme == null) {
            theme = this.f28798f.getTheme();
        }
        com.bumptech.glide.d dVar = this.f28799g;
        return j.C(dVar, dVar, i10, theme);
    }

    public final void k(String str) {
        StringBuilder r10 = da.e.r(str, " this: ");
        r10.append(this.f28793a);
        Log.v("Request", r10.toString());
    }

    public final void l(GlideException glideException, int i10) {
        int i11;
        int i12;
        this.f28794b.a();
        synchronized (this.f28795c) {
            try {
                glideException.getClass();
                int i13 = this.f28799g.f10809i;
                if (i13 <= i10) {
                    Log.w("Glide", "Load failed for " + this.f28800h + " with size [" + this.f28817y + "x" + this.f28818z + "]", glideException);
                    if (i13 <= 4) {
                        glideException.e();
                    }
                }
                Drawable drawable = null;
                this.f28811s = null;
                this.C = 5;
                this.A = true;
                try {
                    List<d> list = this.f28807o;
                    if (list != null) {
                        for (d dVar : list) {
                            Object obj = this.f28800h;
                            i();
                            dVar.b(obj);
                        }
                    }
                    d dVar2 = this.f28796d;
                    if (dVar2 != null) {
                        Object obj2 = this.f28800h;
                        i();
                        dVar2.b(obj2);
                    }
                    c cVar = this.f28797e;
                    if (cVar == null || ((h) cVar).e(this)) {
                        if (this.f28800h == null) {
                            if (this.f28816x == null) {
                                a aVar = this.f28802j;
                                Drawable drawable2 = aVar.f28781o;
                                this.f28816x = drawable2;
                                if (drawable2 == null && (i12 = aVar.f28782p) > 0) {
                                    this.f28816x = j(i12);
                                }
                            }
                            drawable = this.f28816x;
                        }
                        if (drawable == null) {
                            if (this.f28814v == null) {
                                a aVar2 = this.f28802j;
                                Drawable drawable3 = aVar2.f28771e;
                                this.f28814v = drawable3;
                                if (drawable3 == null && (i11 = aVar2.f28772f) > 0) {
                                    this.f28814v = j(i11);
                                }
                            }
                            drawable = this.f28814v;
                        }
                        if (drawable == null) {
                            drawable = e();
                        }
                        this.f28806n.c(drawable);
                    }
                    this.A = false;
                    c cVar2 = this.f28797e;
                    if (cVar2 != null) {
                        ((h) cVar2).k(this);
                    }
                } catch (Throwable th2) {
                    this.A = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void m(e0 e0Var, Object obj, xj.a aVar) {
        i();
        this.C = 4;
        this.f28810r = e0Var;
        if (this.f28799g.f10809i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + aVar + " for " + this.f28800h + " with size [" + this.f28817y + "x" + this.f28818z + "] in " + rk.f.a(this.f28812t) + " ms");
        }
        this.A = true;
        try {
            List list = this.f28807o;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).a(obj);
                }
            }
            d dVar = this.f28796d;
            if (dVar != null) {
                dVar.a(obj);
            }
            this.f28808p.getClass();
            this.f28806n.a(obj);
            this.A = false;
            c cVar = this.f28797e;
            if (cVar != null) {
                ((h) cVar).l(this);
            }
        } catch (Throwable th2) {
            this.A = false;
            throw th2;
        }
    }

    public final void n(xj.a aVar, e0 e0Var) {
        Object obj;
        String str;
        this.f28794b.a();
        e0 e0Var2 = null;
        try {
            try {
                synchronized (this.f28795c) {
                    try {
                        this.f28811s = null;
                        if (e0Var == null) {
                            l(new GlideException("Expected to receive a Resource<R> with an object of " + this.f28801i + " inside, but instead got null."), 5);
                            return;
                        }
                        Object obj2 = e0Var.get();
                        if (obj2 != null && this.f28801i.isAssignableFrom(obj2.getClass())) {
                            c cVar = this.f28797e;
                            if (cVar != null && !((h) cVar).j(this)) {
                                this.f28810r = null;
                                this.C = 4;
                                this.f28813u.getClass();
                                r.f(e0Var);
                                return;
                            }
                            m(e0Var, obj2, aVar);
                            return;
                        }
                        this.f28810r = null;
                        StringBuilder sb2 = new StringBuilder("Expected to receive an object of ");
                        sb2.append(this.f28801i);
                        sb2.append(" but instead got ");
                        if (obj2 != null) {
                            obj = obj2.getClass();
                        } else {
                            obj = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        sb2.append(obj);
                        sb2.append(UrlTreeKt.componentParamPrefix);
                        sb2.append(obj2);
                        sb2.append("} inside Resource{");
                        sb2.append(e0Var);
                        sb2.append("}.");
                        if (obj2 != null) {
                            str = HttpUrl.FRAGMENT_ENCODE_SET;
                        } else {
                            str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                        }
                        sb2.append(str);
                        l(new GlideException(sb2.toString()), 5);
                        this.f28813u.getClass();
                        r.f(e0Var);
                    } catch (Throwable th2) {
                        th = th2;
                        e0Var = null;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            th = th3;
                            e0Var2 = e0Var;
                            if (e0Var2 != null) {
                                this.f28813u.getClass();
                                r.f(e0Var2);
                            }
                            throw th;
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final void o(int i10, int i11) {
        Object obj;
        int round;
        int i12 = i10;
        this.f28794b.a();
        Object obj2 = this.f28795c;
        synchronized (obj2) {
            try {
                try {
                    boolean z10 = D;
                    if (z10) {
                        k("Got onSizeReady in " + rk.f.a(this.f28812t));
                    }
                    if (this.C == 3) {
                        this.C = 2;
                        float f10 = this.f28802j.f28768b;
                        if (i12 != Integer.MIN_VALUE) {
                            i12 = Math.round(i12 * f10);
                        }
                        this.f28817y = i12;
                        if (i11 == Integer.MIN_VALUE) {
                            round = i11;
                        } else {
                            round = Math.round(f10 * i11);
                        }
                        this.f28818z = round;
                        if (z10) {
                            k("finished setup for calling load in " + rk.f.a(this.f28812t));
                        }
                        r rVar = this.f28813u;
                        com.bumptech.glide.d dVar = this.f28799g;
                        Object obj3 = this.f28800h;
                        a aVar = this.f28802j;
                        try {
                            obj = obj2;
                            try {
                                this.f28811s = rVar.a(dVar, obj3, aVar.f28778l, this.f28817y, this.f28818z, aVar.f28785s, this.f28801i, this.f28805m, aVar.f28769c, aVar.f28784r, aVar.f28779m, aVar.f28791y, aVar.f28783q, aVar.f28775i, aVar.f28789w, aVar.f28792z, aVar.f28790x, this, this.f28809q);
                                if (this.C != 2) {
                                    this.f28811s = null;
                                }
                                if (z10) {
                                    k("finished onSizeReady in " + rk.f.a(this.f28812t));
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            obj = obj2;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    obj = obj2;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }
}
