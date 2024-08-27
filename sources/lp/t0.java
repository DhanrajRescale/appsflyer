package lp;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class t0 extends h0 {
    public final void e0(Object obj) {
        obj.getClass();
        a0(obj);
    }

    public final v0 f0() {
        int i10 = this.f24989c;
        if (i10 != 0) {
            if (i10 != 1) {
                v0 p10 = v0.p(i10, this.f24988b);
                this.f24989c = p10.size();
                this.f24990d = true;
                return p10;
            }
            Object obj = this.f24988b[0];
            Objects.requireNonNull(obj);
            int i11 = v0.f25066c;
            return new w1(obj);
        }
        int i12 = v0.f25066c;
        return p1.f25035j;
    }

    @Override // bl.j
    public final bl.j i(Object obj) {
        obj.getClass();
        a0(obj);
        return this;
    }
}
