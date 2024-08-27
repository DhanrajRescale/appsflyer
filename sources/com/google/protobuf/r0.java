package com.google.protobuf;

/* loaded from: classes2.dex */
public final class r0 implements z0 {

    /* renamed from: a, reason: collision with root package name */
    public final b f11976a;

    /* renamed from: b, reason: collision with root package name */
    public final h1 f11977b;

    /* renamed from: c, reason: collision with root package name */
    public final m f11978c;

    public r0(h1 h1Var, m mVar, b bVar) {
        this.f11977b = h1Var;
        mVar.getClass();
        this.f11978c = mVar;
        this.f11976a = bVar;
    }

    @Override // com.google.protobuf.z0
    public final void a(Object obj, Object obj2) {
        a1.A(this.f11977b, obj, obj2);
    }

    @Override // com.google.protobuf.z0
    public final void b(Object obj) {
        this.f11977b.a(obj);
        this.f11978c.getClass();
        a3.a.u(obj);
        throw null;
    }

    @Override // com.google.protobuf.z0
    public final boolean c(Object obj) {
        this.f11978c.getClass();
        a3.a.u(obj);
        throw null;
    }

    @Override // com.google.protobuf.z0
    public final void d(Object obj, ek.h0 h0Var) {
        this.f11978c.getClass();
        a3.a.u(obj);
        throw null;
    }

    @Override // com.google.protobuf.z0
    public final boolean e(Object obj, Object obj2) {
        h1 h1Var = this.f11977b;
        ((j1) h1Var).getClass();
        i1 i1Var = ((t) obj).unknownFields;
        ((j1) h1Var).getClass();
        if (!i1Var.equals(((t) obj2).unknownFields)) {
            return false;
        }
        return true;
    }

    @Override // com.google.protobuf.z0
    public final int f(Object obj) {
        ((j1) this.f11977b).getClass();
        i1 i1Var = ((t) obj).unknownFields;
        int i10 = i1Var.f11927d;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < i1Var.f11924a; i12++) {
                int i13 = i1Var.f11925b[i12] >>> 3;
                i11 += j.c(3, (h) i1Var.f11926c[i12]) + j.t(2, i13) + (j.s(1) * 2);
            }
            i1Var.f11927d = i11;
            return i11;
        }
        return i10;
    }

    @Override // com.google.protobuf.z0
    public final t g() {
        b bVar = this.f11976a;
        if (bVar instanceof t) {
            return (t) ((t) bVar).m(4);
        }
        return ((r) ((t) bVar).m(5)).h();
    }

    @Override // com.google.protobuf.z0
    public final int h(Object obj) {
        ((j1) this.f11977b).getClass();
        return ((t) obj).unknownFields.hashCode();
    }
}
