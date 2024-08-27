package t0;

import android.os.Trace;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final Set f35230a;

    /* renamed from: e, reason: collision with root package name */
    public t.d0 f35234e;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f35231b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f35232c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f35233d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f35235f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final t.s f35236g = new t.s();

    /* renamed from: h, reason: collision with root package name */
    public final t.s f35237h = new t.s();

    public x(t.c0 c0Var) {
        this.f35230a = c0Var;
    }

    public final void a() {
        Set set = this.f35230a;
        if (!set.isEmpty()) {
            Trace.beginSection("Compose:abandons");
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    h2 h2Var = (h2) it.next();
                    it.remove();
                    h2Var.a();
                }
                Unit unit = Unit.f23355a;
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
    }

    public final void b() {
        e(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        ArrayList arrayList = this.f35232c;
        boolean z10 = !arrayList.isEmpty();
        Set set = this.f35230a;
        if (z10) {
            Trace.beginSection("Compose:onForgotten");
            try {
                t.d0 d0Var = this.f35234e;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    Object obj = arrayList.get(size);
                    if (obj instanceof h2) {
                        set.remove(obj);
                        ((h2) obj).b();
                    }
                    if (obj instanceof l) {
                        if (d0Var != null && d0Var.a(obj)) {
                            ((l) obj).a();
                        } else {
                            ((l) obj).b();
                        }
                    }
                }
                Unit unit = Unit.f23355a;
                Trace.endSection();
            } finally {
            }
        }
        ArrayList arrayList2 = this.f35231b;
        if (!arrayList2.isEmpty()) {
            Trace.beginSection("Compose:onRemembered");
            try {
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    h2 h2Var = (h2) arrayList2.get(i10);
                    set.remove(h2Var);
                    h2Var.d();
                }
                Unit unit2 = Unit.f23355a;
                Trace.endSection();
            } finally {
            }
        }
    }

    public final void c() {
        ArrayList arrayList = this.f35233d;
        if (!arrayList.isEmpty()) {
            Trace.beginSection("Compose:sideeffects");
            try {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Function0) arrayList.get(i10)).mo2invoke();
                }
                arrayList.clear();
                Unit unit = Unit.f23355a;
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
    }

    public final void d(h2 h2Var, int i10, int i11, int i12) {
        e(i10);
        if (i10 < i12) {
            this.f35235f.add(h2Var);
            this.f35236g.a(i11);
            this.f35237h.a(i12);
            return;
        }
        this.f35232c.add(h2Var);
    }

    public final void e(int i10) {
        ArrayList arrayList = this.f35235f;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = null;
            t.s sVar = null;
            int i11 = 0;
            while (true) {
                t.s sVar2 = this.f35237h;
                if (i11 >= sVar2.f34898b) {
                    break;
                }
                if (i10 >= sVar2.e(i11)) {
                    t.s sVar3 = this.f35236g;
                    int e10 = sVar3.e(i11);
                    Object obj = arrayList.get(i11);
                    sVar2.h(i11);
                    sVar3.h(i11);
                    arrayList.remove(i11);
                    if (arrayList2 == null) {
                        arrayList2 = vt.y.h(obj);
                        sVar = new t.s();
                        sVar.a(e10);
                    } else {
                        Intrinsics.d(sVar, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        int[] iArr = sVar.f34897a;
                        int i12 = sVar.f34898b;
                        int i13 = 0;
                        while (true) {
                            if (i13 < i12) {
                                if (e10 > iArr[i13]) {
                                    break;
                                } else {
                                    i13++;
                                }
                            } else {
                                i13 = -1;
                                break;
                            }
                        }
                        if (i13 < 0) {
                            i13 = sVar.f34898b;
                        }
                        sVar.b(i13, e10);
                        arrayList2.add(i13, obj);
                    }
                } else {
                    i11++;
                }
            }
            if (arrayList2 != null) {
                this.f35232c.addAll(arrayList2);
            }
        }
    }
}
