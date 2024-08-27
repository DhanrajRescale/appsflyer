package o5;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import e5.x;
import h.r0;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c implements k {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f29586a;

    /* renamed from: b, reason: collision with root package name */
    public final f f29587b;

    /* renamed from: c, reason: collision with root package name */
    public final e f29588c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f29589d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f29590e;

    /* renamed from: f, reason: collision with root package name */
    public int f29591f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10) {
        this.f29586a = mediaCodec;
        this.f29587b = new f(handlerThread);
        this.f29588c = new e(mediaCodec, handlerThread2);
        this.f29589d = z10;
    }

    public static void o(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        boolean z10;
        f fVar = cVar.f29587b;
        if (fVar.f29608c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.H0(z10);
        HandlerThread handlerThread = fVar.f29607b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = cVar.f29586a;
        mediaCodec.setCallback(fVar, handler);
        fVar.f29608c = handler;
        e5.a.a("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        e5.a.i();
        e eVar = cVar.f29588c;
        if (!eVar.f29605f) {
            HandlerThread handlerThread2 = eVar.f29601b;
            handlerThread2.start();
            eVar.f29602c = new h.f(eVar, handlerThread2.getLooper(), 3);
            eVar.f29605f = true;
        }
        e5.a.a("startCodec");
        mediaCodec.start();
        e5.a.i();
        cVar.f29591f = 1;
    }

    public static String p(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // o5.k
    public final void a() {
    }

    @Override // o5.k
    public final MediaFormat b() {
        MediaFormat mediaFormat;
        f fVar = this.f29587b;
        synchronized (fVar.f29606a) {
            try {
                mediaFormat = fVar.f29613h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    @Override // o5.k
    public final void c(Bundle bundle) {
        q();
        this.f29586a.setParameters(bundle);
    }

    @Override // o5.k
    public final void d(int i10, long j10) {
        this.f29586a.releaseOutputBuffer(i10, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002d A[Catch: all -> 0x002f, DONT_GENERATE, TryCatch #0 {all -> 0x002f, blocks: (B:6:0x0012, B:8:0x0016, B:10:0x001a, B:12:0x0022, B:18:0x002d, B:22:0x0031, B:25:0x003c, B:26:0x0038, B:28:0x003e, B:29:0x0040, B:30:0x0041, B:31:0x0043), top: B:5:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:6:0x0012, B:8:0x0016, B:10:0x001a, B:12:0x0022, B:18:0x002d, B:22:0x0031, B:25:0x003c, B:26:0x0038, B:28:0x003e, B:29:0x0040, B:30:0x0041, B:31:0x0043), top: B:5:0x0012 }] */
    @Override // o5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e() {
        /*
            r7 = this;
            o5.e r0 = r7.f29588c
            java.util.concurrent.atomic.AtomicReference r0 = r0.f29603d
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            if (r0 != 0) goto L46
            o5.f r0 = r7.f29587b
            java.lang.Object r2 = r0.f29606a
            monitor-enter(r2)
            java.lang.IllegalStateException r3 = r0.f29618m     // Catch: java.lang.Throwable -> L2f
            if (r3 != 0) goto L41
            android.media.MediaCodec$CodecException r3 = r0.f29615j     // Catch: java.lang.Throwable -> L2f
            if (r3 != 0) goto L3e
            long r3 = r0.f29616k     // Catch: java.lang.Throwable -> L2f
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L29
            boolean r1 = r0.f29617l     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L27
            goto L29
        L27:
            r1 = 0
            goto L2a
        L29:
            r1 = 1
        L2a:
            r3 = -1
            if (r1 == 0) goto L31
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            goto L3d
        L2f:
            r0 = move-exception
            goto L44
        L31:
            k3.o r0 = r0.f29609d     // Catch: java.lang.Throwable -> L2f
            int r1 = r0.f22020c     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L38
            goto L3c
        L38:
            int r3 = r0.f()     // Catch: java.lang.Throwable -> L2f
        L3c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
        L3d:
            return r3
        L3e:
            r0.f29615j = r1     // Catch: java.lang.Throwable -> L2f
            throw r3     // Catch: java.lang.Throwable -> L2f
        L41:
            r0.f29618m = r1     // Catch: java.lang.Throwable -> L2f
            throw r3     // Catch: java.lang.Throwable -> L2f
        L44:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            throw r0
        L46:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.c.e():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002d A[Catch: all -> 0x002f, DONT_GENERATE, TryCatch #0 {all -> 0x002f, blocks: (B:6:0x0012, B:8:0x0016, B:10:0x001a, B:12:0x0022, B:18:0x002d, B:22:0x0031, B:24:0x0037, B:26:0x0039, B:28:0x003f, B:29:0x0066, B:32:0x005c, B:34:0x0068, B:35:0x006a, B:36:0x006b, B:37:0x006d), top: B:5:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:6:0x0012, B:8:0x0016, B:10:0x001a, B:12:0x0022, B:18:0x002d, B:22:0x0031, B:24:0x0037, B:26:0x0039, B:28:0x003f, B:29:0x0066, B:32:0x005c, B:34:0x0068, B:35:0x006a, B:36:0x006b, B:37:0x006d), top: B:5:0x0012 }] */
    @Override // o5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(android.media.MediaCodec.BufferInfo r11) {
        /*
            r10 = this;
            o5.e r0 = r10.f29588c
            java.util.concurrent.atomic.AtomicReference r0 = r0.f29603d
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            if (r0 != 0) goto L70
            o5.f r0 = r10.f29587b
            java.lang.Object r2 = r0.f29606a
            monitor-enter(r2)
            java.lang.IllegalStateException r3 = r0.f29618m     // Catch: java.lang.Throwable -> L2f
            if (r3 != 0) goto L6b
            android.media.MediaCodec$CodecException r3 = r0.f29615j     // Catch: java.lang.Throwable -> L2f
            if (r3 != 0) goto L68
            long r3 = r0.f29616k     // Catch: java.lang.Throwable -> L2f
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L29
            boolean r1 = r0.f29617l     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L27
            goto L29
        L27:
            r1 = 0
            goto L2a
        L29:
            r1 = 1
        L2a:
            r3 = -1
            if (r1 == 0) goto L31
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            goto L67
        L2f:
            r11 = move-exception
            goto L6e
        L31:
            k3.o r1 = r0.f29610e     // Catch: java.lang.Throwable -> L2f
            int r4 = r1.f22020c     // Catch: java.lang.Throwable -> L2f
            if (r4 != 0) goto L39
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            goto L67
        L39:
            int r3 = r1.f()     // Catch: java.lang.Throwable -> L2f
            if (r3 < 0) goto L59
            android.media.MediaFormat r1 = r0.f29613h     // Catch: java.lang.Throwable -> L2f
            yk.j.I0(r1)     // Catch: java.lang.Throwable -> L2f
            java.util.ArrayDeque r0 = r0.f29611f     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r0 = r0.remove()     // Catch: java.lang.Throwable -> L2f
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch: java.lang.Throwable -> L2f
            int r5 = r0.offset     // Catch: java.lang.Throwable -> L2f
            int r6 = r0.size     // Catch: java.lang.Throwable -> L2f
            long r7 = r0.presentationTimeUs     // Catch: java.lang.Throwable -> L2f
            int r9 = r0.flags     // Catch: java.lang.Throwable -> L2f
            r4 = r11
            r4.set(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L2f
            goto L66
        L59:
            r11 = -2
            if (r3 != r11) goto L66
            java.util.ArrayDeque r11 = r0.f29612g     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r11 = r11.remove()     // Catch: java.lang.Throwable -> L2f
            android.media.MediaFormat r11 = (android.media.MediaFormat) r11     // Catch: java.lang.Throwable -> L2f
            r0.f29613h = r11     // Catch: java.lang.Throwable -> L2f
        L66:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
        L67:
            return r3
        L68:
            r0.f29615j = r1     // Catch: java.lang.Throwable -> L2f
            throw r3     // Catch: java.lang.Throwable -> L2f
        L6b:
            r0.f29618m = r1     // Catch: java.lang.Throwable -> L2f
            throw r3     // Catch: java.lang.Throwable -> L2f
        L6e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            throw r11
        L70:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.c.f(android.media.MediaCodec$BufferInfo):int");
    }

    @Override // o5.k
    public final void flush() {
        this.f29588c.a();
        this.f29586a.flush();
        f fVar = this.f29587b;
        synchronized (fVar.f29606a) {
            fVar.f29616k++;
            Handler handler = fVar.f29608c;
            int i10 = x.f15050a;
            handler.post(new androidx.activity.b(fVar, 18));
        }
        this.f29586a.start();
    }

    @Override // o5.k
    public final void g(int i10, int i11, int i12, long j10) {
        e eVar = this.f29588c;
        RuntimeException runtimeException = (RuntimeException) eVar.f29603d.getAndSet(null);
        if (runtimeException == null) {
            d b10 = e.b();
            b10.f29592a = i10;
            b10.f29593b = 0;
            b10.f29594c = i11;
            b10.f29596e = j10;
            b10.f29597f = i12;
            h.f fVar = eVar.f29602c;
            int i13 = x.f15050a;
            fVar.obtainMessage(0, b10).sendToTarget();
            return;
        }
        throw runtimeException;
    }

    @Override // o5.k
    public final void h(int i10, boolean z10) {
        this.f29586a.releaseOutputBuffer(i10, z10);
    }

    @Override // o5.k
    public final void i(int i10) {
        q();
        this.f29586a.setVideoScalingMode(i10);
    }

    @Override // o5.k
    public final ByteBuffer j(int i10) {
        return this.f29586a.getInputBuffer(i10);
    }

    @Override // o5.k
    public final void k(Surface surface) {
        q();
        this.f29586a.setOutputSurface(surface);
    }

    @Override // o5.k
    public final ByteBuffer l(int i10) {
        return this.f29586a.getOutputBuffer(i10);
    }

    @Override // o5.k
    public final void m(x5.d dVar, Handler handler) {
        q();
        this.f29586a.setOnFrameRenderedListener(new a(this, dVar, 0), handler);
    }

    @Override // o5.k
    public final void n(int i10, h5.d dVar, long j10) {
        e eVar = this.f29588c;
        RuntimeException runtimeException = (RuntimeException) eVar.f29603d.getAndSet(null);
        if (runtimeException == null) {
            d b10 = e.b();
            b10.f29592a = i10;
            b10.f29593b = 0;
            b10.f29594c = 0;
            b10.f29596e = j10;
            b10.f29597f = 0;
            int i11 = dVar.f17996f;
            MediaCodec.CryptoInfo cryptoInfo = b10.f29595d;
            cryptoInfo.numSubSamples = i11;
            int[] iArr = dVar.f17994d;
            int[] iArr2 = cryptoInfo.numBytesOfClearData;
            if (iArr != null) {
                if (iArr2 != null && iArr2.length >= iArr.length) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                } else {
                    iArr2 = Arrays.copyOf(iArr, iArr.length);
                }
            }
            cryptoInfo.numBytesOfClearData = iArr2;
            int[] iArr3 = dVar.f17995e;
            int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr3 != null) {
                if (iArr4 != null && iArr4.length >= iArr3.length) {
                    System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
                } else {
                    iArr4 = Arrays.copyOf(iArr3, iArr3.length);
                }
            }
            cryptoInfo.numBytesOfEncryptedData = iArr4;
            byte[] bArr = dVar.f17992b;
            byte[] bArr2 = cryptoInfo.key;
            if (bArr != null) {
                if (bArr2 != null && bArr2.length >= bArr.length) {
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                } else {
                    bArr2 = Arrays.copyOf(bArr, bArr.length);
                }
            }
            bArr2.getClass();
            cryptoInfo.key = bArr2;
            byte[] bArr3 = dVar.f17991a;
            byte[] bArr4 = cryptoInfo.iv;
            if (bArr3 != null) {
                if (bArr4 != null && bArr4.length >= bArr3.length) {
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                } else {
                    bArr4 = Arrays.copyOf(bArr3, bArr3.length);
                }
            }
            bArr4.getClass();
            cryptoInfo.iv = bArr4;
            cryptoInfo.mode = dVar.f17993c;
            if (x.f15050a >= 24) {
                cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(dVar.f17997g, dVar.f17998h));
            }
            eVar.f29602c.obtainMessage(1, b10).sendToTarget();
            return;
        }
        throw runtimeException;
    }

    public final void q() {
        if (this.f29589d) {
            try {
                e eVar = this.f29588c;
                r0 r0Var = eVar.f29604e;
                r0Var.d();
                h.f fVar = eVar.f29602c;
                fVar.getClass();
                fVar.obtainMessage(2).sendToTarget();
                synchronized (r0Var) {
                    while (!r0Var.f17735a) {
                        r0Var.wait();
                    }
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // o5.k
    public final void release() {
        try {
            if (this.f29591f == 1) {
                e eVar = this.f29588c;
                if (eVar.f29605f) {
                    eVar.a();
                    eVar.f29601b.quit();
                }
                eVar.f29605f = false;
                f fVar = this.f29587b;
                synchronized (fVar.f29606a) {
                    fVar.f29617l = true;
                    fVar.f29607b.quit();
                    fVar.a();
                }
            }
            this.f29591f = 2;
            if (!this.f29590e) {
                this.f29586a.release();
                this.f29590e = true;
            }
        } catch (Throwable th2) {
            if (!this.f29590e) {
                this.f29586a.release();
                this.f29590e = true;
            }
            throw th2;
        }
    }
}
