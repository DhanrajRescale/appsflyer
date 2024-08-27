package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import b5.i0;
import bq.a;
import bq.b;
import bq.j;
import bq.k;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzef;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import jq.c;
import pp.g;
import tp.d;
import tp.e;
import tp.f;

@Keep
@KeepForSdk
/* loaded from: classes2.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static d lambda$getComponents$0(b bVar) {
        g gVar = (g) bVar.a(g.class);
        Context context = (Context) bVar.a(Context.class);
        c cVar = (c) bVar.a(c.class);
        Preconditions.checkNotNull(gVar);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(cVar);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (e.f36345c == null) {
            synchronized (e.class) {
                try {
                    if (e.f36345c == null) {
                        Bundle bundle = new Bundle(1);
                        gVar.a();
                        if ("[DEFAULT]".equals(gVar.f31272b)) {
                            ((k) cVar).a(f.f36348a, tp.g.f36349a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", gVar.j());
                        }
                        e.f36345c = new e(zzef.zzg(context, null, null, null, bundle).zzd());
                    }
                } finally {
                }
            }
        }
        return e.f36345c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    @KeepForSdk
    public List<a> getComponents() {
        i0 a10 = a.a(d.class);
        a10.b(j.c(g.class));
        a10.b(j.c(Context.class));
        a10.b(j.c(c.class));
        a10.f3355f = up.a.f37318a;
        a10.d(2);
        return Arrays.asList(a10.c(), yk.g.p("fire-analytics", "21.2.2"));
    }
}
