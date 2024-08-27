package o7;

import android.os.Bundle;
import androidx.lifecycle.a1;
import androidx.lifecycle.h1;
import androidx.lifecycle.i1;
import androidx.lifecycle.j;
import androidx.lifecycle.m;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import androidx.lifecycle.u0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final f f29758a;

    public a(f owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f29758a = owner;
    }

    @Override // androidx.lifecycle.r
    public final void c(t source, m event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == m.ON_CREATE) {
            source.getLifecycle().c(this);
            f owner = this.f29758a;
            Bundle a10 = owner.getSavedStateRegistry().a("androidx.savedstate.Restarter");
            if (a10 == null) {
                return;
            }
            ArrayList<String> stringArrayList = a10.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, a.class.getClassLoader()).asSubclass(b.class);
                        Intrinsics.checkNotNullExpressionValue(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                Intrinsics.checkNotNullExpressionValue(newInstance, "{\n                constr…wInstance()\n            }");
                                ((j) ((b) newInstance)).getClass();
                                Intrinsics.checkNotNullParameter(owner, "owner");
                                if (owner instanceof i1) {
                                    h1 viewModelStore = ((i1) owner).getViewModelStore();
                                    d savedStateRegistry = owner.getSavedStateRegistry();
                                    viewModelStore.getClass();
                                    LinkedHashMap linkedHashMap = viewModelStore.f1912a;
                                    Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                    while (it.hasNext()) {
                                        String key = (String) it.next();
                                        Intrinsics.checkNotNullParameter(key, "key");
                                        a1 a1Var = (a1) linkedHashMap.get(key);
                                        Intrinsics.c(a1Var);
                                        u0.a(a1Var, savedStateRegistry, owner.getLifecycle());
                                    }
                                    if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                        savedStateRegistry.d();
                                    }
                                } else {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
                                }
                            } catch (Exception e10) {
                                throw new RuntimeException(a3.a.f("Failed to instantiate ", str), e10);
                            }
                        } catch (NoSuchMethodException e11) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
                        }
                    } catch (ClassNotFoundException e12) {
                        throw new RuntimeException(nn.d.k("Class ", str, " wasn't found"), e12);
                    }
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
