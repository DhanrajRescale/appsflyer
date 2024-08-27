package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.h1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import tu.k1;
import tu.l1;

/* loaded from: classes.dex */
public abstract class t {
    public final ArrayList A;
    public final ut.g B;
    public final tu.w0 C;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2304a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f2305b;

    /* renamed from: c, reason: collision with root package name */
    public f0 f2306c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f2307d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable[] f2308e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2309f;

    /* renamed from: g, reason: collision with root package name */
    public final vt.q f2310g;

    /* renamed from: h, reason: collision with root package name */
    public final k1 f2311h;

    /* renamed from: i, reason: collision with root package name */
    public final k1 f2312i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f2313j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f2314k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f2315l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f2316m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.lifecycle.t f2317n;

    /* renamed from: o, reason: collision with root package name */
    public NavControllerViewModel f2318o;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f2319p;

    /* renamed from: q, reason: collision with root package name */
    public androidx.lifecycle.n f2320q;

    /* renamed from: r, reason: collision with root package name */
    public final p f2321r;

    /* renamed from: s, reason: collision with root package name */
    public final androidx.activity.x f2322s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f2323t;

    /* renamed from: u, reason: collision with root package name */
    public final w0 f2324u;

    /* renamed from: v, reason: collision with root package name */
    public final LinkedHashMap f2325v;

    /* renamed from: w, reason: collision with root package name */
    public Function1 f2326w;

    /* renamed from: x, reason: collision with root package name */
    public Function1 f2327x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashMap f2328y;

    /* renamed from: z, reason: collision with root package name */
    public int f2329z;

    public t(Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f2304a = context;
        Iterator it = pu.m.d(c.f2161c, context).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.f2305b = (Activity) obj;
        this.f2310g = new vt.q();
        vt.i0 i0Var = vt.i0.f38321a;
        this.f2311h = l1.a(i0Var);
        this.f2312i = l1.a(i0Var);
        this.f2313j = new LinkedHashMap();
        this.f2314k = new LinkedHashMap();
        this.f2315l = new LinkedHashMap();
        this.f2316m = new LinkedHashMap();
        this.f2319p = new CopyOnWriteArrayList();
        this.f2320q = androidx.lifecycle.n.f1948b;
        this.f2321r = new p(this, 0);
        this.f2322s = new androidx.activity.x(this);
        this.f2323t = true;
        w0 w0Var = new w0();
        this.f2324u = w0Var;
        this.f2325v = new LinkedHashMap();
        this.f2328y = new LinkedHashMap();
        w0Var.a(new g0(w0Var));
        w0Var.a(new d(this.f2304a));
        this.A = new ArrayList();
        this.B = ut.h.a(new m(this, 2));
        su.a aVar = su.a.f34776a;
        this.C = tu.x0.b(1, 0, 2);
    }

    public static c0 d(c0 c0Var, int i10) {
        f0 f0Var;
        if (c0Var.f2181h == i10) {
            return c0Var;
        }
        if (c0Var instanceof f0) {
            f0Var = (f0) c0Var;
        } else {
            f0Var = c0Var.f2175b;
            Intrinsics.c(f0Var);
        }
        return f0Var.o(i10, true);
    }

