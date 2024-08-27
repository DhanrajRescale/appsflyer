package androidx.media;

import android.media.AudioAttributes;
import v7.a;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f2040a = (AudioAttributes) aVar.g(audioAttributesImplApi21.f2040a, 1);
        audioAttributesImplApi21.f2041b = aVar.f(audioAttributesImplApi21.f2041b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        aVar.getClass();
        aVar.k(audioAttributesImplApi21.f2040a, 1);
        aVar.j(audioAttributesImplApi21.f2041b, 2);
    }
}
