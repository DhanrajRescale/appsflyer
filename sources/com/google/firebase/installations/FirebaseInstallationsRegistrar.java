package com.google.firebase.installations;

import androidx.annotation.Keep;
import b3.t;
import b5.i0;
import b5.s0;
import bq.b;
import bq.p;
import com.google.firebase.components.ComponentRegistrar;
import cq.j;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kq.e;
import kq.f;
import nq.c;
import nq.d;
import pp.g;
import wp.a;

@Keep
/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static d lambda$getComponents$0(b bVar) {
        return new c((g) bVar.a(g.class), bVar.b(f.class), (ExecutorService) bVar.e(new p(a.class, ExecutorService.class)), new j((Executor) bVar.e(new p(wp.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<bq.a> getComponents() {
        i0 a10 = bq.a.a(d.class);
        a10.f3350a = LIBRARY_NAME;
        a10.b(bq.j.c(g.class));
        a10.b(bq.j.b(f.class));
        a10.b(new bq.j(new p(a.class, ExecutorService.class), 1, 0));
        a10.b(new bq.j(new p(wp.b.class, Executor.class), 1, 0));
        a10.f3355f = new s0(6);
        bq.a c10 = a10.c();
        Object obj = new Object();
        i0 a11 = bq.a.a(e.class);
        a11.f3352c = 1;
        a11.f3355f = new t(obj, 0);
        return Arrays.asList(c10, a11.c(), yk.g.p(LIBRARY_NAME, "17.1.3"));
    }
}
