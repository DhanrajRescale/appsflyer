package k7;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class w0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22610a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f22611b;

    public /* synthetic */ w0(RecyclerView recyclerView, int i10) {
        this.f22610a = i10;
        this.f22611b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        long j10;
        int i10 = this.f22610a;
        RecyclerView recyclerView3 = this.f22611b;
        switch (i10) {
            case 0:
                if (recyclerView3.f2415u && !recyclerView3.isLayoutRequested()) {
                    if (!recyclerView3.f2411s) {
                        recyclerView3.requestLayout();
                        return;
                    } else if (recyclerView3.f2421x) {
                        recyclerView3.f2419w = true;
                        return;
                    } else {
                        recyclerView3.p();
                        return;
                    }
                }
                return;
            default:
                e1 e1Var = recyclerView3.f2389g0;
                if (e1Var != null) {
                    q qVar = (q) e1Var;
                    ArrayList arrayList = qVar.f22543h;
                    boolean z10 = !arrayList.isEmpty();
                    ArrayList arrayList2 = qVar.f22545j;
                    boolean z11 = !arrayList2.isEmpty();
                    ArrayList arrayList3 = qVar.f22546k;
                    boolean z12 = !arrayList3.isEmpty();
                    ArrayList arrayList4 = qVar.f22544i;
                    boolean z13 = !arrayList4.isEmpty();
                    if (!z10 && !z11 && !z13 && !z12) {
                        recyclerView2 = recyclerView3;
                    } else {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            recyclerView2 = recyclerView3;
                            long j11 = qVar.f22334d;
                            if (hasNext) {
                                y1 y1Var = (y1) it.next();
                                View view = y1Var.f22629a;
                                ViewPropertyAnimator animate = view.animate();
                                qVar.f22552q.add(y1Var);
                                animate.setDuration(j11).alpha(s0.g.f34069a).setListener(new l(qVar, y1Var, animate, view)).start();
                                recyclerView3 = recyclerView2;
                            } else {
                                arrayList.clear();
                                if (z11) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    qVar.f22548m.add(arrayList5);
                                    arrayList2.clear();
                                    k kVar = new k(0, qVar, arrayList5);
                                    if (z10) {
                                        View view2 = ((p) arrayList5.get(0)).f22517a.f22629a;
                                        WeakHashMap weakHashMap = d4.n1.f13788a;
                                        d4.v0.n(view2, kVar, j11);
                                    } else {
                                        kVar.run();
                                    }
                                }
                                if (z12) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    qVar.f22549n.add(arrayList6);
                                    arrayList3.clear();
                                    k kVar2 = new k(1, qVar, arrayList6);
                                    if (z10) {
                                        View view3 = ((o) arrayList6.get(0)).f22504a.f22629a;
                                        WeakHashMap weakHashMap2 = d4.n1.f13788a;
                                        d4.v0.n(view3, kVar2, j11);
                                    } else {
                                        kVar2.run();
                                    }
                                }
                                if (z13) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    qVar.f22547l.add(arrayList7);
                                    arrayList4.clear();
                                    k kVar3 = new k(2, qVar, arrayList7);
                                    if (!z10 && !z11 && !z12) {
                                        kVar3.run();
                                    } else {
                                        long j12 = 0;
                                        if (!z10) {
                                            j11 = 0;
                                        }
                                        if (z11) {
                                            j10 = qVar.f22335e;
                                        } else {
                                            j10 = 0;
                                        }
                                        if (z12) {
                                            j12 = qVar.f22336f;
                                        }
                                        long max = Math.max(j10, j12) + j11;
                                        View view4 = ((y1) arrayList7.get(0)).f22629a;
                                        WeakHashMap weakHashMap3 = d4.n1.f13788a;
                                        d4.v0.n(view4, kVar3, max);
                                    }
                                }
                            }
                        }
                    }
                    recyclerView = recyclerView2;
                } else {
                    recyclerView = recyclerView3;
                }
                recyclerView.E0 = false;
                return;
        }
    }
}
