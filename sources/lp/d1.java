package lp;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class d1 implements kp.n, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f24966a;

    public d1(int i10) {
        kp.j.A(i10, "expectedValuesPerKey");
        this.f24966a = i10;
    }

    @Override // kp.n
    public final Object get() {
        return new ArrayList(this.f24966a);
    }
}
