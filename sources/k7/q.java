package k7;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q extends e1 {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f22541s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22542g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f22543h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f22544i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f22545j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f22546k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f22547l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f22548m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f22549n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f22550o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f22551p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f22552q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f22553r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((y1) arrayList.get(size)).f22629a.animate().cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, k7.o] */
    @Override // k7.e1
    public final boolean a(y1 y1Var, y1 y1Var2, v5.i iVar, v5.i iVar2) {
        int i10;
        int i11;
        int i12 = iVar.f37737a;
        int i13 = iVar.f37738b;
        if (y1Var2.s()) {
            int i14 = iVar.f37737a;
            i11 = iVar.f37738b;
            i10 = i14;
        } else {
            i10 = iVar2.f37737a;
            i11 = iVar2.f37738b;
        }
        if (y1Var == y1Var2) {
            return g(y1Var, i12, i13, i10, i11);
        }
        View view = y1Var.f22629a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(y1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(y1Var2);
        float f10 = -((int) ((i10 - i12) - translationX));
        View view2 = y1Var2.f22629a;
        view2.setTranslationX(f10);
        view2.setTranslationY(-((int) ((i11 - i13) - translationY)));
        view2.setAlpha(s0.g.f34069a);
        ArrayList arrayList = this.f22546k;
        ?? obj = new Object();
        obj.f22504a = y1Var;
        obj.f22505b = y1Var2;
        obj.f22506c = i12;
        obj.f22507d = i13;
        obj.f22508e = i10;
        obj.f22509f = i11;
        arrayList.add(obj);
        return true;
    }

    @Override // k7.e1
    public final void d(y1 y1Var) {
        View view = y1Var.f22629a;
        view.animate().cancel();
        ArrayList arrayList = this.f22545j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((p) arrayList.get(size)).f22517a == y1Var) {
                view.setTranslationY(s0.g.f34069a);
                view.setTranslationX(s0.g.f34069a);
                c(y1Var);
                arrayList.remove(size);
            }
        }
        j(y1Var, this.f22546k);
        if (this.f22543h.remove(y1Var)) {
            view.setAlpha(1.0f);
            c(y1Var);
        }
        if (this.f22544i.remove(y1Var)) {
            view.setAlpha(1.0f);
            c(y1Var);
        }
        ArrayList arrayList2 = this.f22549n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(y1Var, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f22548m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((p) arrayList5.get(size4)).f22517a == y1Var) {
                    view.setTranslationY(s0.g.f34069a);
                    view.setTranslationX(s0.g.f34069a);
                    c(y1Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f22547l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(y1Var)) {
                view.setAlpha(1.0f);
                c(y1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f22552q.remove(y1Var);
        this.f22550o.remove(y1Var);
        this.f22553r.remove(y1Var);
        this.f22551p.remove(y1Var);
        i();
    }

    @Override // k7.e1
    public final void e() {
        ArrayList arrayList = this.f22545j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            p pVar = (p) arrayList.get(size);
            View view = pVar.f22517a.f22629a;
            view.setTranslationY(s0.g.f34069a);
            view.setTranslationX(s0.g.f34069a);
            c(pVar.f22517a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f22543h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((y1) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f22544i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            y1 y1Var = (y1) arrayList3.get(size3);
            y1Var.f22629a.setAlpha(1.0f);
            c(y1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f22546k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            o oVar = (o) arrayList4.get(size4);
            y1 y1Var2 = oVar.f22504a;
            if (y1Var2 != null) {
                k(oVar, y1Var2);
            }
            y1 y1Var3 = oVar.f22505b;
            if (y1Var3 != null) {
                k(oVar, y1Var3);
            }
        }
        arrayList4.clear();
        if (!f()) {
            return;
        }
        ArrayList arrayList5 = this.f22548m;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                p pVar2 = (p) arrayList6.get(size6);
                View view2 = pVar2.f22517a.f22629a;
                view2.setTranslationY(s0.g.f34069a);
                view2.setTranslationX(s0.g.f34069a);
                c(pVar2.f22517a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f22547l;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                y1 y1Var4 = (y1) arrayList8.get(size8);
                y1Var4.f22629a.setAlpha(1.0f);
                c(y1Var4);
                arrayList8.remove(size8);
                if (arrayList8.isEmpty()) {
                    arrayList7.remove(arrayList8);
                }
            }
        }
        ArrayList arrayList9 = this.f22549n;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                o oVar2 = (o) arrayList10.get(size10);
                y1 y1Var5 = oVar2.f22504a;
                if (y1Var5 != null) {
                    k(oVar2, y1Var5);
                }
                y1 y1Var6 = oVar2.f22505b;
                if (y1Var6 != null) {
                    k(oVar2, y1Var6);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        h(this.f22552q);
        h(this.f22551p);
        h(this.f22550o);
        h(this.f22553r);
        ArrayList arrayList11 = this.f22332b;
        if (arrayList11.size() <= 0) {
            arrayList11.clear();
        } else {
            a3.a.u(arrayList11.get(0));
            throw null;
        }
    }

    @Override // k7.e1
    public final boolean f() {
        if (this.f22544i.isEmpty() && this.f22546k.isEmpty() && this.f22545j.isEmpty() && this.f22543h.isEmpty() && this.f22551p.isEmpty() && this.f22552q.isEmpty() && this.f22550o.isEmpty() && this.f22553r.isEmpty() && this.f22548m.isEmpty() && this.f22547l.isEmpty() && this.f22549n.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, k7.p] */
    public final boolean g(y1 y1Var, int i10, int i11, int i12, int i13) {
        View view = y1Var.f22629a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) y1Var.f22629a.getTranslationY());
        l(y1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            c(y1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        ArrayList arrayList = this.f22545j;
        ?? obj = new Object();
        obj.f22517a = y1Var;
        obj.f22518b = translationX;
        obj.f22519c = translationY;
        obj.f22520d = i12;
        obj.f22521e = i13;
        arrayList.add(obj);
        return true;
    }

    public final void i() {
        if (!f()) {
            ArrayList arrayList = this.f22332b;
            if (arrayList.size() <= 0) {
                arrayList.clear();
            } else {
                a3.a.u(arrayList.get(0));
                throw null;
            }
        }
    }

    public final void j(y1 y1Var, ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o oVar = (o) arrayList.get(size);
            if (k(oVar, y1Var) && oVar.f22504a == null && oVar.f22505b == null) {
                arrayList.remove(oVar);
            }
        }
    }

    public final boolean k(o oVar, y1 y1Var) {
        if (oVar.f22505b == y1Var) {
            oVar.f22505b = null;
        } else if (oVar.f22504a == y1Var) {
            oVar.f22504a = null;
        } else {
            return false;
        }
        y1Var.f22629a.setAlpha(1.0f);
        View view = y1Var.f22629a;
        view.setTranslationX(s0.g.f34069a);
        view.setTranslationY(s0.g.f34069a);
        c(y1Var);
        return true;
    }

    public final void l(y1 y1Var) {
        if (f22541s == null) {
            f22541s = new ValueAnimator().getInterpolator();
        }
        y1Var.f22629a.animate().setInterpolator(f22541s);
        d(y1Var);
    }
}
