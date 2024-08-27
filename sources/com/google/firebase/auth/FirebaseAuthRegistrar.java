package com.google.firebase.auth;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import b3.t;
import b5.i0;
import bq.b;
import bq.j;
import bq.p;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.auth.FirebaseAuthRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kq.e;
import kq.f;
import m.a4;
import mq.c;
import pp.g;
import wp.d;
import xp.a;

@Keep
@KeepForSdk
/* loaded from: classes2.dex */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static FirebaseAuth lambda$getComponents$0(p pVar, p pVar2, p pVar3, p pVar4, p pVar5, b bVar) {
        g gVar = (g) bVar.a(g.class);
        c b10 = bVar.b(a.class);
        c b11 = bVar.b(f.class);
        return new FirebaseAuth(gVar, b10, b11, (Executor) bVar.e(pVar2), (Executor) bVar.e(pVar3), (ScheduledExecutorService) bVar.e(pVar4), (Executor) bVar.e(pVar5));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    public List<bq.a> getComponents() {
        final p pVar = new p(wp.a.class, Executor.class);
        final p pVar2 = new p(wp.b.class, Executor.class);
        final p pVar3 = new p(wp.c.class, Executor.class);
        final p pVar4 = new p(wp.c.class, ScheduledExecutorService.class);
        final p pVar5 = new p(d.class, Executor.class);
        i0 i0Var = new i0(FirebaseAuth.class, new Class[]{aq.a.class});
        i0Var.b(j.c(g.class));
        i0Var.b(new j(1, 1, f.class));
        i0Var.b(new j(pVar, 1, 0));
        i0Var.b(new j(pVar2, 1, 0));
        i0Var.b(new j(pVar3, 1, 0));
        i0Var.b(new j(pVar4, 1, 0));
        i0Var.b(new j(pVar5, 1, 0));
        i0Var.b(j.b(a.class));
        i0Var.f3355f = new bq.d() { // from class: zp.a0
            @Override // bq.d
            public final Object h(a4 a4Var) {
                return FirebaseAuthRegistrar.lambda$getComponents$0(bq.p.this, pVar2, pVar3, pVar4, pVar5, a4Var);
            }
        };
        bq.a c10 = i0Var.c();
        Object obj = new Object();
        i0 a10 = bq.a.a(e.class);
        a10.f3352c = 1;
        a10.f3355f = new t(obj, 0);
        return Arrays.asList(c10, a10.c(), yk.g.p("fire-auth", "22.0.0"));
    }
}
