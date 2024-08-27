package k5;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import b5.u0;
import h.m0;
import h.r0;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import lp.j1;
import lp.o0;

/* loaded from: classes.dex */
public final class e0 implements m {

    /* renamed from: g0, reason: collision with root package name */
    public static final Object f22055g0 = new Object();

    /* renamed from: h0, reason: collision with root package name */
    public static ExecutorService f22056h0;

    /* renamed from: i0, reason: collision with root package name */
    public static int f22057i0;
    public z A;
    public u0 B;
    public boolean C;
    public ByteBuffer D;
    public int E;
    public long F;
    public long G;
    public long H;
    public long I;
    public int J;
    public boolean K;
    public boolean L;
    public long M;
    public float N;
    public ByteBuffer O;
    public int P;
    public ByteBuffer Q;
    public byte[] R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public b5.h Y;
    public v Z;

    /* renamed from: a, reason: collision with root package name */
    public final Context f22058a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f22059a0;

    /* renamed from: b, reason: collision with root package name */
    public final h.c f22060b;

    /* renamed from: b0, reason: collision with root package name */
    public long f22061b0;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22062c;

    /* renamed from: c0, reason: collision with root package name */
    public long f22063c0;

    /* renamed from: d, reason: collision with root package name */
    public final q f22064d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f22065d0;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f22066e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f22067e0;

    /* renamed from: f, reason: collision with root package name */
    public final j1 f22068f;

    /* renamed from: f0, reason: collision with root package name */
    public Looper f22069f0;

    /* renamed from: g, reason: collision with root package name */
    public final j1 f22070g;

    /* renamed from: h, reason: collision with root package name */
    public final r0 f22071h;

    /* renamed from: i, reason: collision with root package name */
    public final p f22072i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayDeque f22073j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f22074k;

    /* renamed from: l, reason: collision with root package name */
    public final int f22075l;

    /* renamed from: m, reason: collision with root package name */
    public d0 f22076m;

    /* renamed from: n, reason: collision with root package name */
    public final v5.d f22077n;

    /* renamed from: o, reason: collision with root package name */
    public final v5.d f22078o;

    /* renamed from: p, reason: collision with root package name */
    public final f0 f22079p;

    /* renamed from: q, reason: collision with root package name */
    public j5.d0 f22080q;

    /* renamed from: r, reason: collision with root package name */
    public hr.c f22081r;

    /* renamed from: s, reason: collision with root package name */
    public y f22082s;

    /* renamed from: t, reason: collision with root package name */
    public y f22083t;

    /* renamed from: u, reason: collision with root package name */
    public c5.a f22084u;

    /* renamed from: v, reason: collision with root package name */
    public AudioTrack f22085v;

    /* renamed from: w, reason: collision with root package name */
    public c f22086w;

    /* renamed from: x, reason: collision with root package name */
    public g f22087x;

    /* renamed from: y, reason: collision with root package name */
    public b5.g f22088y;

    /* renamed from: z, reason: collision with root package name */
    public z f22089z;

