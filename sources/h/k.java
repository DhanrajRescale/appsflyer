package h;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k implements o7.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17708a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17709b;

    public k(o7.d registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        this.f17709b = new LinkedHashSet();
        registry.c("androidx.savedstate.Restarter", this);
    }

    @Override // o7.c
    public final Bundle a() {
        int i10 = this.f17708a;
        Object obj = this.f17709b;
        switch (i10) {
            case 0:
                Bundle bundle = new Bundle();
                ((m) obj).q().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((Set) obj));
                return bundle2;
        }
    }

    public k(m mVar) {
        this.f17709b = mVar;
    }
}
