package d2;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class z2 implements c2.s1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f13701a;

    /* renamed from: b, reason: collision with root package name */
    public final List f13702b;

    /* renamed from: c, reason: collision with root package name */
    public Float f13703c = null;

    /* renamed from: d, reason: collision with root package name */
    public Float f13704d = null;

    /* renamed from: e, reason: collision with root package name */
    public h2.h f13705e = null;

    /* renamed from: f, reason: collision with root package name */
    public h2.h f13706f = null;

    public z2(int i10, ArrayList arrayList) {
        this.f13701a = i10;
        this.f13702b = arrayList;
    }

    @Override // c2.s1
    public final boolean r() {
        return this.f13702b.contains(this);
    }
}
