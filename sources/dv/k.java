package dv;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Stack;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public e f14542a;

    /* renamed from: b, reason: collision with root package name */
    public wn.e f14543b;

    public static void a(s sVar, LinkedHashMap linkedHashMap) {
        LinkedHashMap g10 = sVar.g();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            if (!g10.containsKey(str)) {
                sVar.b(str, (String) entry.getValue());
            }
        }
    }

    public static void b(r rVar, s sVar, d dVar) {
        if (rVar != null) {
            int i10 = rVar.f14582i;
            if (i10 == 2 || ((i10 == 2 || i10 == 1) && dVar.f14504a && !dVar.f14505b)) {
                dVar.f14506c.add(sVar);
            }
        }
    }

    public static boolean h(b bVar, d dVar) {
        r rVar;
        t tVar = (t) ((n) dVar.f14508e.peek()).f14560a.f18058d;
        if (tVar != null && (rVar = tVar.f14602c) != null) {
            return rVar.a(bVar);
        }
        return true;
    }

    public static void l(List list, b bVar, d dVar) {
        s sVar;
        ((n) dVar.f14508e.peek()).f14560a.getClass();
        h8.h hVar = ((n) dVar.f14508e.peek()).f14560a;
        t tVar = null;
        if (!((List) hVar.f18057c).isEmpty()) {
            List list2 = (List) hVar.f18057c;
            ListIterator listIterator = list2.listIterator(list2.size());
            t tVar2 = null;
            while (true) {
                t tVar3 = tVar2;
                if (listIterator.hasPrevious()) {
                    if (Thread.currentThread().isInterrupted()) {
                        ((k) hVar.f18056b).getClass();
                        break;
                    }
                    tVar2 = (t) listIterator.previous();
                    r rVar = tVar2.f14602c;
                    if (rVar == null || (1 == rVar.f14575b && rVar.f14578e.isEmpty())) {
                        if (tVar3 != null) {
                            tVar = tVar3;
                            break;
                        }
                    }
                } else {
                    tVar = tVar2;
                    break;
                }
            }
        }
        if (tVar != null && (sVar = (s) list.get(tVar.f14600a)) != null) {
            if (sVar.f14591e == null) {
                sVar.f14591e = new ArrayList();
            }
            if (bVar instanceof b) {
                sVar.f14591e.add(bVar);
            } else {
                throw new RuntimeException("Attempt to add invalid item for moving; class=" + bVar.getClass());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0282  */
    /* JADX WARN: Type inference failed for: r12v20, types: [dv.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v10, types: [dv.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, dv.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final dv.s c(java.io.StringReader r17, dv.d r18) {
        /*
            Method dump skipped, instructions count: 1275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dv.k.c(java.io.StringReader, dv.d):dv.s");
    }

    public final void d(List list, d dVar) {
        t tVar;
        h8.h hVar = ((n) dVar.f14508e.peek()).f14560a;
        if (((List) hVar.f18057c).isEmpty()) {
            tVar = null;
        } else {
            tVar = (t) ((List) hVar.f18057c).get(0);
        }
        for (t tVar2 : (List) ((n) dVar.f14508e.peek()).f14560a.f18057c) {
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            this.f14542a.b(true);
        }
        if (tVar != null) {
            e(list, tVar, null, dVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0123, code lost:
    
        if (r1 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x012b, code lost:
    
        if (r15.f14516m.isEmpty() != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x012d, code lost:
    
        r15.f14516m.pop();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0132, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList e(java.util.List r12, dv.t r13, dv.u r14, dv.d r15) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dv.k.e(java.util.List, dv.t, dv.u, dv.d):java.util.ArrayList");
    }

    public final r f(String str, d dVar) {
        Stack stack;
        e eVar = this.f14542a;
        r a10 = eVar.f14518a.a(str);
        if (a10 != null && a10.f14586m != null && (stack = dVar.f14516m) != null && stack.size() > 0 && ((String) dVar.f14516m.peek()) == a10.f14586m) {
            return a10;
        }
        if (!g(str, dVar)) {
            return eVar.f14518a.a(str);
        }
        return null;
    }

    public final boolean g(String str, d dVar) {
        String str2;
        if (!this.f14542a.f14523f || str == null) {
            return false;
        }
        if (str.contains(":")) {
            return true;
        }
        Stack stack = dVar.f14516m;
        if (stack == null || stack.size() == 0 || (str2 = (String) dVar.f14516m.peek()) == null || str2.equals("http://www.w3.org/1999/xhtml")) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:285:0x0545, code lost:
    
        if (r12.f14600a <= r7) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0533, code lost:
    
        if (r12.f14600a <= r7) goto L233;
     */
    /* JADX WARN: Type inference failed for: r1v17, types: [dv.s, java.lang.Object, dv.o] */
    /* JADX WARN: Type inference failed for: r6v5, types: [dv.s, java.lang.Object, dv.o] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.util.List r22, java.util.ListIterator r23, dv.d r24) {
        /*
            Method dump skipped, instructions count: 1949
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dv.k.i(java.util.List, java.util.ListIterator, dv.d):void");
    }

    public final boolean j(ArrayList arrayList, d dVar) {
        boolean z10 = false;
        for (Object obj : arrayList) {
            if ((obj instanceof s) && !dVar.f14514k.contains(obj)) {
                s sVar = (s) obj;
                HashSet hashSet = dVar.f14513j;
                e eVar = this.f14542a;
                if (hashSet != null) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        if (((ev.a) it.next()).a(sVar)) {
                            sVar.f14598l = true;
                            dVar.f14514k.add(sVar);
                            eVar.a();
                            break;
                        }
                    }
                }
                HashSet hashSet2 = dVar.f14515l;
                if (hashSet2 != null && !hashSet2.isEmpty()) {
                    Iterator it2 = dVar.f14515l.iterator();
                    while (it2.hasNext()) {
                        if (((ev.a) it2.next()).a(sVar)) {
                        }
                    }
                    if (!sVar.f14594h) {
                        eVar.c();
                    }
                    sVar.f14598l = true;
                    dVar.f14514k.add(sVar);
                    z10 = true;
                }
                if (!sVar.j()) {
                    z10 |= j(sVar.f14590d, dVar);
                }
            }
        }
        return z10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, dv.n] */
    public final void k(d dVar) {
        Stack stack = dVar.f14508e;
        h8.h hVar = new h8.h(this);
        wn.e eVar = new wn.e(20);
        ?? obj = new Object();
        obj.f14560a = hVar;
        obj.f14561b = eVar;
    }
}
