package d0;

import kotlin.ranges.IntRange;
import t0.l3;
import t0.n1;
import t0.o3;

/* loaded from: classes.dex */
public final class b0 implements l3 {

    /* renamed from: a, reason: collision with root package name */
    public final n1 f13143a;

    /* renamed from: b, reason: collision with root package name */
    public int f13144b;

    public b0(int i10) {
        int i11 = (i10 / 30) * 30;
        this.f13143a = t0.t.n0(kotlin.ranges.d.k(Math.max(i11 - 100, 0), i11 + 130), o3.f35116a);
        this.f13144b = i10;
    }

    public final void b(int i10) {
        if (i10 != this.f13144b) {
            this.f13144b = i10;
            int i11 = (i10 / 30) * 30;
            this.f13143a.setValue(kotlin.ranges.d.k(Math.max(i11 - 100, 0), i11 + 130));
        }
    }

    @Override // t0.l3
    public final Object getValue() {
        return (IntRange) this.f13143a.getValue();
    }
}
