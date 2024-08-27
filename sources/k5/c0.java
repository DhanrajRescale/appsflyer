package k5;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* loaded from: classes.dex */
public final class c0 extends AudioTrack$StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f22050a;

    public c0(d0 d0Var) {
        this.f22050a = d0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        e0 e0Var;
        hr.c cVar;
        i5.h0 h0Var;
        if (audioTrack.equals(this.f22050a.f22053c.f22085v) && (cVar = (e0Var = this.f22050a.f22053c).f22081r) != null && e0Var.V && (h0Var = ((h0) cVar.f18690b).f22117h1) != null) {
            h0Var.f19486a.f19558h.d(2);
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        e0 e0Var;
        hr.c cVar;
        i5.h0 h0Var;
        if (audioTrack.equals(this.f22050a.f22053c.f22085v) && (cVar = (e0Var = this.f22050a.f22053c).f22081r) != null && e0Var.V && (h0Var = ((h0) cVar.f18690b).f22117h1) != null) {
            h0Var.f19486a.f19558h.d(2);
        }
    }
}
