package s4;

import android.media.MediaDataSource;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public long f34183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f34184b;

    public a(f fVar) {
        this.f34184b = fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j10, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (j10 < 0) {
            return -1;
        }
        try {
            long j11 = this.f34183a;
            f fVar = this.f34184b;
            if (j11 != j10) {
                if (j11 >= 0 && j10 >= j11 + fVar.f34185a.available()) {
                    return -1;
                }
                fVar.b(j10);
                this.f34183a = j10;
            }
            if (i11 > fVar.f34185a.available()) {
                i11 = fVar.f34185a.available();
            }
            int read = fVar.read(bArr, i10, i11);
            if (read >= 0) {
                this.f34183a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f34183a = -1L;
        return -1;
    }
}
