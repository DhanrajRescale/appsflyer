package vt;

/* loaded from: classes2.dex */
public final class r0 extends c {

    /* renamed from: c, reason: collision with root package name */
    public int f38335c;

    /* renamed from: d, reason: collision with root package name */
    public int f38336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s0 f38337e;

    public r0(s0 s0Var) {
        this.f38337e = s0Var;
        this.f38335c = s0Var.b();
        this.f38336d = s0Var.f38340d;
    }

    @Override // vt.c
    public final void b() {
        int i10 = this.f38335c;
        if (i10 == 0) {
            this.f38308a = 2;
            return;
        }
        s0 s0Var = this.f38337e;
        Object[] objArr = s0Var.f38338b;
        int i11 = this.f38336d;
        this.f38309b = objArr[i11];
        this.f38308a = 1;
        this.f38336d = (i11 + 1) % s0Var.f38339c;
        this.f38335c = i10 - 1;
    }
}
