package o5;

import android.media.MediaCodecInfo;
import android.util.Pair;
import b5.r0;
import b5.s0;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import d2.b0;
import e5.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import lp.o0;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f29679a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f29680b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static int f29681c = -1;

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (x.f15050a < 26 && x.f15051b.equals("R9") && arrayList.size() == 1 && ((m) arrayList.get(0)).f29630a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(m.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new b0(new s0(27), 1));
        }
        int i10 = x.f15050a;
        if (i10 < 21 && arrayList.size() > 1) {
            String str2 = ((m) arrayList.get(0)).f29630a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new b0(new s0(28), 1));
            }
        }
        if (i10 < 32 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((m) arrayList.get(0)).f29630a)) {
            arrayList.add((m) arrayList.remove(0));
        }
    }

    public static String b(b5.v vVar) {
        Pair d10;
        if ("audio/eac3-joc".equals(vVar.f3652l)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(vVar.f3652l) && (d10 = d(vVar)) != null) {
            int intValue = ((Integer) d10.first).intValue();
            if (intValue != 16 && intValue != 256) {
                if (intValue == 512) {
                    return "video/avc";
                }
                return null;
            }
            return "video/hevc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0375 A[Catch: NumberFormatException -> 0x0385, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0385, blocks: (B:196:0x032e, B:198:0x0340, B:210:0x035e, B:213:0x0375), top: B:195:0x032e }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair d(b5.v r17) {
        /*
            Method dump skipped, instructions count: 2420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.u.d(b5.v):android.util.Pair");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [o5.s] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, eb.f] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r9v3, types: [o5.s, java.lang.Object] */
    public static synchronized List e(String str, boolean z10, boolean z11) {
        ?? r72;
        int i10;
        synchronized (u.class) {
            try {
                r rVar = new r(str, z10, z11);
                HashMap hashMap = f29680b;
                List list = (List) hashMap.get(rVar);
                if (list != null) {
                    return list;
                }
                int i11 = x.f15050a;
                if (i11 >= 21) {
                    ?? obj = new Object();
                    if (!z10 && !z11) {
                        i10 = 0;
                        obj.f15308a = i10;
                        r72 = obj;
                    }
                    i10 = 1;
                    obj.f15308a = i10;
                    r72 = obj;
                } else {
                    r72 = new Object();
                }
                ArrayList f10 = f(rVar, r72);
                if (z10 && f10.isEmpty() && 21 <= i11 && i11 <= 23) {
                    f10 = f(rVar, new Object());
                    if (!f10.isEmpty()) {
                        e5.m.f("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((m) f10.get(0)).f29630a);
                    }
                }
                a(str, f10);
                o0 q10 = o0.q(f10);
                hashMap.put(rVar, q10);
                return q10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r8 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList f(o5.r r23, o5.s r24) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.u.f(o5.r, o5.s):java.util.ArrayList");
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = x.f15050a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = x.f15051b;
            if ("a70".equals(str3) || ("Xiaomi".equals(x.f15052c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = x.f15051b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = x.f15051b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(x.f15052c))) {
            String str6 = x.f15051b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(x.f15052c)) {
            String str7 = x.f15051b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 <= 19 && x.f15051b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        if (i10 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (x.f15050a >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (r0.j(str)) {
            return true;
        }
        String P1 = dp.b.P1(mediaCodecInfo.getName());
        if (P1.startsWith("arc.")) {
            return false;
        }
        if (P1.startsWith("omx.google.") || P1.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((P1.startsWith("omx.sec.") && P1.contains(".sw.")) || P1.equals("omx.qcom.video.decoder.hevcswvdec") || P1.startsWith("c2.android.") || P1.startsWith("c2.google.")) {
            return true;
        }
        if (!P1.startsWith("omx.") && !P1.startsWith("c2.")) {
            return true;
        }
        return false;
    }

    public static int i() {
        m mVar;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i10;
        int i11;
        if (f29681c == -1) {
            int i12 = 0;
            List e10 = e("video/avc", false, false);
            if (e10.isEmpty()) {
                mVar = null;
            } else {
                mVar = (m) e10.get(0);
            }
            if (mVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f29633d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i13 = 0;
                while (i12 < length) {
                    int i14 = codecProfileLevelArr[i12].level;
                    if (i14 != 1 && i14 != 2) {
                        switch (i14) {
                            case 8:
                            case 16:
                            case 32:
                                i11 = 101376;
                                break;
                            case 64:
                                i11 = 202752;
                                break;
                            case 128:
                            case 256:
                                i11 = 414720;
                                break;
                            case 512:
                                i11 = 921600;
                                break;
                            case UserMetadata.MAX_ATTRIBUTE_SIZE /* 1024 */:
                                i11 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i11 = 2097152;
                                break;
                            case UserMetadata.MAX_INTERNAL_KEY_SIZE /* 8192 */:
                                i11 = 2228224;
                                break;
                            case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                                i11 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i11 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i11 = 35651584;
                                break;
                            default:
                                i11 = -1;
                                break;
                        }
                    } else {
                        i11 = 25344;
                    }
                    i13 = Math.max(i11, i13);
                    i12++;
                }
                if (x.f15050a >= 21) {
                    i10 = 345600;
                } else {
                    i10 = 172800;
                }
                i12 = Math.max(i13, i10);
            }
            f29681c = i12;
        }
        return f29681c;
    }
}
