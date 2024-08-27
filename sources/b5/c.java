package b5;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public abstract class c {
    public static void a(AudioAttributes.Builder builder, int i10) {
        builder.setAllowedCapturePolicy(i10);
    }
}
