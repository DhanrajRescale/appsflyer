package lp;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class m0 implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f25010a;

    public m0(Object[] objArr) {
        this.f25010a = objArr;
    }

    public Object readResolve() {
        return o0.r(this.f25010a);
    }
}
