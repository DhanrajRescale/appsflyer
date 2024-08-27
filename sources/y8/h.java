package y8;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.lifecycle.t;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import okhttp3.Headers;
import qu.b0;
import vt.i0;
import vt.p0;

/* loaded from: classes.dex */
public final class h {
    public b0 A;
    public final t9.c B;
    public final w8.c C;
    public Integer D;
    public Drawable E;
    public Integer F;
    public Drawable G;
    public Integer H;
    public Drawable I;
    public final androidx.lifecycle.o J;
    public z8.h K;
    public z8.f L;
    public androidx.lifecycle.o M;
    public z8.h N;
    public z8.f O;

    /* renamed from: a, reason: collision with root package name */
    public final Context f41336a;

    /* renamed from: b, reason: collision with root package name */
    public c f41337b;

    /* renamed from: c, reason: collision with root package name */
    public Object f41338c;

    /* renamed from: d, reason: collision with root package name */
    public a9.a f41339d;

    /* renamed from: e, reason: collision with root package name */
    public i f41340e;

    /* renamed from: f, reason: collision with root package name */
    public w8.c f41341f;

    /* renamed from: g, reason: collision with root package name */
    public String f41342g;

    /* renamed from: h, reason: collision with root package name */
    public final Bitmap.Config f41343h;

    /* renamed from: i, reason: collision with root package name */
    public final ColorSpace f41344i;

    /* renamed from: j, reason: collision with root package name */
    public z8.d f41345j;

    /* renamed from: k, reason: collision with root package name */
    public final Pair f41346k;

    /* renamed from: l, reason: collision with root package name */
    public final p8.c f41347l;

    /* renamed from: m, reason: collision with root package name */
    public List f41348m;

    /* renamed from: n, reason: collision with root package name */
    public c9.e f41349n;

    /* renamed from: o, reason: collision with root package name */
    public final Headers.Builder f41350o;

    /* renamed from: p, reason: collision with root package name */
    public final LinkedHashMap f41351p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f41352q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f41353r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f41354s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f41355t;

    /* renamed from: u, reason: collision with root package name */
    public b f41356u;

    /* renamed from: v, reason: collision with root package name */
    public b f41357v;

    /* renamed from: w, reason: collision with root package name */
    public final b f41358w;

    /* renamed from: x, reason: collision with root package name */
    public final b0 f41359x;

    /* renamed from: y, reason: collision with root package name */
    public b0 f41360y;

    /* renamed from: z, reason: collision with root package name */
    public b0 f41361z;

