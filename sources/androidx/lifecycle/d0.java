package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class d0 extends e0 {

    /* renamed from: a, reason: collision with root package name */
    public final o.g f1901a;

    public d0(Object obj) {
        super(obj);
        this.f1901a = new o.g();
    }

    public final void a(LiveData liveData, f0 f0Var) {
        if (liveData != null) {
            c0 c0Var = new c0(liveData, f0Var);
            c0 c0Var2 = (c0) this.f1901a.e(liveData, c0Var);
            if (c0Var2 != null && c0Var2.f1894b != f0Var) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            }
            if (c0Var2 == null && hasActiveObservers()) {
                liveData.observeForever(c0Var);
                return;
            }
            return;
        }
        throw new NullPointerException("source cannot be null");
    }

    @Override // androidx.lifecycle.LiveData
    public final void onActive() {
        Iterator it = this.f1901a.iterator();
        while (true) {
            o.e eVar = (o.e) it;
            if (eVar.hasNext()) {
                c0 c0Var = (c0) ((Map.Entry) eVar.next()).getValue();
                c0Var.f1893a.observeForever(c0Var);
            } else {
                return;
            }
        }
    }

    @Override // androidx.lifecycle.LiveData
    public final void onInactive() {
        Iterator it = this.f1901a.iterator();
        while (true) {
            o.e eVar = (o.e) it;
            if (eVar.hasNext()) {
                c0 c0Var = (c0) ((Map.Entry) eVar.next()).getValue();
                c0Var.f1893a.removeObserver(c0Var);
            } else {
                return;
            }
        }
    }

    public d0() {
        this.f1901a = new o.g();
    }
}
