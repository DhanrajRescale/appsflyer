package androidx.media;

import v7.a;
import v7.c;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        c cVar = audioAttributesCompat.f2039a;
        if (aVar.e(1)) {
            cVar = aVar.h();
        }
        audioAttributesCompat.f2039a = (AudioAttributesImpl) cVar;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) {
        aVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f2039a;
        aVar.i(1);
        aVar.l(audioAttributesImpl);
    }
}
