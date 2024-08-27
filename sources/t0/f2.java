package t0;

import android.util.Log;
import androidx.compose.runtime.ComposeRuntimeError;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import ut.l;

/* loaded from: classes.dex */
public final class f2 extends v {

    /* renamed from: v, reason: collision with root package name */
    public static final tu.k1 f34996v = tu.l1.a(z0.b.f41892e);

    /* renamed from: w, reason: collision with root package name */
    public static final AtomicReference f34997w = new AtomicReference(Boolean.FALSE);

    /* renamed from: a, reason: collision with root package name */
    public final i f34998a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f34999b;

    /* renamed from: c, reason: collision with root package name */
    public qu.o1 f35000c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f35001d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f35002e;

    /* renamed from: f, reason: collision with root package name */
    public List f35003f;

    /* renamed from: g, reason: collision with root package name */
    public v0.c f35004g;

    /* renamed from: h, reason: collision with root package name */
    public final v0.h f35005h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f35006i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f35007j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f35008k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f35009l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f35010m;

    /* renamed from: n, reason: collision with root package name */
    public Set f35011n;

    /* renamed from: o, reason: collision with root package name */
    public qu.h f35012o;

    /* renamed from: p, reason: collision with root package name */
    public h.r0 f35013p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f35014q;

    /* renamed from: r, reason: collision with root package name */
    public final tu.k1 f35015r;

    /* renamed from: s, reason: collision with root package name */
    public final qu.q1 f35016s;

    /* renamed from: t, reason: collision with root package name */
    public final CoroutineContext f35017t;

    /* renamed from: u, reason: collision with root package name */
    public final hr.c f35018u;

    public f2(CoroutineContext coroutineContext) {
        i iVar = new i(new x.a(this, 20));
        this.f34998a = iVar;
        this.f34999b = new Object();
        this.f35002e = new ArrayList();
        this.f35004g = new v0.c();
        this.f35005h = new v0.h(new e0[16]);
        this.f35006i = new ArrayList();
        this.f35007j = new ArrayList();
        this.f35008k = new LinkedHashMap();
        this.f35009l = new LinkedHashMap();
        this.f35015r = tu.l1.a(z1.f35280c);
        qu.q1 q1Var = new qu.q1((qu.o1) coroutineContext.g(qu.c0.f32192b));
        q1Var.I(new t.g0(this, 18));
        this.f35016s = q1Var;
        this.f35017t = coroutineContext.l(iVar).l(q1Var);
        this.f35018u = new hr.c(this, 4);
    }

