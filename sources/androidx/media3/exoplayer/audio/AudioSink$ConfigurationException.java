package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import b5.v;

/* loaded from: classes.dex */
public final class AudioSink$ConfigurationException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final v f2073a;

    public AudioSink$ConfigurationException(AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException, v vVar) {
        super(audioProcessor$UnhandledAudioFormatException);
        this.f2073a = vVar;
    }

    public AudioSink$ConfigurationException(String str, v vVar) {
        super(str);
        this.f2073a = vVar;
    }
}
