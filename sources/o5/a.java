package o5;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import e5.x;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29581a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x5.d f29582b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f29583c;

    public /* synthetic */ a(k kVar, x5.d dVar, int i10) {
        this.f29581a = i10;
        this.f29583c = kVar;
        this.f29582b = dVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        x5.d dVar = this.f29582b;
        int i10 = this.f29581a;
        k kVar = this.f29583c;
        switch (i10) {
            case 0:
                ((c) kVar).getClass();
                dVar.getClass();
                if (x.f15050a < 30) {
                    Handler handler = dVar.f39978a;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j10 >> 32), (int) j10));
                    return;
                } else {
                    dVar.a(j10);
                    return;
                }
            default:
                ((v) kVar).getClass();
                dVar.getClass();
                if (x.f15050a < 30) {
                    Handler handler2 = dVar.f39978a;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j10 >> 32), (int) j10));
                    return;
                } else {
                    dVar.a(j10);
                    return;
                }
        }
    }
}
