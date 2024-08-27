package g7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v0 extends vt.d {

    /* renamed from: b, reason: collision with root package name */
    public final int f17096b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17097c;

    /* renamed from: d, reason: collision with root package name */
    public final List f17098d;

    public v0(int i10, int i11, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f17096b = i10;
        this.f17097c = i11;
        this.f17098d = items;
    }

    @Override // vt.b
    public final int b() {
        return this.f17098d.size() + this.f17096b + this.f17097c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        int i11 = this.f17096b;
        if (i10 >= 0 && i10 < i11) {
            return null;
        }
        List list = this.f17098d;
        if (i10 < list.size() + i11 && i11 <= i10) {
            return list.get(i10 - i11);
        }
        int size = list.size() + i11;
        if (i10 < b() && size <= i10) {
            return null;
        }
        StringBuilder n10 = a3.a.n("Illegal attempt to access index ", i10, " in ItemSnapshotList of size ");
        n10.append(b());
        throw new IndexOutOfBoundsException(n10.toString());
    }
}
