package k5;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import b5.u0;
import h.m0;
import i5.h1;
import i5.o0;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import lp.j1;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes.dex */
public final class h0 extends o5.p implements o0 {
    public final Context W0;
    public final tr.e X0;
    public final m Y0;
    public int Z0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f22110a1;

    /* renamed from: b1, reason: collision with root package name */
    public b5.v f22111b1;

    /* renamed from: c1, reason: collision with root package name */
    public b5.v f22112c1;

    /* renamed from: d1, reason: collision with root package name */
    public long f22113d1;

    /* renamed from: e1, reason: collision with root package name */
    public boolean f22114e1;

    /* renamed from: f1, reason: collision with root package name */
    public boolean f22115f1;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f22116g1;

    /* renamed from: h1, reason: collision with root package name */
    public i5.h0 f22117h1;

    public h0(Context context, yq.b bVar, o5.q qVar, Handler handler, i5.d0 d0Var, e0 e0Var) {
        super(1, bVar, qVar, 44100.0f);
        this.W0 = context.getApplicationContext();
        this.Y0 = e0Var;
        this.X0 = new tr.e(handler, d0Var);
        e0Var.f22081r = new hr.c(this);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [lp.h0, lp.k0] */
    public static j1 v0(o5.q qVar, b5.v vVar, boolean z10, m mVar) {
        List p10;
        o5.m mVar2;
        if (vVar.f3652l == null) {
            lp.l0 l0Var = lp.o0.f25025b;
            return j1.f24998e;
        }
        if (((e0) mVar).g(vVar) != 0) {
            List e10 = o5.u.e("audio/raw", false, false);
            if (e10.isEmpty()) {
                mVar2 = null;
            } else {
                mVar2 = (o5.m) e10.get(0);
            }
            if (mVar2 != null) {
                return lp.o0.v(mVar2);
            }
        }
        Pattern pattern = o5.u.f29679a;
        List p11 = qVar.p(vVar.f3652l, z10, false);
        String b10 = o5.u.b(vVar);
        if (b10 == null) {
            lp.l0 l0Var2 = lp.o0.f25025b;
            p10 = j1.f24998e;
        } else {
            p10 = qVar.p(b10, z10, false);
        }
        lp.l0 l0Var3 = lp.o0.f25025b;
        ?? h0Var = new lp.h0();
        h0Var.c0(p11);
        h0Var.c0(p10);
        return h0Var.e0();
    }

    @Override // o5.p
    public final i5.h E(o5.m mVar, b5.v vVar, b5.v vVar2) {
        boolean z10;
        i5.h b10 = mVar.b(vVar, vVar2);
        int i10 = 0;
        if (this.D == null && p0(vVar2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = b10.f19485e;
        if (z10) {
            i11 |= 32768;
        }
        if (u0(vVar2, mVar) > this.Z0) {
            i11 |= 64;
        }
        int i12 = i11;
        String str = mVar.f29630a;
        if (i12 == 0) {
            i10 = b10.f19484d;
        }
        return new i5.h(str, vVar, vVar2, i10, i12);
    }

    @Override // o5.p
    public final float O(float f10, b5.v[] vVarArr) {
        int i10 = -1;
        for (b5.v vVar : vVarArr) {
            int i11 = vVar.f3666z;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return f10 * i10;
    }

    @Override // o5.p
    public final ArrayList P(o5.q qVar, b5.v vVar, boolean z10) {
        j1 v02 = v0(qVar, vVar, z10, this.Y0);
        Pattern pattern = o5.u.f29679a;
        ArrayList arrayList = new ArrayList(v02);
        Collections.sort(arrayList, new d2.b0(new b3.t(vVar, 12), 1));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if ("AXON 7 mini".equals(r2) == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f1  */
    @Override // o5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o5.i Q(o5.m r12, b5.v r13, android.media.MediaCrypto r14, float r15) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.h0.Q(o5.m, b5.v, android.media.MediaCrypto, float):o5.i");
    }

    @Override // o5.p
    public final void V(Exception exc) {
        e5.m.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        tr.e eVar = this.X0;
        Handler handler = (Handler) eVar.f36361b;
        if (handler != null) {
            handler.post(new h(eVar, exc, 0));
        }
    }

    @Override // o5.p
    public final void W(String str, long j10, long j11) {
        tr.e eVar = this.X0;
        Handler handler = (Handler) eVar.f36361b;
        if (handler != null) {
            handler.post(new k(eVar, str, j10, j11, 0));
        }
    }

    @Override // o5.p
    public final void X(String str) {
        tr.e eVar = this.X0;
        Handler handler = (Handler) eVar.f36361b;
        if (handler != null) {
            handler.post(new m0(10, eVar, str));
        }
    }

    @Override // o5.p
    public final i5.h Y(tr.e eVar) {
        b5.v vVar = (b5.v) eVar.f36362c;
        vVar.getClass();
        this.f22111b1 = vVar;
        i5.h Y = super.Y(eVar);
        b5.v vVar2 = this.f22111b1;
        tr.e eVar2 = this.X0;
        Handler handler = (Handler) eVar2.f36361b;
        if (handler != null) {
            handler.post(new androidx.fragment.app.e(5, eVar2, vVar2, Y));
        }
        return Y;
    }

    @Override // o5.p
    public final void Z(b5.v vVar, MediaFormat mediaFormat) {
        int i10;
        int i11;
        b5.v vVar2 = this.f22112c1;
        int[] iArr = null;
        if (vVar2 != null) {
            vVar = vVar2;
        } else if (this.J != null) {
            if ("audio/raw".equals(vVar.f3652l)) {
                i10 = vVar.A;
            } else if (e5.x.f15050a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i10 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i10 = e5.x.t(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i10 = 2;
            }
            b5.u uVar = new b5.u();
            uVar.f3600k = "audio/raw";
            uVar.f3615z = i10;
            uVar.A = vVar.B;
            uVar.B = vVar.C;
            uVar.f3613x = mediaFormat.getInteger("channel-count");
            uVar.f3614y = mediaFormat.getInteger("sample-rate");
            b5.v vVar3 = new b5.v(uVar);
            if (this.f22110a1 && vVar3.f3665y == 6 && (i11 = vVar.f3665y) < 6) {
                iArr = new int[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    iArr[i12] = i12;
                }
            }
            vVar = vVar3;
        }
        try {
            ((e0) this.Y0).b(vVar, iArr);
        } catch (AudioSink$ConfigurationException e10) {
            throw f(5001, e10.f2073a, e10, false);
        }
    }

    @Override // i5.o0
    public final void a(u0 u0Var) {
        e0 e0Var = (e0) this.Y0;
        e0Var.getClass();
        e0Var.B = new u0(e5.x.h(u0Var.f3617a, 0.1f, 8.0f), e5.x.h(u0Var.f3618b, 0.1f, 8.0f));
        if (e0Var.s()) {
            e0Var.r();
            return;
        }
        z zVar = new z(u0Var, -9223372036854775807L, -9223372036854775807L);
        if (e0Var.m()) {
            e0Var.f22089z = zVar;
        } else {
            e0Var.A = zVar;
        }
    }

    @Override // o5.p
    public final void a0() {
        this.Y0.getClass();
    }

    @Override // i5.o0
    public final long b() {
        if (this.f19414g == 2) {
            w0();
        }
        return this.f22113d1;
    }

    @Override // i5.f, i5.c1
    public final void c(int i10, Object obj) {
        u0 u0Var;
        boolean z10;
        m mVar = this.Y0;
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 6) {
                    switch (i10) {
                        case 9:
                            e0 e0Var = (e0) mVar;
                            e0Var.C = ((Boolean) obj).booleanValue();
                            if (e0Var.s()) {
                                u0Var = u0.f3616d;
                            } else {
                                u0Var = e0Var.B;
                            }
                            z zVar = new z(u0Var, -9223372036854775807L, -9223372036854775807L);
                            if (e0Var.m()) {
                                e0Var.f22089z = zVar;
                                return;
                            } else {
                                e0Var.A = zVar;
                                return;
                            }
                        case 10:
                            int intValue = ((Integer) obj).intValue();
                            e0 e0Var2 = (e0) mVar;
                            if (e0Var2.X != intValue) {
                                e0Var2.X = intValue;
                                if (intValue != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                e0Var2.W = z10;
                                e0Var2.d();
                                return;
                            }
                            return;
                        case 11:
                            this.f22117h1 = (i5.h0) obj;
                            return;
                        case 12:
                            if (e5.x.f15050a >= 23) {
                                g0.a(mVar, obj);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                b5.h hVar = (b5.h) obj;
                e0 e0Var3 = (e0) mVar;
                if (!e0Var3.Y.equals(hVar)) {
                    hVar.getClass();
                    if (e0Var3.f22085v != null) {
                        e0Var3.Y.getClass();
                    }
                    e0Var3.Y = hVar;
                    return;
                }
                return;
            }
            b5.g gVar = (b5.g) obj;
            e0 e0Var4 = (e0) mVar;
            if (!e0Var4.f22088y.equals(gVar)) {
                e0Var4.f22088y = gVar;
                if (!e0Var4.f22059a0) {
                    e0Var4.d();
                    return;
                }
                return;
            }
            return;
        }
        float floatValue = ((Float) obj).floatValue();
        e0 e0Var5 = (e0) mVar;
        if (e0Var5.N != floatValue) {
            e0Var5.N = floatValue;
            if (e0Var5.m()) {
                if (e5.x.f15050a >= 21) {
                    e0Var5.f22085v.setVolume(e0Var5.N);
                    return;
                }
                AudioTrack audioTrack = e0Var5.f22085v;
                float f10 = e0Var5.N;
                audioTrack.setStereoVolume(f10, f10);
            }
        }
    }

    @Override // o5.p
    public final void c0() {
        ((e0) this.Y0).K = true;
    }

    @Override // i5.o0
    public final u0 d() {
        return ((e0) this.Y0).B;
    }

    @Override // o5.p
    public final void d0(h5.f fVar) {
        if (this.f22114e1 && !fVar.g(Integer.MIN_VALUE)) {
            if (Math.abs(fVar.f18004f - this.f22113d1) > 500000) {
                this.f22113d1 = fVar.f18004f;
            }
            this.f22114e1 = false;
        }
    }

    @Override // o5.p
    public final boolean g0(long j10, long j11, o5.k kVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, b5.v vVar) {
        byteBuffer.getClass();
        if (this.f22112c1 != null && (i11 & 2) != 0) {
            kVar.getClass();
            kVar.h(i10, false);
            return true;
        }
        m mVar = this.Y0;
        if (z10) {
            if (kVar != null) {
                kVar.h(i10, false);
            }
            this.R0.f19439f += i12;
            ((e0) mVar).K = true;
            return true;
        }
        try {
            if (!((e0) mVar).j(byteBuffer, j12, i12)) {
                return false;
            }
            if (kVar != null) {
                kVar.h(i10, false);
            }
            this.R0.f19438e += i12;
            return true;
        } catch (AudioSink$InitializationException e10) {
            throw f(5001, this.f22111b1, e10, e10.f2075b);
        } catch (AudioSink$WriteException e11) {
            throw f(5002, vVar, e11, e11.f2077b);
        }
    }

    @Override // i5.f
    public final o0 j() {
        return this;
    }

    @Override // o5.p
    public final void j0() {
        try {
            e0 e0Var = (e0) this.Y0;
            if (!e0Var.T && e0Var.m() && e0Var.c()) {
                e0Var.o();
                e0Var.T = true;
            }
        } catch (AudioSink$WriteException e10) {
            throw f(5002, e10.f2078c, e10, e10.f2077b);
        }
    }

    @Override // i5.f
    public final String k() {
        return "MediaCodecAudioRenderer";
    }

    @Override // i5.f
    public final boolean m() {
        if (this.N0) {
            e0 e0Var = (e0) this.Y0;
            if (!e0Var.m() || (e0Var.T && !e0Var.k())) {
                return true;
            }
        }
        return false;
    }

    @Override // o5.p, i5.f
    public final boolean n() {
        if (!((e0) this.Y0).k() && !super.n()) {
            return false;
        }
        return true;
    }

    @Override // o5.p, i5.f
    public final void o() {
        tr.e eVar = this.X0;
        this.f22116g1 = true;
        this.f22111b1 = null;
        try {
            ((e0) this.Y0).d();
            try {
                super.o();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.o();
                throw th2;
            } finally {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [i5.g, java.lang.Object] */
    @Override // i5.f
    public final void p(boolean z10, boolean z11) {
        ?? obj = new Object();
        this.R0 = obj;
        tr.e eVar = this.X0;
        Handler handler = (Handler) eVar.f36361b;
        int i10 = 1;
        if (handler != null) {
            handler.post(new i(eVar, obj, i10));
        }
        h1 h1Var = this.f19411d;
        h1Var.getClass();
        boolean z12 = h1Var.f19488a;
        boolean z13 = false;
        m mVar = this.Y0;
        if (z12) {
            e0 e0Var = (e0) mVar;
            e0Var.getClass();
            if (e5.x.f15050a >= 21) {
                z13 = true;
            }
            yk.j.H0(z13);
            yk.j.H0(e0Var.W);
            if (!e0Var.f22059a0) {
                e0Var.f22059a0 = true;
                e0Var.d();
            }
        } else {
            e0 e0Var2 = (e0) mVar;
            if (e0Var2.f22059a0) {
                e0Var2.f22059a0 = false;
                e0Var2.d();
            }
        }
        j5.d0 d0Var = this.f19413f;
        d0Var.getClass();
        ((e0) mVar).f22080q = d0Var;
    }

    @Override // o5.p
    public final boolean p0(b5.v vVar) {
        if (((e0) this.Y0).g(vVar) != 0) {
            return true;
        }
        return false;
    }

    @Override // o5.p, i5.f
    public final void q(long j10, boolean z10) {
        super.q(j10, z10);
        ((e0) this.Y0).d();
        this.f22113d1 = j10;
        this.f22114e1 = true;
        this.f22115f1 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (r4 != null) goto L30;
     */
    @Override // o5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int q0(o5.q r12, b5.v r13) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.h0.q0(o5.q, b5.v):int");
    }

    @Override // i5.f
    public final void r() {
        e eVar;
        g gVar = ((e0) this.Y0).f22087x;
        if (gVar != null && gVar.f22106h) {
            gVar.f22105g = null;
            int i10 = e5.x.f15050a;
            Context context = gVar.f22099a;
            if (i10 >= 23 && (eVar = gVar.f22102d) != null) {
                d.b(context, eVar);
            }
            h.a0 a0Var = gVar.f22103e;
            if (a0Var != null) {
                context.unregisterReceiver(a0Var);
            }
            f fVar = gVar.f22104f;
            if (fVar != null) {
                fVar.f22090a.unregisterContentObserver(fVar);
            }
            gVar.f22106h = false;
        }
    }

    @Override // i5.f
    public final void s() {
        m mVar = this.Y0;
        try {
            try {
                G();
                i0();
                n5.i iVar = this.D;
                if (iVar != null) {
                    iVar.c(null);
                }
                this.D = null;
            } catch (Throwable th2) {
                n5.i iVar2 = this.D;
                if (iVar2 != null) {
                    iVar2.c(null);
                }
                this.D = null;
                throw th2;
            }
        } finally {
            if (this.f22116g1) {
                this.f22116g1 = false;
                ((e0) mVar).q();
            }
        }
    }

    @Override // i5.f
    public final void t() {
        e0 e0Var = (e0) this.Y0;
        e0Var.V = true;
        if (e0Var.m()) {
            o oVar = e0Var.f22072i.f22175f;
            oVar.getClass();
            oVar.a();
            e0Var.f22085v.play();
        }
    }

    @Override // i5.f
    public final void u() {
        w0();
        e0 e0Var = (e0) this.Y0;
        e0Var.V = false;
        if (e0Var.m()) {
            p pVar = e0Var.f22072i;
            pVar.d();
            if (pVar.f22194y == -9223372036854775807L) {
                o oVar = pVar.f22175f;
                oVar.getClass();
                oVar.a();
                e0Var.f22085v.pause();
            }
        }
    }

    public final int u0(b5.v vVar, o5.m mVar) {
        int i10;
        if ("OMX.google.raw.decoder".equals(mVar.f29630a) && (i10 = e5.x.f15050a) < 24 && (i10 != 23 || !e5.x.E(this.W0))) {
            return -1;
        }
        return vVar.f3653m;
    }

    public final void w0() {
        long j10;
        ArrayDeque arrayDeque;
        long r10;
        long j11;
        boolean m10 = m();
        e0 e0Var = (e0) this.Y0;
        if (e0Var.m() && !e0Var.L) {
            long min = Math.min(e0Var.f22072i.a(m10), e5.x.K(e0Var.f22083t.f22212e, e0Var.i()));
            while (true) {
                arrayDeque = e0Var.f22073j;
                if (arrayDeque.isEmpty() || min < ((z) arrayDeque.getFirst()).f22220c) {
                    break;
                } else {
                    e0Var.A = (z) arrayDeque.remove();
                }
            }
            z zVar = e0Var.A;
            long j12 = min - zVar.f22220c;
            boolean equals = zVar.f22218a.equals(u0.f3616d);
            h.c cVar = e0Var.f22060b;
            if (equals) {
                r10 = e0Var.A.f22219b + j12;
            } else if (arrayDeque.isEmpty()) {
                c5.f fVar = (c5.f) cVar.f17585d;
                if (fVar.f7999o >= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
                    long j13 = fVar.f7998n;
                    fVar.f7994j.getClass();
                    long j14 = j13 - ((r2.f7974k * r2.f7965b) * 2);
                    int i10 = fVar.f7992h.f7952a;
                    int i11 = fVar.f7991g.f7952a;
                    if (i10 == i11) {
                        j11 = e5.x.L(j12, j14, fVar.f7999o);
                    } else {
                        j11 = e5.x.L(j12, j14 * i10, fVar.f7999o * i11);
                    }
                } else {
                    j11 = (long) (fVar.f7987c * j12);
                }
                r10 = j11 + e0Var.A.f22219b;
            } else {
                z zVar2 = (z) arrayDeque.getFirst();
                r10 = zVar2.f22219b - e5.x.r(zVar2.f22220c - min, e0Var.A.f22218a.f3617a);
            }
            j10 = e5.x.K(e0Var.f22083t.f22212e, ((j0) cVar.f17584c).f22140t) + r10;
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 != Long.MIN_VALUE) {
            if (!this.f22115f1) {
                j10 = Math.max(this.f22113d1, j10);
            }
            this.f22113d1 = j10;
            this.f22115f1 = false;
        }
    }
}
