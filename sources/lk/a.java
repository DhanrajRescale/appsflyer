package lk;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Set f24870a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public boolean f24871b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24872c;

    @Override // lk.d
    public final void a(e eVar) {
        this.f24870a.add(eVar);
        if (this.f24872c) {
            eVar.onDestroy();
        } else if (this.f24871b) {
            eVar.onStart();
        } else {
            eVar.onStop();
        }
    }

    @Override // lk.d
    public final void b(e eVar) {
        this.f24870a.remove(eVar);
    }

    public final void c() {
        this.f24871b = true;
        Iterator it = rk.k.d(this.f24870a).iterator();
        while (it.hasNext()) {
            ((e) it.next()).onStart();
        }
    }
}
