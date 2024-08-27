package q8;

import bv.b0;
import bv.d0;
import bv.e0;
import bv.x;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.s;
import kotlin.text.w;
import o8.z;
import qu.i2;
import yk.o;

/* loaded from: classes.dex */
public final class h implements Closeable, Flushable {

    /* renamed from: q, reason: collision with root package name */
    public static final Regex f31844q = new Regex("[a-z0-9_-]{1,120}");

    /* renamed from: a, reason: collision with root package name */
    public final b0 f31845a;

    /* renamed from: b, reason: collision with root package name */
    public final long f31846b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f31847c;

    /* renamed from: d, reason: collision with root package name */
    public final b0 f31848d;

    /* renamed from: e, reason: collision with root package name */
    public final b0 f31849e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f31850f;

    /* renamed from: g, reason: collision with root package name */
    public final vu.f f31851g;

    /* renamed from: h, reason: collision with root package name */
    public long f31852h;

    /* renamed from: i, reason: collision with root package name */
    public int f31853i;

    /* renamed from: j, reason: collision with root package name */
    public bv.k f31854j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f31855k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f31856l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f31857m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f31858n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f31859o;

    /* renamed from: p, reason: collision with root package name */
    public final f f31860p;

    public h(x xVar, b0 b0Var, xu.d dVar, long j10) {
        this.f31845a = b0Var;
        this.f31846b = j10;
        if (j10 > 0) {
            this.f31847c = b0Var.d("journal");
            this.f31848d = b0Var.d("journal.tmp");
            this.f31849e = b0Var.d("journal.bkp");
            this.f31850f = new LinkedHashMap(0, 0.75f, true);
            i2 l10 = el.l.l();
            qu.b0 context = dVar.e0(1);
            Intrinsics.checkNotNullParameter(context, "context");
            this.f31851g = hl.f.d(kotlin.coroutines.g.a(l10, context));
            this.f31860p = new f(xVar);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    public static void H(String str) {
        if (f31844q.c(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    public static final void a(h hVar, n5.b0 b0Var, boolean z10) {
        long j10;
        synchronized (hVar) {
            d dVar = (d) b0Var.f28248c;
            if (Intrinsics.a(dVar.f31836g, b0Var)) {
                if (z10 && !dVar.f31835f) {
                    for (int i10 = 0; i10 < 2; i10++) {
                        if (((boolean[]) b0Var.f28249d)[i10] && !hVar.f31860p.f((b0) dVar.f31833d.get(i10))) {
                            b0Var.a();
                            return;
                        }
                    }
                    for (int i11 = 0; i11 < 2; i11++) {
                        b0 b0Var2 = (b0) dVar.f31833d.get(i11);
                        b0 b0Var3 = (b0) dVar.f31832c.get(i11);
                        if (hVar.f31860p.f(b0Var2)) {
                            hVar.f31860p.b(b0Var2, b0Var3);
                        } else {
                            f fVar = hVar.f31860p;
                            b0 file = (b0) dVar.f31832c.get(i11);
                            if (!fVar.f(file)) {
                                Intrinsics.checkNotNullParameter(file, "file");
                                d9.e.a(fVar.k(file));
                            }
                        }
                        long j11 = dVar.f31831b[i11];
                        Long l10 = hVar.f31860p.h(b0Var3).f7384d;
                        if (l10 != null) {
                            j10 = l10.longValue();
                        } else {
                            j10 = 0;
                        }
                        dVar.f31831b[i11] = j10;
                        hVar.f31852h = (hVar.f31852h - j11) + j10;
                    }
                } else {
                    for (int i12 = 0; i12 < 2; i12++) {
                        hVar.f31860p.e((b0) dVar.f31833d.get(i12));
                    }
                }
                dVar.f31836g = null;
                if (dVar.f31835f) {
                    hVar.x(dVar);
                    return;
                }
                hVar.f31853i++;
                bv.k kVar = hVar.f31854j;
                Intrinsics.c(kVar);
                if (!z10 && !dVar.f31834e) {
                    hVar.f31850f.remove(dVar.f31830a);
                    kVar.y("REMOVE");
                    kVar.r(32);
                    kVar.y(dVar.f31830a);
                    kVar.r(10);
                    kVar.flush();
                    if (hVar.f31852h <= hVar.f31846b || hVar.f31853i >= 2000) {
                        hVar.g();
                    }
                    return;
                }
                dVar.f31834e = true;
                kVar.y("CLEAN");
                kVar.r(32);
                kVar.y(dVar.f31830a);
                for (long j12 : dVar.f31831b) {
                    kVar.r(32).Y(j12);
                }
                kVar.r(10);
                kVar.flush();
                if (hVar.f31852h <= hVar.f31846b) {
                }
                hVar.g();
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final synchronized void I() {
        Throwable th2;
        try {
            bv.k kVar = this.f31854j;
            if (kVar != null) {
                kVar.close();
            }
            d0 u10 = hl.f.u(this.f31860p.k(this.f31848d));
            try {
                u10.y("libcore.io.DiskLruCache");
                u10.r(10);
                u10.y("1");
                u10.r(10);
                u10.Y(1);
                u10.r(10);
                u10.Y(2);
                u10.r(10);
                u10.r(10);
                for (d dVar : this.f31850f.values()) {
                    if (dVar.f31836g != null) {
                        u10.y("DIRTY");
                        u10.r(32);
                        u10.y(dVar.f31830a);
                        u10.r(10);
                    } else {
                        u10.y("CLEAN");
                        u10.r(32);
                        u10.y(dVar.f31830a);
                        for (long j10 : dVar.f31831b) {
                            u10.r(32);
                            u10.Y(j10);
                        }
                        u10.r(10);
                    }
                }
                Unit unit = Unit.f23355a;
                try {
                    u10.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                try {
                    u10.close();
                } catch (Throwable th5) {
                    ut.c.a(th4, th5);
                }
                th2 = th4;
            }
            if (th2 == null) {
                if (this.f31860p.f(this.f31847c)) {
                    this.f31860p.b(this.f31847c, this.f31849e);
                    this.f31860p.b(this.f31848d, this.f31847c);
                    this.f31860p.e(this.f31849e);
                } else {
                    this.f31860p.b(this.f31848d, this.f31847c);
                }
                this.f31854j = j();
                this.f31853i = 0;
                this.f31855k = false;
                this.f31859o = false;
            } else {
                throw th2;
            }
        } catch (Throwable th6) {
            throw th6;
        }
    }

    public final void b() {
        if (!this.f31857m) {
        } else {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public final synchronized n5.b0 c(String str) {
        n5.b0 b0Var;
        try {
            b();
            H(str);
            f();
            d dVar = (d) this.f31850f.get(str);
            if (dVar != null) {
                b0Var = dVar.f31836g;
            } else {
                b0Var = null;
            }
            if (b0Var != null) {
                return null;
            }
            if (dVar != null && dVar.f31837h != 0) {
                return null;
            }
            if (!this.f31858n && !this.f31859o) {
                bv.k kVar = this.f31854j;
                Intrinsics.c(kVar);
                kVar.y("DIRTY");
                kVar.r(32);
                kVar.y(str);
                kVar.r(10);
                kVar.flush();
                if (this.f31855k) {
                    return null;
                }
                if (dVar == null) {
                    dVar = new d(this, str);
                    this.f31850f.put(str, dVar);
                }
                n5.b0 b0Var2 = new n5.b0(this, dVar);
                dVar.f31836g = b0Var2;
                return b0Var2;
            }
            g();
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f31856l && !this.f31857m) {
                for (d dVar : (d[]) this.f31850f.values().toArray(new d[0])) {
                    n5.b0 b0Var = dVar.f31836g;
                    if (b0Var != null) {
                        Object obj = b0Var.f28248c;
                        if (Intrinsics.a(((d) obj).f31836g, b0Var)) {
                            ((d) obj).f31835f = true;
                        }
                    }
                }
                z();
                hl.f.A(this.f31851g, null);
                bv.k kVar = this.f31854j;
                Intrinsics.c(kVar);
                kVar.close();
                this.f31854j = null;
                this.f31857m = true;
                return;
            }
            this.f31857m = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized e d(String str) {
        e a10;
        b();
        H(str);
        f();
        d dVar = (d) this.f31850f.get(str);
        if (dVar != null && (a10 = dVar.a()) != null) {
            this.f31853i++;
            bv.k kVar = this.f31854j;
            Intrinsics.c(kVar);
            kVar.y("READ");
            kVar.r(32);
            kVar.y(str);
            kVar.r(10);
            if (this.f31853i >= 2000) {
                g();
            }
            return a10;
        }
        return null;
    }

    public final synchronized void f() {
        try {
            if (this.f31856l) {
                return;
            }
            this.f31860p.e(this.f31848d);
            if (this.f31860p.f(this.f31849e)) {
                if (this.f31860p.f(this.f31847c)) {
                    this.f31860p.e(this.f31849e);
                } else {
                    this.f31860p.b(this.f31849e, this.f31847c);
                }
            }
            if (this.f31860p.f(this.f31847c)) {
                try {
                    n();
                    l();
                    this.f31856l = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        o.J(this.f31860p, this.f31845a);
                        this.f31857m = false;
                    } catch (Throwable th2) {
                        this.f31857m = false;
                        throw th2;
                    }
                }
            }
            I();
            this.f31856l = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (!this.f31856l) {
            return;
        }
        b();
        z();
        bv.k kVar = this.f31854j;
        Intrinsics.c(kVar);
        kVar.flush();
    }

    public final void g() {
        yk.g.H(this.f31851g, null, null, new g(this, null), 3);
    }

    public final d0 j() {
        f fVar = this.f31860p;
        fVar.getClass();
        b0 file = this.f31847c;
        Intrinsics.checkNotNullParameter(file, "file");
        return hl.f.u(new i(fVar.a(file), new z(this, 1)));
    }

    public final void l() {
        Iterator it = this.f31850f.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i10 = 0;
            if (dVar.f31836g == null) {
                while (i10 < 2) {
                    j10 += dVar.f31831b[i10];
                    i10++;
                }
            } else {
                dVar.f31836g = null;
                while (i10 < 2) {
                    b0 b0Var = (b0) dVar.f31832c.get(i10);
                    f fVar = this.f31860p;
                    fVar.e(b0Var);
                    fVar.e((b0) dVar.f31833d.get(i10));
                    i10++;
                }
                it.remove();
            }
        }
        this.f31852h = j10;
    }

    public final void n() {
        e0 v10 = hl.f.v(this.f31860p.l(this.f31847c));
        try {
            String w10 = v10.w(Long.MAX_VALUE);
            String w11 = v10.w(Long.MAX_VALUE);
            String w12 = v10.w(Long.MAX_VALUE);
            String w13 = v10.w(Long.MAX_VALUE);
            String w14 = v10.w(Long.MAX_VALUE);
            if (Intrinsics.a("libcore.io.DiskLruCache", w10) && Intrinsics.a("1", w11) && Intrinsics.a(String.valueOf(1), w12) && Intrinsics.a(String.valueOf(2), w13) && w14.length() <= 0) {
                int i10 = 0;
                while (true) {
                    try {
                        v(v10.w(Long.MAX_VALUE));
                        i10++;
                    } catch (EOFException unused) {
                        this.f31853i = i10 - this.f31850f.size();
                        if (!v10.p()) {
                            I();
                        } else {
                            this.f31854j = j();
                        }
                        Unit unit = Unit.f23355a;
                        try {
                            v10.close();
                            th = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        if (th == null) {
                            return;
                        } else {
                            throw th;
                        }
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + w10 + ", " + w11 + ", " + w12 + ", " + w13 + ", " + w14 + ']');
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                v10.close();
            } catch (Throwable th4) {
                ut.c.a(th, th4);
            }
        }
    }

    public final void v(String str) {
        String substring;
        int z10 = w.z(str, ' ', 0, false, 6);
        if (z10 != -1) {
            int i10 = z10 + 1;
            int z11 = w.z(str, ' ', i10, false, 4);
            LinkedHashMap linkedHashMap = this.f31850f;
            if (z11 == -1) {
                substring = str.substring(i10);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                if (z10 == 6 && s.r(str, "REMOVE", false)) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i10, z11);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            }
            Object obj = linkedHashMap.get(substring);
            if (obj == null) {
                obj = new d(this, substring);
                linkedHashMap.put(substring, obj);
            }
            d dVar = (d) obj;
            if (z11 != -1 && z10 == 5 && s.r(str, "CLEAN", false)) {
                String substring2 = str.substring(z11 + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                List O = w.O(substring2, new char[]{' '});
                dVar.f31834e = true;
                dVar.f31836g = null;
                int size = O.size();
                dVar.f31838i.getClass();
                if (size == 2) {
                    try {
                        int size2 = O.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            dVar.f31831b[i11] = Long.parseLong((String) O.get(i11));
                        }
                        return;
                    } catch (NumberFormatException unused) {
                        throw new IOException("unexpected journal line: " + O);
                    }
                }
                throw new IOException("unexpected journal line: " + O);
            }
            if (z11 == -1 && z10 == 5 && s.r(str, "DIRTY", false)) {
                dVar.f31836g = new n5.b0(this, dVar);
                return;
            } else if (z11 == -1 && z10 == 4 && s.r(str, "READ", false)) {
                return;
            } else {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final void x(d dVar) {
        bv.k kVar;
        int i10 = dVar.f31837h;
        String str = dVar.f31830a;
        if (i10 > 0 && (kVar = this.f31854j) != null) {
            kVar.y("DIRTY");
            kVar.r(32);
            kVar.y(str);
            kVar.r(10);
            kVar.flush();
        }
        if (dVar.f31837h <= 0 && dVar.f31836g == null) {
            for (int i11 = 0; i11 < 2; i11++) {
                this.f31860p.e((b0) dVar.f31832c.get(i11));
                long j10 = this.f31852h;
                long[] jArr = dVar.f31831b;
                this.f31852h = j10 - jArr[i11];
                jArr[i11] = 0;
            }
            this.f31853i++;
            bv.k kVar2 = this.f31854j;
            if (kVar2 != null) {
                kVar2.y("REMOVE");
                kVar2.r(32);
                kVar2.y(str);
                kVar2.r(10);
            }
            this.f31850f.remove(str);
            if (this.f31853i >= 2000) {
                g();
                return;
            }
            return;
        }
        dVar.f31835f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        x(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z() {
        /*
            r4 = this;
        L0:
            long r0 = r4.f31852h
            long r2 = r4.f31846b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.f31850f
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            q8.d r1 = (q8.d) r1
            boolean r2 = r1.f31835f
            if (r2 != 0) goto L12
            r4.x(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.f31858n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.h.z():void");
    }
}
