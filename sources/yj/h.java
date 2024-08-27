package yj;

import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41658a;

    @Override // yj.f
    public final Class a() {
        switch (this.f41658a) {
            case 0:
                throw new UnsupportedOperationException("Not implemented");
            case 1:
                return ParcelFileDescriptor.class;
            default:
                return ByteBuffer.class;
        }
    }

    @Override // yj.f
    public final g b(Object obj) {
        switch (this.f41658a) {
            case 0:
                return new e4.k(obj);
            case 1:
                return new e.l((ParcelFileDescriptor) obj);
            default:
                return new xj.f((ByteBuffer) obj, 0);
        }
    }
}
