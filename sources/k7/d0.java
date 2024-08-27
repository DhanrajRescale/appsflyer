package k7;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d0 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f22323e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final c2.p f22324f = new c2.p(4);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f22325a;

    /* renamed from: b, reason: collision with root package name */
    public long f22326b;

    /* renamed from: c, reason: collision with root package name */
    public long f22327c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f22328d;

    public static y1 c(RecyclerView recyclerView, int i10, long j10) {
        int h10 = recyclerView.f2386f.h();
        for (int i11 = 0; i11 < h10; i11++) {
            y1 N = RecyclerView.N(recyclerView.f2386f.g(i11));
            if (N.f22631c == i10 && !N.j()) {
                return null;
            }
        }
        u6.g gVar = recyclerView.f2382c;
        try {
            recyclerView.U();
            y1 m10 = gVar.m(i10, j10);
            if (m10 != null) {
                if (m10.i() && !m10.j()) {
                    gVar.j(m10.f22629a);
                } else {
                    gVar.a(m10, false);
                }
            }
            recyclerView.V(false);
            return m10;
        } catch (Throwable th2) {
            recyclerView.V(false);
            throw th2;
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.U0 && !this.f22325a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f22326b == 0) {
                this.f22326b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        p2.m mVar = recyclerView.f2422x0;
        mVar.f30589b = i10;
        mVar.f30590c = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(long j10) {
        c0 c0Var;
        RecyclerView recyclerView;
        long j11;
        RecyclerView recyclerView2;
        c0 c0Var2;
        boolean z10;
        ArrayList arrayList = this.f22325a;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i11);
            if (recyclerView3.getWindowVisibility() == 0) {
                p2.m mVar = recyclerView3.f2422x0;
                mVar.b(recyclerView3, false);
                i10 += mVar.f30591d;
            }
        }
        ArrayList arrayList2 = this.f22328d;
        arrayList2.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                p2.m mVar2 = recyclerView4.f2422x0;
                int abs = Math.abs(mVar2.f30590c) + Math.abs(mVar2.f30589b);
                for (int i14 = 0; i14 < mVar2.f30591d * 2; i14 += 2) {
                    if (i12 >= arrayList2.size()) {
                        Object obj = new Object();
                        arrayList2.add(obj);
                        c0Var2 = obj;
                    } else {
                        c0Var2 = (c0) arrayList2.get(i12);
                    }
                    int[] iArr = (int[]) mVar2.f30592e;
                    int i15 = iArr[i14 + 1];
                    if (i15 <= abs) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    c0Var2.f22308a = z10;
                    c0Var2.f22309b = abs;
                    c0Var2.f22310c = i15;
                    c0Var2.f22311d = recyclerView4;
                    c0Var2.f22312e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList2, f22324f);
        for (int i16 = 0; i16 < arrayList2.size() && (recyclerView = (c0Var = (c0) arrayList2.get(i16)).f22311d) != null; i16++) {
            if (c0Var.f22308a) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = j10;
            }
            y1 c10 = c(recyclerView, c0Var.f22312e, j11);
            if (c10 != null && c10.f22630b != null && c10.i() && !c10.j() && (recyclerView2 = (RecyclerView) c10.f22630b.get()) != null) {
                if (recyclerView2.D && recyclerView2.f2386f.h() != 0) {
                    e1 e1Var = recyclerView2.f2389g0;
                    if (e1Var != null) {
                        e1Var.e();
                    }
                    i1 i1Var = recyclerView2.f2402n;
                    u6.g gVar = recyclerView2.f2382c;
                    if (i1Var != null) {
                        i1Var.m0(gVar);
                        recyclerView2.f2402n.n0(gVar);
                    }
                    gVar.b();
                }
                p2.m mVar3 = recyclerView2.f2422x0;
                mVar3.b(recyclerView2, true);
                if (mVar3.f30591d != 0) {
                    try {
                        int i17 = y3.p.f41148a;
                        y3.o.a("RV Nested Prefetch");
                        u1 u1Var = recyclerView2.f2424y0;
                        z0 z0Var = recyclerView2.f2400m;
                        u1Var.f22589d = 1;
                        u1Var.f22590e = z0Var.a();
                        u1Var.f22592g = false;
                        u1Var.f22593h = false;
                        u1Var.f22594i = false;
                        for (int i18 = 0; i18 < mVar3.f30591d * 2; i18 += 2) {
                            c(recyclerView2, ((int[]) mVar3.f30592e)[i18], j10);
                        }
                        y3.o.b();
                        c0Var.f22308a = false;
                        c0Var.f22309b = 0;
                        c0Var.f22310c = 0;
                        c0Var.f22311d = null;
                        c0Var.f22312e = 0;
                    } catch (Throwable th2) {
                        int i19 = y3.p.f41148a;
                        y3.o.b();
                        throw th2;
                    }
                }
            }
            c0Var.f22308a = false;
            c0Var.f22309b = 0;
            c0Var.f22310c = 0;
            c0Var.f22311d = null;
            c0Var.f22312e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i10 = y3.p.f41148a;
            y3.o.a("RV Prefetch");
            ArrayList arrayList = this.f22325a;
            if (arrayList.isEmpty()) {
                this.f22326b = 0L;
                y3.o.b();
                return;
            }
            int size = arrayList.size();
            long j10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i11);
                if (recyclerView.getWindowVisibility() == 0) {
                    j10 = Math.max(recyclerView.getDrawingTime(), j10);
                }
            }
            if (j10 == 0) {
                this.f22326b = 0L;
                y3.o.b();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j10) + this.f22327c);
                this.f22326b = 0L;
                y3.o.b();
            }
        } catch (Throwable th2) {
            this.f22326b = 0L;
            int i12 = y3.p.f41148a;
            y3.o.b();
            throw th2;
        }
    }
}
