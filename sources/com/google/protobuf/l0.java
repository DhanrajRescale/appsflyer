package com.google.protobuf;

import java.util.Map;

/* loaded from: classes2.dex */
public final class l0 {
    public static int a(int i10, Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        j0 j0Var = (j0) obj2;
        int i11 = 0;
        if (!k0Var.isEmpty()) {
            for (Map.Entry entry : k0Var.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                j0Var.getClass();
                int s7 = j.s(i10);
                int a10 = j0.a(j0Var.f11935a, key, value);
                i11 = com.google.android.gms.internal.p002firebaseauthapi.a.B(a10, a10, s7, i11);
            }
        }
        return i11;
    }

    public static void b(Object obj) {
        ((k0) obj).f11940a = false;
    }
}
