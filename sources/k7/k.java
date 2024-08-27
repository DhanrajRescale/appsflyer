package k7;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22434a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22435b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22436c;

    public /* synthetic */ k(int i10, Object obj, Object obj2) {
        this.f22434a = i10;
        this.f22436c = obj;
        this.f22435b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        View view2;
        long j10;
        char c10;
        int i10 = this.f22434a;
        Object obj = this.f22435b;
        Object obj2 = this.f22436c;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    p pVar = (p) it.next();
                    q qVar = (q) obj2;
                    y1 y1Var = pVar.f22517a;
                    qVar.getClass();
                    View view3 = y1Var.f22629a;
                    int i11 = pVar.f22520d - pVar.f22518b;
                    int i12 = pVar.f22521e - pVar.f22519c;
                    if (i11 != 0) {
                        view3.animate().translationX(s0.g.f34069a);
                    }
                    if (i12 != 0) {
                        view3.animate().translationY(s0.g.f34069a);
                    }
                    ViewPropertyAnimator animate = view3.animate();
                    qVar.f22551p.add(y1Var);
                    animate.setDuration(qVar.f22335e).setListener(new m(qVar, y1Var, i11, view3, i12, animate)).start();
                }
                arrayList.clear();
                ((q) obj2).f22548m.remove(arrayList);
                return;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj;
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    o oVar = (o) it2.next();
                    q qVar2 = (q) obj2;
                    qVar2.getClass();
                    y1 y1Var2 = oVar.f22504a;
                    if (y1Var2 == null) {
                        view = null;
                    } else {
                        view = y1Var2.f22629a;
                    }
                    y1 y1Var3 = oVar.f22505b;
                    if (y1Var3 != null) {
                        view2 = y1Var3.f22629a;
                    } else {
                        view2 = null;
                    }
                    ArrayList arrayList3 = qVar2.f22553r;
                    long j11 = qVar2.f22336f;
                    if (view != null) {
                        ViewPropertyAnimator duration = view.animate().setDuration(j11);
                        arrayList3.add(oVar.f22504a);
                        duration.translationX(oVar.f22508e - oVar.f22506c);
                        duration.translationY(oVar.f22509f - oVar.f22507d);
                        j10 = j11;
                        duration.alpha(s0.g.f34069a).setListener(new n(qVar2, oVar, duration, view, 0)).start();
                    } else {
                        j10 = j11;
                    }
                    if (view2 != null) {
                        ViewPropertyAnimator animate2 = view2.animate();
                        arrayList3.add(oVar.f22505b);
                        c10 = 0;
                        animate2.translationX(s0.g.f34069a).translationY(s0.g.f34069a).setDuration(j10).alpha(1.0f).setListener(new n(qVar2, oVar, animate2, view2, 1)).start();
                    } else {
                        c10 = 0;
                    }
                }
                arrayList2.clear();
                ((q) obj2).f22549n.remove(arrayList2);
                return;
            case 2:
                ArrayList arrayList4 = (ArrayList) obj;
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    y1 y1Var4 = (y1) it3.next();
                    q qVar3 = (q) obj2;
                    qVar3.getClass();
                    View view4 = y1Var4.f22629a;
                    ViewPropertyAnimator animate3 = view4.animate();
                    qVar3.f22550o.add(y1Var4);
                    animate3.alpha(1.0f).setDuration(qVar3.f22333c).setListener(new l(qVar3, y1Var4, view4, animate3)).start();
                }
                arrayList4.clear();
                ((q) obj2).f22547l.remove(arrayList4);
                return;
            default:
                f fVar = (f) obj2;
                h hVar = fVar.f22345e;
                if (hVar.f22375g == fVar.f22343c) {
                    List list = fVar.f22342b;
                    hVar.f22373e = list;
                    hVar.f22374f = Collections.unmodifiableList(list);
                    ((s) obj).a(hVar.f22369a);
                    hVar.a(fVar.f22344d);
                    return;
                }
                return;
        }
    }
}
