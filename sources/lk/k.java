package lk;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Set f24899a = Collections.newSetFromMap(new WeakHashMap());

    @Override // lk.e
    public final void onDestroy() {
        Iterator it = rk.k.d(this.f24899a).iterator();
        while (it.hasNext()) {
            ((ok.g) it.next()).onDestroy();
        }
    }

    @Override // lk.e
    public final void onStart() {
        Iterator it = rk.k.d(this.f24899a).iterator();
        while (it.hasNext()) {
            ((ok.g) it.next()).onStart();
        }
    }

    @Override // lk.e
    public final void onStop() {
        Iterator it = rk.k.d(this.f24899a).iterator();
        while (it.hasNext()) {
            ((ok.g) it.next()).onStop();
        }
    }
}