    public h(Context context) {
        this.f41336a = context;
        this.f41337b = d9.d.f14220a;
        this.f41338c = null;
        this.f41339d = null;
        this.f41340e = null;
        this.f41341f = null;
        this.f41342g = null;
        this.f41343h = null;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f41344i = null;
        }
        this.f41345j = null;
        this.f41346k = null;
        this.f41347l = null;
        this.f41348m = i0.f38321a;
        this.f41349n = null;
        this.f41350o = null;
        this.f41351p = null;
        this.f41352q = true;
        this.f41353r = null;
        this.f41354s = null;
        this.f41355t = true;
        this.f41356u = null;
        this.f41357v = null;
        this.f41358w = null;
        this.f41359x = null;
        this.f41360y = null;
        this.f41361z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = null;
    }

    public final j a() {
        Headers headers;
        q qVar;
        q qVar2;
        boolean z10;
        boolean z11;
        c9.e eVar;
        z8.h hVar;
        z8.f fVar;
        n nVar;
        n nVar2;
        Context context = this.f41336a;
        Object obj = this.f41338c;
        if (obj == null) {
            obj = l.f41388a;
        }
        Object obj2 = obj;
        a9.a aVar = this.f41339d;
        i iVar = this.f41340e;
        w8.c cVar = this.f41341f;
        String str = this.f41342g;
        Bitmap.Config config = this.f41343h;
        if (config == null) {
            config = this.f41337b.f41307g;
        }
        Bitmap.Config config2 = config;
        ColorSpace colorSpace = this.f41344i;
        z8.d dVar = this.f41345j;
        if (dVar == null) {
            dVar = this.f41337b.f41306f;
        }
        z8.d dVar2 = dVar;
        Pair pair = this.f41346k;
        p8.c cVar2 = this.f41347l;
        List list = this.f41348m;
        c9.e eVar2 = this.f41349n;
        if (eVar2 == null) {
            eVar2 = this.f41337b.f41305e;
        }
        c9.e eVar3 = eVar2;
        Headers.Builder builder = this.f41350o;
        if (builder != null) {
            headers = builder.build();
        } else {
            headers = null;
        }
        if (headers == null) {
            headers = d9.e.f14223c;
        } else {
            Bitmap.Config[] configArr = d9.e.f14221a;
        }
        Headers headers2 = headers;
        LinkedHashMap linkedHashMap = this.f41351p;
        if (linkedHashMap != null) {
            qVar = new q(yk.o.Y(linkedHashMap));
        } else {
            qVar = null;
        }
        if (qVar == null) {
            qVar2 = q.f41413b;
        } else {
            qVar2 = qVar;
        }
        boolean z12 = this.f41352q;
        Boolean bool = this.f41353r;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            z10 = this.f41337b.f41308h;
        }
        boolean z13 = z10;
        Boolean bool2 = this.f41354s;
        if (bool2 != null) {
            z11 = bool2.booleanValue();
        } else {
            z11 = this.f41337b.f41309i;
        }
        boolean z14 = z11;
        boolean z15 = this.f41355t;
        b bVar = this.f41356u;
        if (bVar == null) {
            bVar = this.f41337b.f41313m;
        }
        b bVar2 = bVar;
        b bVar3 = this.f41357v;
        if (bVar3 == null) {
            bVar3 = this.f41337b.f41314n;
        }
        b bVar4 = bVar3;
        b bVar5 = this.f41358w;
        if (bVar5 == null) {
            bVar5 = this.f41337b.f41315o;
        }
        b bVar6 = bVar5;
        b0 b0Var = this.f41359x;
        if (b0Var == null) {
            b0Var = this.f41337b.f41301a;
        }
        b0 b0Var2 = b0Var;
        b0 b0Var3 = this.f41360y;
        if (b0Var3 == null) {
            b0Var3 = this.f41337b.f41302b;
        }
        b0 b0Var4 = b0Var3;
        b0 b0Var5 = this.f41361z;
        if (b0Var5 == null) {
            b0Var5 = this.f41337b.f41303c;
        }
        b0 b0Var6 = b0Var5;
        b0 b0Var7 = this.A;
        if (b0Var7 == null) {
            b0Var7 = this.f41337b.f41304d;
        }
        b0 b0Var8 = b0Var7;
        androidx.lifecycle.o oVar = this.J;
        Context context2 = this.f41336a;
        if (oVar == null && (oVar = this.M) == null) {
            eVar = eVar3;
            Object obj3 = context2;
            while (true) {
                if (obj3 instanceof t) {
                    oVar = ((t) obj3).getLifecycle();
                    break;
                }
                if (!(obj3 instanceof ContextWrapper)) {
                    oVar = null;
                    break;
                }
                obj3 = ((ContextWrapper) obj3).getBaseContext();
            }
            if (oVar == null) {
                oVar = g.f41334b;
            }
        } else {
            eVar = eVar3;
        }
        androidx.lifecycle.o oVar2 = oVar;
        z8.h hVar2 = this.K;
        if (hVar2 == null) {
            z8.h hVar3 = this.N;
            if (hVar3 == null) {
                hVar3 = new z8.c(context2);
            }
            hVar = hVar3;
        } else {
            hVar = hVar2;
        }
        z8.f fVar2 = this.L;
        if (fVar2 == null && (fVar2 = this.O) == null) {
            if (hVar2 instanceof z8.i) {
            }
            fVar = z8.f.f42184b;
        } else {
            fVar = fVar2;
        }
        t9.c cVar3 = this.B;
        if (cVar3 != null) {
            nVar = new n(yk.o.Y((Map) cVar3.f35633b));
        } else {
            nVar = null;
        }
        if (nVar == null) {
            nVar2 = n.f41404b;
        } else {
            nVar2 = nVar;
        }
        return new j(context, obj2, aVar, iVar, cVar, str, config2, colorSpace, dVar2, pair, cVar2, list, eVar, headers2, qVar2, z12, z13, z14, z15, bVar2, bVar4, bVar6, b0Var2, b0Var4, b0Var6, b0Var8, oVar2, hVar, fVar, nVar2, this.C, this.D, this.E, this.F, this.G, this.H, this.I, new d(this.J, this.K, this.L, this.f41359x, this.f41360y, this.f41361z, this.A, this.f41349n, this.f41345j, this.f41343h, this.f41353r, this.f41354s, this.f41356u, this.f41357v, this.f41358w), this.f41337b);
    }

    public final void b() {
        this.f41349n = new c9.a(100);
    }

    public final void c(Object obj) {
        this.f41338c = obj;
    }

    public h(j jVar, Context context) {
        this.f41336a = context;
        this.f41337b = jVar.M;
        this.f41338c = jVar.f41363b;
        this.f41339d = jVar.f41364c;
        this.f41340e = jVar.f41365d;
        this.f41341f = jVar.f41366e;
        this.f41342g = jVar.f41367f;
        d dVar = jVar.L;
        this.f41343h = dVar.f41325j;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f41344i = jVar.f41369h;
        }
        this.f41345j = dVar.f41324i;
        this.f41346k = jVar.f41371j;
        this.f41347l = jVar.f41372k;
        this.f41348m = jVar.f41373l;
        this.f41349n = dVar.f41323h;
        this.f41350o = jVar.f41375n.newBuilder();
        this.f41351p = p0.m(jVar.f41376o.f41414a);
        this.f41352q = jVar.f41377p;
        this.f41353r = dVar.f41326k;
        this.f41354s = dVar.f41327l;
        this.f41355t = jVar.f41380s;
        this.f41356u = dVar.f41328m;
        this.f41357v = dVar.f41329n;
        this.f41358w = dVar.f41330o;
        this.f41359x = dVar.f41319d;
        this.f41360y = dVar.f41320e;
        this.f41361z = dVar.f41321f;
        this.A = dVar.f41322g;
        n nVar = jVar.D;
        nVar.getClass();
        this.B = new t9.c(nVar);
        this.C = jVar.E;
        this.D = jVar.F;
        this.E = jVar.G;
        this.F = jVar.H;
        this.G = jVar.I;
        this.H = jVar.J;
        this.I = jVar.K;
        this.J = dVar.f41316a;
        this.K = dVar.f41317b;
        this.L = dVar.f41318c;
        if (jVar.f41362a == context) {
            this.M = jVar.A;
            this.N = jVar.B;
            this.O = jVar.C;
        } else {
            this.M = null;
            this.N = null;
            this.O = null;
        }
    }
}
