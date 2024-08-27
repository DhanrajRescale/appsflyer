package o5;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import e5.x;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class v implements k {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f29682a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer[] f29683b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f29684c;

    public v(MediaCodec mediaCodec) {
        this.f29682a = mediaCodec;
        if (x.f15050a < 21) {
            this.f29683b = mediaCodec.getInputBuffers();
            this.f29684c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // o5.k
    public final void a() {
    }

    @Override // o5.k
    public final MediaFormat b() {
        return this.f29682a.getOutputFormat();
    }

    @Override // o5.k
    public final void c(Bundle bundle) {
        this.f29682a.setParameters(bundle);
    }

    @Override // o5.k
    public final void d(int i10, long j10) {
        this.f29682a.releaseOutputBuffer(i10, j10);
    }

    @Override // o5.k
    public final int e() {
        return this.f29682a.dequeueInputBuffer(0L);
    }

    @Override // o5.k
    public final int f(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = this.f29682a;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && x.f15050a < 21) {
                this.f29684c = mediaCodec.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // o5.k
    public final void flush() {
        this.f29682a.flush();
    }

    @Override // o5.k
    public final void g(int i10, int i11, int i12, long j10) {
        this.f29682a.queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override // o5.k
    public final void h(int i10, boolean z10) {
        this.f29682a.releaseOutputBuffer(i10, z10);
    }

    @Override // o5.k
    public final void i(int i10) {
        this.f29682a.setVideoScalingMode(i10);
    }

    @Override // o5.k
    public final ByteBuffer j(int i10) {
        if (x.f15050a >= 21) {
            return this.f29682a.getInputBuffer(i10);
        }
        return this.f29683b[i10];
    }

    @Override // o5.k
    public final void k(Surface surface) {
        this.f29682a.setOutputSurface(surface);
    }

    @Override // o5.k
    public final ByteBuffer l(int i10) {
        if (x.f15050a >= 21) {
            return this.f29682a.getOutputBuffer(i10);
        }
        return this.f29684c[i10];
    }

    @Override // o5.k
    public final void m(x5.d dVar, Handler handler) {
        this.f29682a.setOnFrameRenderedListener(new a(this, dVar, 1), handler);
    }

    @Override // o5.k
    public final void n(int i10, h5.d dVar, long j10) {
        this.f29682a.queueSecureInputBuffer(i10, 0, dVar.f17999i, j10, 0);
    }

    @Override // o5.k
    public final void release() {
        this.f29683b = null;
        this.f29684c = null;
        this.f29682a.release();
    }
}
