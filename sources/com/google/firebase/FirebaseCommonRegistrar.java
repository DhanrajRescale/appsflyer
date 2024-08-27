package com.google.firebase;

import android.content.Context;
import android.os.Build;
import b5.i0;
import b5.s0;
import bq.a;
import bq.j;
import bq.p;
import com.google.firebase.components.ComponentRegistrar;
import hr.b;
import i5.w;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kq.d;
import kq.e;
import kq.f;
import kq.g;

/* loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        i0 a10 = a.a(b.class);
        a10.b(new j(2, 0, hr.a.class));
        a10.f3355f = new s0(9);
        arrayList.add(a10.c());
        p pVar = new p(wp.a.class, Executor.class);
        i0 i0Var = new i0(d.class, new Class[]{f.class, g.class});
        i0Var.b(j.c(Context.class));
        i0Var.b(j.c(pp.g.class));
        i0Var.b(new j(2, 0, e.class));
        i0Var.b(new j(1, 1, b.class));
        i0Var.b(new j(pVar, 1, 0));
        i0Var.f3355f = new kq.b(pVar, 0);
        arrayList.add(i0Var.c());
        arrayList.add(yk.g.p("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(yk.g.p("fire-core", "20.3.2"));
        arrayList.add(yk.g.p("device-name", a(Build.PRODUCT)));
        arrayList.add(yk.g.p("device-model", a(Build.DEVICE)));
        arrayList.add(yk.g.p("device-brand", a(Build.BRAND)));
        arrayList.add(yk.g.v("android-target-sdk", new w(19)));
        arrayList.add(yk.g.v("android-min-sdk", new w(20)));
        arrayList.add(yk.g.v("android-platform", new w(21)));
        arrayList.add(yk.g.v("android-installer", new w(22)));
        try {
            ut.f.f37390c.getClass();
            str = "2.0.0";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(yk.g.p("kotlin", str));
        }
        return arrayList;
    }
}
