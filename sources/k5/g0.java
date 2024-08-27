package k5;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public abstract class g0 {
    public static void a(m mVar, Object obj) {
        v vVar;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
        e0 e0Var = (e0) mVar;
        if (audioDeviceInfo == null) {
            vVar = null;
        } else {
            e0Var.getClass();
            vVar = new v(audioDeviceInfo);
        }
        e0Var.Z = vVar;
        AudioTrack audioTrack = e0Var.f22085v;
        if (audioTrack != null) {
            s.a(audioTrack, vVar);
        }
    }
}
