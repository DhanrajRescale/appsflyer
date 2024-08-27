package u5;

import b5.j1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final j1 f36836a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f36837b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36838c;

    public q(int i10, j1 j1Var, int[] iArr) {
        if (iArr.length == 0) {
            e5.m.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f36836a = j1Var;
        this.f36837b = iArr;
        this.f36838c = i10;
    }
}
