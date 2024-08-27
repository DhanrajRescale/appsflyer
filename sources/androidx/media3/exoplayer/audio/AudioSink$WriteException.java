package androidx.media3.exoplayer.audio;

import b5.v;
import jr.h;

/* loaded from: classes.dex */
public final class AudioSink$WriteException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f2076a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2077b;

    /* renamed from: c, reason: collision with root package name */
    public final v f2078c;

    public AudioSink$WriteException(int i10, v vVar, boolean z10) {
        super(h.n("AudioTrack write failed: ", i10));
        this.f2077b = z10;
        this.f2076a = i10;
        this.f2078c = vVar;
    }
}