    public static /* synthetic */ void t(t tVar, n nVar) {
        tVar.s(nVar, false, new vt.q());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (g() > 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A() {
        /*
            r2 = this;
            boolean r0 = r2.f2323t
            if (r0 == 0) goto Lc
            int r0 = r2.g()
            r1 = 1
            if (r0 <= r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            androidx.activity.x r0 = r2.f2322s
            r0.setEnabled(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.t.A():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017d, code lost:
    
        r5 = r4.previous();
        r7 = ((androidx.navigation.n) r5).f2258b;
        r8 = r16.f2306c;
        kotlin.jvm.internal.Intrinsics.c(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x018f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r7, r8) == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0191, code lost:
    
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0192, code lost:
    
        r12 = (androidx.navigation.n) r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0194, code lost:
    
        if (r12 != null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0196, code lost:
    
        r4 = androidx.navigation.n.f2256m;
        r4 = r16.f2306c;
        kotlin.jvm.internal.Intrinsics.c(r4);
        r5 = r16.f2306c;
        kotlin.jvm.internal.Intrinsics.c(r5);
        r12 = mt.p.q(r11, r4, r5.e(r18), i(), r16.f2318o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01b0, code lost:
    
        r6.g(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01b3, code lost:
    
        r2 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01bb, code lost:
    
        if (r2.hasNext() == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01bd, code lost:
    
        r4 = (androidx.navigation.n) r2.next();
        r5 = r16.f2325v.get(r16.f2324u.b(r4.f2258b.f2174a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01d3, code lost:
    
        if (r5 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01d5, code lost:
    
        ((androidx.navigation.q) r5).a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01f3, code lost:
    
        throw new java.lang.IllegalStateException(nn.d.o(new java.lang.StringBuilder("NavigatorBackStack for "), r17.f2174a, " should already be created").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01f4, code lost:
    
        r9.addAll(r6);
        r9.h(r19);
        r1 = vt.g0.J(r19, r6).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0206, code lost:
    
        if (r1.hasNext() == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0208, code lost:
    
        r2 = (androidx.navigation.n) r1.next();
        r3 = r2.f2258b.f2175b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0212, code lost:
    
        if (r3 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0214, code lost:
    
        k(r2, e(r3.f2181h));
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x021e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0166, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0147, code lost:
    
        r5 = r9.f38331b[r9.f38330a];
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x00a2, code lost:
    
        r10 = ((androidx.navigation.n) r6.first()).f2258b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r6 = new vt.q();
        r10 = r17 instanceof androidx.navigation.f0;
        r11 = r16.f2304a;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r10 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r10 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        kotlin.jvm.internal.Intrinsics.c(r10);
        r10 = r10.f2175b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r10 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        r13 = r20.listIterator(r20.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r13.hasPrevious() == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        r14 = r13.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(((androidx.navigation.n) r14).f2258b, r10) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        r14 = (androidx.navigation.n) r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (r14 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        r13 = androidx.navigation.n.f2256m;
        r14 = mt.p.q(r11, r10, r18, i(), r16.f2318o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        r6.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        if ((!r9.isEmpty()) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0012, code lost:
    
        if (r6 == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        if (((androidx.navigation.n) r9.last()).f2258b != r10) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
    
        t(r16, (androidx.navigation.n) r9.last());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        if (r10 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        if (r10 != r17) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        if (r6.isEmpty() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
    
        r10 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
    
        if (r10 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b2, code lost:
    
        if (c(r10.f2181h) == r10) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b4, code lost:
    
        r10 = r10.f2175b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b6, code lost:
    
        if (r10 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b8, code lost:
    
        if (r18 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r9.isEmpty() != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00be, code lost:
    
        if (r18.isEmpty() != r7) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c0, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c3, code lost:
    
        r14 = r20.listIterator(r20.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cf, code lost:
    
        if (r14.hasPrevious() == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d1, code lost:
    
        r15 = r14.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00de, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(((androidx.navigation.n) r15).f2258b, r10) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e4, code lost:
    
        r15 = (androidx.navigation.n) r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e6, code lost:
    
        if (r15 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e8, code lost:
    
        r7 = androidx.navigation.n.f2256m;
        r15 = mt.p.q(r11, r10, r10.e(r13), i(), r16.f2318o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f8, code lost:
    
        r6.g(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fb, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e3, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c2, code lost:
    
        r13 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if ((((androidx.navigation.n) r9.last()).f2258b instanceof androidx.navigation.f) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0101, code lost:
    
        if (r6.isEmpty() == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0104, code lost:
    
        r5 = ((androidx.navigation.n) r6.first()).f2258b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0110, code lost:
    
        if (r9.isEmpty() != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x011c, code lost:
    
        if ((((androidx.navigation.n) r9.last()).f2258b instanceof androidx.navigation.f0) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x011e, code lost:
    
        r7 = ((androidx.navigation.n) r9.last()).f2258b;
        kotlin.jvm.internal.Intrinsics.d(r7, "null cannot be cast to non-null type androidx.navigation.NavGraph");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0133, code lost:
    
        if (((androidx.navigation.f0) r7).o(r5.f2181h, false) != null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0135, code lost:
    
        t(r16, (androidx.navigation.n) r9.last());
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0143, code lost:
    
        if (r9.isEmpty() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0145, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014d, code lost:
    
        r5 = (androidx.navigation.n) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014f, code lost:
    
        if (r5 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0155, code lost:
    
        if (r6.isEmpty() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r(((androidx.navigation.n) r9.last()).f2258b.f2181h, true, false) != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0157, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x015f, code lost:
    
        r5 = (androidx.navigation.n) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0159, code lost:
    
        r5 = r6.f38331b[r6.f38330a];
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0161, code lost:
    
        if (r5 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0163, code lost:
    
        r5 = r5.f2258b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x016d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r5, r16.f2306c) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x016f, code lost:
    
        r4 = r20.listIterator(r20.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017b, code lost:
    
        if (r4.hasPrevious() == false) goto L132;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.navigation.c0 r17, android.os.Bundle r18, androidx.navigation.n r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.t.a(androidx.navigation.c0, android.os.Bundle, androidx.navigation.n, java.util.List):void");
    }

    public final boolean b() {
        vt.q qVar;
        while (true) {
            qVar = this.f2310g;
            if (qVar.isEmpty() || !(((n) qVar.last()).f2258b instanceof f0)) {
                break;
            }
            t(this, (n) qVar.last());
        }
        n nVar = (n) qVar.o();
        ArrayList arrayList = this.A;
        if (nVar != null) {
            arrayList.add(nVar);
        }
        this.f2329z++;
        z();
        int i10 = this.f2329z - 1;
        this.f2329z = i10;
        if (i10 == 0) {
            ArrayList S = vt.g0.S(arrayList);
            arrayList.clear();
            Iterator it = S.iterator();
            while (it.hasNext()) {
                n nVar2 = (n) it.next();
                Iterator it2 = this.f2319p.iterator();
                if (!it2.hasNext()) {
                    this.C.f(nVar2);
                } else {
                    a3.a.u(it2.next());
                    c0 c0Var = nVar2.f2258b;
                    nVar2.a();
                    throw null;
                }
            }
            this.f2311h.m(vt.g0.S(qVar));
            this.f2312i.m(u());
        }
        if (nVar != null) {
            return true;
        }
        return false;
    }

    public final c0 c(int i10) {
        c0 c0Var;
        f0 f0Var = this.f2306c;
        if (f0Var == null) {
            return null;
        }
        if (f0Var.f2181h == i10) {
            return f0Var;
        }
        n nVar = (n) this.f2310g.o();
        if (nVar == null || (c0Var = nVar.f2258b) == null) {
            c0Var = this.f2306c;
            Intrinsics.c(c0Var);
        }
        return d(c0Var, i10);
    }

    public final n e(int i10) {
        Object obj;
        vt.q qVar = this.f2310g;
        ListIterator<E> listIterator = qVar.listIterator(qVar.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (((n) obj).f2258b.f2181h == i10) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        n nVar = (n) obj;
        if (nVar != null) {
            return nVar;
        }
        StringBuilder n10 = a3.a.n("No destination with ID ", i10, " is on the NavController's back stack. The current destination is ");
        n10.append(f());
        throw new IllegalArgumentException(n10.toString().toString());
    }

    public final c0 f() {
        n nVar = (n) this.f2310g.o();
        if (nVar != null) {
            return nVar.f2258b;
        }
        return null;
    }

    public final int g() {
        vt.q qVar = this.f2310g;
        int i10 = 0;
        if (!(qVar instanceof Collection) || !qVar.isEmpty()) {
            Iterator it = qVar.iterator();
            while (it.hasNext()) {
                if ((!(((n) it.next()).f2258b instanceof f0)) && (i10 = i10 + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        return i10;
    }

    public final f0 h() {
        f0 f0Var = this.f2306c;
        if (f0Var != null) {
            Intrinsics.d(f0Var, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            return f0Var;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
    }

    public final androidx.lifecycle.n i() {
        return this.f2317n == null ? androidx.lifecycle.n.f1949c : this.f2320q;
    }

    public final n j() {
        Object obj;
        Iterator it = vt.g0.L(this.f2310g).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = pu.m.b(it).iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (!(((n) obj).f2258b instanceof f0)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (n) obj;
    }

    public final void k(n nVar, n nVar2) {
        this.f2313j.put(nVar, nVar2);
        LinkedHashMap linkedHashMap = this.f2314k;
        if (linkedHashMap.get(nVar2) == null) {
            linkedHashMap.put(nVar2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(nVar2);
        Intrinsics.c(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    public final void l(int i10, Bundle bundle, k0 k0Var) {
        c0 c0Var;
        int i11;
        int i12;
        vt.q qVar = this.f2310g;
        if (qVar.isEmpty()) {
            c0Var = this.f2306c;
        } else {
            c0Var = ((n) qVar.last()).f2258b;
        }
        if (c0Var != null) {
            g h10 = c0Var.h(i10);
            Bundle bundle2 = null;
            if (h10 != null) {
                if (k0Var == null) {
                    k0Var = h10.f2209b;
                }
                Bundle bundle3 = h10.f2210c;
                i11 = h10.f2208a;
                if (bundle3 != null) {
                    bundle2 = new Bundle();
                    bundle2.putAll(bundle3);
                }
            } else {
                i11 = i10;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            if (i11 == 0 && k0Var != null && (i12 = k0Var.f2236c) != -1) {
                if (r(i12, k0Var.f2237d, false)) {
                    b();
                    return;
                }
                return;
            }
            if (i11 != 0) {
                c0 c10 = c(i11);
                if (c10 == null) {
                    int i13 = c0.f2173j;
                    Context context = this.f2304a;
                    String o10 = x2.c.o(i11, context);
                    if (h10 == null) {
                        throw new IllegalArgumentException("Navigation action/destination " + o10 + " cannot be found from the current destination " + c0Var);
                    }
                    StringBuilder s7 = da.e.s("Navigation destination ", o10, " referenced from action ");
                    s7.append(x2.c.o(i10, context));
                    s7.append(" cannot be found from the current destination ");
                    s7.append(c0Var);
                    throw new IllegalArgumentException(s7.toString().toString());
                }
                n(c10, bundle2, k0Var);
                return;
            }
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
        }
        throw new IllegalStateException("no current navigation node");
    }

    public final void m(Uri deepLink, k0 k0Var) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        Object obj = null;
        h.c request = new h.c(19, deepLink, obj, obj);
        Intrinsics.checkNotNullParameter(request, "request");
        f0 f0Var = this.f2306c;
        Intrinsics.c(f0Var);
        b0 i10 = f0Var.i(request);
        if (i10 != null) {
            c0 c0Var = i10.f2154a;
            Bundle e10 = c0Var.e(i10.f2155b);
            if (e10 == null) {
                e10 = new Bundle();
            }
            Intent intent = new Intent();
            intent.setDataAndType((Uri) request.f17583b, (String) request.f17585d);
            intent.setAction((String) request.f17584c);
            e10.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
            n(c0Var, e10, k0Var);
            return;
        }
        throw new IllegalArgumentException("Navigation destination that matches request " + request + " cannot be found in the navigation graph " + this.f2306c);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(androidx.navigation.c0 r26, android.os.Bundle r27, androidx.navigation.k0 r28) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.t.n(androidx.navigation.c0, android.os.Bundle, androidx.navigation.k0):void");
    }

    public final void o(d0 directions) {
        Intrinsics.checkNotNullParameter(directions, "directions");
        l(directions.b(), directions.a(), null);
    }

    public final boolean p() {
        Bundle bundle;
        int[] iArr;
        Bundle bundle2;
        Bundle bundle3;
        Intent intent;
        if (g() == 1) {
            Activity activity = this.f2305b;
            if (activity != null && (intent = activity.getIntent()) != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            if (bundle != null) {
                iArr = bundle.getIntArray("android-support-nav:controller:deepLinkIds");
            } else {
                iArr = null;
            }
            int i10 = 0;
            if (iArr != null) {
                if (this.f2309f) {
                    Intrinsics.c(activity);
                    Intent intent2 = activity.getIntent();
                    Bundle extras = intent2.getExtras();
                    Intrinsics.c(extras);
                    int[] intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                    Intrinsics.c(intArray);
                    ArrayList z10 = vt.v.z(intArray);
                    ArrayList parcelableArrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
                    Intrinsics.checkNotNullParameter(z10, "<this>");
                    if (!z10.isEmpty()) {
                        int intValue = ((Number) z10.remove(vt.y.f(z10))).intValue();
                        if (parcelableArrayList != null) {
                            Intrinsics.checkNotNullParameter(parcelableArrayList, "<this>");
                            if (!parcelableArrayList.isEmpty()) {
                            } else {
                                throw new NoSuchElementException("List is empty.");
                            }
                        }
                        if (!z10.isEmpty()) {
                            c0 d10 = d(h(), intValue);
                            if (d10 instanceof f0) {
                                int i11 = f0.f2190o;
                                intValue = ni.j.k((f0) d10).f2181h;
                            }
                            c0 f10 = f();
                            if (f10 != null && intValue == f10.f2181h) {
                                q.h hVar = new q.h(this);
                                Bundle y10 = hl.f.y(new Pair("android-support-nav:controller:deepLinkIntent", intent2));
                                Bundle bundle4 = extras.getBundle("android-support-nav:controller:deepLinkExtras");
                                if (bundle4 != null) {
                                    y10.putAll(bundle4);
                                }
                                hVar.f31454f = y10;
                                ((Intent) hVar.f31451c).putExtra("android-support-nav:controller:deepLinkExtras", y10);
                                Iterator it = z10.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    int i12 = i10 + 1;
                                    if (i10 >= 0) {
                                        int intValue2 = ((Number) next).intValue();
                                        if (parcelableArrayList != null) {
                                            bundle3 = (Bundle) parcelableArrayList.get(i10);
                                        } else {
                                            bundle3 = null;
                                        }
                                        ((List) hVar.f31453e).add(new a0(intValue2, bundle3));
                                        if (((f0) hVar.f31452d) != null) {
                                            hVar.f();
                                        }
                                        i10 = i12;
                                    } else {
                                        vt.y.j();
                                        throw null;
                                    }
                                }
                                hVar.c().g();
                                activity.finish();
                                return true;
                            }
                        }
                    } else {
                        throw new NoSuchElementException("List is empty.");
                    }
                }
                return false;
            }
            c0 f11 = f();
            Intrinsics.c(f11);
            int i13 = f11.f2181h;
            for (f0 f0Var = f11.f2175b; f0Var != null; f0Var = f0Var.f2175b) {
                if (f0Var.f2192l != i13) {
                    Bundle bundle5 = new Bundle();
                    if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                        bundle5.putParcelable("android-support-nav:controller:deepLinkIntent", activity.getIntent());
                        f0 f0Var2 = this.f2306c;
                        Intrinsics.c(f0Var2);
                        Intent intent3 = activity.getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent3, "activity!!.intent");
                        b0 i14 = f0Var2.i(new h.c(intent3));
                        if (i14 != null) {
                            bundle2 = i14.f2155b;
                        } else {
                            bundle2 = null;
                        }
                        if (bundle2 != null) {
                            bundle5.putAll(i14.f2154a.e(i14.f2155b));
                        }
                    }
                    q.h hVar2 = new q.h(this);
                    int i15 = f0Var.f2181h;
                    ((List) hVar2.f31453e).clear();
                    ((List) hVar2.f31453e).add(new a0(i15, null));
                    if (((f0) hVar2.f31452d) != null) {
                        hVar2.f();
                    }
                    hVar2.f31454f = bundle5;
                    ((Intent) hVar2.f31451c).putExtra("android-support-nav:controller:deepLinkExtras", bundle5);
                    hVar2.c().g();
                    if (activity == null) {
                        return true;
                    }
                    activity.finish();
                    return true;
                }
                i13 = f0Var.f2181h;
            }
            return false;
        }
        return q();
    }

    public final boolean q() {
        if (this.f2310g.isEmpty()) {
            return false;
        }
        c0 f10 = f();
        Intrinsics.c(f10);
        if (!r(f10.f2181h, true, false) || !b()) {
            return false;
        }
        return true;
    }

    public final boolean r(int i10, boolean z10, boolean z11) {
        c0 c0Var;
        String str;
        String str2;
        Object obj;
        String str3;
        vt.q qVar = this.f2310g;
        if (qVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = vt.g0.L(qVar).iterator();
        while (true) {
            if (it.hasNext()) {
                c0 c0Var2 = ((n) it.next()).f2258b;
                v0 b10 = this.f2324u.b(c0Var2.f2174a);
                if (z10 || c0Var2.f2181h != i10) {
                    arrayList.add(b10);
                }
                if (c0Var2.f2181h == i10) {
                    c0Var = c0Var2;
                    break;
                }
            } else {
                c0Var = null;
                break;
            }
        }
        if (c0Var == null) {
            int i11 = c0.f2173j;
            Log.i("NavController", "Ignoring popBackStack to destination " + x2.c.o(i10, this.f2304a) + " as it was not found on the current back stack");
            return false;
        }
        iu.v vVar = new iu.v();
        vt.q qVar2 = new vt.q();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                v0 v0Var = (v0) it2.next();
                iu.v vVar2 = new iu.v();
                n nVar = (n) qVar.last();
                vt.q qVar3 = qVar;
                this.f2327x = new i0.k0(vVar2, vVar, this, z11, qVar2);
                v0Var.i(nVar, z11);
                str = null;
                this.f2327x = null;
                if (!vVar2.f20556a) {
                    break;
                }
                qVar = qVar3;
            } else {
                str = null;
                break;
            }
        }
        if (z11) {
            LinkedHashMap linkedHashMap = this.f2315l;
            if (!z10) {
                Sequence d10 = pu.m.d(c.f2163e, c0Var);
                r predicate = new r(this, 0);
                Intrinsics.checkNotNullParameter(d10, "<this>");
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                Iterator it3 = new pu.q(0, predicate, d10).iterator();
                while (it3.hasNext()) {
                    Integer valueOf = Integer.valueOf(((c0) it3.next()).f2181h);
                    if (qVar2.isEmpty()) {
                        obj = str;
                    } else {
                        obj = qVar2.f38331b[qVar2.f38330a];
                    }
                    o oVar = (o) obj;
                    if (oVar != null) {
                        str3 = oVar.f2270a;
                    } else {
                        str3 = str;
                    }
                    linkedHashMap.put(valueOf, str3);
                }
            }
            if (!qVar2.isEmpty()) {
                o oVar2 = (o) qVar2.first();
                Sequence d11 = pu.m.d(c.f2164f, c(oVar2.f2271b));
                r predicate2 = new r(this, 1);
                Intrinsics.checkNotNullParameter(d11, "<this>");
                Intrinsics.checkNotNullParameter(predicate2, "predicate");
                Iterator it4 = new pu.q(0, predicate2, d11).iterator();
                while (true) {
                    boolean hasNext = it4.hasNext();
                    str2 = oVar2.f2270a;
                    if (!hasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((c0) it4.next()).f2181h), str2);
                }
                this.f2316m.put(str2, qVar2);
            }
        }
        A();
        return vVar.f20556a;
    }

    public final void s(n nVar, boolean z10, vt.q qVar) {
        NavControllerViewModel navControllerViewModel;
        tu.s0 s0Var;
        Set set;
        vt.q qVar2 = this.f2310g;
        n nVar2 = (n) qVar2.last();
        if (Intrinsics.a(nVar2, nVar)) {
            qVar2.u();
            q qVar3 = (q) this.f2325v.get(this.f2324u.b(nVar2.f2258b.f2174a));
            boolean z11 = true;
            if ((qVar3 == null || (s0Var = qVar3.f2283f) == null || (set = (Set) s0Var.f36547a.getValue()) == null || !set.contains(nVar2)) && !this.f2314k.containsKey(nVar2)) {
                z11 = false;
            }
            androidx.lifecycle.n nVar3 = nVar2.f2264h.f1978d;
            androidx.lifecycle.n nVar4 = androidx.lifecycle.n.f1949c;
            if (nVar3.a(nVar4)) {
                if (z10) {
                    nVar2.b(nVar4);
                    qVar.g(new o(nVar2));
                }
                if (!z11) {
                    nVar2.b(androidx.lifecycle.n.f1947a);
                    y(nVar2);
                } else {
                    nVar2.b(nVar4);
                }
            }
            if (!z10 && !z11 && (navControllerViewModel = this.f2318o) != null) {
                String backStackEntryId = nVar2.f2262f;
                Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
                h1 h1Var = (h1) navControllerViewModel.f2147b.remove(backStackEntryId);
                if (h1Var != null) {
                    h1Var.a();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(("Attempted to pop " + nVar.f2258b + ", which is not the top of the back stack (" + nVar2.f2258b + ')').toString());
    }

    public final ArrayList u() {
        androidx.lifecycle.n nVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f2325v.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            nVar = androidx.lifecycle.n.f1950d;
            if (!hasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((q) it.next()).f2283f.f36547a.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                n nVar2 = (n) obj;
                if (!arrayList.contains(nVar2) && !nVar2.f2267k.a(nVar)) {
                    arrayList2.add(obj);
                }
            }
            vt.d0.m(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f2310g.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            n nVar3 = (n) next;
            if (!arrayList.contains(nVar3) && nVar3.f2267k.a(nVar)) {
                arrayList3.add(next);
            }
        }
        vt.d0.m(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!(((n) next2).f2258b instanceof f0)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    public final boolean v(int i10, Bundle bundle, k0 k0Var) {
        c0 h10;
        n nVar;
        c0 c0Var;
        LinkedHashMap linkedHashMap = this.f2315l;
        int i11 = 0;
        if (!linkedHashMap.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i10));
        Collection values = linkedHashMap.values();
        s predicate = new s(str, i11);
        Intrinsics.checkNotNullParameter(values, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        vt.d0.o(values, predicate, true);
        LinkedHashMap linkedHashMap2 = this.f2316m;
        zq.f.w(linkedHashMap2);
        vt.q qVar = (vt.q) linkedHashMap2.remove(str);
        ArrayList arrayList = new ArrayList();
        n nVar2 = (n) this.f2310g.o();
        if (nVar2 == null || (h10 = nVar2.f2258b) == null) {
            h10 = h();
        }
        if (qVar != null) {
            Iterator it = qVar.iterator();
            while (it.hasNext()) {
                o oVar = (o) it.next();
                c0 d10 = d(h10, oVar.f2271b);
                Context context = this.f2304a;
                if (d10 != null) {
                    arrayList.add(oVar.a(context, d10, i(), this.f2318o));
                    h10 = d10;
                } else {
                    int i12 = c0.f2173j;
                    throw new IllegalStateException(("Restore State failed: destination " + x2.c.o(oVar.f2271b, context) + " cannot be found from the current destination " + h10).toString());
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!(((n) next).f2258b instanceof f0)) {
                arrayList3.add(next);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (true) {
            String str2 = null;
            if (!it3.hasNext()) {
                break;
            }
            n nVar3 = (n) it3.next();
            List list = (List) vt.g0.D(arrayList2);
            if (list != null && (nVar = (n) vt.g0.C(list)) != null && (c0Var = nVar.f2258b) != null) {
                str2 = c0Var.f2174a;
            }
            if (Intrinsics.a(str2, nVar3.f2258b.f2174a)) {
                list.add(nVar3);
            } else {
                arrayList2.add(vt.y.h(nVar3));
            }
        }
        iu.v vVar = new iu.v();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            List list2 = (List) it4.next();
            v0 b10 = this.f2324u.b(((n) vt.g0.u(list2)).f2258b.f2174a);
            this.f2326w = new c.d(vVar, arrayList, new iu.x(), this, bundle, 3);
            b10.d(list2, k0Var);
            this.f2326w = null;
        }
        return vVar.f20556a;
    }

    public final void w(int i10, Bundle bundle) {
        x(((i0) this.B.getValue()).b(i10), bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x025c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c2  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(androidx.navigation.f0 r23, android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 1174
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.t.x(androidx.navigation.f0, android.os.Bundle):void");
    }

    public final void y(n child) {
        Integer num;
        Intrinsics.checkNotNullParameter(child, "child");
        n nVar = (n) this.f2313j.remove(child);
        if (nVar == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f2314k;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(nVar);
        if (atomicInteger != null) {
            num = Integer.valueOf(atomicInteger.decrementAndGet());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            q qVar = (q) this.f2325v.get(this.f2324u.b(nVar.f2258b.f2174a));
            if (qVar != null) {
                qVar.b(nVar);
            }
            linkedHashMap.remove(nVar);
        }
    }

    public final void z() {
        c0 c0Var;
        Boolean bool;
        AtomicInteger atomicInteger;
        tu.s0 s0Var;
        Set set;
        ArrayList S = vt.g0.S(this.f2310g);
        if (S.isEmpty()) {
            return;
        }
        c0 c0Var2 = ((n) vt.g0.C(S)).f2258b;
        if (c0Var2 instanceof f) {
            Iterator it = vt.g0.L(S).iterator();
            while (it.hasNext()) {
                c0Var = ((n) it.next()).f2258b;
                if (!(c0Var instanceof f0) && !(c0Var instanceof f)) {
                    break;
                }
            }
        }
        c0Var = null;
        HashMap hashMap = new HashMap();
        for (n nVar : vt.g0.L(S)) {
            androidx.lifecycle.n nVar2 = nVar.f2267k;
            c0 c0Var3 = nVar.f2258b;
            androidx.lifecycle.n nVar3 = androidx.lifecycle.n.f1951e;
            androidx.lifecycle.n nVar4 = androidx.lifecycle.n.f1950d;
            if (c0Var2 != null && c0Var3.f2181h == c0Var2.f2181h) {
                if (nVar2 != nVar3) {
                    q qVar = (q) this.f2325v.get(this.f2324u.b(c0Var3.f2174a));
                    if (qVar != null && (s0Var = qVar.f2283f) != null && (set = (Set) s0Var.f36547a.getValue()) != null) {
                        bool = Boolean.valueOf(set.contains(nVar));
                    } else {
                        bool = null;
                    }
                    if (!Intrinsics.a(bool, Boolean.TRUE) && ((atomicInteger = (AtomicInteger) this.f2314k.get(nVar)) == null || atomicInteger.get() != 0)) {
                        hashMap.put(nVar, nVar3);
                    } else {
                        hashMap.put(nVar, nVar4);
                    }
                }
                c0Var2 = c0Var2.f2175b;
            } else if (c0Var != null && c0Var3.f2181h == c0Var.f2181h) {
                if (nVar2 == nVar3) {
                    nVar.b(nVar4);
                } else if (nVar2 != nVar4) {
                    hashMap.put(nVar, nVar4);
                }
                c0Var = c0Var.f2175b;
            } else {
                nVar.b(androidx.lifecycle.n.f1949c);
            }
        }
        Iterator it2 = S.iterator();
        while (it2.hasNext()) {
            n nVar5 = (n) it2.next();
            androidx.lifecycle.n nVar6 = (androidx.lifecycle.n) hashMap.get(nVar5);
            if (nVar6 != null) {
                nVar5.b(nVar6);
            } else {
                nVar5.c();
            }
        }
    }
}
