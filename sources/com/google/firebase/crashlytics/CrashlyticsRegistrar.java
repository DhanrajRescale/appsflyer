package com.google.firebase.crashlytics;

import b3.t;
import b5.i0;
import bq.b;
import bq.j;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import java.util.Arrays;
import java.util.List;
import nq.d;
import pp.g;

/* loaded from: classes2.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-cls";

    public FirebaseCrashlytics buildCrashlytics(b bVar) {
        return FirebaseCrashlytics.init((g) bVar.a(g.class), (d) bVar.a(d.class), bVar.h(CrashlyticsNativeComponent.class), bVar.h(tp.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<bq.a> getComponents() {
        i0 a10 = bq.a.a(FirebaseCrashlytics.class);
        a10.f3350a = LIBRARY_NAME;
        a10.b(j.c(g.class));
        a10.b(j.c(d.class));
        a10.b(new j(0, 2, CrashlyticsNativeComponent.class));
        a10.b(new j(0, 2, tp.d.class));
        a10.f3355f = new t(this, 2);
        a10.d(2);
        return Arrays.asList(a10.c(), yk.g.p(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
