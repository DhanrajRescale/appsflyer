package i5;

import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
public final class c implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f19381a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f19382b;

    public c(e eVar, Handler handler) {
        this.f19382b = eVar;
        this.f19381a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        this.f19381a.post(new t3.m(i10, 1, this));
    }
}
