package hk;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class r implements xj.d {
    @Override // xj.d
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // xj.d
    public final ImageHeaderParser$ImageType b(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // xj.d
    public final int c(InputStream inputStream, bk.h hVar) {
        int c10 = new s4.g(inputStream).c();
        if (c10 == 0) {
            return -1;
        }
        return c10;
    }
}
