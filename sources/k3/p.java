package k3;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: f, reason: collision with root package name */
    public static int f22023f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f22024a;

    /* renamed from: b, reason: collision with root package name */
    public int f22025b;

    /* renamed from: c, reason: collision with root package name */
    public int f22026c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f22027d;

    /* renamed from: e, reason: collision with root package name */
    public int f22028e;

    public final void a(ArrayList arrayList) {
        int size = this.f22024a.size();
        if (this.f22028e != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                p pVar = (p) arrayList.get(i10);
                if (this.f22028e == pVar.f22025b) {
                    c(this.f22026c, pVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [k3.o, java.lang.Object] */
    public final int b(c3.d dVar, int i10) {
        int n10;
        int n11;
        ArrayList arrayList = this.f22024a;
        if (arrayList.size() == 0) {
            return 0;
        }
        j3.e eVar = (j3.e) ((j3.d) arrayList.get(0)).V;
        dVar.t();
        eVar.d(dVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((j3.d) arrayList.get(i11)).d(dVar, false);
        }
        if (i10 == 0 && eVar.B0 > 0) {
            hl.f.s(eVar, dVar, arrayList, 0);
        }
        if (i10 == 1 && eVar.C0 > 0) {
            hl.f.s(eVar, dVar, arrayList, 1);
        }
        try {
            dVar.p();
        } catch (Exception e10) {
            System.err.println(e10.toString() + "\n" + Arrays.toString(e10.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", HttpUrl.FRAGMENT_ENCODE_SET));
        }
        this.f22027d = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            j3.d dVar2 = (j3.d) arrayList.get(i12);
            ?? obj = new Object();
            obj.f22022e = new WeakReference(dVar2);
            c3.d.n(dVar2.K);
            obj.f22018a = c3.d.n(dVar2.L);
            obj.f22019b = c3.d.n(dVar2.M);
            c3.d.n(dVar2.N);
            obj.f22020c = c3.d.n(dVar2.O);
            obj.f22021d = i10;
            this.f22027d.add(obj);
        }
        if (i10 == 0) {
            n10 = c3.d.n(eVar.K);
            n11 = c3.d.n(eVar.M);
            dVar.t();
        } else {
            n10 = c3.d.n(eVar.L);
            n11 = c3.d.n(eVar.N);
            dVar.t();
        }
        return n11 - n10;
    }

    public final void c(int i10, p pVar) {
        Iterator it = this.f22024a.iterator();
        while (it.hasNext()) {
            j3.d dVar = (j3.d) it.next();
            ArrayList arrayList = pVar.f22024a;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            int i11 = pVar.f22025b;
            if (i10 == 0) {
                dVar.f20878p0 = i11;
            } else {
                dVar.f20880q0 = i11;
            }
        }
        this.f22028e = pVar.f22025b;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f22026c;
        if (i10 == 0) {
            str = "Horizontal";
        } else if (i10 == 1) {
            str = "Vertical";
        } else if (i10 == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        sb2.append(str);
        sb2.append(" [");
        String m10 = nn.d.m(sb2, this.f22025b, "] <");
        Iterator it = this.f22024a.iterator();
        while (it.hasNext()) {
            j3.d dVar = (j3.d) it.next();
            StringBuilder r10 = da.e.r(m10, " ");
            r10.append(dVar.f20867j0);
            m10 = r10.toString();
        }
        return jr.h.r(m10, " >");
    }
}
