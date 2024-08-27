package com.google.firebase.messaging;

import androidx.annotation.Keep;
import b5.i0;
import b5.s0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

@Keep
@KeepForSdk
/* loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(bq.b bVar) {
        pp.g gVar = (pp.g) bVar.a(pp.g.class);
        a3.a.u(bVar.a(lq.a.class));
        return new FirebaseMessaging(gVar, bVar.b(hr.b.class), bVar.b(kq.g.class), (nq.d) bVar.a(nq.d.class), (gn.f) bVar.a(gn.f.class), (jq.c) bVar.a(jq.c.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<bq.a> getComponents() {
        i0 a10 = bq.a.a(FirebaseMessaging.class);
        a10.f3350a = LIBRARY_NAME;
        a10.b(bq.j.c(pp.g.class));
        a10.b(new bq.j(0, 0, lq.a.class));
        a10.b(bq.j.b(hr.b.class));
        a10.b(bq.j.b(kq.g.class));
        a10.b(new bq.j(0, 0, gn.f.class));
        a10.b(bq.j.c(nq.d.class));
        a10.b(bq.j.c(jq.c.class));
        a10.f3355f = new s0(7);
        a10.d(1);
        return Arrays.asList(a10.c(), yk.g.p(LIBRARY_NAME, "23.1.2"));
    }
}
