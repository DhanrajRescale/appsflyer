package i5;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements e5.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f19665b;

    public /* synthetic */ x(int i10, boolean z10) {
        this.f19664a = i10;
        this.f19665b = z10;
    }

    @Override // e5.j
    public final void invoke(Object obj) {
        int i10 = this.f19664a;
        boolean z10 = this.f19665b;
        switch (i10) {
            case 0:
                ((b5.y0) obj).m(z10);
                return;
            default:
                ((b5.y0) obj).A(z10);
                return;
        }
    }
}
