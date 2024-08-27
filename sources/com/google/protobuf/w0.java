package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class w0 {

    /* renamed from: c, reason: collision with root package name */
    public static final w0 f11993c = new w0();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f11995b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final i0 f11994a = new i0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.protobuf.r0] */
    /* JADX WARN: Type inference failed for: r4v9, types: [com.google.protobuf.r0] */
    public final z0 a(Class cls) {
        q0 s7;
        q0 q0Var;
        Class cls2;
        Charset charset = z.f12003a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f11995b;
            z0 z0Var = (z0) concurrentHashMap.get(cls);
            if (z0Var == null) {
                i0 i0Var = this.f11994a;
                i0Var.getClass();
                Class cls3 = a1.f11874a;
                if (!t.class.isAssignableFrom(cls) && (cls2 = a1.f11874a) != null && !cls2.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
                }
                n0 a10 = i0Var.f11922a.a(cls);
                y0 y0Var = (y0) a10;
                if ((y0Var.f12002d & 2) == 2) {
                    boolean isAssignableFrom = t.class.isAssignableFrom(cls);
                    b bVar = y0Var.f11999a;
                    if (isAssignableFrom) {
                        q0Var = new r0(a1.f11877d, n.f11948a, bVar);
                    } else {
                        h1 h1Var = a1.f11875b;
                        m mVar = n.f11949b;
                        if (mVar != null) {
                            q0Var = new r0(h1Var, mVar, bVar);
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    s7 = q0Var;
                } else if (t.class.isAssignableFrom(cls)) {
                    if (y0Var.d() == 1) {
                        s7 = q0.s(a10, t0.f11988b, f0.f11907b, a1.f11877d, n.f11948a, m0.f11946b);
                    } else {
                        s7 = q0.s(a10, t0.f11988b, f0.f11907b, a1.f11877d, null, m0.f11946b);
                    }
                } else if (y0Var.d() == 1) {
                    s0 s0Var = t0.f11987a;
                    d0 d0Var = f0.f11906a;
                    h1 h1Var2 = a1.f11875b;
                    m mVar2 = n.f11949b;
                    if (mVar2 != null) {
                        s7 = q0.s(a10, s0Var, d0Var, h1Var2, mVar2, m0.f11945a);
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                } else {
                    s7 = q0.s(a10, t0.f11987a, f0.f11906a, a1.f11876c, null, m0.f11945a);
                }
                z0 z0Var2 = (z0) concurrentHashMap.putIfAbsent(cls, s7);
                if (z0Var2 != null) {
                    return z0Var2;
                }
                return s7;
            }
            return z0Var;
        }
        throw new NullPointerException("messageType");
    }
}
