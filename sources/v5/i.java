package v5;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f37737a;

    /* renamed from: b, reason: collision with root package name */
    public int f37738b;

    /* renamed from: c, reason: collision with root package name */
    public int f37739c;

    /* renamed from: d, reason: collision with root package name */
    public int f37740d;

    public /* synthetic */ i(int i10, int i11, int i12, int i13) {
        this.f37737a = i10;
        this.f37738b = i11;
        this.f37739c = i12;
        this.f37740d = i13;
    }

    public final boolean a(int i10) {
        if (i10 == 1) {
            if (this.f37737a - this.f37738b <= 1) {
                return false;
            }
        } else if (this.f37739c - this.f37740d <= 1) {
            return false;
        }
        return true;
    }
}
