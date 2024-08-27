package com.google.protobuf;

/* loaded from: classes2.dex */
public final class e0 extends f0 {
    @Override // com.google.protobuf.f0
    public final void a(long j10, Object obj) {
        ((c) ((y) r1.f11981c.i(j10, obj))).f11897a = false;
    }

    @Override // com.google.protobuf.f0
    public final void b(Object obj, long j10, Object obj2) {
        q1 q1Var = r1.f11981c;
        y yVar = (y) q1Var.i(j10, obj);
        y yVar2 = (y) q1Var.i(j10, obj2);
        int size = yVar.size();
        int size2 = yVar2.size();
        if (size > 0 && size2 > 0) {
            if (!((c) yVar).f11897a) {
                yVar = yVar.f(size2 + size);
            }
            yVar.addAll(yVar2);
        }
        if (size > 0) {
            yVar2 = yVar;
        }
        r1.r(obj, j10, yVar2);
    }
}
