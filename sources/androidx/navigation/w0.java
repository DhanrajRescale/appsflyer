package androidx.navigation;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f2336b = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2337a = new LinkedHashMap();

    public final void a(v0 navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        String name = ni.j.n(navigator.getClass());
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        if (name.length() > 0) {
            LinkedHashMap linkedHashMap = this.f2337a;
            v0 v0Var = (v0) linkedHashMap.get(name);
            if (!Intrinsics.a(v0Var, navigator)) {
                boolean z10 = false;
                if (v0Var != null && v0Var.f2333b) {
                    z10 = true;
                }
                if (!z10) {
                    if (!navigator.f2333b) {
                        return;
                    }
                    throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
                }
                throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + v0Var).toString());
            }
            return;
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }

    public final v0 b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (name != null && name.length() > 0) {
            v0 v0Var = (v0) this.f2337a.get(name);
            if (v0Var != null) {
                return v0Var;
            }
            throw new IllegalStateException(nn.d.k("Could not find Navigator with name \"", name, "\". You must call NavController.addNavigator() for each navigation type."));
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }
}
