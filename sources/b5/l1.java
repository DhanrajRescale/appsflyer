package b5;

import com.google.android.gms.common.api.Api;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class l1 {

    /* renamed from: e, reason: collision with root package name */
    public int f3410e;

    /* renamed from: f, reason: collision with root package name */
    public int f3411f;

    /* renamed from: g, reason: collision with root package name */
    public int f3412g;

    /* renamed from: h, reason: collision with root package name */
    public int f3413h;

    /* renamed from: l, reason: collision with root package name */
    public lp.o0 f3417l;

    /* renamed from: m, reason: collision with root package name */
    public int f3418m;

    /* renamed from: n, reason: collision with root package name */
    public lp.o0 f3419n;

    /* renamed from: o, reason: collision with root package name */
    public int f3420o;

    /* renamed from: p, reason: collision with root package name */
    public int f3421p;

    /* renamed from: q, reason: collision with root package name */
    public int f3422q;

    /* renamed from: r, reason: collision with root package name */
    public lp.o0 f3423r;

    /* renamed from: s, reason: collision with root package name */
    public lp.o0 f3424s;

    /* renamed from: t, reason: collision with root package name */
    public int f3425t;

    /* renamed from: u, reason: collision with root package name */
    public int f3426u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3427v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3428w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3429x;

    /* renamed from: y, reason: collision with root package name */
    public HashMap f3430y;

    /* renamed from: z, reason: collision with root package name */
    public HashSet f3431z;

    /* renamed from: a, reason: collision with root package name */
    public int f3406a = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: b, reason: collision with root package name */
    public int f3407b = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: c, reason: collision with root package name */
    public int f3408c = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: d, reason: collision with root package name */
    public int f3409d = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: i, reason: collision with root package name */
    public int f3414i = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: j, reason: collision with root package name */
    public int f3415j = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3416k = true;

    public l1() {
        lp.l0 l0Var = lp.o0.f25025b;
        lp.j1 j1Var = lp.j1.f24998e;
        this.f3417l = j1Var;
        this.f3418m = 0;
        this.f3419n = j1Var;
        this.f3420o = 0;
        this.f3421p = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f3422q = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f3423r = j1Var;
        this.f3424s = j1Var;
        this.f3425t = 0;
        this.f3426u = 0;
        this.f3427v = false;
        this.f3428w = false;
        this.f3429x = false;
        this.f3430y = new HashMap();
        this.f3431z = new HashSet();
    }

    public void a(int i10) {
        Iterator it = this.f3430y.values().iterator();
        while (it.hasNext()) {
            if (((k1) it.next()).f3397a.f3378c == i10) {
                it.remove();
            }
        }
    }

    public final void b(m1 m1Var) {
        this.f3406a = m1Var.f3463a;
        this.f3407b = m1Var.f3464b;
        this.f3408c = m1Var.f3465c;
        this.f3409d = m1Var.f3466d;
        this.f3410e = m1Var.f3467e;
        this.f3411f = m1Var.f3468f;
        this.f3412g = m1Var.f3469g;
        this.f3413h = m1Var.f3470h;
        this.f3414i = m1Var.f3471i;
        this.f3415j = m1Var.f3472j;
        this.f3416k = m1Var.f3473k;
        this.f3417l = m1Var.f3474l;
        this.f3418m = m1Var.f3475m;
        this.f3419n = m1Var.f3476n;
        this.f3420o = m1Var.f3477o;
        this.f3421p = m1Var.f3478p;
        this.f3422q = m1Var.f3479q;
        this.f3423r = m1Var.f3480r;
        this.f3424s = m1Var.f3481s;
        this.f3425t = m1Var.f3482t;
        this.f3426u = m1Var.f3483u;
        this.f3427v = m1Var.f3484v;
        this.f3428w = m1Var.f3485w;
        this.f3429x = m1Var.f3486x;
        this.f3431z = new HashSet(m1Var.f3488z);
        this.f3430y = new HashMap(m1Var.f3487y);
    }

    public l1 c(int i10, int i11) {
        this.f3414i = i10;
        this.f3415j = i11;
        this.f3416k = true;
        return this;
    }
}
