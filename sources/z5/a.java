package z5;

import androidx.media3.common.ParserException;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f42014a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f42015b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f42016c = {1, 2, 3, 6};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f42017d = {48000, 44100, 32000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f42018e = {24000, 22050, 16000};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f42019f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f42020g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f42021h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f42022i = {2002, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, 1920, 1601, 1600, 1001, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f42023j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f42024k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f42025l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, UserMetadata.MAX_ATTRIBUTE_SIZE, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f42026m = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f42027n = {44100, 48000, 32000};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f42028o = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f42029p = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f42030q = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f42031r = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f42032s = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int a(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 >= 0 && i10 < 3 && i11 >= 0 && i12 < 19) {
            int i13 = f42017d[i10];
            if (i13 == 44100) {
                return ((i11 % 2) + f42021h[i12]) * 2;
            }
            int i14 = f42020g[i12];
            if (i13 == 32000) {
                return i14 * 6;
            }
            return i14 * 4;
        }
        return -1;
    }

    public static void b(int i10, e5.p pVar) {
        pVar.C(7);
        byte[] bArr = pVar.f15036a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & 255);
        bArr[5] = (byte) ((i10 >> 8) & 255);
        bArr[6] = (byte) (i10 & 255);
    }

    public static int c(int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if ((i10 & (-2097152)) == -2097152) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i17 = f42027n[i14];
        if (i11 == 2) {
            i17 /= 2;
        } else if (i11 == 0) {
            i17 /= 4;
        }
        int i18 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            if (i11 == 3) {
                i16 = f42028o[i13 - 1];
            } else {
                i16 = f42029p[i13 - 1];
            }
            return (((i16 * 12) / i17) + i18) * 4;
        }
        if (i11 == 3) {
            if (i12 == 2) {
                i15 = f42030q[i13 - 1];
            } else {
                i15 = f42031r[i13 - 1];
            }
        } else {
            i15 = f42032s[i13 - 1];
        }
        int i19 = 144;
        if (i11 == 3) {
            return v.e.b(i15, 144, i17, i18);
        }
        if (i12 == 1) {
            i19 = 72;
        }
        return v.e.b(i19, i15, i17, i18);
    }

    public static int d(b5.m mVar) {
        int i10 = mVar.i(4);
        if (i10 == 15) {
            if (mVar.b() >= 24) {
                return mVar.i(24);
            }
            throw ParserException.a("AAC header insufficient data", null);
        }
        if (i10 < 13) {
            return f42014a[i10];
        }
        throw ParserException.a("AAC header wrong Sampling Frequency Index", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
    
        if (r11 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0093, code lost:
    
        if (r11 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0098, code lost:
    
        if (r11 != 8) goto L50;
     */
    /* JADX WARN: Type inference failed for: r11v2, types: [b5.f, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static b5.f e(b5.m r11) {
        /*
            r0 = 16
            int r1 = r11.i(r0)
            int r0 = r11.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.i(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r11.i(r1)
            r4 = 0
            r5 = 3
            if (r2 != r5) goto L3d
            r6 = r4
        L2b:
            int r7 = r11.i(r1)
            int r7 = r7 + r6
            boolean r6 = r11.h()
            if (r6 != 0) goto L38
            int r2 = r2 + r7
            goto L3d
        L38:
            int r7 = r7 + 1
            int r6 = r7 << 2
            goto L2b
        L3d:
            r6 = 10
            int r6 = r11.i(r6)
            boolean r7 = r11.h()
            if (r7 == 0) goto L52
            int r7 = r11.i(r5)
            if (r7 <= 0) goto L52
            r11.s(r1)
        L52:
            boolean r7 = r11.h()
            r8 = 44100(0xac44, float:6.1797E-41)
            r9 = 48000(0xbb80, float:6.7262E-41)
            if (r7 == 0) goto L60
            r7 = r9
            goto L61
        L60:
            r7 = r8
        L61:
            int r11 = r11.i(r3)
            int[] r10 = z5.a.f42022i
            if (r7 != r8) goto L70
            r8 = 13
            if (r11 != r8) goto L70
            r4 = r10[r11]
            goto L9b
        L70:
            if (r7 != r9) goto L9b
            r8 = 14
            if (r11 >= r8) goto L9b
            r4 = r10[r11]
            int r6 = r6 % 5
            r8 = 8
            r9 = 1
            if (r6 == r9) goto L96
            r9 = 11
            if (r6 == r1) goto L91
            if (r6 == r5) goto L96
            if (r6 == r3) goto L88
            goto L9b
        L88:
            if (r11 == r5) goto L8e
            if (r11 == r8) goto L8e
            if (r11 != r9) goto L9b
        L8e:
            int r4 = r4 + 1
            goto L9b
        L91:
            if (r11 == r8) goto L8e
            if (r11 != r9) goto L9b
            goto L8e
        L96:
            if (r11 == r5) goto L8e
            if (r11 != r8) goto L9b
            goto L8e
        L9b:
            b5.f r11 = new b5.f
            r11.<init>()
            r11.f3276a = r2
            r11.f3278c = r1
            r11.f3277b = r7
            r11.f3279d = r0
            r11.f3280e = r4
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.a.e(b5.m):b5.f");
    }

    public static e5.g f(b5.m mVar, boolean z10) {
        int i10 = mVar.i(5);
        if (i10 == 31) {
            i10 = mVar.i(6) + 32;
        }
        int d10 = d(mVar);
        int i11 = mVar.i(4);
        String n10 = jr.h.n("mp4a.40.", i10);
        if (i10 == 5 || i10 == 29) {
            d10 = d(mVar);
            int i12 = mVar.i(5);
            if (i12 == 31) {
                i12 = mVar.i(6) + 32;
            }
            i10 = i12;
            if (i10 == 22) {
                i11 = mVar.i(4);
            }
        }
        if (z10) {
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 6 && i10 != 7 && i10 != 17) {
                switch (i10) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.c("Unsupported audio object type: " + i10);
                }
            }
            if (mVar.h()) {
                e5.m.f("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (mVar.h()) {
                mVar.s(14);
            }
            boolean h10 = mVar.h();
            if (i11 != 0) {
                if (i10 == 6 || i10 == 20) {
                    mVar.s(3);
                }
                if (h10) {
                    if (i10 == 22) {
                        mVar.s(16);
                    }
                    if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                        mVar.s(3);
                    }
                    mVar.s(1);
                }
                switch (i10) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int i13 = mVar.i(2);
                        if (i13 == 2 || i13 == 3) {
                            throw ParserException.c("Unsupported epConfig: " + i13);
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i14 = f42015b[i11];
        if (i14 != -1) {
            return new e5.g(d10, i14, n10);
        }
        throw ParserException.a(null, null);
    }

    public static int g(int i10) {
        boolean z10;
        int i11;
        int i12;
        if ((i10 & (-2097152)) == -2097152) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                return 1152;
            }
            if (i12 == 3) {
                return 384;
            }
            throw new IllegalArgumentException();
        }
        if (i11 == 3) {
            return 1152;
        }
        return 576;
    }
}
