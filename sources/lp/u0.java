package lp;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class u0 implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f25063a;

    public u0(Object[] objArr) {
        this.f25063a = objArr;
    }

    public Object readResolve() {
        Object[] objArr = this.f25063a;
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return v0.p(objArr.length, (Object[]) objArr.clone());
            }
            return new w1(objArr[0]);
        }
        return p1.f25035j;
    }
}
