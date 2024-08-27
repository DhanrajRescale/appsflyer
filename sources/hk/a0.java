package hk;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* loaded from: classes.dex */
public final class a0 implements xj.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18516a;

    public /* synthetic */ a0(int i10) {
        this.f18516a = i10;
    }

    @Override // xj.m
    public final ak.e0 a(Object obj, int i10, int i11, xj.k kVar) {
        switch (this.f18516a) {
            case 0:
                return new z((Bitmap) obj);
            case 1:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new ik.b(drawable, 0);
                }
                return null;
            default:
                return new z((File) obj);
        }
    }

    @Override // xj.m
    public final /* bridge */ /* synthetic */ boolean b(Object obj, xj.k kVar) {
        switch (this.f18516a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return true;
        }
    }
}
