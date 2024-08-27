package hk;

import android.graphics.Bitmap;
import java.io.File;

/* loaded from: classes.dex */
public final class z implements ak.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18581a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18582b;

    public z(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f18582b = bArr;
    }

    @Override // ak.e0
    public final void b() {
    }

    @Override // ak.e0
    public final int c() {
        int i10 = this.f18581a;
        Object obj = this.f18582b;
        switch (i10) {
            case 0:
                return rk.k.c((Bitmap) obj);
            case 1:
                return ((byte[]) obj).length;
            default:
                return 1;
        }
    }

    @Override // ak.e0
    public final Class d() {
        switch (this.f18581a) {
            case 0:
                return Bitmap.class;
            case 1:
                return byte[].class;
            default:
                return this.f18582b.getClass();
        }
    }

    @Override // ak.e0
    public final Object get() {
        int i10 = this.f18581a;
        Object obj = this.f18582b;
        switch (i10) {
            case 0:
                return (Bitmap) obj;
            case 1:
                return (byte[]) obj;
            default:
                return obj;
        }
    }

    public z(File file) {
        if (file == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f18582b = file;
    }

    public z(Bitmap bitmap) {
        this.f18582b = bitmap;
    }
}
