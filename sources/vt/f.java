package vt;

import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import vt.d;

/* loaded from: classes2.dex */
public final class f extends d implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final d f38312b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38313c;

    /* renamed from: d, reason: collision with root package name */
    public final int f38314d;

    public f(d list, int i10, int i11) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f38312b = list;
        this.f38313c = i10;
        d.Companion companion = d.INSTANCE;
        int size = list.size();
        companion.getClass();
        d.Companion.c(i10, i11, size);
        this.f38314d = i11 - i10;
    }

    @Override // vt.b
    public final int b() {
        return this.f38314d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        d.Companion companion = d.INSTANCE;
        int i11 = this.f38314d;
        companion.getClass();
        d.Companion.a(i10, i11);
        return this.f38312b.get(this.f38313c + i10);
    }
}
