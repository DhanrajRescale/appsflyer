package com.google.protobuf;

/* loaded from: classes2.dex */
public final class h0 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public o0[] f11919a;

    @Override // com.google.protobuf.o0
    public final n0 a(Class cls) {
        for (o0 o0Var : this.f11919a) {
            if (o0Var.b(cls)) {
                return o0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.protobuf.o0
    public final boolean b(Class cls) {
        for (o0 o0Var : this.f11919a) {
            if (o0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
