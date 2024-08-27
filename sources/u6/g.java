package u6;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import d4.n1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import k7.a2;
import k7.e1;
import k7.o1;
import k7.p1;
import k7.q;
import k7.y1;
import k7.z0;
import k7.z1;
import p2.m;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f36876a;

    /* renamed from: b, reason: collision with root package name */
    public int f36877b;

    /* renamed from: c, reason: collision with root package name */
    public final Cloneable f36878c;

    /* renamed from: d, reason: collision with root package name */
    public Cloneable f36879d;

    /* renamed from: e, reason: collision with root package name */
    public final Cloneable f36880e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f36881f;

    /* renamed from: g, reason: collision with root package name */
    public Object f36882g;

    /* renamed from: h, reason: collision with root package name */
    public Object f36883h;

    /* renamed from: i, reason: collision with root package name */
    public Object f36884i;

    public g(int i10, int i11) {
        this.f36876a = i10;
        this.f36877b = i11;
        this.f36878c = new SparseArray();
        this.f36879d = new SparseArray();
        this.f36880e = new SparseArray();
        this.f36881f = new SparseArray();
        this.f36882g = new SparseArray();
    }

    public final void a(y1 y1Var, boolean z10) {
        d4.c cVar;
        RecyclerView.l(y1Var);
        a2 a2Var = ((RecyclerView) this.f36884i).F0;
        View view = y1Var.f22629a;
        if (a2Var != null) {
            z1 z1Var = a2Var.f22272e;
            if (z1Var instanceof z1) {
                cVar = (d4.c) z1Var.f22655e.remove(view);
            } else {
                cVar = null;
            }
            n1.n(view, cVar);
        }
        if (z10) {
            ((RecyclerView) this.f36884i).getClass();
            if (((RecyclerView) this.f36884i).f2403o.size() <= 0) {
                z0 z0Var = ((RecyclerView) this.f36884i).f2400m;
                if (z0Var != null) {
                    z0Var.n(y1Var);
                }
                RecyclerView recyclerView = (RecyclerView) this.f36884i;
                if (recyclerView.f2424y0 != null) {
                    recyclerView.f2388g.o(y1Var);
                }
                if (RecyclerView.V0) {
                    Log.d("RecyclerView", "dispatchViewRecycled: " + y1Var);
                }
            } else {
                a3.a.u(((RecyclerView) this.f36884i).f2403o.get(0));
                throw null;
            }
        }
        y1Var.f22647s = null;
        y1Var.f22646r = null;
        p1 d10 = d();
        d10.getClass();
        int i10 = y1Var.f22634f;
        ArrayList arrayList = d10.a(i10).f22513a;
        if (((o1) d10.f22538a.get(i10)).f22514b <= arrayList.size()) {
            hl.f.z(view);
        } else {
            if (RecyclerView.U0 && arrayList.contains(y1Var)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            y1Var.q();
            arrayList.add(y1Var);
        }
    }

    public final void b() {
        ((ArrayList) this.f36878c).clear();
        h();
    }

    public final int c(int i10) {
        if (i10 >= 0 && i10 < ((RecyclerView) this.f36884i).f2424y0.b()) {
            Object obj = this.f36884i;
            if (!((RecyclerView) obj).f2424y0.f22592g) {
                return i10;
            }
            return ((RecyclerView) obj).f2384e.f(i10, 0);
        }
        StringBuilder n10 = a3.a.n("invalid position ", i10, ". State item count is ");
        n10.append(((RecyclerView) this.f36884i).f2424y0.b());
        throw new IndexOutOfBoundsException(nn.d.i((RecyclerView) this.f36884i, n10));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, k7.p1] */
    public final p1 d() {
        if (((p1) this.f36882g) == null) {
            ?? obj = new Object();
            obj.f22538a = new SparseArray();
            obj.f22539b = 0;
            obj.f22540c = Collections.newSetFromMap(new IdentityHashMap());
            this.f36882g = obj;
            f();
        }
        return (p1) this.f36882g;
    }

    public final View e(int i10) {
        return m(i10, Long.MAX_VALUE).f22629a;
    }

    public final void f() {
        if (((p1) this.f36882g) != null) {
            Object obj = this.f36884i;
            if (((RecyclerView) obj).f2400m != null && ((RecyclerView) obj).isAttachedToWindow()) {
                p1 p1Var = (p1) this.f36882g;
                p1Var.f22540c.add(((RecyclerView) this.f36884i).f2400m);
            }
        }
    }

    public final void g(z0 z0Var, boolean z10) {
        Object obj = this.f36882g;
        if (((p1) obj) != null) {
            p1 p1Var = (p1) obj;
            Set set = p1Var.f22540c;
            set.remove(z0Var);
            if (set.size() == 0 && !z10) {
                int i10 = 0;
                while (true) {
                    SparseArray sparseArray = p1Var.f22538a;
                    if (i10 < sparseArray.size()) {
                        ArrayList arrayList = ((o1) sparseArray.get(sparseArray.keyAt(i10))).f22513a;
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            hl.f.z(((y1) arrayList.get(i11)).f22629a);
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void h() {
        ArrayList arrayList = (ArrayList) this.f36880e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i(size);
        }
        arrayList.clear();
        if (RecyclerView.f2376a1) {
            m mVar = ((RecyclerView) this.f36884i).f2422x0;
            int[] iArr = (int[]) mVar.f30592e;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            mVar.f30591d = 0;
        }
    }

    public final void i(int i10) {
        if (RecyclerView.V0) {
            Log.d("RecyclerView", "Recycling cached view at index " + i10);
        }
        Cloneable cloneable = this.f36880e;
        y1 y1Var = (y1) ((ArrayList) cloneable).get(i10);
        if (RecyclerView.V0) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + y1Var);
        }
        a(y1Var, true);
        ((ArrayList) cloneable).remove(i10);
    }

    public final void j(View view) {
        y1 N = RecyclerView.N(view);
        if (N.n()) {
            ((RecyclerView) this.f36884i).removeDetachedView(view, false);
        }
        if (N.m()) {
            N.f22642n.n(N);
        } else if (N.t()) {
            N.f22638j &= -33;
        }
        k(N);
        if (((RecyclerView) this.f36884i).f2389g0 != null && !N.k()) {
            ((RecyclerView) this.f36884i).f2389g0.d(N);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(k7.y1 r9) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.g.k(k7.y1):void");
    }

    public final void l(View view) {
        e1 e1Var;
        y1 N = RecyclerView.N(view);
        if (!N.g(12) && N.o() && (e1Var = ((RecyclerView) this.f36884i).f2389g0) != null) {
            q qVar = (q) e1Var;
            if (N.f().isEmpty() && qVar.f22542g && !N.j()) {
                if (((ArrayList) this.f36879d) == null) {
                    this.f36879d = new ArrayList();
                }
                N.f22642n = this;
                N.f22643o = true;
                ((ArrayList) this.f36879d).add(N);
                return;
            }
        }
        if (N.j() && !N.l() && !((RecyclerView) this.f36884i).f2400m.f22652b) {
            throw new IllegalArgumentException(nn.d.i((RecyclerView) this.f36884i, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        N.f22642n = this;
        N.f22643o = false;
        ((ArrayList) this.f36878c).add(N);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0219, code lost:
    
        if (((androidx.recyclerview.widget.RecyclerView) r25.f36884i).f2424y0.f22592g == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0257, code lost:
    
        if (r8.f22633e != r4.b(r8.f22631c)) goto L122;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:243:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x06f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x06d9  */
    /* JADX WARN: Type inference failed for: r4v66, types: [java.lang.Object, v5.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k7.y1 m(int r26, long r27) {
        /*
            Method dump skipped, instructions count: 1828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.g.m(int, long):k7.y1");
    }

    public final void n(y1 y1Var) {
        if (y1Var.f22643o) {
            ((ArrayList) this.f36879d).remove(y1Var);
        } else {
            ((ArrayList) this.f36878c).remove(y1Var);
        }
        y1Var.f22642n = null;
        y1Var.f22643o = false;
        y1Var.f22638j &= -33;
    }

    public final void o() {
        int i10;
        Object obj = this.f36884i;
        if (((RecyclerView) obj).f2402n != null) {
            i10 = ((RecyclerView) obj).f2402n.f22413j;
        } else {
            i10 = 0;
        }
        this.f36877b = this.f36876a + i10;
        Cloneable cloneable = this.f36880e;
        for (int size = ((ArrayList) cloneable).size() - 1; size >= 0 && ((ArrayList) cloneable).size() > this.f36877b; size--) {
            i(size);
        }
    }

    public g(RecyclerView recyclerView) {
        this.f36884i = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f36878c = arrayList;
        this.f36879d = null;
        this.f36880e = new ArrayList();
        this.f36881f = Collections.unmodifiableList(arrayList);
        this.f36876a = 2;
        this.f36877b = 2;
    }
}
