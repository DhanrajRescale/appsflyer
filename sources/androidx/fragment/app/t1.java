package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t1 implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1833b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1834c = null;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1835d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1836e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1837f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v1 f1838g;

    public t1(v1 v1Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f1838g = v1Var;
        this.f1832a = obj;
        this.f1833b = arrayList;
        this.f1836e = obj2;
        this.f1837f = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        v1 v1Var = this.f1838g;
        Object obj = this.f1832a;
        if (obj != null) {
            v1Var.t(obj, this.f1833b, null);
        }
        Object obj2 = this.f1834c;
        if (obj2 != null) {
            v1Var.t(obj2, this.f1835d, null);
        }
        Object obj3 = this.f1836e;
        if (obj3 != null) {
            v1Var.t(obj3, this.f1837f, null);
        }
    }
}