    public static final void A(ArrayList arrayList, f2 f2Var, e0 e0Var) {
        arrayList.clear();
        synchronized (f2Var.f34999b) {
            try {
                Iterator it = f2Var.f35007j.iterator();
                while (it.hasNext()) {
                    c1 c1Var = (c1) it.next();
                    c1Var.getClass();
                    if (Intrinsics.a(null, e0Var)) {
                        arrayList.add(c1Var);
                        it.remove();
                    }
                }
                Unit unit = Unit.f23355a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void D(f2 f2Var, Exception exc, boolean z10, int i10) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        f2Var.C(exc, null, z10);
    }

    public static final e0 r(f2 f2Var, e0 e0Var, v0.c cVar) {
        y yVar = (y) e0Var;
        if (yVar.f35267r.E || yVar.f35269t) {
            return null;
        }
        Set set = f2Var.f35011n;
        if (set != null && set.contains(e0Var)) {
            return null;
        }
        e1.c n10 = yq.b.n(new t.g0(e0Var, 19), new x.z(23, e0Var, cVar));
        try {
            e1.i j10 = n10.j();
            try {
                if (cVar.g()) {
                    x.y0 y0Var = new x.y0(8, cVar, e0Var);
                    r rVar = ((y) e0Var).f35267r;
                    if (!rVar.E) {
                        rVar.E = true;
                        try {
                            y0Var.mo2invoke();
                            rVar.E = false;
                        } catch (Throwable th2) {
                            rVar.E = false;
                            throw th2;
                        }
                    } else {
                        t.F("Preparing a composition while composing is not supported");
                        throw null;
                    }
                }
                boolean x10 = ((y) e0Var).x();
                e1.i.p(j10);
                if (!x10) {
                    e0Var = null;
                }
                return e0Var;
            } catch (Throwable th3) {
                e1.i.p(j10);
                throw th3;
            }
        } finally {
            t(n10);
        }
    }

    public static final boolean s(f2 f2Var) {
        boolean z10;
        List y10;
        synchronized (f2Var.f34999b) {
            z10 = true;
            if (f2Var.f35004g.isEmpty()) {
                if (!f2Var.f35005h.l() && !f2Var.w()) {
                    z10 = false;
                }
            } else {
                v0.c cVar = f2Var.f35004g;
                f2Var.f35004g = new v0.c();
                synchronized (f2Var.f34999b) {
                    y10 = f2Var.y();
                }
                try {
                    int size = y10.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((y) ((e0) y10.get(i10))).y(cVar);
                        if (((z1) f2Var.f35015r.getValue()).compareTo(z1.f35279b) <= 0) {
                            break;
                        }
                    }
                    f2Var.f35004g = new v0.c();
                    synchronized (f2Var.f34999b) {
                        if (f2Var.v() == null) {
                            if (!f2Var.f35005h.l() && !f2Var.w()) {
                                z10 = false;
                            }
                        } else {
                            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                        }
                    }
                } catch (Throwable th2) {
                    synchronized (f2Var.f34999b) {
                        f2Var.f35004g.b(cVar);
                        Unit unit = Unit.f23355a;
                        throw th2;
                    }
                }
            }
        }
        return z10;
    }

    public static void t(e1.c cVar) {
        try {
            if (!(cVar.v() instanceof e1.j)) {
            } else {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            cVar.c();
        }
    }

    public final List B(List list, v0.c cVar) {
        ArrayList arrayList;
        Object obj;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = list.get(i10);
            ((c1) obj2).getClass();
            Object obj3 = hashMap.get(null);
            if (obj3 == null) {
                obj3 = new ArrayList();
                hashMap.put(null, obj3);
            }
            ((ArrayList) obj3).add(obj2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            e0 e0Var = (e0) entry.getKey();
            List list2 = (List) entry.getValue();
            t.u0(!((y) e0Var).f35267r.E);
            e1.c n10 = yq.b.n(new t.g0(e0Var, 19), new x.z(23, e0Var, cVar));
            try {
                e1.i j10 = n10.j();
                try {
                    synchronized (this.f34999b) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            c1 c1Var = (c1) list2.get(i11);
                            LinkedHashMap linkedHashMap = this.f35008k;
                            c1Var.getClass();
                            List list3 = (List) linkedHashMap.get(null);
                            if (list3 != null) {
                                Intrinsics.checkNotNullParameter(list3, "<this>");
                                if (!list3.isEmpty()) {
                                    Object remove = list3.remove(0);
                                    if (list3.isEmpty()) {
                                        linkedHashMap.remove(null);
                                    }
                                    obj = remove;
                                } else {
                                    throw new NoSuchElementException("List is empty.");
                                }
                            } else {
                                obj = null;
                            }
                            arrayList.add(new Pair(c1Var, obj));
                        }
                    }
                    ((y) e0Var).s(arrayList);
                    Unit unit = Unit.f23355a;
                } finally {
                }
            } finally {
                t(n10);
            }
        }
        return vt.g0.R(hashMap.keySet());
    }

