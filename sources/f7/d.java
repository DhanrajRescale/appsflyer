package f7;

import android.util.Log;
import androidx.lifecycle.m;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import androidx.navigation.n;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import vt.g0;

/* loaded from: classes.dex */
public final class d implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15962a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15963b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f15962a = i10;
        this.f15963b = obj;
    }

    @Override // androidx.lifecycle.r
    public final void c(t source, m event) {
        int i10 = this.f15962a;
        Object obj = this.f15963b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                int i11 = c.f15961a[event.ordinal()];
                if (i11 != 1) {
                    Object obj2 = null;
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                androidx.fragment.app.t tVar = (androidx.fragment.app.t) source;
                                e eVar = (e) obj;
                                for (Object obj3 : (Iterable) eVar.b().f2283f.f36547a.getValue()) {
                                    if (Intrinsics.a(((n) obj3).f2262f, tVar.getTag())) {
                                        obj2 = obj3;
                                    }
                                }
                                n nVar = (n) obj2;
                                if (nVar != null) {
                                    eVar.b().b(nVar);
                                }
                                tVar.getLifecycle().c(this);
                                return;
                            }
                            return;
                        }
                        androidx.fragment.app.t tVar2 = (androidx.fragment.app.t) source;
                        if (!tVar2.requireDialog().isShowing()) {
                            e eVar2 = (e) obj;
                            List list = (List) eVar2.b().f2282e.f36547a.getValue();
                            ListIterator listIterator = list.listIterator(list.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    Object previous = listIterator.previous();
                                    if (Intrinsics.a(((n) previous).f2262f, tVar2.getTag())) {
                                        obj2 = previous;
                                    }
                                }
                            }
                            n nVar2 = (n) obj2;
                            if (!Intrinsics.a(g0.D(list), nVar2)) {
                                Log.i("DialogFragmentNavigator", "Dialog " + tVar2 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                            }
                            if (nVar2 != null) {
                                eVar2.b().f(nVar2, false);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    androidx.fragment.app.t tVar3 = (androidx.fragment.app.t) source;
                    e eVar3 = (e) obj;
                    for (Object obj4 : (Iterable) eVar3.b().f2283f.f36547a.getValue()) {
                        if (Intrinsics.a(((n) obj4).f2262f, tVar3.getTag())) {
                            obj2 = obj4;
                        }
                    }
                    n nVar3 = (n) obj2;
                    if (nVar3 != null) {
                        eVar3.b().b(nVar3);
                        return;
                    }
                    return;
                }
                androidx.fragment.app.t tVar4 = (androidx.fragment.app.t) source;
                Iterable iterable = (Iterable) ((e) obj).b().f2282e.f36547a.getValue();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.a(((n) it.next()).f2262f, tVar4.getTag())) {
                            return;
                        }
                    }
                }
                tVar4.dismiss();
                return;
            default:
                ((z7.d) obj).b(false);
                return;
        }
    }
}
