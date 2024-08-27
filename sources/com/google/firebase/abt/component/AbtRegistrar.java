package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import b5.i0;
import b5.s0;
import bq.b;
import bq.j;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import rp.a;
import tp.d;
import yk.g;

@Keep
/* loaded from: classes2.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public static /* synthetic */ a lambda$getComponents$0(b bVar) {
        return new a((Context) bVar.a(Context.class), bVar.b(d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<bq.a> getComponents() {
        i0 a10 = bq.a.a(a.class);
        a10.f3350a = LIBRARY_NAME;
        a10.b(j.c(Context.class));
        a10.b(j.b(d.class));
        a10.f3355f = new s0(0);
        return Arrays.asList(a10.c(), g.p(LIBRARY_NAME, "21.1.1"));
    }
}
