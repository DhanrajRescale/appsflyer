package uu;

import kotlin.jvm.internal.Intrinsics;
import tu.i1;
import tu.w0;

/* loaded from: classes2.dex */
public final class c0 extends w0 implements i1 {
    @Override // tu.i1
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.f36576h;
            Intrinsics.c(objArr);
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.f36577i + ((int) ((r() + this.f36579k) - this.f36577i))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void y(int i10) {
        synchronized (this) {
            Object[] objArr = this.f36576h;
            Intrinsics.c(objArr);
            f(Integer.valueOf(((Number) objArr[((int) ((this.f36577i + ((int) ((r() + this.f36579k) - this.f36577i))) - 1)) & (objArr.length - 1)]).intValue() + i10));
        }
    }
}
