package xj;

import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class e implements hk.i {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f40296a;

    @Override // hk.i
    public final int a() {
        return (b() << 8) | b();
    }

    @Override // hk.i
    public final short b() {
        int read = this.f40296a.read();
        if (read != -1) {
            return (short) read;
        }
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    public final int c(int i10, byte[] bArr) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10 && (i12 = this.f40296a.read(bArr, i11, i10 - i11)) != -1) {
            i11 += i12;
        }
        if (i11 == 0 && i12 == -1) {
            throw new DefaultImageHeaderParser$Reader$EndOfFileException();
        }
        return i11;
    }

    @Override // hk.i
    public final long skip(long j10) {
        if (j10 < 0) {
            return 0L;
        }
        long j11 = j10;
        while (j11 > 0) {
            InputStream inputStream = this.f40296a;
            long skip = inputStream.skip(j11);
            if (skip > 0) {
                j11 -= skip;
            } else {
                if (inputStream.read() == -1) {
                    break;
                }
                j11--;
            }
        }
        return j10 - j11;
    }
}
