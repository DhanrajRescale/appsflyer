package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import b5.i0;
import b5.s0;
import bq.b;
import bq.j;
import com.google.firebase.components.ComponentRegistrar;
import gn.f;
import hn.a;
import java.util.Arrays;
import java.util.List;
import jn.r;
import yk.g;

@Keep
/* loaded from: classes2.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ f lambda$getComponents$0(b bVar) {
        r.b((Context) bVar.a(Context.class));
        return r.a().c(a.f18622e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<bq.a> getComponents() {
        i0 a10 = bq.a.a(f.class);
        a10.f3350a = LIBRARY_NAME;
        a10.b(j.c(Context.class));
        a10.f3355f = new s0(5);
        return Arrays.asList(a10.c(), g.p(LIBRARY_NAME, "18.1.8"));
    }
}
