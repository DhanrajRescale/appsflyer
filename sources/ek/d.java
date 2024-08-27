package ek;

/* loaded from: classes.dex */
public final class d implements yj.e {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f15578a;

    /* renamed from: b, reason: collision with root package name */
    public final c f15579b;

    public d(byte[] bArr, c cVar) {
        this.f15578a = bArr;
        this.f15579b = cVar;
    }

    @Override // yj.e
    public final Class a() {
        return this.f15579b.a();
    }

    @Override // yj.e
    public final void c() {
    }

    @Override // yj.e
    public final void cancel() {
    }

    @Override // yj.e
    public final void d(com.bumptech.glide.e eVar, yj.d dVar) {
        dVar.j(this.f15579b.C(this.f15578a));
    }

    @Override // yj.e
    public final xj.a f() {
        return xj.a.f40286a;
    }
}
