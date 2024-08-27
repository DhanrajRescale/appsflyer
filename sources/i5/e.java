package i5;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f19394a;

    /* renamed from: b, reason: collision with root package name */
    public final c f19395b;

    /* renamed from: c, reason: collision with root package name */
    public d f19396c;

    /* renamed from: d, reason: collision with root package name */
    public b5.g f19397d;

    /* renamed from: e, reason: collision with root package name */
    public int f19398e;

    /* renamed from: f, reason: collision with root package name */
    public int f19399f;

    /* renamed from: g, reason: collision with root package name */
    public float f19400g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public AudioFocusRequest f19401h;

    public e(Context context, Handler handler, d0 d0Var) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f19394a = audioManager;
        this.f19396c = d0Var;
        this.f19395b = new c(this, handler);
        this.f19398e = 0;
    }

    public final void a() {
        if (this.f19398e == 0) {
            return;
        }
        int i10 = e5.x.f15050a;
        AudioManager audioManager = this.f19394a;
        if (i10 >= 26) {
            AudioFocusRequest audioFocusRequest = this.f19401h;
            if (audioFocusRequest != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            audioManager.abandonAudioFocus(this.f19395b);
        }
        d(0);
    }

    public final void b(int i10) {
        d dVar = this.f19396c;
        if (dVar != null) {
            g0 g0Var = ((d0) dVar).f19384a;
            boolean A = g0Var.A();
            int i11 = 1;
            if (A && i10 != 1) {
                i11 = 2;
            }
            g0Var.U(i10, i11, A);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        if (r7.f3298a == 1) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(b5.g r7) {
        /*
            r6 = this;
            b5.g r0 = r6.f19397d
            boolean r0 = e5.x.a(r0, r7)
            if (r0 != 0) goto L42
            r6.f19397d = r7
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L10
        Le:
            r2 = r0
            goto L36
        L10:
            r2 = 3
            java.lang.String r3 = "AudioFocusManager"
            r4 = 2
            int r5 = r7.f3300c
            switch(r5) {
                case 0: goto L30;
                case 1: goto L2e;
                case 2: goto L27;
                case 3: goto Le;
                case 4: goto L27;
                case 5: goto L36;
                case 6: goto L36;
                case 7: goto L36;
                case 8: goto L36;
                case 9: goto L36;
                case 10: goto L36;
                case 11: goto L29;
                case 12: goto L36;
                case 13: goto L36;
                case 14: goto L2e;
                case 15: goto L19;
                case 16: goto L1f;
                default: goto L19;
            }
        L19:
            java.lang.String r7 = "Unidentified audio usage: "
            nn.d.u(r7, r5, r3)
            goto Le
        L1f:
            int r7 = e5.x.f15050a
            r2 = 19
            if (r7 < r2) goto L27
            r2 = 4
            goto L36
        L27:
            r2 = r4
            goto L36
        L29:
            int r7 = r7.f3298a
            if (r7 != r1) goto L36
            goto L27
        L2e:
            r2 = r1
            goto L36
        L30:
            java.lang.String r7 = "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."
            e5.m.f(r3, r7)
            goto L2e
        L36:
            r6.f19399f = r2
            if (r2 == r1) goto L3c
            if (r2 != 0) goto L3d
        L3c:
            r0 = r1
        L3d:
            java.lang.String r7 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            yk.j.F0(r0, r7)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.e.c(b5.g):void");
    }

    public final void d(int i10) {
        float f10;
        if (this.f19398e == i10) {
            return;
        }
        this.f19398e = i10;
        if (i10 == 3) {
            f10 = 0.2f;
        } else {
            f10 = 1.0f;
        }
        if (this.f19400g == f10) {
            return;
        }
        this.f19400g = f10;
        d dVar = this.f19396c;
        if (dVar != null) {
            g0 g0Var = ((d0) dVar).f19384a;
            g0Var.L(1, 2, Float.valueOf(g0Var.Z * g0Var.A.f19400g));
        }
    }

    public final int e(int i10, boolean z10) {
        int i11;
        int requestAudioFocus;
        AudioFocusRequest.Builder g10;
        boolean z11;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        int i12 = 1;
        if (i10 != 1 && this.f19399f == 1) {
            if (!z10) {
                return -1;
            }
            if (this.f19398e != 1) {
                int i13 = e5.x.f15050a;
                AudioManager audioManager = this.f19394a;
                c cVar = this.f19395b;
                if (i13 >= 26) {
                    AudioFocusRequest audioFocusRequest = this.f19401h;
                    if (audioFocusRequest == null) {
                        if (audioFocusRequest == null) {
                            h1.b.n();
                            g10 = h1.b.c(this.f19399f);
                        } else {
                            h1.b.n();
                            g10 = h1.b.g(this.f19401h);
                        }
                        b5.g gVar = this.f19397d;
                        if (gVar != null && gVar.f3298a == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        gVar.getClass();
                        audioAttributes = g10.setAudioAttributes((AudioAttributes) gVar.a().f35633b);
                        willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(z11);
                        onAudioFocusChangeListener = willPauseWhenDucked.setOnAudioFocusChangeListener(cVar);
                        build = onAudioFocusChangeListener.build();
                        this.f19401h = build;
                    }
                    requestAudioFocus = audioManager.requestAudioFocus(this.f19401h);
                } else {
                    b5.g gVar2 = this.f19397d;
                    gVar2.getClass();
                    int i14 = gVar2.f3300c;
                    if (i14 != 13) {
                        switch (i14) {
                            case 2:
                                i11 = 0;
                                break;
                            case 3:
                                i11 = 8;
                                break;
                            case 4:
                                i11 = 4;
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i11 = 5;
                                break;
                            case 6:
                                i11 = 2;
                                break;
                            default:
                                i11 = 3;
                                break;
                        }
                    } else {
                        i11 = 1;
                    }
                    requestAudioFocus = audioManager.requestAudioFocus(cVar, i11, this.f19399f);
                }
                if (requestAudioFocus == 1) {
                    d(1);
                } else {
                    d(0);
                    i12 = -1;
                }
            }
            return i12;
        }
        a();
        if (z10) {
            return 1;
        }
        return -1;
    }
}
