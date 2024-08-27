package t7;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import d4.b1;
import d4.n1;
import d4.v0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public abstract class p implements Cloneable {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f35500u = {2, 1, 3, 4};

    /* renamed from: v, reason: collision with root package name */
    public static final mt.p f35501v = new Object();

    /* renamed from: w, reason: collision with root package name */
    public static final ThreadLocal f35502w = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f35513k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f35514l;

    /* renamed from: s, reason: collision with root package name */
    public vl.b f35521s;

    /* renamed from: a, reason: collision with root package name */
    public final String f35503a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f35504b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f35505c = -1;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f35506d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f35507e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f35508f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public h8.h f35509g = new h8.h(5);

    /* renamed from: h, reason: collision with root package name */
    public h8.h f35510h = new h8.h(5);

    /* renamed from: i, reason: collision with root package name */
    public u f35511i = null;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f35512j = f35500u;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f35515m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public int f35516n = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f35517o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f35518p = false;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f35519q = null;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f35520r = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public mt.p f35522t = f35501v;

    public static void c(h8.h hVar, View view, w wVar) {
        ((t.f) hVar.f18056b).put(view, wVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (((SparseArray) hVar.f18057c).indexOfKey(id2) >= 0) {
                ((SparseArray) hVar.f18057c).put(id2, null);
            } else {
                ((SparseArray) hVar.f18057c).put(id2, view);
            }
        }
        WeakHashMap weakHashMap = n1.f13788a;
        String k10 = b1.k(view);
        if (k10 != null) {
            if (((t.f) hVar.f18059e).containsKey(k10)) {
                ((t.f) hVar.f18059e).put(k10, null);
            } else {
                ((t.f) hVar.f18059e).put(k10, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (((t.o) hVar.f18058d).d(itemIdAtPosition) >= 0) {
                    View view2 = (View) ((t.o) hVar.f18058d).c(itemIdAtPosition);
                    if (view2 != null) {
                        v0.r(view2, false);
                        ((t.o) hVar.f18058d).g(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                v0.r(view, true);
                ((t.o) hVar.f18058d).g(itemIdAtPosition, view);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [t.j0, java.lang.Object, t.f] */
    public static t.f o() {
        ThreadLocal threadLocal = f35502w;
        t.f fVar = (t.f) threadLocal.get();
        if (fVar == null) {
            ?? j0Var = new t.j0();
            threadLocal.set(j0Var);
            return j0Var;
        }
        return fVar;
    }

    public static boolean t(w wVar, w wVar2, String str) {
        Object obj = wVar.f35535a.get(str);
        Object obj2 = wVar2.f35535a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j10) {
        this.f35505c = j10;
    }

    public void B(vl.b bVar) {
        this.f35521s = bVar;
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.f35506d = timeInterpolator;
    }

    public void D(mt.p pVar) {
        if (pVar == null) {
            this.f35522t = f35501v;
        } else {
            this.f35522t = pVar;
        }
    }

    public void E() {
    }

    public void F(long j10) {
        this.f35504b = j10;
    }

    public final void G() {
        if (this.f35516n == 0) {
            ArrayList arrayList = this.f35519q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f35519q.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((o) arrayList2.get(i10)).e(this);
                }
            }
            this.f35518p = false;
        }
        this.f35516n++;
    }

    public String H(String str) {
        StringBuilder p10 = da.e.p(str);
        p10.append(getClass().getSimpleName());
        p10.append("@");
        p10.append(Integer.toHexString(hashCode()));
        p10.append(": ");
        String sb2 = p10.toString();
        if (this.f35505c != -1) {
            sb2 = a3.a.j(da.e.r(sb2, "dur("), this.f35505c, ") ");
        }
        if (this.f35504b != -1) {
            sb2 = a3.a.j(da.e.r(sb2, "dly("), this.f35504b, ") ");
        }
        if (this.f35506d != null) {
            StringBuilder r10 = da.e.r(sb2, "interp(");
            r10.append(this.f35506d);
            r10.append(") ");
            sb2 = r10.toString();
        }
        ArrayList arrayList = this.f35507e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f35508f;
        if (size > 0 || arrayList2.size() > 0) {
            String r11 = jr.h.r(sb2, "tgts(");
            if (arrayList.size() > 0) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (i10 > 0) {
                        r11 = jr.h.r(r11, ", ");
                    }
                    StringBuilder p11 = da.e.p(r11);
                    p11.append(arrayList.get(i10));
                    r11 = p11.toString();
                }
            }
            if (arrayList2.size() > 0) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (i11 > 0) {
                        r11 = jr.h.r(r11, ", ");
                    }
                    StringBuilder p12 = da.e.p(r11);
                    p12.append(arrayList2.get(i11));
                    r11 = p12.toString();
                }
            }
            return jr.h.r(r11, ")");
        }
        return sb2;
    }

    public void a(o oVar) {
        if (this.f35519q == null) {
            this.f35519q = new ArrayList();
        }
        this.f35519q.add(oVar);
    }

    public void b(View view) {
        this.f35508f.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.f35515m;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = this.f35519q;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) this.f35519q.clone();
            int size2 = arrayList3.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((o) arrayList3.get(i10)).b();
            }
        }
    }

    public abstract void d(w wVar);

    public final void e(View view, boolean z10) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            w wVar = new w(view);
            if (z10) {
                g(wVar);
            } else {
                d(wVar);
            }
            wVar.f35537c.add(this);
            f(wVar);
            if (z10) {
                c(this.f35509g, view, wVar);
            } else {
                c(this.f35510h, view, wVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10), z10);
            }
        }
    }

    public void f(w wVar) {
    }

    public abstract void g(w wVar);

    public final void h(ViewGroup viewGroup, boolean z10) {
        i(z10);
        ArrayList arrayList = this.f35507e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f35508f;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z10);
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i10)).intValue());
            if (findViewById != null) {
                w wVar = new w(findViewById);
                if (z10) {
                    g(wVar);
                } else {
                    d(wVar);
                }
                wVar.f35537c.add(this);
                f(wVar);
                if (z10) {
                    c(this.f35509g, findViewById, wVar);
                } else {
                    c(this.f35510h, findViewById, wVar);
                }
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            View view = (View) arrayList2.get(i11);
            w wVar2 = new w(view);
            if (z10) {
                g(wVar2);
            } else {
                d(wVar2);
            }
            wVar2.f35537c.add(this);
            f(wVar2);
            if (z10) {
                c(this.f35509g, view, wVar2);
            } else {
                c(this.f35510h, view, wVar2);
            }
        }
    }

    public final void i(boolean z10) {
        if (z10) {
            ((t.f) this.f35509g.f18056b).clear();
            ((SparseArray) this.f35509g.f18057c).clear();
            ((t.o) this.f35509g.f18058d).a();
        } else {
            ((t.f) this.f35510h.f18056b).clear();
            ((SparseArray) this.f35510h.f18057c).clear();
            ((t.o) this.f35510h.f18058d).a();
        }
    }

    @Override // 
    /* renamed from: j */
    public p clone() {
        try {
            p pVar = (p) super.clone();
            pVar.f35520r = new ArrayList();
            pVar.f35509g = new h8.h(5);
            pVar.f35510h = new h8.h(5);
            pVar.f35513k = null;
            pVar.f35514l = null;
            return pVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator k(ViewGroup viewGroup, w wVar, w wVar2) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [t7.n, java.lang.Object] */
    public void l(ViewGroup viewGroup, h8.h hVar, h8.h hVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator k10;
        int i10;
        View view;
        w wVar;
        Animator animator;
        w wVar2;
        t.f o10 = o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            w wVar3 = (w) arrayList.get(i11);
            w wVar4 = (w) arrayList2.get(i11);
            if (wVar3 != null && !wVar3.f35537c.contains(this)) {
                wVar3 = null;
            }
            if (wVar4 != null && !wVar4.f35537c.contains(this)) {
                wVar4 = null;
            }
            if ((wVar3 == null && wVar4 == null) || ((wVar3 != null && wVar4 != null && !r(wVar3, wVar4)) || (k10 = k(viewGroup, wVar3, wVar4)) == null)) {
                i10 = size;
            } else {
                String str = this.f35503a;
                if (wVar4 != null) {
                    String[] p10 = p();
                    view = wVar4.f35536b;
                    if (p10 != null && p10.length > 0) {
                        wVar2 = new w(view);
                        w wVar5 = (w) ((t.f) hVar2.f18056b).get(view);
                        i10 = size;
                        if (wVar5 != null) {
                            int i12 = 0;
                            while (i12 < p10.length) {
                                HashMap hashMap = wVar2.f35535a;
                                String str2 = p10[i12];
                                hashMap.put(str2, wVar5.f35535a.get(str2));
                                i12++;
                                p10 = p10;
                            }
                        }
                        int i13 = o10.f34873c;
                        int i14 = 0;
                        while (true) {
                            if (i14 < i13) {
                                n nVar = (n) o10.get((Animator) o10.f(i14));
                                if (nVar.f35497c != null && nVar.f35495a == view && nVar.f35496b.equals(str) && nVar.f35497c.equals(wVar2)) {
                                    animator = null;
                                    break;
                                }
                                i14++;
                            } else {
                                animator = k10;
                                break;
                            }
                        }
                    } else {
                        i10 = size;
                        animator = k10;
                        wVar2 = null;
                    }
                    k10 = animator;
                    wVar = wVar2;
                } else {
                    i10 = size;
                    view = wVar3.f35536b;
                    wVar = null;
                }
                if (k10 != null) {
                    d0 d0Var = y.f35540a;
                    i0 i0Var = new i0(viewGroup);
                    ?? obj = new Object();
                    obj.f35495a = view;
                    obj.f35496b = str;
                    obj.f35497c = wVar;
                    obj.f35498d = i0Var;
                    obj.f35499e = this;
                    o10.put(k10, obj);
                    this.f35520r.add(k10);
                }
            }
            i11++;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i15 = 0; i15 < sparseIntArray.size(); i15++) {
                Animator animator2 = (Animator) this.f35520r.get(sparseIntArray.keyAt(i15));
                animator2.setStartDelay(animator2.getStartDelay() + (sparseIntArray.valueAt(i15) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i10 = this.f35516n - 1;
        this.f35516n = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.f35519q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f35519q.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((o) arrayList2.get(i11)).c(this);
                }
            }
            for (int i12 = 0; i12 < ((t.o) this.f35509g.f18058d).i(); i12++) {
                View view = (View) ((t.o) this.f35509g.f18058d).j(i12);
                if (view != null) {
                    WeakHashMap weakHashMap = n1.f13788a;
                    v0.r(view, false);
                }
            }
            for (int i13 = 0; i13 < ((t.o) this.f35510h.f18058d).i(); i13++) {
                View view2 = (View) ((t.o) this.f35510h.f18058d).j(i13);
                if (view2 != null) {
                    WeakHashMap weakHashMap2 = n1.f13788a;
                    v0.r(view2, false);
                }
            }
            this.f35518p = true;
        }
    }

    public final w n(View view, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        u uVar = this.f35511i;
        if (uVar != null) {
            return uVar.n(view, z10);
        }
        if (z10) {
            arrayList = this.f35513k;
        } else {
            arrayList = this.f35514l;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                w wVar = (w) arrayList.get(i10);
                if (wVar == null) {
                    return null;
                }
                if (wVar.f35536b == view) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 < 0) {
            return null;
        }
        if (z10) {
            arrayList2 = this.f35514l;
        } else {
            arrayList2 = this.f35513k;
        }
        return (w) arrayList2.get(i10);
    }

    public String[] p() {
        return null;
    }

    public final w q(View view, boolean z10) {
        h8.h hVar;
        u uVar = this.f35511i;
        if (uVar != null) {
            return uVar.q(view, z10);
        }
        if (z10) {
            hVar = this.f35509g;
        } else {
            hVar = this.f35510h;
        }
        return (w) ((t.f) hVar.f18056b).get(view);
    }

    public boolean r(w wVar, w wVar2) {
        if (wVar == null || wVar2 == null) {
            return false;
        }
        String[] p10 = p();
        if (p10 != null) {
            for (String str : p10) {
                if (!t(wVar, wVar2, str)) {
                }
            }
            return false;
        }
        Iterator it = wVar.f35535a.keySet().iterator();
        while (it.hasNext()) {
            if (t(wVar, wVar2, (String) it.next())) {
            }
        }
        return false;
        return true;
    }

    public final boolean s(View view) {
        int id2 = view.getId();
        ArrayList arrayList = this.f35507e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f35508f;
        if ((size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id2)) || arrayList2.contains(view)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return H(HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public void u(View view) {
        if (!this.f35518p) {
            ArrayList arrayList = this.f35515m;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Animator) arrayList.get(size)).pause();
            }
            ArrayList arrayList2 = this.f35519q;
            if (arrayList2 != null && arrayList2.size() > 0) {
                ArrayList arrayList3 = (ArrayList) this.f35519q.clone();
                int size2 = arrayList3.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    ((o) arrayList3.get(i10)).a();
                }
            }
            this.f35517o = true;
        }
    }

    public void w(o oVar) {
        ArrayList arrayList = this.f35519q;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(oVar);
        if (this.f35519q.size() == 0) {
            this.f35519q = null;
        }
    }

    public void x(View view) {
        this.f35508f.remove(view);
    }

    public void y(ViewGroup viewGroup) {
        if (this.f35517o) {
            if (!this.f35518p) {
                ArrayList arrayList = this.f35515m;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((Animator) arrayList.get(size)).resume();
                }
                ArrayList arrayList2 = this.f35519q;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList arrayList3 = (ArrayList) this.f35519q.clone();
                    int size2 = arrayList3.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((o) arrayList3.get(i10)).d();
                    }
                }
            }
            this.f35517o = false;
        }
    }

    public void z() {
        G();
        t.f o10 = o();
        Iterator it = this.f35520r.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (o10.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new m(this, o10));
                    long j10 = this.f35505c;
                    if (j10 >= 0) {
                        animator.setDuration(j10);
                    }
                    long j11 = this.f35504b;
                    if (j11 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j11);
                    }
                    TimeInterpolator timeInterpolator = this.f35506d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new m.d(this, 1));
                    animator.start();
                }
            }
        }
        this.f35520r.clear();
        m();
    }
}
