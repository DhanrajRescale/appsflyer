package mv;

import d4.c0;
import el.l;
import hv.r;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import w.k;

/* loaded from: classes2.dex */
public final class b extends h implements Serializable {
    private static final long serialVersionUID = 3044319355680032515L;

    /* renamed from: a, reason: collision with root package name */
    public final long[] f28076a;

    /* renamed from: b, reason: collision with root package name */
    public final r[] f28077b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f28078c;

    /* renamed from: d, reason: collision with root package name */
    public final hv.g[] f28079d;

    /* renamed from: e, reason: collision with root package name */
    public final r[] f28080e;

    /* renamed from: f, reason: collision with root package name */
    public final f[] f28081f;

    /* renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap f28082g = new ConcurrentHashMap();

    public b(long[] jArr, r[] rVarArr, long[] jArr2, r[] rVarArr2, f[] fVarArr) {
        this.f28076a = jArr;
        this.f28077b = rVarArr;
        this.f28078c = jArr2;
        this.f28080e = rVarArr2;
        this.f28081f = fVarArr;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < jArr2.length) {
            r rVar = rVarArr2[i10];
            int i11 = i10 + 1;
            r rVar2 = rVarArr2[i11];
            hv.g u10 = hv.g.u(jArr2[i10], 0, rVar);
            if (rVar2.f18764b > rVar.f18764b) {
                arrayList.add(u10);
                arrayList.add(u10.y(rVar2.f18764b - r0));
            } else {
                arrayList.add(u10.y(r3 - r0));
                arrayList.add(u10);
            }
            i10 = i11;
        }
        this.f28079d = (hv.g[]) arrayList.toArray(new hv.g[arrayList.size()]);
    }

    private Object writeReplace() {
        return new a((byte) 1, this);
    }

    @Override // mv.h
    public final r a(hv.e eVar) {
        long j10 = eVar.f18717a;
        int length = this.f28081f.length;
        r[] rVarArr = this.f28080e;
        long[] jArr = this.f28078c;
        if (length > 0 && j10 > jArr[jArr.length - 1]) {
            e[] g10 = g(hv.f.B(l.W(rVarArr[rVarArr.length - 1].f18764b + j10, 86400L)).f18721a);
            e eVar2 = null;
            for (int i10 = 0; i10 < g10.length; i10++) {
                eVar2 = g10[i10];
                hv.g gVar = eVar2.f28091a;
                r rVar = eVar2.f28092b;
                if (j10 < gVar.l(rVar)) {
                    return rVar;
                }
            }
            return eVar2.f28093c;
        }
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return rVarArr[binarySearch + 1];
    }

    @Override // mv.h
    public final e b(hv.g gVar) {
        Object h10 = h(gVar);
        if (h10 instanceof e) {
            return (e) h10;
        }
        return null;
    }

    @Override // mv.h
    public final List c(hv.g gVar) {
        Object h10 = h(gVar);
        if (h10 instanceof e) {
            e eVar = (e) h10;
            r rVar = eVar.f28093c;
            int i10 = rVar.f18764b;
            r rVar2 = eVar.f28092b;
            if (i10 > rVar2.f18764b) {
                return Collections.emptyList();
            }
            return Arrays.asList(rVar2, rVar);
        }
        return Collections.singletonList((r) h10);
    }

    @Override // mv.h
    public final boolean d(hv.e eVar) {
        int binarySearch = Arrays.binarySearch(this.f28076a, eVar.f18717a);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return !this.f28077b[binarySearch + 1].equals(a(eVar));
    }

    @Override // mv.h
    public final boolean e() {
        if (this.f28078c.length == 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (Arrays.equals(this.f28076a, bVar.f28076a) && Arrays.equals(this.f28077b, bVar.f28077b) && Arrays.equals(this.f28078c, bVar.f28078c) && Arrays.equals(this.f28080e, bVar.f28080e) && Arrays.equals(this.f28081f, bVar.f28081f)) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        if (e() && a(hv.e.f18716c).equals(((g) obj).f28103a)) {
            return true;
        }
        return false;
    }

    @Override // mv.h
    public final boolean f(hv.g gVar, r rVar) {
        return c(gVar).contains(rVar);
    }

    public final e[] g(int i10) {
        hv.f o10;
        Integer valueOf = Integer.valueOf(i10);
        ConcurrentHashMap concurrentHashMap = this.f28082g;
        e[] eVarArr = (e[]) concurrentHashMap.get(valueOf);
        if (eVarArr != null) {
            return eVarArr;
        }
        f[] fVarArr = this.f28081f;
        e[] eVarArr2 = new e[fVarArr.length];
        for (int i11 = 0; i11 < fVarArr.length; i11++) {
            f fVar = fVarArr[i11];
            hv.c cVar = fVar.f28096c;
            hv.i iVar = fVar.f28094a;
            byte b10 = fVar.f28095b;
            if (b10 < 0) {
                long j10 = i10;
                iv.f.f20561a.getClass();
                int n10 = iVar.n(iv.f.b(j10)) + 1 + b10;
                hv.f fVar2 = hv.f.f18719d;
                lv.a.YEAR.h(j10);
                lv.a.DAY_OF_MONTH.h(n10);
                o10 = hv.f.o(i10, iVar, n10);
                if (cVar != null) {
                    o10 = o10.e(new c0(1, cVar));
                }
            } else {
                hv.f fVar3 = hv.f.f18719d;
                lv.a.YEAR.h(i10);
                l.D0(iVar, "month");
                lv.a.DAY_OF_MONTH.h(b10);
                o10 = hv.f.o(i10, iVar, b10);
                if (cVar != null) {
                    o10 = o10.e(new c0(0, cVar));
                }
            }
            hv.g t10 = hv.g.t(o10.D(fVar.f28098e), fVar.f28097d);
            int e10 = k.e(fVar.f28099f);
            r rVar = fVar.f28101h;
            if (e10 != 0) {
                if (e10 == 2) {
                    t10 = t10.y(rVar.f18764b - fVar.f28100g.f18764b);
                }
            } else {
                t10 = t10.y(rVar.f18764b - r.f18761f.f18764b);
            }
            eVarArr2[i11] = new e(t10, rVar, fVar.f28102i);
        }
        if (i10 < 2100) {
            concurrentHashMap.putIfAbsent(valueOf, eVarArr2);
        }
        return eVarArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        if (r14.r(r10.y(r7.f18764b - r9.f18764b)) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        if (r14.r(r10.y(r7.f18764b - r9.f18764b)) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(hv.g r14) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mv.b.h(hv.g):java.lang.Object");
    }

    public final int hashCode() {
        return (((Arrays.hashCode(this.f28076a) ^ Arrays.hashCode(this.f28077b)) ^ Arrays.hashCode(this.f28078c)) ^ Arrays.hashCode(this.f28080e)) ^ Arrays.hashCode(this.f28081f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StandardZoneRules[currentStandardOffset=");
        sb2.append(this.f28077b[r1.length - 1]);
        sb2.append("]");
        return sb2.toString();
    }
}
