package i5;

import android.media.MediaFormat;

/* loaded from: classes.dex */
public final class e0 implements x5.m, y5.a, c1 {

    /* renamed from: a, reason: collision with root package name */
    public x5.m f19402a;

    /* renamed from: b, reason: collision with root package name */
    public y5.a f19403b;

    /* renamed from: c, reason: collision with root package name */
    public x5.m f19404c;

    /* renamed from: d, reason: collision with root package name */
    public y5.a f19405d;

    @Override // y5.a
    public final void a(long j10, float[] fArr) {
        y5.a aVar = this.f19405d;
        if (aVar != null) {
            aVar.a(j10, fArr);
        }
        y5.a aVar2 = this.f19403b;
        if (aVar2 != null) {
            aVar2.a(j10, fArr);
        }
    }

    @Override // y5.a
    public final void b() {
        y5.a aVar = this.f19405d;
        if (aVar != null) {
            aVar.b();
        }
        y5.a aVar2 = this.f19403b;
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    @Override // i5.c1
    public final void c(int i10, Object obj) {
        if (i10 != 7) {
            if (i10 != 8) {
                if (i10 == 10000) {
                    y5.k kVar = (y5.k) obj;
                    if (kVar == null) {
                        this.f19404c = null;
                        this.f19405d = null;
                        return;
                    } else {
                        this.f19404c = kVar.getVideoFrameMetadataListener();
                        this.f19405d = kVar.getCameraMotionListener();
                        return;
                    }
                }
                return;
            }
            this.f19403b = (y5.a) obj;
            return;
        }
        this.f19402a = (x5.m) obj;
    }

    @Override // x5.m
    public final void d(long j10, long j11, b5.v vVar, MediaFormat mediaFormat) {
        x5.m mVar = this.f19404c;
        if (mVar != null) {
            mVar.d(j10, j11, vVar, mediaFormat);
        }
        x5.m mVar2 = this.f19402a;
        if (mVar2 != null) {
            mVar2.d(j10, j11, vVar, mediaFormat);
        }
    }
}
