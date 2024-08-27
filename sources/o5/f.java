package o5;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class f extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f29607b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f29608c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f29613h;

    /* renamed from: i, reason: collision with root package name */
    public MediaFormat f29614i;

    /* renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f29615j;

    /* renamed from: k, reason: collision with root package name */
    public long f29616k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f29617l;

    /* renamed from: m, reason: collision with root package name */
    public IllegalStateException f29618m;

    /* renamed from: a, reason: collision with root package name */
    public final Object f29606a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final k3.o f29609d = new k3.o();

    /* renamed from: e, reason: collision with root package name */
    public final k3.o f29610e = new k3.o();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f29611f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f29612g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f29607b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f29612g;
        if (!arrayDeque.isEmpty()) {
            this.f29614i = (MediaFormat) arrayDeque.getLast();
        }
        this.f29609d.e();
        this.f29610e.e();
        this.f29611f.clear();
        arrayDeque.clear();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f29606a) {
            this.f29615j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f29606a) {
            this.f29609d.d(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f29606a) {
            try {
                MediaFormat mediaFormat = this.f29614i;
                if (mediaFormat != null) {
                    this.f29610e.d(-2);
                    this.f29612g.add(mediaFormat);
                    this.f29614i = null;
                }
                this.f29610e.d(i10);
                this.f29611f.add(bufferInfo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f29606a) {
            this.f29610e.d(-2);
            this.f29612g.add(mediaFormat);
            this.f29614i = null;
        }
    }
}
