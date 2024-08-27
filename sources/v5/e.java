package v5;

import e5.x;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public int f37707c;

    /* renamed from: d, reason: collision with root package name */
    public int f37708d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f37705a = true;

    /* renamed from: b, reason: collision with root package name */
    public final int f37706b = 65536;

    /* renamed from: e, reason: collision with root package name */
    public int f37709e = 0;

    /* renamed from: f, reason: collision with root package name */
    public a[] f37710f = new a[100];

    public final synchronized void a() {
        int max = Math.max(0, x.g(this.f37707c, this.f37706b) - this.f37708d);
        int i10 = this.f37709e;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f37710f, max, i10, (Object) null);
        this.f37709e = max;
    }
}
