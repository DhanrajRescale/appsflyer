package k5;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* loaded from: classes.dex */
public final class e extends AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f22054a;

    public e(g gVar) {
        this.f22054a = gVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        g gVar = this.f22054a;
        g.a(gVar, c.b(gVar.f22099a));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        g gVar = this.f22054a;
        g.a(gVar, c.b(gVar.f22099a));
    }
}
