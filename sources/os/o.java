package os;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f30362a;

    public /* synthetic */ o(u uVar) {
        this.f30362a = uVar;
    }

    public final View a(l lVar, View view, int i10) {
        String str;
        String str2;
        Object obj = this.f30362a;
        int i11 = ((c2.y) obj).f7883b[i10];
        String str3 = lVar.f30353b;
        if (str3 != null) {
            Class<?> cls = view.getClass();
            while (true) {
                String canonicalName = cls.getCanonicalName();
                if (canonicalName != null && canonicalName.equals(str3)) {
                    break;
                }
                if (cls == Object.class) {
                    break;
                }
                cls = cls.getSuperclass();
            }
        }
        int i12 = lVar.f30355d;
        if ((-1 == i12 || view.getId() == i12) && (((str = lVar.f30356e) == null || str.equals(view.getContentDescription())) && ((str2 = lVar.f30357f) == null || (view.getTag() != null && str2.equals(view.getTag().toString()))))) {
            int[] iArr = ((c2.y) obj).f7883b;
            iArr[i10] = iArr[i10] + 1;
            int i13 = lVar.f30354c;
            if (i13 == -1 || i13 == i11) {
                return view;
            }
        }
        if (lVar.f30352a == 1 && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View a10 = a(lVar, viewGroup.getChildAt(i14), i10);
                if (a10 != null) {
                    return a10;
                }
            }
            return null;
        }
        return null;
    }

    public final void b(View view, List list, k0 k0Var) {
        if (list.isEmpty()) {
            k0Var.a(view);
            return;
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        c2.y yVar = (c2.y) this.f30362a;
        if (yVar.f7883b.length == yVar.f7884c) {
            el.l.T0("MixpanelAPI.PathFinder", "Path is too deep, will not match");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        l lVar = (l) list.get(0);
        List subList = list.subList(1, list.size());
        int childCount = viewGroup.getChildCount();
        int i10 = yVar.f7884c;
        yVar.f7884c = i10 + 1;
        yVar.f7883b[i10] = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View a10 = a(lVar, viewGroup.getChildAt(i11), i10);
            if (a10 != null) {
                b(a10, subList, k0Var);
            }
            int i12 = lVar.f30354c;
            if (i12 >= 0 && yVar.f7883b[i10] > i12) {
                break;
            }
        }
        int i13 = yVar.f7884c - 1;
        yVar.f7884c = i13;
        if (i13 < 0) {
            throw new ArrayIndexOutOfBoundsException(yVar.f7884c);
        }
    }

    public final void c(View view, List list, k0 k0Var) {
        if (list.isEmpty()) {
            return;
        }
        c2.y yVar = (c2.y) this.f30362a;
        if (yVar.f7883b.length == yVar.f7884c) {
            el.l.V0("MixpanelAPI.PathFinder", "There appears to be a concurrency issue in the pathfinding code. Path will not be matched.");
            return;
        }
        l lVar = (l) list.get(0);
        List subList = list.subList(1, list.size());
        int i10 = yVar.f7884c;
        yVar.f7884c = i10 + 1;
        yVar.f7883b[i10] = 0;
        View a10 = a(lVar, view, i10);
        int i11 = yVar.f7884c - 1;
        yVar.f7884c = i11;
        if (i11 >= 0) {
            if (a10 != null) {
                b(a10, subList, k0Var);
                return;
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException(yVar.f7884c);
    }

    public o() {
        this.f30362a = new c2.y();
    }
}
