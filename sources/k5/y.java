package k5;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final b5.v f22208a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22209b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22210c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22211d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22212e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22213f;

    /* renamed from: g, reason: collision with root package name */
    public final int f22214g;

    /* renamed from: h, reason: collision with root package name */
    public final int f22215h;

    /* renamed from: i, reason: collision with root package name */
    public final c5.a f22216i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f22217j;

    public y(b5.v vVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, c5.a aVar, boolean z10) {
        this.f22208a = vVar;
        this.f22209b = i10;
        this.f22210c = i11;
        this.f22211d = i12;
        this.f22212e = i13;
        this.f22213f = i14;
        this.f22214g = i15;
        this.f22215h = i16;
        this.f22216i = aVar;
        this.f22217j = z10;
    }

    public static AudioAttributes c(b5.g gVar, boolean z10) {
        if (z10) {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
        return (AudioAttributes) gVar.a().f35633b;
    }

    public final AudioTrack a(boolean z10, b5.g gVar, int i10) {
        boolean z11;
        boolean z12;
        int i11 = this.f22210c;
        try {
            AudioTrack b10 = b(z10, gVar, i10);
            int state = b10.getState();
            if (state == 1) {
                return b10;
            }
            try {
                b10.release();
            } catch (Exception unused) {
            }
            int i12 = this.f22212e;
            int i13 = this.f22213f;
            int i14 = this.f22215h;
            b5.v vVar = this.f22208a;
            if (i11 == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            throw new AudioSink$InitializationException(state, i12, i13, i14, vVar, z12, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            int i15 = this.f22212e;
            int i16 = this.f22213f;
            int i17 = this.f22215h;
            b5.v vVar2 = this.f22208a;
            if (i11 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            throw new AudioSink$InitializationException(0, i15, i16, i17, vVar2, z11, e10);
        }
    }

    public final AudioTrack b(boolean z10, b5.g gVar, int i10) {
        int i11;
        int i12;
        AudioTrack.Builder offloadedPlayback;
        int i13 = e5.x.f15050a;
        boolean z11 = false;
        int i14 = this.f22214g;
        int i15 = this.f22213f;
        int i16 = this.f22212e;
        if (i13 >= 29) {
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(c(gVar, z10)).setAudioFormat(e0.f(i16, i15, i14)).setTransferMode(1).setBufferSizeInBytes(this.f22215h).setSessionId(i10);
            if (this.f22210c == 1) {
                z11 = true;
            }
            offloadedPlayback = sessionId.setOffloadedPlayback(z11);
            return offloadedPlayback.build();
        }
        if (i13 >= 21) {
            return new AudioTrack(c(gVar, z10), e0.f(i16, i15, i14), this.f22215h, 1, i10);
        }
        int i17 = gVar.f3300c;
        if (i17 != 13) {
            switch (i17) {
                case 2:
                    i11 = 0;
                    break;
                case 3:
                    i12 = 8;
                    i11 = i12;
                    break;
                case 4:
                    i12 = 4;
                    i11 = i12;
                    break;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    i12 = 5;
                    i11 = i12;
                    break;
                case 6:
                    i12 = 2;
                    i11 = i12;
                    break;
                default:
                    i12 = 3;
                    i11 = i12;
                    break;
            }
        } else {
            i11 = 1;
        }
        if (i10 == 0) {
            return new AudioTrack(i11, this.f22212e, this.f22213f, this.f22214g, this.f22215h, 1);
        }
        return new AudioTrack(i11, this.f22212e, this.f22213f, this.f22214g, this.f22215h, 1, i10);
    }
}
