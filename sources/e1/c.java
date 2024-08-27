package e1;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;
import vt.g0;

/* loaded from: classes.dex */
public class c extends i {

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f14846o = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f14847f;

    /* renamed from: g, reason: collision with root package name */
    public final Function1 f14848g;

    /* renamed from: h, reason: collision with root package name */
    public int f14849h;

    /* renamed from: i, reason: collision with root package name */
    public v0.c f14850i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f14851j;

    /* renamed from: k, reason: collision with root package name */
    public n f14852k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f14853l;

    /* renamed from: m, reason: collision with root package name */
    public int f14854m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f14855n;

    public c(int i10, n nVar, Function1 function1, Function1 function12) {
        super(i10, nVar);
        this.f14847f = function1;
        this.f14848g = function12;
        this.f14852k = n.f14896e;
        this.f14853l = f14846o;
        this.f14854m = 1;
    }

    public void A(v0.c cVar) {
        this.f14850i = cVar;
    }

    public c B(Function1 function1, Function1 function12) {
        d dVar;
        if (!this.f14882c) {
            if (this.f14855n && this.f14883d < 0) {
                al.d.f1("Unsupported operation on a disposed or applied snapshot");
                throw null;
            }
            z(d());
            Object obj = p.f14905b;
            synchronized (obj) {
                int i10 = p.f14907d;
                p.f14907d = i10 + 1;
                p.f14906c = p.f14906c.i(i10);
                n e10 = e();
                r(e10.i(i10));
                dVar = new d(i10, p.d(d() + 1, i10, e10), p.j(function1, f(), true), p.a(function12, i()), this);
            }
            if (!this.f14855n && !this.f14882c) {
                int d10 = d();
                synchronized (obj) {
                    int i11 = p.f14907d;
                    p.f14907d = i11 + 1;
                    q(i11);
                    p.f14906c = p.f14906c.i(d());
                    Unit unit = Unit.f23355a;
                }
                r(p.d(d10 + 1, d(), e()));
            }
            return dVar;
        }
        al.d.e1("Cannot use a disposed snapshot");
        throw null;
    }

    @Override // e1.i
    public final void b() {
        p.f14906c = p.f14906c.e(d()).b(this.f14852k);
    }

    @Override // e1.i
    public void c() {
        if (!this.f14882c) {
            super.c();
            l();
        }
    }

    @Override // e1.i
    public boolean g() {
        return false;
    }

    @Override // e1.i
    public int h() {
        return this.f14849h;
    }

    @Override // e1.i
    public Function1 i() {
        return this.f14848g;
    }

    @Override // e1.i
    public void k() {
        this.f14854m++;
    }

