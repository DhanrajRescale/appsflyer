package o5;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import b5.r0;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import e5.x;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f29630a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29631b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29632c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f29633d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f29634e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f29635f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f29636g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f29637h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f29638i;

    public m(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13) {
        str.getClass();
        this.f29630a = str;
        this.f29631b = str2;
        this.f29632c = str3;
        this.f29633d = codecCapabilities;
        this.f29636g = z10;
        this.f29637h = z11;
        this.f29634e = z12;
        this.f29635f = z13;
        this.f29638i = r0.l(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(x.g(i10, widthAlignment) * widthAlignment, x.g(i11, heightAlignment) * heightAlignment);
        int i12 = point.x;
        int i13 = point.y;
        if (d10 != -1.0d && d10 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
        }
        return videoCapabilities.isSizeSupported(i12, i13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if ("Nexus 10".equals(r3) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r10) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o5.m h(java.lang.String r10, java.lang.String r11, java.lang.String r12, android.media.MediaCodecInfo.CodecCapabilities r13, boolean r14, boolean r15, boolean r16, boolean r17) {
        /*
            r1 = r10
            r4 = r13
            o5.m r9 = new o5.m
            r0 = 0
            r2 = 1
            if (r4 == 0) goto L3f
            int r3 = e5.x.f15050a
            r5 = 19
            if (r3 < r5) goto L3f
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r13.isFeatureSupported(r5)
            if (r5 == 0) goto L3f
            r5 = 22
            if (r3 > r5) goto L3d
            java.lang.String r3 = e5.x.f15053d
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L2c
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L3d
        L2c:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto L3f
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L3d
            goto L3f
        L3d:
            r7 = r2
            goto L40
        L3f:
            r7 = r0
        L40:
            r3 = 21
            if (r4 == 0) goto L4e
            int r5 = e5.x.f15050a
            if (r5 < r3) goto L4e
            java.lang.String r5 = "tunneled-playback"
            boolean r5 = r13.isFeatureSupported(r5)
        L4e:
            if (r17 != 0) goto L61
            if (r4 == 0) goto L5f
            int r5 = e5.x.f15050a
            if (r5 < r3) goto L5f
            java.lang.String r3 = "secure-playback"
            boolean r3 = r13.isFeatureSupported(r3)
            if (r3 == 0) goto L5f
            goto L61
        L5f:
            r8 = r0
            goto L62
        L61:
            r8 = r2
        L62:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.m.h(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):o5.m");
    }

    public final i5.h b(b5.v vVar, b5.v vVar2) {
        int i10;
        int i11;
        if (!x.a(vVar.f3652l, vVar2.f3652l)) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        if (this.f29638i) {
            if (vVar.f3660t != vVar2.f3660t) {
                i10 |= UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            if (!this.f29634e && (vVar.f3657q != vVar2.f3657q || vVar.f3658r != vVar2.f3658r)) {
                i10 |= 512;
            }
            if (!x.a(vVar.f3664x, vVar2.f3664x)) {
                i10 |= 2048;
            }
            if (x.f15053d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f29630a) && !vVar.c(vVar2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                String str = this.f29630a;
                if (vVar.c(vVar2)) {
                    i11 = 3;
                } else {
                    i11 = 2;
                }
                return new i5.h(str, vVar, vVar2, i11, 0);
            }
        } else {
            if (vVar.f3665y != vVar2.f3665y) {
                i10 |= 4096;
            }
            if (vVar.f3666z != vVar2.f3666z) {
                i10 |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            if (vVar.A != vVar2.A) {
                i10 |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            String str2 = this.f29631b;
            if (i10 == 0 && "audio/mp4a-latm".equals(str2)) {
                Pair d10 = u.d(vVar);
                Pair d11 = u.d(vVar2);
                if (d10 != null && d11 != null) {
                    int intValue = ((Integer) d10.first).intValue();
                    int intValue2 = ((Integer) d11.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new i5.h(this.f29630a, vVar, vVar2, 3, 0);
                    }
                }
            }
            if (!vVar.c(vVar2)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(str2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new i5.h(this.f29630a, vVar, vVar2, 1, 0);
            }
        }
        return new i5.h(this.f29630a, vVar, vVar2, 0, i10);
    }

    public final boolean c(b5.v vVar, boolean z10) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i10;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair d10 = u.d(vVar);
        if (d10 == null) {
            return true;
        }
        int intValue = ((Integer) d10.first).intValue();
        int intValue2 = ((Integer) d10.second).intValue();
        boolean equals = "video/dolby-vision".equals(vVar.f3652l);
        int i11 = 8;
        String str = this.f29631b;
        if (equals) {
            if ("video/avc".equals(str)) {
                intValue2 = 0;
                intValue = 8;
            } else if ("video/hevc".equals(str)) {
                intValue2 = 0;
                intValue = 2;
            }
        }
        if (!this.f29638i && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f29633d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (x.f15050a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
            if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                i10 = videoCapabilities.getBitrateRange().getUpper().intValue();
            } else {
                i10 = 0;
            }
            if (i10 >= 180000000) {
                i11 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            } else if (i10 >= 120000000) {
                i11 = 512;
            } else if (i10 >= 60000000) {
                i11 = 256;
            } else if (i10 >= 30000000) {
                i11 = 128;
            } else if (i10 >= 18000000) {
                i11 = 64;
            } else if (i10 >= 12000000) {
                i11 = 32;
            } else if (i10 >= 7200000) {
                i11 = 16;
            } else if (i10 < 3600000) {
                if (i10 >= 1800000) {
                    i11 = 4;
                } else if (i10 >= 800000) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i11;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z10)) {
                if ("video/hevc".equals(str) && 2 == intValue) {
                    String str2 = x.f15051b;
                    if (!"sailfish".equals(str2) && !"marlin".equals(str2)) {
                    }
                }
                return true;
            }
        }
        g("codec.profileLevel, " + vVar.f3649i + ", " + this.f29632c);
        return false;
    }

    public final boolean d(b5.v vVar) {
        boolean z10;
        int i10;
        int i11;
        String str = vVar.f3652l;
        String str2 = this.f29631b;
        boolean z11 = true;
        if (!str2.equals(str) && !str2.equals(u.b(vVar))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 || !c(vVar, true)) {
            return false;
        }
        if (this.f29638i) {
            int i12 = vVar.f3657q;
            if (i12 > 0 && (i11 = vVar.f3658r) > 0) {
                if (x.f15050a >= 21) {
                    return f(i12, i11, vVar.f3659s);
                }
                if (i12 * i11 > u.i()) {
                    z11 = false;
                }
                if (!z11) {
                    g("legacyFrameSize, " + i12 + "x" + i11);
                }
            }
            return z11;
        }
        int i13 = x.f15050a;
        if (i13 < 21) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f29633d;
        int i14 = vVar.f3666z;
        if (i14 != -1) {
            if (codecCapabilities == null) {
                g("sampleRate.caps");
            } else {
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    g("sampleRate.aCaps");
                } else if (!audioCapabilities.isSampleRateSupported(i14)) {
                    g("sampleRate.support, " + i14);
                }
            }
            return false;
        }
        int i15 = vVar.f3665y;
        if (i15 == -1) {
            return true;
        }
        if (codecCapabilities == null) {
            g("channelCount.caps");
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                g("channelCount.aCaps");
            } else {
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((i13 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i10 = 6;
                    } else if ("audio/eac3".equals(str2)) {
                        i10 = 16;
                    } else {
                        i10 = 30;
                    }
                    e5.m.f("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f29630a + ", [" + maxInputChannelCount + " to " + i10 + "]");
                    maxInputChannelCount = i10;
                }
                if (maxInputChannelCount >= i15) {
                    return true;
                }
                g("channelCount.support, " + i15);
            }
        }
        return false;
    }

    public final boolean e(b5.v vVar) {
        if (this.f29638i) {
            return this.f29634e;
        }
        Pair d10 = u.d(vVar);
        if (d10 != null && ((Integer) d10.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public final boolean f(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f29633d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        if (x.f15050a >= 29) {
            int a10 = l.a(videoCapabilities, i10, i11, d10);
            if (a10 == 2) {
                return true;
            }
            if (a10 == 1) {
                StringBuilder q10 = da.e.q("sizeAndRate.cover, ", i10, "x", i11, "@");
                q10.append(d10);
                g(q10.toString());
                return false;
            }
        }
        if (!a(videoCapabilities, i10, i11, d10)) {
            if (i10 < i11) {
                String str = this.f29630a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(x.f15051b)) && a(videoCapabilities, i11, i10, d10)) {
                    StringBuilder q11 = da.e.q("sizeAndRate.rotated, ", i10, "x", i11, "@");
                    q11.append(d10);
                    StringBuilder l10 = v.e.l("AssumedSupport [", q11.toString(), "] [", str, ", ");
                    l10.append(this.f29631b);
                    l10.append("] [");
                    l10.append(x.f15054e);
                    l10.append("]");
                    e5.m.b("MediaCodecInfo", l10.toString());
                }
            }
            StringBuilder q12 = da.e.q("sizeAndRate.support, ", i10, "x", i11, "@");
            q12.append(d10);
            g(q12.toString());
            return false;
        }
        return true;
    }

    public final void g(String str) {
        StringBuilder s7 = da.e.s("NoSupport [", str, "] [");
        s7.append(this.f29630a);
        s7.append(", ");
        s7.append(this.f29631b);
        s7.append("] [");
        s7.append(x.f15054e);
        s7.append("]");
        e5.m.b("MediaCodecInfo", s7.toString());
    }

    public final String toString() {
        return this.f29630a;
    }
}
