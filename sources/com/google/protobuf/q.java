package com.google.protobuf;

/* loaded from: classes2.dex */
public final class q implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final q f11960a = new Object();

    @Override // com.google.protobuf.o0
    public final n0 a(Class cls) {
        if (t.class.isAssignableFrom(cls)) {
            try {
                return (n0) t.n(cls.asSubclass(t.class)).m(3);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.protobuf.o0
    public final boolean b(Class cls) {
        return t.class.isAssignableFrom(cls);
    }
}
