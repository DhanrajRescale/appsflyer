package j5;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.PlaybackException;
import b5.f0;
import b5.g1;
import b5.h1;
import b5.i1;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a0 implements c, b0 {
    public boolean A;

    /* renamed from: a, reason: collision with root package name */
    public final Context f20937a;

    /* renamed from: b, reason: collision with root package name */
    public final y f20938b;

    /* renamed from: c, reason: collision with root package name */
    public final PlaybackSession f20939c;

    /* renamed from: i, reason: collision with root package name */
    public String f20945i;

    /* renamed from: j, reason: collision with root package name */
    public PlaybackMetrics.Builder f20946j;

    /* renamed from: k, reason: collision with root package name */
    public int f20947k;

    /* renamed from: n, reason: collision with root package name */
    public PlaybackException f20950n;

    /* renamed from: o, reason: collision with root package name */
    public l0.j f20951o;

    /* renamed from: p, reason: collision with root package name */
    public l0.j f20952p;

    /* renamed from: q, reason: collision with root package name */
    public l0.j f20953q;

    /* renamed from: r, reason: collision with root package name */
    public b5.v f20954r;

    /* renamed from: s, reason: collision with root package name */
    public b5.v f20955s;

    /* renamed from: t, reason: collision with root package name */
    public b5.v f20956t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f20957u;

    /* renamed from: v, reason: collision with root package name */
    public int f20958v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f20959w;

    /* renamed from: x, reason: collision with root package name */
    public int f20960x;

    /* renamed from: y, reason: collision with root package name */
    public int f20961y;

    /* renamed from: z, reason: collision with root package name */
    public int f20962z;

    /* renamed from: e, reason: collision with root package name */
    public final h1 f20941e = new h1();

    /* renamed from: f, reason: collision with root package name */
    public final g1 f20942f = new g1();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f20944h = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f20943g = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final long f20940d = SystemClock.elapsedRealtime();

    /* renamed from: l, reason: collision with root package name */
    public int f20948l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f20949m = 0;

    public a0(Context context, PlaybackSession playbackSession) {
        this.f20937a = context.getApplicationContext();
        this.f20939c = playbackSession;
        y yVar = new y();
        this.f20938b = yVar;
        yVar.f21032d = this;
    }

    public final boolean a(l0.j jVar) {
        String str;
        if (jVar != null) {
            String str2 = (String) jVar.f23775c;
            y yVar = this.f20938b;
            synchronized (yVar) {
                str = yVar.f21034f;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        long longValue;
        long longValue2;
        int i10;
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.f20946j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.f20962z);
            this.f20946j.setVideoFramesDropped(this.f20960x);
            this.f20946j.setVideoFramesPlayed(this.f20961y);
            Long l10 = (Long) this.f20943g.get(this.f20945i);
            PlaybackMetrics.Builder builder2 = this.f20946j;
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l11 = (Long) this.f20944h.get(this.f20945i);
            PlaybackMetrics.Builder builder3 = this.f20946j;
            if (l11 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l11.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.f20946j;
            if (l11 != null && l11.longValue() > 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            builder4.setStreamSource(i10);
            build = this.f20946j.build();
            this.f20939c.reportPlaybackMetrics(build);
        }
        this.f20946j = null;
        this.f20945i = null;
        this.f20962z = 0;
        this.f20960x = 0;
        this.f20961y = 0;
        this.f20954r = null;
        this.f20955s = null;
        this.f20956t = null;
        this.A = false;
    }

    public final void c(i1 i1Var, r5.w wVar) {
        int b10;
        PlaybackMetrics.Builder builder = this.f20946j;
        if (wVar == null || (b10 = i1Var.b(wVar.f3556a)) == -1) {
            return;
        }
        g1 g1Var = this.f20942f;
        int i10 = 0;
        i1Var.g(b10, g1Var, false);
        int i11 = g1Var.f3318c;
        h1 h1Var = this.f20941e;
        i1Var.o(i11, h1Var);
        f0 f0Var = h1Var.f3334c.f3390b;
        int i12 = 2;
        if (f0Var != null) {
            int B = e5.x.B(f0Var.f3289a, f0Var.f3290b);
            if (B != 0) {
                if (B != 1) {
                    if (B != 2) {
                        i10 = 1;
                    } else {
                        i10 = 4;
                    }
                } else {
                    i10 = 5;
                }
            } else {
                i10 = 3;
            }
        }
        builder.setStreamType(i10);
        if (h1Var.f3345n != -9223372036854775807L && !h1Var.f3343l && !h1Var.f3340i && !h1Var.a()) {
            builder.setMediaDurationMillis(e5.x.P(h1Var.f3345n));
        }
        if (!h1Var.a()) {
            i12 = 1;
        }
        builder.setPlaybackType(i12);
        this.A = true;
    }

    public final void d(b bVar, String str) {
        r5.w wVar = bVar.f20966d;
        if ((wVar == null || !wVar.a()) && str.equals(this.f20945i)) {
            b();
        }
        this.f20943g.remove(str);
        this.f20944h.remove(str);
    }

    public final void e(int i10, long j10, b5.v vVar, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i12;
        String str;
        timeSinceCreatedMillis = i5.a0.f(i10).setTimeSinceCreatedMillis(j10 - this.f20940d);
        if (vVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i11 != 1) {
                i12 = 3;
                if (i11 != 2) {
                    if (i11 != 3) {
                        i12 = 1;
                    } else {
                        i12 = 4;
                    }
                }
            } else {
                i12 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i12);
            String str2 = vVar.f3651k;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = vVar.f3652l;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = vVar.f3649i;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i13 = vVar.f3648h;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = vVar.f3657q;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = vVar.f3658r;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = vVar.f3665y;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = vVar.f3666z;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str5 = vVar.f3643c;
            if (str5 != null) {
                int i18 = e5.x.f15050a;
                String[] split = str5.split("-", -1);
                String str6 = split[0];
                if (split.length >= 2) {
                    str = split[1];
                } else {
                    str = null;
                }
                Pair create = Pair.create(str6, str);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = vVar.f3659s;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        PlaybackSession playbackSession = this.f20939c;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }
}
