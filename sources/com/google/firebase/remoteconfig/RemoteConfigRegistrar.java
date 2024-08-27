package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import b5.i0;
import bq.b;
import bq.j;
import bq.p;
import com.google.firebase.components.ComponentRegistrar;
import ir.f;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import nq.d;
import pp.g;
import rp.a;

@Keep
/* loaded from: classes2.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    public static f lambda$getComponents$0(p pVar, b bVar) {
        qp.b bVar2;
        Context context = (Context) bVar.a(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) bVar.e(pVar);
        g gVar = (g) bVar.a(g.class);
        d dVar = (d) bVar.a(d.class);
        a aVar = (a) bVar.a(a.class);
        synchronized (aVar) {
            try {
                if (!aVar.f33971a.containsKey("frc")) {
                    aVar.f33971a.put("frc", new qp.b(aVar.f33972b));
                }
                bVar2 = (qp.b) aVar.f33971a.get("frc");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new f(context, scheduledExecutorService, gVar, dVar, bVar2, bVar.b(tp.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<bq.a> getComponents() {
        p pVar = new p(wp.b.class, ScheduledExecutorService.class);
        i0 a10 = bq.a.a(f.class);
        a10.f3350a = LIBRARY_NAME;
        a10.b(j.c(Context.class));
        a10.b(new j(pVar, 1, 0));
        a10.b(j.c(g.class));
        a10.b(j.c(d.class));
        a10.b(j.c(a.class));
        a10.b(j.b(tp.d.class));
        a10.f3355f = new kq.b(pVar, 2);
        a10.d(2);
        return Arrays.asList(a10.c(), yk.g.p(LIBRARY_NAME, "21.4.0"));
    }
}
