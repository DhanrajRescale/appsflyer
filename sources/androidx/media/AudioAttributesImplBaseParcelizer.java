package androidx.media;

import v7.a;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2042a = aVar.f(audioAttributesImplBase.f2042a, 1);
        audioAttributesImplBase.f2043b = aVar.f(audioAttributesImplBase.f2043b, 2);
        audioAttributesImplBase.f2044c = aVar.f(audioAttributesImplBase.f2044c, 3);
        audioAttributesImplBase.f2045d = aVar.f(audioAttributesImplBase.f2045d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.getClass();
        aVar.j(audioAttributesImplBase.f2042a, 1);
        aVar.j(audioAttributesImplBase.f2043b, 2);
        aVar.j(audioAttributesImplBase.f2044c, 3);
        aVar.j(audioAttributesImplBase.f2045d, 4);
    }
}
