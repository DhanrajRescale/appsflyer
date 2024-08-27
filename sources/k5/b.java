package k5;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import lp.m1;
import lp.n1;
import lp.o0;
import lp.o1;
import lp.y1;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final AudioAttributes f22042a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    /* JADX WARN: Type inference failed for: r0v1, types: [lp.h0, lp.k0] */
    public static o0 a() {
        boolean isDirectPlaybackSupported;
        lp.l0 l0Var = o0.f25025b;
        ?? h0Var = new lp.h0();
        o1 o1Var = c.f22047e;
        m1 m1Var = o1Var.f25052b;
        if (m1Var == null) {
            m1 m1Var2 = new m1(o1Var, new n1(o1Var.f25028e, 0, o1Var.f25029f));
            o1Var.f25052b = m1Var2;
            m1Var = m1Var2;
        }
        y1 it = m1Var.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (e5.x.f15050a >= 34 || intValue != 30) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), f22042a);
                if (isDirectPlaybackSupported) {
                    h0Var.a0(Integer.valueOf(intValue));
                }
            }
        }
        h0Var.a0(2);
        return h0Var.e0();
    }

    public static int b(int i10, int i11) {
        boolean isDirectPlaybackSupported;
        for (int i12 = 10; i12 > 0; i12--) {
            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(e5.x.n(i12)).build(), f22042a);
            if (isDirectPlaybackSupported) {
                return i12;
            }
        }
        return 0;
    }
}
