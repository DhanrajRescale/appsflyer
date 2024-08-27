package x5;

import android.os.Handler;
import android.os.Message;
import androidx.media3.exoplayer.ExoPlaybackException;
import e5.x;

/* loaded from: classes.dex */
public final class d implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f39978a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f39979b;

    public d(g gVar, o5.k kVar) {
        this.f39979b = gVar;
        Handler l10 = x.l(this);
        this.f39978a = l10;
        kVar.m(this, l10);
    }

    public final void a(long j10) {
        g gVar = this.f39979b;
        if (this == gVar.C1 && gVar.J != null) {
            if (j10 == Long.MAX_VALUE) {
                gVar.P0 = true;
                return;
            }
            try {
                gVar.t0(j10);
                gVar.C0(gVar.f40010y1);
                gVar.R0.f19438e++;
                gVar.B0();
                gVar.b0(j10);
            } catch (ExoPlaybackException e10) {
                gVar.Q0 = e10;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i10 = message.arg1;
        int i11 = message.arg2;
        int i12 = x.f15050a;
        a(((i10 & 4294967295L) << 32) | (4294967295L & i11));
        return true;
    }
}
