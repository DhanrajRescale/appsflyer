package k3;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends q {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f21988k;

    /* renamed from: l, reason: collision with root package name */
    public int f21989l;

    public d(int i10, j3.d dVar) {
        super(dVar);
        j3.d dVar2;
        q qVar;
        int i11;
        q qVar2;
        this.f21988k = new ArrayList();
        this.f22034f = i10;
        j3.d dVar3 = this.f22030b;
        j3.d o10 = dVar3.o(i10);
        while (true) {
            dVar2 = dVar3;
            dVar3 = o10;
            if (dVar3 == null) {
                break;
            } else {
                o10 = dVar3.o(this.f22034f);
            }
        }
        this.f22030b = dVar2;
        int i12 = this.f22034f;
        if (i12 == 0) {
            qVar = dVar2.f20854d;
        } else if (i12 == 1) {
            qVar = dVar2.f20856e;
        } else {
            qVar = null;
        }
        ArrayList arrayList = this.f21988k;
        arrayList.add(qVar);
        j3.d n10 = dVar2.n(this.f22034f);
        while (n10 != null) {
            int i13 = this.f22034f;
            if (i13 == 0) {
                qVar2 = n10.f20854d;
            } else if (i13 == 1) {
                qVar2 = n10.f20856e;
            } else {
                qVar2 = null;
            }
            arrayList.add(qVar2);
            n10 = n10.n(this.f22034f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            q qVar3 = (q) it.next();
            int i14 = this.f22034f;
            if (i14 == 0) {
                qVar3.f22030b.f20850b = this;
            } else if (i14 == 1) {
                qVar3.f22030b.f20852c = this;
            }
        }
        if (this.f22034f == 0 && ((j3.e) this.f22030b.V).f20895x0 && arrayList.size() > 1) {
            this.f22030b = ((q) jr.h.l(arrayList, 1)).f22030b;
        }
        if (this.f22034f == 0) {
            i11 = this.f22030b.f20869k0;
        } else {
            i11 = this.f22030b.f20871l0;
        }
        this.f21989l = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:291:0x03aa, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    @Override // k3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(k3.e r27) {
        /*
            Method dump skipped, instructions count: 969
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.d.a(k3.e):void");
    }

    @Override // k3.q
    public final void d() {
        ArrayList arrayList = this.f21988k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((q) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        j3.d dVar = ((q) arrayList.get(0)).f22030b;
        j3.d dVar2 = ((q) arrayList.get(size - 1)).f22030b;
        int i10 = this.f22034f;
        g gVar = this.f22037i;
        g gVar2 = this.f22036h;
        if (i10 == 0) {
            j3.c cVar = dVar.K;
            j3.c cVar2 = dVar2.M;
            g i11 = q.i(cVar, 0);
            int e10 = cVar.e();
            j3.d m10 = m();
            if (m10 != null) {
                e10 = m10.K.e();
            }
            if (i11 != null) {
                q.b(gVar2, i11, e10);
            }
            g i12 = q.i(cVar2, 0);
            int e11 = cVar2.e();
            j3.d n10 = n();
            if (n10 != null) {
                e11 = n10.M.e();
            }
            if (i12 != null) {
                q.b(gVar, i12, -e11);
            }
        } else {
            j3.c cVar3 = dVar.L;
            j3.c cVar4 = dVar2.N;
            g i13 = q.i(cVar3, 1);
            int e12 = cVar3.e();
            j3.d m11 = m();
            if (m11 != null) {
                e12 = m11.L.e();
            }
            if (i13 != null) {
                q.b(gVar2, i13, e12);
            }
            g i14 = q.i(cVar4, 1);
            int e13 = cVar4.e();
            j3.d n11 = n();
            if (n11 != null) {
                e13 = n11.N.e();
            }
            if (i14 != null) {
                q.b(gVar, i14, -e13);
            }
        }
        gVar2.f21999a = this;
        gVar.f21999a = this;
    }

    @Override // k3.q
    public final void e() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f21988k;
            if (i10 < arrayList.size()) {
                ((q) arrayList.get(i10)).e();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // k3.q
    public final void f() {
        this.f22031c = null;
        Iterator it = this.f21988k.iterator();
        while (it.hasNext()) {
            ((q) it.next()).f();
        }
    }

    @Override // k3.q
    public final long j() {
        ArrayList arrayList = this.f21988k;
        int size = arrayList.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j10 = r5.f22037i.f22004f + ((q) arrayList.get(i10)).j() + j10 + r5.f22036h.f22004f;
        }
        return j10;
    }

    @Override // k3.q
    public final boolean k() {
        ArrayList arrayList = this.f21988k;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((q) arrayList.get(i10)).k()) {
                return false;
            }
        }
        return true;
    }

    public final j3.d m() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f21988k;
            if (i10 < arrayList.size()) {
                j3.d dVar = ((q) arrayList.get(i10)).f22030b;
                if (dVar.f20865i0 != 8) {
                    return dVar;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final j3.d n() {
        ArrayList arrayList = this.f21988k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j3.d dVar = ((q) arrayList.get(size)).f22030b;
            if (dVar.f20865i0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        if (this.f22034f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb2.append(str);
        Iterator it = this.f21988k.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            sb2.append(UrlTreeKt.configurablePathSegmentPrefix);
            sb2.append(qVar);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
