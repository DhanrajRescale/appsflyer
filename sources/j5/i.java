package j5;

import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements e5.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20982a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlaybackException f20983b;

    public /* synthetic */ i(b bVar, ExoPlaybackException exoPlaybackException, int i10) {
        this.f20982a = i10;
        this.f20983b = exoPlaybackException;
    }

    @Override // e5.j
    public final void invoke(Object obj) {
        switch (this.f20982a) {
            case 0:
                ((a0) ((c) obj)).f20950n = this.f20983b;
                return;
            default:
                ((c) obj).getClass();
                return;
        }
    }
}
