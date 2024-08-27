package c7;

import androidx.media3.common.ParserException;
import b5.u;
import b5.v;
import e5.p;
import e5.x;
import k3.o;
import okhttp3.internal.http.StatusLine;
import z5.b0;
import z5.r;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f8015m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f8016n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    public final r f8017a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f8018b;

    /* renamed from: c, reason: collision with root package name */
    public final o f8019c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8020d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f8021e;

    /* renamed from: f, reason: collision with root package name */
    public final p f8022f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8023g;

    /* renamed from: h, reason: collision with root package name */
    public final v f8024h;

    /* renamed from: i, reason: collision with root package name */
    public int f8025i;

    /* renamed from: j, reason: collision with root package name */
    public long f8026j;

    /* renamed from: k, reason: collision with root package name */
    public int f8027k;

    /* renamed from: l, reason: collision with root package name */
    public long f8028l;

    public a(r rVar, b0 b0Var, o oVar) {
        this.f8017a = rVar;
        this.f8018b = b0Var;
        this.f8019c = oVar;
        int max = Math.max(1, oVar.f22019b / 10);
        this.f8023g = max;
        p pVar = new p((byte[]) oVar.f22022e);
        pVar.n();
        int n10 = pVar.n();
        this.f8020d = n10;
        int i10 = oVar.f22018a;
        int i11 = oVar.f22020c;
        int i12 = (((i11 - (i10 * 4)) * 8) / (oVar.f22021d * i10)) + 1;
        if (n10 == i12) {
            int g10 = x.g(max, n10);
            this.f8021e = new byte[g10 * i11];
            this.f8022f = new p(n10 * 2 * i10 * g10);
            int i13 = oVar.f22019b;
            int i14 = ((i11 * i13) * 8) / n10;
            u uVar = new u();
            uVar.f3600k = "audio/raw";
            uVar.f3595f = i14;
            uVar.f3596g = i14;
            uVar.f3601l = max * 2 * i10;
            uVar.f3613x = i10;
            uVar.f3614y = i13;
            uVar.f3615z = 2;
            this.f8024h = new v(uVar);
            return;
        }
        throw ParserException.a("Expected frames per block: " + i12 + "; got: " + n10, null);
    }

    @Override // c7.b
    public final void a(long j10) {
        this.f8025i = 0;
        this.f8026j = j10;
        this.f8027k = 0;
        this.f8028l = 0L;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:50:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:5:0x0023->B:11:0x003f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003c -> B:3:0x0020). Please report as a decompilation issue!!! */
    @Override // c7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(z5.q r25, long r26) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.a.b(z5.q, long):boolean");
    }

    @Override // c7.b
    public final void c(int i10, long j10) {
        this.f8017a.d(new e(this.f8019c, this.f8020d, i10, j10));
        this.f8018b.e(this.f8024h);
    }

    public final void d(int i10) {
        long j10 = this.f8026j;
        long j11 = this.f8028l;
        o oVar = this.f8019c;
        long L = j10 + x.L(j11, 1000000L, oVar.f22019b);
        int i11 = i10 * 2 * oVar.f22018a;
        this.f8018b.b(L, 1, i11, this.f8027k - i11, null);
        this.f8028l += i10;
        this.f8027k -= i11;
    }
}
