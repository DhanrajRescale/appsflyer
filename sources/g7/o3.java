package g7;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class o3 {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f16981a;

    /* renamed from: b, reason: collision with root package name */
    public u0 f16982b;

    /* renamed from: c, reason: collision with root package name */
    public t4 f16983c;

    /* renamed from: d, reason: collision with root package name */
    public z2 f16984d;

    /* renamed from: e, reason: collision with root package name */
    public final h.c f16985e;

    /* renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArrayList f16986f;

    /* renamed from: g, reason: collision with root package name */
    public final q4 f16987g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f16988h;

    /* renamed from: i, reason: collision with root package name */
    public volatile int f16989i;

    /* renamed from: j, reason: collision with root package name */
    public final tu.i1 f16990j;

    /* renamed from: k, reason: collision with root package name */
    public final tu.w0 f16991k;

    public o3(CoroutineContext mainContext, c3 c3Var) {
        g1 g1Var;
        z2 z2Var;
        g1 g1Var2;
        Intrinsics.checkNotNullParameter(mainContext, "mainContext");
        this.f16981a = mainContext;
        z2 z2Var2 = z2.f17160e;
        if (c3Var != null) {
            g1Var = (g1) c3Var.f16696d.mo2invoke();
        } else {
            g1Var = null;
        }
        if (g1Var != null) {
            z2Var = new z2(g1Var);
        } else {
            z2Var = z2.f17160e;
            Intrinsics.d(z2Var, "null cannot be cast to non-null type androidx.paging.PageStore<T of androidx.paging.PageStore.Companion.initial>");
        }
        this.f16984d = z2Var;
        h.c cVar = new h.c(21, 0);
        if (c3Var != null && (g1Var2 = (g1) c3Var.f16696d.mo2invoke()) != null) {
            cVar.U(g1Var2.f16789e, g1Var2.f16790f);
        }
        this.f16985e = cVar;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f16986f = copyOnWriteArrayList;
        this.f16987g = new q4(true);
        this.f16990j = (tu.i1) cVar.f17585d;
        this.f16991k = tu.x0.a(0, 64, su.a.f34777b);
        c2.p0 listener = new c2.p0(this, 13);
        Intrinsics.checkNotNullParameter(listener, "listener");
        copyOnWriteArrayList.add(listener);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(g7.o3 r5, java.util.List r6, int r7, int r8, boolean r9, g7.a1 r10, g7.a1 r11, g7.u0 r12, yt.a r13) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.o3.a(g7.o3, java.util.List, int, int, boolean, g7.a1, g7.a1, g7.u0, yt.a):java.lang.Object");
    }

    public final Object b(int i10) {
        this.f16988h = true;
        this.f16989i = i10;
        if (Log.isLoggable("Paging", 2)) {
            String message = "Accessing item index[" + i10 + ']';
            Intrinsics.checkNotNullParameter(message, "message");
            Log.v("Paging", message, null);
        }
        u0 u0Var = this.f16982b;
        if (u0Var != null) {
            u0Var.j(this.f16984d.a(i10));
        }
        z2 z2Var = this.f16984d;
        if (i10 >= 0) {
            if (i10 < z2Var.e()) {
                int i11 = i10 - z2Var.f17163c;
                if (i11 < 0 || i11 >= z2Var.f17162b) {
                    return null;
                }
                return z2Var.b(i11);
            }
        } else {
            z2Var.getClass();
        }
        StringBuilder n10 = a3.a.n("Index: ", i10, ", Size: ");
        n10.append(z2Var.e());
        throw new IndexOutOfBoundsException(n10.toString());
    }

    public abstract Object c(kp.j jVar, yt.a aVar);

    public final v0 d() {
        z2 z2Var = this.f16984d;
        int i10 = z2Var.f17163c;
        int i11 = z2Var.f17164d;
        ArrayList arrayList = z2Var.f17161a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            vt.d0.m(((s4) it.next()).f17055b, arrayList2);
        }
        return new v0(i10, i11, arrayList2);
    }
}
