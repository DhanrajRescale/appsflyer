package k5;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class p {
    public long A;
    public long B;
    public long C;
    public long D;
    public boolean E;
    public long F;
    public long G;

    /* renamed from: a, reason: collision with root package name */
    public final a0 f22170a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f22171b;

    /* renamed from: c, reason: collision with root package name */
    public AudioTrack f22172c;

    /* renamed from: d, reason: collision with root package name */
    public int f22173d;

    /* renamed from: e, reason: collision with root package name */
    public int f22174e;

    /* renamed from: f, reason: collision with root package name */
    public o f22175f;

    /* renamed from: g, reason: collision with root package name */
    public int f22176g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22177h;

    /* renamed from: i, reason: collision with root package name */
    public long f22178i;

    /* renamed from: j, reason: collision with root package name */
    public float f22179j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f22180k;

    /* renamed from: l, reason: collision with root package name */
    public long f22181l;

    /* renamed from: m, reason: collision with root package name */
    public long f22182m;

    /* renamed from: n, reason: collision with root package name */
    public Method f22183n;

    /* renamed from: o, reason: collision with root package name */
    public long f22184o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f22185p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f22186q;

    /* renamed from: r, reason: collision with root package name */
    public long f22187r;

    /* renamed from: s, reason: collision with root package name */
    public long f22188s;

    /* renamed from: t, reason: collision with root package name */
    public long f22189t;

    /* renamed from: u, reason: collision with root package name */
    public long f22190u;

    /* renamed from: v, reason: collision with root package name */
    public long f22191v;

    /* renamed from: w, reason: collision with root package name */
    public int f22192w;

    /* renamed from: x, reason: collision with root package name */
    public int f22193x;

    /* renamed from: y, reason: collision with root package name */
    public long f22194y;

    /* renamed from: z, reason: collision with root package name */
    public long f22195z;

    public p(a0 a0Var) {
        this.f22170a = a0Var;
        if (e5.x.f15050a >= 18) {
            try {
                this.f22183n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f22171b = new long[10];
    }

    public final long a(boolean z10) {
        boolean z11;
        long r10;
        long j10;
        long j11;
        long j12;
        Method method;
        long j13;
        long j14;
        AudioTrack audioTrack = this.f22172c;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        a0 a0Var = this.f22170a;
        if (playState == 3) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.f22182m >= 30000) {
                long K = e5.x.K(this.f22176g, b());
                if (K != 0) {
                    int i10 = this.f22192w;
                    long v10 = e5.x.v(K, this.f22179j) - nanoTime;
                    long[] jArr = this.f22171b;
                    jArr[i10] = v10;
                    this.f22192w = (this.f22192w + 1) % 10;
                    int i11 = this.f22193x;
                    if (i11 < 10) {
                        this.f22193x = i11 + 1;
                    }
                    this.f22182m = nanoTime;
                    this.f22181l = 0L;
                    int i12 = 0;
                    while (true) {
                        int i13 = this.f22193x;
                        if (i12 >= i13) {
                            break;
                        }
                        this.f22181l = (jArr[i12] / i13) + this.f22181l;
                        i12++;
                    }
                }
            }
            if (!this.f22177h) {
                o oVar = this.f22175f;
                oVar.getClass();
                n nVar = oVar.f22164a;
                if (nVar != null && nanoTime - oVar.f22168e >= oVar.f22167d) {
                    oVar.f22168e = nanoTime;
                    AudioTrack audioTrack2 = (AudioTrack) nVar.f22162d;
                    AudioTimestamp audioTimestamp = (AudioTimestamp) nVar.f22163e;
                    boolean timestamp = audioTrack2.getTimestamp(audioTimestamp);
                    if (timestamp) {
                        long j15 = audioTimestamp.framePosition;
                        if (nVar.f22160b > j15) {
                            nVar.f22159a++;
                        }
                        nVar.f22160b = j15;
                        nVar.f22161c = j15 + (nVar.f22159a << 32);
                    }
                    int i14 = oVar.f22165b;
                    if (i14 != 0) {
                        if (i14 != 1) {
                            if (i14 != 2) {
                                if (i14 != 3) {
                                    if (i14 != 4) {
                                        throw new IllegalStateException();
                                    }
                                } else if (timestamp) {
                                    oVar.a();
                                }
                            } else if (!timestamp) {
                                oVar.a();
                            }
                        } else if (timestamp) {
                            if (nVar.f22161c > oVar.f22169f) {
                                oVar.b(2);
                            }
                        } else {
                            oVar.a();
                        }
                    } else if (timestamp) {
                        if (((AudioTimestamp) nVar.f22163e).nanoTime / 1000 >= oVar.f22166c) {
                            oVar.f22169f = nVar.f22161c;
                            oVar.b(1);
                        }
                    } else if (nanoTime - oVar.f22166c > 500000) {
                        oVar.b(3);
                    }
                    if (timestamp) {
                        if (nVar != null) {
                            j13 = ((AudioTimestamp) nVar.f22163e).nanoTime / 1000;
                        } else {
                            j13 = -9223372036854775807L;
                        }
                        if (nVar != null) {
                            j14 = nVar.f22161c;
                        } else {
                            j14 = -1;
                        }
                        long K2 = e5.x.K(this.f22176g, b());
                        if (Math.abs(j13 - nanoTime) > 5000000) {
                            a0Var.getClass();
                            StringBuilder sb2 = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                            sb2.append(j14);
                            sb2.append(", ");
                            sb2.append(j13);
                            sb2.append(", ");
                            sb2.append(nanoTime);
                            sb2.append(", ");
                            sb2.append(K2);
                            sb2.append(", ");
                            e0 e0Var = a0Var.f22041a;
                            sb2.append(e0Var.h());
                            sb2.append(", ");
                            sb2.append(e0Var.i());
                            String sb3 = sb2.toString();
                            Object obj = e0.f22055g0;
                            e5.m.f("DefaultAudioSink", sb3);
                            oVar.b(4);
                        } else if (Math.abs(e5.x.K(this.f22176g, j14) - K2) > 5000000) {
                            a0Var.getClass();
                            StringBuilder sb4 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                            sb4.append(j14);
                            sb4.append(", ");
                            sb4.append(j13);
                            sb4.append(", ");
                            sb4.append(nanoTime);
                            sb4.append(", ");
                            sb4.append(K2);
                            sb4.append(", ");
                            e0 e0Var2 = a0Var.f22041a;
                            sb4.append(e0Var2.h());
                            sb4.append(", ");
                            sb4.append(e0Var2.i());
                            String sb5 = sb4.toString();
                            Object obj2 = e0.f22055g0;
                            e5.m.f("DefaultAudioSink", sb5);
                            oVar.b(4);
                        } else if (oVar.f22165b == 4) {
                            oVar.a();
                        }
                    }
                }
                if (this.f22186q && (method = this.f22183n) != null && nanoTime - this.f22187r >= 500000) {
                    try {
                        AudioTrack audioTrack3 = this.f22172c;
                        audioTrack3.getClass();
                        Integer num = (Integer) method.invoke(audioTrack3, new Object[0]);
                        int i15 = e5.x.f15050a;
                        long intValue = (num.intValue() * 1000) - this.f22178i;
                        this.f22184o = intValue;
                        long max = Math.max(intValue, 0L);
                        this.f22184o = max;
                        if (max > 5000000) {
                            a0Var.getClass();
                            e5.m.f("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                            this.f22184o = 0L;
                        }
                    } catch (Exception unused) {
                        this.f22183n = null;
                    }
                    this.f22187r = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        o oVar2 = this.f22175f;
        oVar2.getClass();
        if (oVar2.f22165b == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            n nVar2 = oVar2.f22164a;
            if (nVar2 != null) {
                j11 = nVar2.f22161c;
            } else {
                j11 = -1;
            }
            long K3 = e5.x.K(this.f22176g, j11);
            if (nVar2 != null) {
                j12 = ((AudioTimestamp) nVar2.f22163e).nanoTime / 1000;
            } else {
                j12 = -9223372036854775807L;
            }
            j10 = e5.x.r(nanoTime2 - j12, this.f22179j) + K3;
        } else {
            if (this.f22193x == 0) {
                r10 = e5.x.K(this.f22176g, b());
            } else {
                r10 = e5.x.r(this.f22181l + nanoTime2, this.f22179j);
            }
            j10 = r10;
            if (!z10) {
                j10 = Math.max(0L, j10 - this.f22184o);
            }
        }
        if (this.E != z11) {
            this.G = this.D;
            this.F = this.C;
        }
        long j16 = nanoTime2 - this.G;
        if (j16 < 1000000) {
            long r11 = e5.x.r(j16, this.f22179j) + this.F;
            long j17 = (j16 * 1000) / 1000000;
            j10 = (((1000 - j17) * r11) + (j10 * j17)) / 1000;
        }
        if (!this.f22180k) {
            long j18 = this.C;
            if (j10 > j18) {
                this.f22180k = true;
                long currentTimeMillis = System.currentTimeMillis() - e5.x.P(e5.x.v(e5.x.P(j10 - j18), this.f22179j));
                hr.c cVar = a0Var.f22041a.f22081r;
                if (cVar != null) {
                    tr.e eVar = ((h0) cVar.f18690b).X0;
                    Handler handler = (Handler) eVar.f36361b;
                    if (handler != null) {
                        handler.post(new j(eVar, 0, currentTimeMillis));
                    }
                }
            }
        }
        this.D = nanoTime2;
        this.C = j10;
        this.E = z11;
        return j10;
    }

    public final long b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f22194y;
        if (j10 != -9223372036854775807L) {
            return Math.min(this.B, this.A + (((e5.x.r((elapsedRealtime * 1000) - j10, this.f22179j) * this.f22176g) + 999999) / 1000000));
        }
        if (elapsedRealtime - this.f22188s >= 5) {
            AudioTrack audioTrack = this.f22172c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (this.f22177h) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f22191v = this.f22189t;
                    }
                    playbackHeadPosition += this.f22191v;
                }
                if (e5.x.f15050a <= 29) {
                    if (playbackHeadPosition == 0 && this.f22189t > 0 && playState == 3) {
                        if (this.f22195z == -9223372036854775807L) {
                            this.f22195z = elapsedRealtime;
                        }
                    } else {
                        this.f22195z = -9223372036854775807L;
                    }
                }
                if (this.f22189t > playbackHeadPosition) {
                    this.f22190u++;
                }
                this.f22189t = playbackHeadPosition;
            }
            this.f22188s = elapsedRealtime;
        }
        return this.f22189t + (this.f22190u << 32);
    }

    public final boolean c(long j10) {
        long a10 = a(false);
        int i10 = this.f22176g;
        int i11 = e5.x.f15050a;
        if (j10 <= ((a10 * i10) + 999999) / 1000000) {
            if (!this.f22177h) {
                return false;
            }
            AudioTrack audioTrack = this.f22172c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() != 2 || b() != 0) {
                return false;
            }
        }
        return true;
    }

    public final void d() {
        this.f22181l = 0L;
        this.f22193x = 0;
        this.f22192w = 0;
        this.f22182m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.f22180k = false;
    }
}