    /* JADX WARN: Type inference failed for: r0v9, types: [k5.l0, c5.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11, types: [b5.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4, types: [c5.d, java.lang.Object, k5.q] */
    public e0(x xVar) {
        c cVar;
        boolean z10;
        int i10;
        Context context = xVar.f22201a;
        this.f22058a = context;
        if (context != null) {
            cVar = c.b(context);
        } else {
            cVar = xVar.f22202b;
        }
        this.f22086w = cVar;
        this.f22060b = xVar.f22203c;
        int i11 = e5.x.f15050a;
        if (i11 >= 21 && xVar.f22204d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f22062c = z10;
        this.f22074k = i11 >= 23 && xVar.f22205e;
        if (i11 >= 29) {
            i10 = xVar.f22206f;
        } else {
            i10 = 0;
        }
        this.f22075l = i10;
        this.f22079p = xVar.f22207g;
        r0 r0Var = new r0(e5.b.f15001a);
        this.f22071h = r0Var;
        r0Var.f();
        this.f22072i = new p(new a0(this));
        ?? dVar = new c5.d();
        this.f22064d = dVar;
        ?? dVar2 = new c5.d();
        dVar2.f22156m = e5.x.f15055f;
        this.f22066e = dVar2;
        c5.d dVar3 = new c5.d();
        lp.l0 l0Var = o0.f25025b;
        Object[] objArr = {dVar3, dVar, dVar2};
        lp.g0.a(3, objArr);
        this.f22068f = o0.o(3, objArr);
        this.f22070g = o0.v(new c5.d());
        this.N = 1.0f;
        this.f22088y = b5.g.f3297g;
        this.X = 0;
        this.Y = new Object();
        u0 u0Var = u0.f3616d;
        this.A = new z(u0Var, 0L, 0L);
        this.B = u0Var;
        this.C = false;
        this.f22073j = new ArrayDeque();
        this.f22077n = new v5.d();
        this.f22078o = new v5.d();
    }

    public static AudioFormat f(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public static boolean n(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (e5.x.f15050a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r0 != 4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r0 != 4) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r13) {
        /*
            r12 = this;
            boolean r0 = r12.s()
            r1 = 4
            r2 = 805306368(0x30000000, float:4.656613E-10)
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            boolean r4 = r12.f22062c
            h.c r5 = r12.f22060b
            if (r0 != 0) goto L4e
            boolean r0 = r12.f22059a0
            if (r0 != 0) goto L48
            k5.y r0 = r12.f22083t
            int r6 = r0.f22210c
            if (r6 != 0) goto L48
            b5.v r0 = r0.f22208a
            int r0 = r0.A
            if (r4 == 0) goto L28
            int r6 = e5.x.f15050a
            if (r0 == r3) goto L48
            if (r0 == r2) goto L48
            if (r0 != r1) goto L28
            goto L48
        L28:
            b5.u0 r0 = r12.B
            java.lang.Object r6 = r5.f17585d
            c5.f r6 = (c5.f) r6
            float r7 = r0.f3617a
            float r8 = r6.f7987c
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            r9 = 1
            if (r8 == 0) goto L3b
            r6.f7987c = r7
            r6.f7993i = r9
        L3b:
            float r7 = r6.f7988d
            float r8 = r0.f3618b
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 == 0) goto L4a
            r6.f7988d = r8
            r6.f7993i = r9
            goto L4a
        L48:
            b5.u0 r0 = b5.u0.f3616d
        L4a:
            r12.B = r0
        L4c:
            r7 = r0
            goto L51
        L4e:
            b5.u0 r0 = b5.u0.f3616d
            goto L4c
        L51:
            boolean r0 = r12.f22059a0
            if (r0 != 0) goto L73
            k5.y r0 = r12.f22083t
            int r6 = r0.f22210c
            if (r6 != 0) goto L73
            b5.v r0 = r0.f22208a
            int r0 = r0.A
            if (r4 == 0) goto L6a
            int r4 = e5.x.f15050a
            if (r0 == r3) goto L73
            if (r0 == r2) goto L73
            if (r0 != r1) goto L6a
            goto L73
        L6a:
            boolean r0 = r12.C
            java.lang.Object r1 = r5.f17584c
            k5.j0 r1 = (k5.j0) r1
            r1.f22133m = r0
            goto L74
        L73:
            r0 = 0
        L74:
            r12.C = r0
            java.util.ArrayDeque r0 = r12.f22073j
            k5.z r1 = new k5.z
            r2 = 0
            long r8 = java.lang.Math.max(r2, r13)
            k5.y r13 = r12.f22083t
            long r2 = r12.i()
            int r13 = r13.f22212e
            long r10 = e5.x.K(r13, r2)
            r6 = r1
            r6.<init>(r7, r8, r10)
            r0.add(r1)
            k5.y r13 = r12.f22083t
            c5.a r13 = r13.f22216i
            r12.f22084u = r13
            r13.b()
            hr.c r13 = r12.f22081r
            if (r13 == 0) goto Lb7
            boolean r14 = r12.C
            java.lang.Object r13 = r13.f18690b
            k5.h0 r13 = (k5.h0) r13
            tr.e r13 = r13.X0
            java.lang.Object r0 = r13.f36361b
            android.os.Handler r0 = (android.os.Handler) r0
            if (r0 == 0) goto Lb7
            nq.b r1 = new nq.b
            r2 = 2
            r1.<init>(r13, r14, r2)
            r0.post(r1)
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.e0.a(long):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x018f, code lost:
    
        if ((r3 & r6) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0192, code lost:
    
        if (r22 > 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0195, code lost:
    
        if (r5 > 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0198, code lost:
    
        if (r5 < 0) goto L89;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:51:0x0163. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r12v5, types: [lp.h0, lp.k0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(b5.v r26, int[] r27) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.e0.b(b5.v, int[]):void");
    }

    public final boolean c() {
        if (!this.f22084u.e()) {
            ByteBuffer byteBuffer = this.Q;
            if (byteBuffer == null) {
                return true;
            }
            u(byteBuffer, Long.MIN_VALUE);
            if (this.Q != null) {
                return false;
            }
            return true;
        }
        c5.a aVar = this.f22084u;
        if (aVar.e() && !aVar.f7950d) {
            aVar.f7950d = true;
            ((c5.c) aVar.f7948b.get(0)).f();
        }
        p(Long.MIN_VALUE);
        if (!this.f22084u.d()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.Q;
        if (byteBuffer2 != null && byteBuffer2.hasRemaining()) {
            return false;
        }
        return true;
    }

    public final void d() {
        if (m()) {
            this.F = 0L;
            this.G = 0L;
            this.H = 0L;
            this.I = 0L;
            this.f22067e0 = false;
            this.J = 0;
            this.A = new z(this.B, 0L, 0L);
            this.M = 0L;
            this.f22089z = null;
            this.f22073j.clear();
            this.O = null;
            this.P = 0;
            this.Q = null;
            this.U = false;
            this.T = false;
            this.D = null;
            this.E = 0;
            this.f22066e.f22158o = 0L;
            c5.a aVar = this.f22083t.f22216i;
            this.f22084u = aVar;
            aVar.b();
            AudioTrack audioTrack = this.f22072i.f22172c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f22085v.pause();
            }
            if (n(this.f22085v)) {
                d0 d0Var = this.f22076m;
                d0Var.getClass();
                this.f22085v.unregisterStreamEventCallback(d0Var.f22052b);
                d0Var.f22051a.removeCallbacksAndMessages(null);
            }
            if (e5.x.f15050a < 21 && !this.W) {
                this.X = 0;
            }
            y yVar = this.f22082s;
            if (yVar != null) {
                this.f22083t = yVar;
                this.f22082s = null;
            }
            p pVar = this.f22072i;
            pVar.d();
            pVar.f22172c = null;
            pVar.f22175f = null;
            AudioTrack audioTrack2 = this.f22085v;
            r0 r0Var = this.f22071h;
            r0Var.d();
            synchronized (f22055g0) {
                try {
                    if (f22056h0 == null) {
                        f22056h0 = Executors.newSingleThreadExecutor(new e5.v("ExoPlayer:AudioTrackReleaseThread"));
                    }
                    f22057i0++;
                    f22056h0.execute(new m0(11, audioTrack2, r0Var));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f22085v = null;
        }
        this.f22078o.f37704c = null;
        this.f22077n.f37704c = null;
    }

    public final c e() {
        Context context;
        c c10;
        e eVar;
        if (this.f22087x == null && (context = this.f22058a) != null) {
            this.f22069f0 = Looper.myLooper();
            g gVar = new g(context, new r(this));
            this.f22087x = gVar;
            if (gVar.f22106h) {
                c10 = gVar.f22105g;
                c10.getClass();
            } else {
                gVar.f22106h = true;
                f fVar = gVar.f22104f;
                if (fVar != null) {
                    fVar.f22090a.registerContentObserver(fVar.f22091b, false, fVar);
                }
                int i10 = e5.x.f15050a;
                Handler handler = gVar.f22101c;
                Context context2 = gVar.f22099a;
                if (i10 >= 23 && (eVar = gVar.f22102d) != null) {
                    d.a(context2, eVar, handler);
                }
                h.a0 a0Var = gVar.f22103e;
                Intent intent = null;
                if (a0Var != null) {
                    intent = context2.registerReceiver(a0Var, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler);
                }
                c10 = c.c(context2, intent);
                gVar.f22105g = c10;
            }
            this.f22086w = c10;
        }
        return this.f22086w;
    }

    public final int g(b5.v vVar) {
        if ("audio/raw".equals(vVar.f3652l)) {
            int i10 = vVar.A;
            if (!e5.x.D(i10)) {
                e5.m.f("DefaultAudioSink", "Invalid PCM encoding: " + i10);
                return 0;
            }
            if (i10 == 2 || (this.f22062c && i10 == 4)) {
                return 2;
            }
            return 1;
        }
        if ((this.f22065d0 || !t(this.f22088y, vVar)) && e().d(vVar) == null) {
            return 0;
        }
        return 2;
    }

    public final long h() {
        if (this.f22083t.f22210c == 0) {
            return this.F / r0.f22209b;
        }
        return this.G;
    }

    public final long i() {
        if (this.f22083t.f22210c == 0) {
            return this.H / r0.f22211d;
        }
        return this.I;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0100, code lost:
    
        if (r10.b() == 0) goto L66;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:78:0x0173. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:90:0x034c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(java.nio.ByteBuffer r25, long r26, int r28) {
        /*
            Method dump skipped, instructions count: 1110
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.e0.j(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean k() {
        if (m() && this.f22072i.c(i())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l() {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.e0.l():boolean");
    }

    public final boolean m() {
        return this.f22085v != null;
    }

    public final void o() {
        if (!this.U) {
            this.U = true;
            long i10 = i();
            p pVar = this.f22072i;
            pVar.A = pVar.b();
            pVar.f22194y = SystemClock.elapsedRealtime() * 1000;
            pVar.B = i10;
            this.f22085v.stop();
            this.E = 0;
        }
    }

    public final void p(long j10) {
        ByteBuffer byteBuffer;
        if (!this.f22084u.e()) {
            ByteBuffer byteBuffer2 = this.O;
            if (byteBuffer2 == null) {
                byteBuffer2 = c5.c.f7956a;
            }
            u(byteBuffer2, j10);
            return;
        }
        while (!this.f22084u.d()) {
            do {
                c5.a aVar = this.f22084u;
                if (!aVar.e()) {
                    byteBuffer = c5.c.f7956a;
                } else {
                    ByteBuffer byteBuffer3 = aVar.f7949c[aVar.c()];
                    if (!byteBuffer3.hasRemaining()) {
                        aVar.f(c5.c.f7956a);
                    }
                    byteBuffer = byteBuffer3;
                }
                if (byteBuffer.hasRemaining()) {
                    u(byteBuffer, j10);
                } else {
                    ByteBuffer byteBuffer4 = this.O;
                    if (byteBuffer4 != null && byteBuffer4.hasRemaining()) {
                        c5.a aVar2 = this.f22084u;
                        ByteBuffer byteBuffer5 = this.O;
                        if (aVar2.e() && !aVar2.f7950d) {
                            aVar2.f(byteBuffer5);
                        }
                    } else {
                        return;
                    }
                }
            } while (!byteBuffer.hasRemaining());
            return;
        }
    }

    public final void q() {
        d();
        lp.l0 listIterator = this.f22068f.listIterator(0);
        while (listIterator.hasNext()) {
            ((c5.c) listIterator.next()).h();
        }
        lp.l0 listIterator2 = this.f22070g.listIterator(0);
        while (listIterator2.hasNext()) {
            ((c5.c) listIterator2.next()).h();
        }
        c5.a aVar = this.f22084u;
        if (aVar != null) {
            aVar.g();
        }
        this.V = false;
        this.f22065d0 = false;
    }

    public final void r() {
        if (m()) {
            try {
                this.f22085v.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.B.f3617a).setPitch(this.B.f3618b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                e5.m.g("DefaultAudioSink", "Failed to set playback params", e10);
            }
            u0 u0Var = new u0(this.f22085v.getPlaybackParams().getSpeed(), this.f22085v.getPlaybackParams().getPitch());
            this.B = u0Var;
            p pVar = this.f22072i;
            pVar.f22179j = u0Var.f3617a;
            o oVar = pVar.f22175f;
            if (oVar != null) {
                oVar.a();
            }
            pVar.d();
        }
    }

    public final boolean s() {
        y yVar = this.f22083t;
        if (yVar != null && yVar.f22217j && e5.x.f15050a >= 23) {
            return true;
        }
        return false;
    }

    public final boolean t(b5.g gVar, b5.v vVar) {
        int i10;
        int n10;
        boolean isOffloadedPlaybackSupported;
        int i11;
        boolean z10;
        boolean z11;
        int i12 = e5.x.f15050a;
        if (i12 < 29 || (i10 = this.f22075l) == 0) {
            return false;
        }
        String str = vVar.f3652l;
        str.getClass();
        int c10 = b5.r0.c(str, vVar.f3649i);
        if (c10 == 0 || (n10 = e5.x.n(vVar.f3665y)) == 0) {
            return false;
        }
        AudioFormat f10 = f(vVar.f3666z, n10, c10);
        AudioAttributes audioAttributes = (AudioAttributes) gVar.a().f35633b;
        if (i12 >= 31) {
            i11 = AudioManager.getPlaybackOffloadSupport(f10, audioAttributes);
        } else {
            isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(f10, audioAttributes);
            if (!isOffloadedPlaybackSupported) {
                i11 = 0;
            } else if (i12 == 30 && e5.x.f15053d.startsWith("Pixel")) {
                i11 = 2;
            } else {
                i11 = 1;
            }
        }
        if (i11 == 0) {
            return false;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                return true;
            }
            throw new IllegalStateException();
        }
        if (vVar.B == 0 && vVar.C == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i10 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ee, code lost:
    
        if (r15 < r14) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(java.nio.ByteBuffer r13, long r14) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.e0.u(java.nio.ByteBuffer, long):void");
    }
}
