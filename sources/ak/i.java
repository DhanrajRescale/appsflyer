package ak;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f492a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f493b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.d f494c;

    /* renamed from: d, reason: collision with root package name */
    public Object f495d;

    /* renamed from: e, reason: collision with root package name */
    public int f496e;

    /* renamed from: f, reason: collision with root package name */
    public int f497f;

    /* renamed from: g, reason: collision with root package name */
    public Class f498g;

    /* renamed from: h, reason: collision with root package name */
    public q f499h;

    /* renamed from: i, reason: collision with root package name */
    public xj.k f500i;

    /* renamed from: j, reason: collision with root package name */
    public Map f501j;

    /* renamed from: k, reason: collision with root package name */
    public Class f502k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f503l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f504m;

    /* renamed from: n, reason: collision with root package name */
    public xj.g f505n;

    /* renamed from: o, reason: collision with root package name */
    public com.bumptech.glide.e f506o;

    /* renamed from: p, reason: collision with root package name */
    public p f507p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f508q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f509r;

    public final ArrayList a() {
        boolean z10 = this.f504m;
        ArrayList arrayList = this.f493b;
        if (!z10) {
            this.f504m = true;
            arrayList.clear();
            ArrayList b10 = b();
            int size = b10.size();
            for (int i10 = 0; i10 < size; i10++) {
                ek.v vVar = (ek.v) b10.get(i10);
                if (!arrayList.contains(vVar.f15628a)) {
                    arrayList.add(vVar.f15628a);
                }
                int i11 = 0;
                while (true) {
                    List list = vVar.f15629b;
                    if (i11 < list.size()) {
                        if (!arrayList.contains(list.get(i11))) {
                            arrayList.add(list.get(i11));
                        }
                        i11++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z10 = this.f503l;
        ArrayList arrayList = this.f492a;
        if (!z10) {
            this.f503l = true;
            arrayList.clear();
            List j10 = this.f494c.f10802b.j(this.f495d);
            int size = j10.size();
            for (int i10 = 0; i10 < size; i10++) {
                ek.v b10 = ((ek.w) j10.get(i10)).b(this.f495d, this.f496e, this.f497f, this.f500i);
                if (b10 != null) {
                    arrayList.add(b10);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final c0 c(Class cls) {
        c0 c0Var;
        c0 c0Var2;
        c0 c0Var3;
        ArrayList arrayList;
        kk.a aVar;
        j8.m mVar = this.f494c.f10802b;
        Class cls2 = this.f498g;
        Class cls3 = this.f502k;
        mk.b bVar = (mk.b) mVar.f21101i;
        rk.i iVar = (rk.i) bVar.f27815b.getAndSet(null);
        rk.i iVar2 = iVar;
        if (iVar == null) {
            iVar2 = new Object();
        }
        iVar2.f33946a = cls;
        iVar2.f33947b = cls2;
        iVar2.f33948c = cls3;
        synchronized (bVar.f27814a) {
            c0Var = (c0) bVar.f27814a.get(iVar2);
        }
        bVar.f27815b.set(iVar2);
        ((mk.b) mVar.f21101i).getClass();
        if (mk.b.f27813c.equals(c0Var)) {
            return null;
        }
        if (c0Var == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((da.d) mVar.f21095c).s(cls, cls2).iterator();
            while (it.hasNext()) {
                Class<?> cls4 = (Class) it.next();
                Iterator it2 = ((q9.b) mVar.f21098f).f(cls4, cls3).iterator();
                while (it2.hasNext()) {
                    Class cls5 = (Class) it2.next();
                    da.d dVar = (da.d) mVar.f21095c;
                    synchronized (dVar) {
                        arrayList = new ArrayList();
                        Iterator it3 = ((List) dVar.f14276b).iterator();
                        while (it3.hasNext()) {
                            List<mk.c> list = (List) ((Map) dVar.f14277c).get((String) it3.next());
                            if (list != null) {
                                for (mk.c cVar : list) {
                                    if (cVar.f27816a.isAssignableFrom(cls) && cls4.isAssignableFrom(cVar.f27817b)) {
                                        arrayList.add(cVar.f27818c);
                                    }
                                }
                            }
                        }
                    }
                    q9.b bVar2 = (q9.b) mVar.f21098f;
                    synchronized (bVar2) {
                        if (cls5.isAssignableFrom(cls4)) {
                            aVar = kk.c.f23236a;
                        } else {
                            for (kk.b bVar3 : bVar2.f31867a) {
                                if (bVar3.f23233a.isAssignableFrom(cls4) && cls5.isAssignableFrom(bVar3.f23234b)) {
                                    aVar = bVar3.f23235c;
                                }
                            }
                            throw new IllegalArgumentException("No transcoder registered to transcode from " + cls4 + " to " + cls5);
                        }
                    }
                    arrayList2.add(new n(cls, cls4, cls5, arrayList, aVar, (c4.e) mVar.f21102j));
                }
            }
            if (arrayList2.isEmpty()) {
                c0Var2 = null;
            } else {
                c0Var2 = new c0(cls, cls2, cls3, arrayList2, (c4.e) mVar.f21102j);
            }
            mk.b bVar4 = (mk.b) mVar.f21101i;
            synchronized (bVar4.f27814a) {
                t.f fVar = bVar4.f27814a;
                rk.i iVar3 = new rk.i(cls, cls2, cls3);
                if (c0Var2 != null) {
                    c0Var3 = c0Var2;
                } else {
                    c0Var3 = mk.b.f27813c;
                }
                fVar.put(iVar3, c0Var3);
            }
            return c0Var2;
        }
        return c0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r1 = r3.f27812b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final xj.c d(java.lang.Object r6) {
        /*
            r5 = this;
            com.bumptech.glide.d r0 = r5.f494c
            j8.m r0 = r0.f10802b
            java.lang.Object r0 = r0.f21094b
            l9.c r0 = (l9.c) r0
            java.lang.Class r1 = r6.getClass()
            monitor-enter(r0)
            java.util.ArrayList r2 = r0.f24251a     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2b
        L13:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2b
            mk.a r3 = (mk.a) r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Class r4 = r3.f27811a     // Catch: java.lang.Throwable -> L2b
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L13
            xj.c r1 = r3.f27812b     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)
            goto L2f
        L2b:
            r6 = move-exception
            goto L4a
        L2d:
            monitor-exit(r0)
            r1 = 0
        L2f:
            if (r1 == 0) goto L32
            return r1
        L32:
            com.bumptech.glide.Registry$NoSourceEncoderAvailableException r0 = new com.bumptech.glide.Registry$NoSourceEncoderAvailableException
            java.lang.Class r6 = r6.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to find source encoder for data class: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L4a:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ak.i.d(java.lang.Object):xj.c");
    }

    public final xj.o e(Class cls) {
        xj.o oVar = (xj.o) this.f501j.get(cls);
        if (oVar == null) {
            Iterator it = this.f501j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    oVar = (xj.o) entry.getValue();
                    break;
                }
            }
        }
        if (oVar == null) {
            if (this.f501j.isEmpty() && this.f508q) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return gk.a.f17446b;
        }
        return oVar;
    }
}
