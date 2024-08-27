package com.assetgro.stockgro.ui.social.presentation.utils;

import android.content.Context;
import android.media.AudioTrack;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.activity.b;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import b5.a1;
import b5.b0;
import b5.c0;
import b5.e0;
import b5.f0;
import b5.i;
import b5.k0;
import b5.l0;
import b5.n0;
import b5.s0;
import b5.y;
import b5.z;
import ba.cw;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.social.presentation.utils.VideoPlayer;
import com.google.android.gms.search.SearchAuth;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import e5.t;
import el.l;
import fi.c;
import fi.d;
import fi.g;
import fi.h;
import fi.j;
import i5.b1;
import i5.e;
import i5.f1;
import i5.g0;
import i5.i0;
import i5.i1;
import i5.m0;
import i5.o;
import i5.q;
import i5.r;
import i5.z0;
import j5.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lp.j1;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import r5.a;
import r5.y0;
import u5.p;
import vt.x;
import vu.f;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u001b\rJ\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0003J\b\u0010\b\u001a\u00020\u0006H\u0003J\b\u0010\t\u001a\u00020\u0006H\u0003J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002R$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/ui/social/presentation/utils/VideoPlayer;", "Landroid/widget/FrameLayout;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "Landroidx/lifecycle/s;", HttpUrl.FRAGMENT_ENCODE_SET, "getPlaybackPosition", HttpUrl.FRAGMENT_ENCODE_SET, "onPause", "onDestroy", "onResume", HttpUrl.FRAGMENT_ENCODE_SET, "isFullScreen", "setFullScreenView", "Lfi/g;", "b", "Lfi/g;", "getOnVideoPlayerAction", "()Lfi/g;", "setOnVideoPlayerAction", "(Lfi/g;)V", "onVideoPlayerAction", "Li5/i1;", "n", "Li5/i1;", "getRenderersFactory", "()Li5/i1;", "renderersFactory", "fi/f", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class VideoPlayer extends FrameLayout implements SeekBar.OnSeekBarChangeListener, s {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f10134s = 0;

    /* renamed from: a, reason: collision with root package name */
    public final cw f10135a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public g onVideoPlayerAction;

    /* renamed from: c, reason: collision with root package name */
    public final j f10137c;

    /* renamed from: d, reason: collision with root package name */
    public g0 f10138d;

    /* renamed from: e, reason: collision with root package name */
    public int f10139e;

    /* renamed from: f, reason: collision with root package name */
    public long f10140f;

    /* renamed from: g, reason: collision with root package name */
    public final SeekBar f10141g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageButton f10142h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageButton f10143i;

    /* renamed from: j, reason: collision with root package name */
    public final ImageButton f10144j;

    /* renamed from: k, reason: collision with root package name */
    public final ImageButton f10145k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f10146l;

    /* renamed from: m, reason: collision with root package name */
    public final ImageButton f10147m;

    /* renamed from: n, reason: collision with root package name */
    public final d f10148n;

    /* renamed from: o, reason: collision with root package name */
    public final f f10149o;

    /* renamed from: p, reason: collision with root package name */
    public int f10150p;

    /* renamed from: q, reason: collision with root package name */
    public final String[] f10151q;

    /* renamed from: r, reason: collision with root package name */
    public final LinkedHashMap f10152r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoPlayer(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final zt.a a(com.assetgro.stockgro.ui.social.presentation.utils.VideoPlayer r6, yt.a r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof fi.k
            if (r0 == 0) goto L16
            r0 = r7
            fi.k r0 = (fi.k) r0
            int r1 = r0.f16134d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f16134d = r1
            goto L1b
        L16:
            fi.k r0 = new fi.k
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.f16132b
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f16134d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.assetgro.stockgro.ui.social.presentation.utils.VideoPlayer r6 = r0.f16131a
            goto L31
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            ut.n.b(r7)
        L34:
            r6.m()
            r0.f16131a = r6
            r0.f16134d = r3
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r7 = kp.j.K(r4, r0)
            if (r7 != r1) goto L34
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.assetgro.stockgro.ui.social.presentation.utils.VideoPlayer.a(com.assetgro.stockgro.ui.social.presentation.utils.VideoPlayer, yt.a):zt.a");
    }

    public static String e(long j10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long minutes = timeUnit.toMinutes(j10);
        String format = String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(minutes), Long.valueOf(timeUnit.toSeconds(j10) - TimeUnit.MINUTES.toSeconds(minutes))}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    @androidx.lifecycle.g0(m.ON_DESTROY)
    private final void onDestroy() {
        try {
            g0 g0Var = this.f10138d;
            if (g0Var != null) {
                g0Var.N(false);
            }
            j();
        } catch (Exception e10) {
            FirebaseCrashlytics.getInstance().recordException(e10);
        }
    }

    @androidx.lifecycle.g0(m.ON_PAUSE)
    private final void onPause() {
        try {
            i();
        } catch (Exception e10) {
            FirebaseCrashlytics.getInstance().recordException(e10);
        }
    }

    @androidx.lifecycle.g0(m.ON_RESUME)
    private final void onResume() {
        try {
            k(0L);
        } catch (Exception e10) {
            FirebaseCrashlytics.getInstance().recordException(e10);
        }
    }

    private final void setFullScreenView(boolean isFullScreen) {
        int i10;
        if (isFullScreen) {
            i10 = R.drawable.ic_video_exit_fullscreen;
        } else {
            i10 = R.drawable.ic_video_go_fullscreen;
        }
        ImageButton imageButton = this.f10147m;
        if (imageButton != null) {
            imageButton.setImageDrawable(getContext().getDrawable(i10));
        }
    }

    public final g getOnVideoPlayerAction() {
        return this.onVideoPlayerAction;
    }

    public final long getPlaybackPosition() {
        g0 g0Var = this.f10138d;
        if (g0Var != null) {
            return g0Var.u();
        }
        return this.f10140f;
    }

    @NotNull
    public final i1 getRenderersFactory() {
        return this.f10148n;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [b5.z, b5.a0] */
    public final void h(String videoUrl, boolean z10) {
        Uri parse;
        boolean z11;
        f0 f0Var;
        int i10;
        boolean z12;
        int i11;
        c0 c0Var;
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        setFullScreenView(z10);
        p pVar = new p(getContext());
        cw cwVar = this.f10135a;
        if (cwVar != null) {
            cwVar.f4422s.setVisibility(0);
            q qVar = new q(getContext());
            yk.j.H0(!qVar.f19617u);
            qVar.f19601e = new o(pVar, 1);
            b5.g gVar = b5.g.f3297g;
            yk.j.H0(!qVar.f19617u);
            qVar.f19606j = gVar;
            qVar.f19607k = true;
            yk.j.H0(!qVar.f19617u);
            d dVar = this.f10148n;
            dVar.getClass();
            qVar.f19599c = new o(dVar, 0);
            yk.j.H0(!qVar.f19617u);
            qVar.f19617u = true;
            final g0 g0Var = new g0(qVar);
            cw cwVar2 = this.f10135a;
            if (cwVar2 != null) {
                cwVar2.f4423t.setPlayer(g0Var);
                y yVar = new y();
                b0 b0Var = new b0();
                List emptyList = Collections.emptyList();
                j1 j1Var = j1.f24998e;
                b5.g0 g0Var2 = b5.g0.f3304c;
                if (videoUrl == null) {
                    parse = null;
                } else {
                    parse = Uri.parse(videoUrl);
                }
                if (b0Var.f3217b != null && b0Var.f3216a == null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                yk.j.H0(z11);
                if (parse != null) {
                    if (b0Var.f3216a != null) {
                        c0Var = new c0(b0Var);
                    } else {
                        c0Var = null;
                    }
                    f0Var = new f0(parse, null, c0Var, null, emptyList, null, j1Var, null);
                } else {
                    f0Var = null;
                }
                k0 k0Var = new k0(HttpUrl.FRAGMENT_ENCODE_SET, new z(yVar), f0Var, new e0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), n0.I, g0Var2);
                Intrinsics.checkNotNullExpressionValue(k0Var, "fromUri(...)");
                List a10 = x.a(k0Var);
                int i12 = this.f10139e;
                long j10 = this.f10140f;
                g0Var.X();
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < a10.size(); i13++) {
                    arrayList.add(g0Var.f19471q.a((k0) a10.get(i13)));
                }
                g0Var.X();
                int y10 = g0Var.y(g0Var.f19459g0);
                long u10 = g0Var.u();
                g0Var.G++;
                ArrayList arrayList2 = g0Var.f19469o;
                if (!arrayList2.isEmpty()) {
                    int size = arrayList2.size();
                    for (int i14 = size - 1; i14 >= 0; i14--) {
                        arrayList2.remove(i14);
                    }
                    y0 y0Var = g0Var.L;
                    int[] iArr = y0Var.f33333b;
                    int[] iArr2 = new int[iArr.length - size];
                    i10 = y10;
                    int i15 = 0;
                    for (int i16 = 0; i16 < iArr.length; i16++) {
                        int i17 = iArr[i16];
                        if (i17 >= 0 && i17 < size) {
                            i15++;
                        } else {
                            int i18 = i16 - i15;
                            if (i17 >= 0) {
                                i17 -= size;
                            }
                            iArr2[i18] = i17;
                        }
                    }
                    g0Var.L = new y0(iArr2, new Random(y0Var.f33332a.nextLong()));
                } else {
                    i10 = y10;
                }
                ArrayList arrayList3 = new ArrayList();
                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                    z0 z0Var = new z0((a) arrayList.get(i19), g0Var.f19470p);
                    arrayList3.add(z0Var);
                    arrayList2.add(i19, new i5.f0(z0Var.f19679a.f33280o, z0Var.f19680b));
                }
                g0Var.L = g0Var.L.a(arrayList3.size());
                f1 f1Var = new f1(arrayList2, g0Var.L);
                boolean q10 = f1Var.q();
                int i20 = f1Var.f19427d;
                if (!q10 && i12 >= i20) {
                    throw new IllegalStateException();
                }
                if (i12 == -1) {
                    i12 = i10;
                    j10 = u10;
                }
                b1 F = g0Var.F(g0Var.f19459g0, f1Var, g0Var.G(f1Var, i12, j10));
                int i21 = F.f19366e;
                if (i12 != -1 && i21 != 1) {
                    i21 = (f1Var.q() || i12 >= i20) ? 4 : 2;
                }
                b1 g10 = F.g(i21);
                g0Var.f19465k.f19558h.a(17, new i0(arrayList3, g0Var.L, i12, e5.x.F(j10))).b();
                if (!g0Var.f19459g0.f19363b.f3556a.equals(g10.f19363b.f3556a) && !g0Var.f19459g0.f19362a.q()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                g0Var.V(g10, 0, 1, z12, 4, g0Var.v(g10), -1, false);
                g0Var.N(true);
                yk.g.H(this.f10149o, null, null, new h(this, null), 3);
                j jVar = this.f10137c;
                jVar.getClass();
                g0Var.f19466l.a(jVar);
                ImageButton imageButton = this.f10142h;
                if (imageButton != null) {
                    final int i22 = 0;
                    imageButton.setOnClickListener(new View.OnClickListener() { // from class: fi.a
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            float f10;
                            int i23;
                            int i24 = i22;
                            VideoPlayer this$0 = this;
                            a1 exoPlayer = g0Var;
                            switch (i24) {
                                case 0:
                                    int i25 = VideoPlayer.f10134s;
                                    Intrinsics.checkNotNullParameter(exoPlayer, "$exoPlayer");
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    boolean z13 = !l.f15696a;
                                    l.f15696a = z13;
                                    if (z13) {
                                        f10 = s0.g.f34069a;
                                    } else {
                                        f10 = 1.0f;
                                    }
                                    ((g0) exoPlayer).S(f10);
                                    this$0.getClass();
                                    if (l.f15696a) {
                                        i23 = R.drawable.ic_video_volume_off;
                                    } else {
                                        i23 = R.drawable.ic_video_volume_up;
                                    }
                                    ImageButton imageButton2 = this$0.f10142h;
                                    if (imageButton2 != null) {
                                        imageButton2.setImageResource(i23);
                                        return;
                                    }
                                    return;
                                default:
                                    int i26 = VideoPlayer.f10134s;
                                    Intrinsics.checkNotNullParameter(exoPlayer, "$exoPlayer");
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    b5.i iVar = (b5.i) exoPlayer;
                                    if (iVar.f()) {
                                        ((g0) iVar).N(false);
                                        hl.f.B(this$0.f10149o.f38365a);
                                        g gVar2 = this$0.onVideoPlayerAction;
                                        if (gVar2 != null) {
                                            gVar2.onPause();
                                        }
                                    } else {
                                        ((g0) iVar).N(true);
                                        yk.g.H(this$0.f10149o, null, null, new i(this$0, null), 3);
                                        g gVar3 = this$0.onVideoPlayerAction;
                                        if (gVar3 != null) {
                                            gVar3.c();
                                        }
                                    }
                                    this$0.l(exoPlayer);
                                    return;
                            }
                        }
                    });
                }
                if (z10) {
                    i11 = R.drawable.ic_video_pause;
                } else {
                    i11 = R.drawable.ic_video_play;
                }
                ImageButton imageButton2 = this.f10143i;
                if (imageButton2 != null) {
                    imageButton2.setImageDrawable(getContext().getDrawable(i11));
                }
                ImageButton imageButton3 = this.f10143i;
                if (imageButton3 != null) {
                    final int i23 = 1;
                    imageButton3.setOnClickListener(new View.OnClickListener() { // from class: fi.a
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            float f10;
                            int i232;
                            int i24 = i23;
                            VideoPlayer this$0 = this;
                            a1 exoPlayer = g0Var;
                            switch (i24) {
                                case 0:
                                    int i25 = VideoPlayer.f10134s;
                                    Intrinsics.checkNotNullParameter(exoPlayer, "$exoPlayer");
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    boolean z13 = !l.f15696a;
                                    l.f15696a = z13;
                                    if (z13) {
                                        f10 = s0.g.f34069a;
                                    } else {
                                        f10 = 1.0f;
                                    }
                                    ((g0) exoPlayer).S(f10);
                                    this$0.getClass();
                                    if (l.f15696a) {
                                        i232 = R.drawable.ic_video_volume_off;
                                    } else {
                                        i232 = R.drawable.ic_video_volume_up;
                                    }
                                    ImageButton imageButton22 = this$0.f10142h;
                                    if (imageButton22 != null) {
                                        imageButton22.setImageResource(i232);
                                        return;
                                    }
                                    return;
                                default:
                                    int i26 = VideoPlayer.f10134s;
                                    Intrinsics.checkNotNullParameter(exoPlayer, "$exoPlayer");
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    b5.i iVar = (b5.i) exoPlayer;
                                    if (iVar.f()) {
                                        ((g0) iVar).N(false);
                                        hl.f.B(this$0.f10149o.f38365a);
                                        g gVar2 = this$0.onVideoPlayerAction;
                                        if (gVar2 != null) {
                                            gVar2.onPause();
                                        }
                                    } else {
                                        ((g0) iVar).N(true);
                                        yk.g.H(this$0.f10149o, null, null, new i(this$0, null), 3);
                                        g gVar3 = this$0.onVideoPlayerAction;
                                        if (gVar3 != null) {
                                            gVar3.c();
                                        }
                                    }
                                    this$0.l(exoPlayer);
                                    return;
                            }
                        }
                    });
                }
                ImageButton imageButton4 = this.f10144j;
                if (imageButton4 != null) {
                    final int i24 = 0;
                    imageButton4.setOnClickListener(new View.OnClickListener() { // from class: fi.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i25 = i24;
                            r exoPlayer = g0Var;
                            switch (i25) {
                                case 0:
                                    int i26 = VideoPlayer.f10134s;
                                    Intrinsics.checkNotNullParameter(exoPlayer, "$exoPlayer");
                                    g0 g0Var3 = (g0) exoPlayer;
                                    g0Var3.h(5, g0Var3.u() + SearchAuth.StatusCodes.AUTH_DISABLED);
                                    return;
                                default:
                                    int i27 = VideoPlayer.f10134s;
                                    Intrinsics.checkNotNullParameter(exoPlayer, "$exoPlayer");
                                    g0 g0Var4 = (g0) exoPlayer;
                                    g0Var4.h(5, g0Var4.u() - SearchAuth.StatusCodes.AUTH_DISABLED);
                                    return;
                            }
                        }
                    });
                }
                ImageButton imageButton5 = this.f10145k;
                if (imageButton5 != null) {
                    final int i25 = 1;
                    imageButton5.setOnClickListener(new View.OnClickListener() { // from class: fi.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i252 = i25;
                            r exoPlayer = g0Var;
                            switch (i252) {
                                case 0:
                                    int i26 = VideoPlayer.f10134s;
                                    Intrinsics.checkNotNullParameter(exoPlayer, "$exoPlayer");
                                    g0 g0Var3 = (g0) exoPlayer;
                                    g0Var3.h(5, g0Var3.u() + SearchAuth.StatusCodes.AUTH_DISABLED);
                                    return;
                                default:
                                    int i27 = VideoPlayer.f10134s;
                                    Intrinsics.checkNotNullParameter(exoPlayer, "$exoPlayer");
                                    g0 g0Var4 = (g0) exoPlayer;
                                    g0Var4.h(5, g0Var4.u() - SearchAuth.StatusCodes.AUTH_DISABLED);
                                    return;
                            }
                        }
                    });
                }
                ImageButton imageButton6 = this.f10147m;
                if (imageButton6 != null) {
                    imageButton6.setOnClickListener(new c(this, 0));
                }
                g0Var.I();
                g0Var.P(1);
                this.f10138d = g0Var;
                return;
            }
            Intrinsics.k("binding");
            throw null;
        }
        Intrinsics.k("binding");
        throw null;
    }

    public final void i() {
        g0 g0Var = this.f10138d;
        if (g0Var != null) {
            g0Var.N(false);
            l(g0Var);
            g gVar = this.onVideoPlayerAction;
            if (gVar != null) {
                gVar.onPause();
            }
        }
    }

    public final void j() {
        String str;
        AudioTrack audioTrack;
        g0 g0Var = this.f10138d;
        if (g0Var != null) {
            this.f10140f = g0Var.u();
            this.f10139e = g0Var.s();
            g0Var.A();
            g0Var.J(this.f10137c);
            StringBuilder sb2 = new StringBuilder("Release ");
            sb2.append(Integer.toHexString(System.identityHashCode(g0Var)));
            sb2.append(" [AndroidXMedia3/1.1.1] [");
            sb2.append(e5.x.f15054e);
            sb2.append("] [");
            HashSet hashSet = l0.f3404a;
            synchronized (l0.class) {
                str = l0.f3405b;
            }
            sb2.append(str);
            sb2.append("]");
            e5.m.e("ExoPlayerImpl", sb2.toString());
            g0Var.X();
            int i10 = e5.x.f15050a;
            if (i10 < 21 && (audioTrack = g0Var.O) != null) {
                audioTrack.release();
                g0Var.O = null;
            }
            g0Var.f19480z.f(false);
            g0Var.B.f(false);
            g0Var.C.f(false);
            e eVar = g0Var.A;
            eVar.f19396c = null;
            eVar.a();
            m0 m0Var = g0Var.f19465k;
            synchronized (m0Var) {
                if (!m0Var.f19575y && m0Var.f19560j.getThread().isAlive()) {
                    m0Var.f19558h.d(7);
                    m0Var.e0(new o(m0Var, 2), m0Var.f19571u);
                    boolean z10 = m0Var.f19575y;
                    if (!z10) {
                        g0Var.f19466l.l(10, new s0(20));
                    }
                }
            }
            g0Var.f19466l.k();
            g0Var.f19462i.f15044a.removeCallbacksAndMessages(null);
            ((v5.h) g0Var.f19474t).f37725b.A(g0Var.f19472r);
            b1 b1Var = g0Var.f19459g0;
            if (b1Var.f19376o) {
                g0Var.f19459g0 = b1Var.a();
            }
            b1 g10 = g0Var.f19459g0.g(1);
            g0Var.f19459g0 = g10;
            b1 b10 = g10.b(g10.f19363b);
            g0Var.f19459g0 = b10;
            b10.f19377p = b10.f19379r;
            g0Var.f19459g0.f19378q = 0L;
            w wVar = (w) g0Var.f19472r;
            t tVar = wVar.f21018h;
            yk.j.I0(tVar);
            tVar.c(new b(wVar, 15));
            p pVar = (p) g0Var.f19460h;
            synchronized (pVar.f36829c) {
                if (i10 >= 32) {
                    n5.b0 b0Var = pVar.f36834h;
                    if (b0Var != null) {
                        Object obj = b0Var.f28250e;
                        if (((Spatializer$OnSpatializerStateChangedListener) obj) != null && ((Handler) b0Var.f28249d) != null) {
                            ((Spatializer) b0Var.f28248c).removeOnSpatializerStateChangedListener((Spatializer$OnSpatializerStateChangedListener) obj);
                            ((Handler) b0Var.f28249d).removeCallbacksAndMessages(null);
                            b0Var.f28249d = null;
                            b0Var.f28250e = null;
                        }
                    }
                }
            }
            pVar.f36845a = null;
            pVar.f36846b = null;
            g0Var.K();
            Surface surface = g0Var.Q;
            if (surface != null) {
                surface.release();
                g0Var.Q = null;
            }
            g0Var.f19449b0 = d5.c.f13920b;
        }
        this.f10138d = null;
    }

    public final void k(long j10) {
        float f10;
        int i10;
        g0 g0Var = this.f10138d;
        if (g0Var != null) {
            if (l.f15696a) {
                f10 = s0.g.f34069a;
            } else {
                f10 = 1.0f;
            }
            g0Var.S(f10);
            if (l.f15696a) {
                i10 = R.drawable.ic_video_volume_off;
            } else {
                i10 = R.drawable.ic_video_volume_up;
            }
            ImageButton imageButton = this.f10142h;
            if (imageButton != null) {
                imageButton.setImageResource(i10);
            }
            g0Var.N(true);
            g0Var.h(5, j10);
            if (g0Var.B() == 3) {
                l(g0Var);
            }
            g gVar = this.onVideoPlayerAction;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public final void l(a1 a1Var) {
        int i10;
        if (((i) a1Var).f()) {
            i10 = R.drawable.ic_video_pause;
        } else {
            i10 = R.drawable.ic_video_play;
        }
        ImageButton imageButton = this.f10143i;
        if (imageButton != null) {
            imageButton.setImageResource(i10);
        }
    }

    public final void m() {
        g0 g0Var = this.f10138d;
        if (g0Var != null) {
            long u10 = g0Var.u();
            long z10 = g0Var.z();
            int i10 = (int) ((100 * u10) / z10);
            SeekBar seekBar = this.f10141g;
            if (seekBar != null) {
                seekBar.setProgress(i10);
            }
            String g10 = a3.a.g(e(u10), " / ", e(z10));
            TextView textView = this.f10146l;
            if (textView != null) {
                textView.setText(g10);
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
        g0 g0Var;
        if (z10 && (g0Var = this.f10138d) != null) {
            g0Var.h(5, (g0Var.z() * i10) / 100);
            m();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public final void setOnVideoPlayerAction(g gVar) {
        this.onVideoPlayerAction = gVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r6v3, types: [fi.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public VideoPlayer(final android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.assetgro.stockgro.ui.social.presentation.utils.VideoPlayer.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
