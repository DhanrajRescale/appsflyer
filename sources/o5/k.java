package o5;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface k {
    void a();

    MediaFormat b();

    void c(Bundle bundle);

    void d(int i10, long j10);

    int e();

    int f(MediaCodec.BufferInfo bufferInfo);

    void flush();

    void g(int i10, int i11, int i12, long j10);

    void h(int i10, boolean z10);

    void i(int i10);

    ByteBuffer j(int i10);

    void k(Surface surface);

    ByteBuffer l(int i10);

    void m(x5.d dVar, Handler handler);

    void n(int i10, h5.d dVar, long j10);

    void release();
}
