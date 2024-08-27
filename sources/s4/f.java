package s4;

import com.google.android.gms.common.api.Api;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f34185a.mark(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public final void b(long j10) {
        int i10 = this.f34186b;
        if (i10 > j10) {
            this.f34186b = 0;
            this.f34185a.reset();
        } else {
            j10 -= i10;
        }
        a((int) j10);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f34185a.mark(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
