package j3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import k3.p;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public int f20840b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20841c;

    /* renamed from: d, reason: collision with root package name */
    public final d f20842d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20843e;

    /* renamed from: f, reason: collision with root package name */
    public c f20844f;

    /* renamed from: i, reason: collision with root package name */
    public c3.g f20847i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f20839a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f20845g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f20846h = Integer.MIN_VALUE;

    public c(d dVar, int i10) {
        this.f20842d = dVar;
        this.f20843e = i10;
    }

    public final void a(c cVar, int i10) {
        b(cVar, i10, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i10, int i11, boolean z10) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z10 && !i(cVar)) {
            return false;
        }
        this.f20844f = cVar;
        if (cVar.f20839a == null) {
            cVar.f20839a = new HashSet();
        }
        HashSet hashSet = this.f20844f.f20839a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f20845g = i10;
        this.f20846h = i11;
        return true;
    }

    public final void c(int i10, p pVar, ArrayList arrayList) {
        HashSet hashSet = this.f20839a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                yk.j.U0(((c) it.next()).f20842d, i10, arrayList, pVar);
            }
        }
    }

    public final int d() {
        if (this.f20841c) {
            return this.f20840b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.f20842d.f20865i0 == 8) {
            return 0;
        }
        int i10 = this.f20846h;
        if (i10 != Integer.MIN_VALUE && (cVar = this.f20844f) != null && cVar.f20842d.f20865i0 == 8) {
            return i10;
        }
        return this.f20845g;
    }

    public final c f() {
        int i10 = this.f20843e;
        int e10 = w.k.e(i10);
        d dVar = this.f20842d;
        switch (e10) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.M;
            case 2:
                return dVar.N;
            case 3:
                return dVar.K;
            case 4:
                return dVar.L;
            default:
                throw new AssertionError(da.e.A(i10));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f20839a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f20844f != null;
    }

    public final boolean i(c cVar) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (cVar == null) {
            return false;
        }
        int i10 = this.f20843e;
        d dVar = cVar.f20842d;
        int i11 = cVar.f20843e;
        if (i11 != i10) {
            switch (w.k.e(i10)) {
                case 0:
                case 7:
                case 8:
                    return false;
                case 1:
                case 3:
                    if (i11 != 2 && i11 != 4) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (dVar instanceof h) {
                        if (z10 || i11 == 8) {
                            z12 = true;
                        }
                        return z12;
                    }
                    return z10;
                case 2:
                case 4:
                    if (i11 != 3 && i11 != 5) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (dVar instanceof h) {
                        if (z11 || i11 == 9) {
                            z12 = true;
                        }
                        return z12;
                    }
                    return z11;
                case 5:
                    if (i11 == 2 || i11 == 4) {
                        return false;
                    }
                    return true;
                case 6:
                    if (i11 == 6 || i11 == 8 || i11 == 9) {
                        return false;
                    }
                    return true;
                default:
                    throw new AssertionError(da.e.A(i10));
            }
        }
        if (i10 == 6 && (!dVar.G || !this.f20842d.G)) {
            return false;
        }
        return true;
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f20844f;
        if (cVar != null && (hashSet = cVar.f20839a) != null) {
            hashSet.remove(this);
            if (this.f20844f.f20839a.size() == 0) {
                this.f20844f.f20839a = null;
            }
        }
        this.f20839a = null;
        this.f20844f = null;
        this.f20845g = 0;
        this.f20846h = Integer.MIN_VALUE;
        this.f20841c = false;
        this.f20840b = 0;
    }

    public final void k() {
        c3.g gVar = this.f20847i;
        if (gVar == null) {
            this.f20847i = new c3.g(1);
        } else {
            gVar.c();
        }
    }

    public final void l(int i10) {
        this.f20840b = i10;
        this.f20841c = true;
    }

    public final String toString() {
        return this.f20842d.f20867j0 + ":" + da.e.A(this.f20843e);
    }
}
