package o7;

import android.os.Bundle;
import androidx.lifecycle.j;
import h.k;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public boolean f29760b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f29761c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f29762d;

    /* renamed from: e, reason: collision with root package name */
    public k f29763e;

    /* renamed from: a, reason: collision with root package name */
    public final o.g f29759a = new o.g();

    /* renamed from: f, reason: collision with root package name */
    public boolean f29764f = true;

    public final Bundle a(String key) {
        Bundle bundle;
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f29762d) {
            Bundle bundle2 = this.f29761c;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2 != null) {
                bundle = bundle2.getBundle(key);
            } else {
                bundle = null;
            }
            Bundle bundle3 = this.f29761c;
            if (bundle3 != null) {
                bundle3.remove(key);
            }
            Bundle bundle4 = this.f29761c;
            if (bundle4 == null || bundle4.isEmpty()) {
                this.f29761c = null;
            }
            return bundle;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final c b() {
        String str;
        c cVar;
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesProvider", "key");
        Iterator it = this.f29759a.iterator();
        do {
            o.e eVar = (o.e) it;
            if (eVar.hasNext()) {
                Map.Entry components = (Map.Entry) eVar.next();
                Intrinsics.checkNotNullExpressionValue(components, "components");
                str = (String) components.getKey();
                cVar = (c) components.getValue();
            } else {
                return null;
            }
        } while (!Intrinsics.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return cVar;
    }

    public final void c(String key, c provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (((c) this.f29759a.e(key, provider)) == null) {
        } else {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void d() {
        Intrinsics.checkNotNullParameter(j.class, "clazz");
        if (this.f29764f) {
            k kVar = this.f29763e;
            if (kVar == null) {
                kVar = new k(this);
            }
            this.f29763e = kVar;
            try {
                j.class.getDeclaredConstructor(new Class[0]);
                k kVar2 = this.f29763e;
                if (kVar2 != null) {
                    String className = j.class.getName();
                    Intrinsics.checkNotNullExpressionValue(className, "clazz.name");
                    Intrinsics.checkNotNullParameter(className, "className");
                    ((Set) kVar2.f17709b).add(className);
                    return;
                }
                return;
            } catch (NoSuchMethodException e10) {
                throw new IllegalArgumentException("Class " + j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }
}