    public final void C(Exception exc, e0 e0Var, boolean z10) {
        if (((Boolean) f34997w.get()).booleanValue() && !(exc instanceof ComposeRuntimeError)) {
            synchronized (this.f34999b) {
                try {
                    int i10 = c.f34957b;
                    Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", exc);
                    this.f35006i.clear();
                    this.f35005h.g();
                    this.f35004g = new v0.c();
                    this.f35007j.clear();
                    this.f35008k.clear();
                    this.f35009l.clear();
                    this.f35013p = new h.r0(z10, exc);
                    if (e0Var != null) {
                        E(e0Var);
                    }
                    v();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        synchronized (this.f34999b) {
            h.r0 r0Var = this.f35013p;
            if (r0Var == null) {
                this.f35013p = new h.r0(false, exc);
                Unit unit = Unit.f23355a;
            } else {
                throw ((Exception) r0Var.f17736b);
            }
        }
        throw exc;
    }

    public final void E(e0 e0Var) {
        ArrayList arrayList = this.f35010m;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f35010m = arrayList;
        }
        if (!arrayList.contains(e0Var)) {
            arrayList.add(e0Var);
        }
        this.f35002e.remove(e0Var);
        this.f35003f = null;
    }

    @Override // t0.v
    public final void a(e0 e0Var, b1.c cVar) {
        boolean z10 = ((y) e0Var).f35267r.E;
        try {
            e1.c n10 = yq.b.n(new t.g0(e0Var, 19), new x.z(23, e0Var, null));
            try {
                e1.i j10 = n10.j();
                try {
                    y yVar = (y) e0Var;
                    yVar.n(cVar);
                    Unit unit = Unit.f23355a;
                    if (!z10) {
                        e1.p.i().m();
                    }
                    synchronized (this.f34999b) {
                        if (((z1) this.f35015r.getValue()).compareTo(z1.f35279b) > 0 && !y().contains(e0Var)) {
                            this.f35002e.add(e0Var);
                            this.f35003f = null;
                        }
                    }
                    try {
                        z(e0Var);
                        try {
                            yVar.i();
                            yVar.k();
                            if (!z10) {
                                e1.p.i().m();
                            }
                        } catch (Exception e10) {
                            D(this, e10, false, 6);
                        }
                    } catch (Exception e11) {
                        C(e11, e0Var, true);
                    }
                } finally {
                    e1.i.p(j10);
                }
            } finally {
                t(n10);
            }
        } catch (Exception e12) {
            C(e12, e0Var, true);
        }
    }

    @Override // t0.v
    public final boolean c() {
        return ((Boolean) f34997w.get()).booleanValue();
    }

    @Override // t0.v
    public final boolean d() {
        return false;
    }

    @Override // t0.v
    public final boolean e() {
        return false;
    }

    @Override // t0.v
    public final int g() {
        return CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
    }

    @Override // t0.v
    public final CoroutineContext h() {
        return this.f35017t;
    }

    @Override // t0.v
    public final void j(e0 e0Var) {
        qu.h hVar;
        synchronized (this.f34999b) {
            if (!this.f35005h.h(e0Var)) {
                this.f35005h.b(e0Var);
                hVar = v();
            } else {
                hVar = null;
            }
        }
        if (hVar != null) {
            l.Companion companion = ut.l.INSTANCE;
            hVar.resumeWith(Unit.f23355a);
        }
    }

    @Override // t0.v
    public final b1 k(c1 c1Var) {
        b1 b1Var;
        synchronized (this.f34999b) {
            b1Var = (b1) this.f35009l.remove(c1Var);
        }
        return b1Var;
    }

    @Override // t0.v
    public final void l(Set set) {
    }

    @Override // t0.v
    public final void n(e0 e0Var) {
        synchronized (this.f34999b) {
            try {
                Set set = this.f35011n;
                if (set == null) {
                    set = new LinkedHashSet();
                    this.f35011n = set;
                }
                set.add(e0Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // t0.v
    public final void q(e0 e0Var) {
        synchronized (this.f34999b) {
            this.f35002e.remove(e0Var);
            this.f35003f = null;
            this.f35005h.m(e0Var);
            this.f35006i.remove(e0Var);
            Unit unit = Unit.f23355a;
        }
    }

    public final void u() {
        synchronized (this.f34999b) {
            try {
                if (((z1) this.f35015r.getValue()).compareTo(z1.f35282e) >= 0) {
                    this.f35015r.m(z1.f35279b);
                }
                Unit unit = Unit.f23355a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f35016s.a(null);
    }

    public final qu.h v() {
        tu.k1 k1Var = this.f35015r;
        int compareTo = ((z1) k1Var.getValue()).compareTo(z1.f35279b);
        ArrayList arrayList = this.f35007j;
        ArrayList arrayList2 = this.f35006i;
        v0.h hVar = this.f35005h;
        if (compareTo <= 0) {
            this.f35002e.clear();
            this.f35003f = vt.i0.f38321a;
            this.f35004g = new v0.c();
            hVar.g();
            arrayList2.clear();
            arrayList.clear();
            this.f35010m = null;
            qu.h hVar2 = this.f35012o;
            if (hVar2 != null) {
                hVar2.r(null);
            }
            this.f35012o = null;
            this.f35013p = null;
            return null;
        }
        h.r0 r0Var = this.f35013p;
        z1 z1Var = z1.f35283f;
        z1 z1Var2 = z1.f35280c;
        if (r0Var == null) {
            if (this.f35000c == null) {
                this.f35004g = new v0.c();
                hVar.g();
                if (w()) {
                    z1Var2 = z1.f35281d;
                }
            } else {
                z1Var2 = (hVar.l() || this.f35004g.g() || (arrayList2.isEmpty() ^ true) || (arrayList.isEmpty() ^ true) || w()) ? z1Var : z1.f35282e;
            }
        }
        k1Var.m(z1Var2);
        if (z1Var2 != z1Var) {
            return null;
        }
        qu.h hVar3 = this.f35012o;
        this.f35012o = null;
        return hVar3;
    }

    public final boolean w() {
        boolean z10;
        if (!this.f35014q) {
            i iVar = this.f34998a;
            synchronized (iVar.f35043b) {
                z10 = !iVar.f35045d.isEmpty();
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean x() {
        boolean z10;
        synchronized (this.f34999b) {
            if (!this.f35004g.g() && !this.f35005h.l()) {
                if (!w()) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    public final List y() {
        List list = this.f35003f;
        if (list == null) {
            ArrayList arrayList = this.f35002e;
            if (arrayList.isEmpty()) {
                list = vt.i0.f38321a;
            } else {
                list = new ArrayList(arrayList);
            }
            this.f35003f = list;
        }
        return list;
    }

    public final void z(e0 e0Var) {
        synchronized (this.f34999b) {
            ArrayList arrayList = this.f35007j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((c1) arrayList.get(i10)).getClass();
                if (Intrinsics.a(null, e0Var)) {
                    Unit unit = Unit.f23355a;
                    ArrayList arrayList2 = new ArrayList();
                    A(arrayList2, this, e0Var);
                    while (!arrayList2.isEmpty()) {
                        B(arrayList2, null);
                        A(arrayList2, this, e0Var);
                    }
                    return;
                }
            }
        }
    }
}