    @Override // e1.i
    public void l() {
        boolean z10;
        int i10 = this.f14854m;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i11 = i10 - 1;
            this.f14854m = i11;
            if (i11 == 0 && !this.f14855n) {
                v0.c w10 = w();
                if (w10 != null) {
                    if (true ^ this.f14855n) {
                        A(null);
                        int d10 = d();
                        Object[] objArr = w10.f37645b;
                        int i12 = w10.f37644a;
                        for (int i13 = 0; i13 < i12; i13++) {
                            Object obj = objArr[i13];
                            Intrinsics.d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            for (a0 b10 = ((y) obj).b(); b10 != null; b10 = b10.f14842b) {
                                int i14 = b10.f14841a;
                                if (i14 == d10 || g0.q(this.f14852k, Integer.valueOf(i14))) {
                                    b10.f14841a = 0;
                                }
                            }
                        }
                    } else {
                        al.d.f1("Unsupported operation on a snapshot that has been applied");
                        throw null;
                    }
                }
                a();
                return;
            }
            return;
        }
        al.d.e1("no pending nested snapshots");
        throw null;
    }

    @Override // e1.i
    public void m() {
        if (!this.f14855n && !this.f14882c) {
            u();
        }
    }

    @Override // e1.i
    public void n(y yVar) {
        v0.c w10 = w();
        if (w10 == null) {
            w10 = new v0.c();
            A(w10);
        }
        w10.add(yVar);
    }

    @Override // e1.i
    public final void o() {
        int length = this.f14853l.length;
        for (int i10 = 0; i10 < length; i10++) {
            p.s(this.f14853l[i10]);
        }
        int i11 = this.f14883d;
        if (i11 >= 0) {
            p.s(i11);
            this.f14883d = -1;
        }
    }

    @Override // e1.i
    public void s(int i10) {
        this.f14849h = i10;
    }

    @Override // e1.i
    public i t(Function1 function1) {
        e eVar;
        if (!this.f14882c) {
            if (this.f14855n && this.f14883d < 0) {
                al.d.f1("Unsupported operation on a disposed or applied snapshot");
                throw null;
            }
            int d10 = d();
            z(d());
            Object obj = p.f14905b;
            synchronized (obj) {
                int i10 = p.f14907d;
                p.f14907d = i10 + 1;
                p.f14906c = p.f14906c.i(i10);
                eVar = new e(i10, p.d(d10 + 1, i10, e()), function1, this);
            }
            if (!this.f14855n && !this.f14882c) {
                int d11 = d();
                synchronized (obj) {
                    int i11 = p.f14907d;
                    p.f14907d = i11 + 1;
                    q(i11);
                    p.f14906c = p.f14906c.i(d());
                    Unit unit = Unit.f23355a;
                }
                r(p.d(d11 + 1, d(), e()));
            }
            return eVar;
        }
        al.d.e1("Cannot use a disposed snapshot");
        throw null;
    }

    public final void u() {
        z(d());
        Unit unit = Unit.f23355a;
        if (!this.f14855n && !this.f14882c) {
            int d10 = d();
            synchronized (p.f14905b) {
                int i10 = p.f14907d;
                p.f14907d = i10 + 1;
                q(i10);
                p.f14906c = p.f14906c.i(d());
            }
            r(p.d(d10 + 1, d(), e()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d A[LOOP:0: B:25:0x009b->B:26:0x009d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9 A[LOOP:1: B:32:0x00b7->B:33:0x00b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public qu.i0 v() {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.c.v():qu.i0");
    }

    public v0.c w() {
        return this.f14850i;
    }

    @Override // e1.i
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Function1 f() {
        return this.f14847f;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, qu.i0] */
    public final i0 y(int i10, HashMap hashMap, n nVar) {
        n nVar2;
        a0 q10;
        a0 h10;
        Pair pair;
        n h11 = e().i(d()).h(this.f14852k);
        v0.c w10 = w();
        Intrinsics.c(w10);
        Object[] objArr = w10.f37645b;
        int i11 = w10.f37644a;
        int i12 = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (i12 < i11) {
            Object obj = objArr[i12];
            Intrinsics.d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            y yVar = (y) obj;
            a0 b10 = yVar.b();
            a0 q11 = p.q(b10, i10, nVar);
            if (q11 == null || (q10 = p.q(b10, d(), h11)) == null || Intrinsics.a(q11, q10)) {
                nVar2 = h11;
            } else {
                nVar2 = h11;
                a0 q12 = p.q(b10, d(), e());
                if (q12 != null) {
                    if (hashMap == null || (h10 = (a0) hashMap.get(q11)) == null) {
                        h10 = yVar.h(q10, q11, q12);
                    }
                    if (h10 == null) {
                        return new Object();
                    }
                    if (!Intrinsics.a(h10, q12)) {
                        if (Intrinsics.a(h10, q11)) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(new Pair(yVar, q11.b()));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(yVar);
                        } else {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            if (!Intrinsics.a(h10, q10)) {
                                pair = new Pair(yVar, h10);
                            } else {
                                pair = new Pair(yVar, q10.b());
                            }
                            arrayList.add(pair);
                        }
                    }
                } else {
                    p.p();
                    throw null;
                }
            }
            i12++;
            h11 = nVar2;
        }
        if (arrayList != null) {
            u();
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                Pair pair2 = (Pair) arrayList.get(i13);
                y yVar2 = (y) pair2.f23353a;
                a0 a0Var = (a0) pair2.f23354b;
                a0Var.f14841a = d();
                synchronized (p.f14905b) {
                    a0Var.f14842b = yVar2.b();
                    yVar2.e(a0Var);
                    Unit unit = Unit.f23355a;
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i14 = 0; i14 < size2; i14++) {
                w10.remove((y) arrayList2.get(i14));
            }
            ArrayList arrayList3 = this.f14851j;
            if (arrayList3 != null) {
                arrayList2 = g0.I(arrayList2, arrayList3);
            }
            this.f14851j = arrayList2;
        }
        return k.f14884i;
    }

    public final void z(int i10) {
        synchronized (p.f14905b) {
            this.f14852k = this.f14852k.i(i10);
            Unit unit = Unit.f23355a;
        }
    }
}
