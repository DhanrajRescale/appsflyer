package k5;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public abstract class s {
    public static void a(AudioTrack audioTrack, v vVar) {
        AudioDeviceInfo audioDeviceInfo;
        if (vVar == null) {
            audioDeviceInfo = null;
        } else {
            audioDeviceInfo = vVar.f22199a;
        }
        audioTrack.setPreferredDevice(audioDeviceInfo);
    }
}
