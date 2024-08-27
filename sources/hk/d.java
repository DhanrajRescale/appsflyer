package hk;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public abstract class d implements xj.o {
    @Override // xj.o
    public final ak.e0 b(com.bumptech.glide.d dVar, ak.e0 e0Var, int i10, int i11) {
        if (rk.k.h(i10, i11)) {
            bk.d dVar2 = com.bumptech.glide.b.b(dVar).f10778a;
            Bitmap bitmap = (Bitmap) e0Var.get();
            if (i10 == Integer.MIN_VALUE) {
                i10 = bitmap.getWidth();
            }
            if (i11 == Integer.MIN_VALUE) {
                i11 = bitmap.getHeight();
            }
            Bitmap c10 = c(dVar2, bitmap, i10, i11);
            if (!bitmap.equals(c10)) {
                return c.e(c10, dVar2);
            }
            return e0Var;
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    public abstract Bitmap c(bk.d dVar, Bitmap bitmap, int i10, int i11);
}
