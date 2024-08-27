package com.google.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final g0 f11921b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final o0 f11922a;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.h0, java.lang.Object, com.google.protobuf.o0] */
    public i0() {
        o0 o0Var;
        o0[] o0VarArr = new o0[2];
        o0VarArr[0] = q.f11960a;
        try {
            o0Var = (o0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            o0Var = f11921b;
        }
        o0VarArr[1] = o0Var;
        ?? obj = new Object();
        obj.f11919a = o0VarArr;
        Charset charset = z.f12003a;
        this.f11922a = obj;
    }
}
