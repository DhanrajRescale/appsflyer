package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class AFd1rSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] AFInAppEventParameterName = null;
    private static int AFKeystoreWrapper = 0;
    private static int AFLogger = 0;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f8423e = false;
    private static boolean registerClient = false;
    private static int unregisterClient = 1;
    private static long valueOf;
    private final Context AFInAppEventType;
    private final Map<String, Object> values;

    /* loaded from: classes.dex */
    public static class AFa1tSDK {
        @NonNull
        public static byte[] AFInAppEventType(@NonNull String str) throws Exception {
            return str.getBytes(Charset.defaultCharset());
        }

        public static byte[] AFKeystoreWrapper(@NonNull byte[] bArr) throws Exception {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                bArr[i10] = (byte) (bArr[i10] ^ ((i10 % 2) + 42));
            }
            return bArr;
        }
    }

    static {
        valueOf();
        Color.rgb(0, 0, 0);
        ViewConfiguration.getEdgeSlop();
        Process.myTid();
        AudioTrack.getMinVolume();
        View.resolveSizeAndState(0, 0, 0);
        View.getDefaultSize(0, 0);
        MotionEvent.axisFromString(HttpUrl.FRAGMENT_ENCODE_SET);
        int i10 = AFLogger + 55;
        unregisterClient = i10 % 128;
        int i11 = i10 % 2;
    }

    public AFd1rSDK(Map<String, Object> map, Context context) {
        this.values = map;
        this.AFInAppEventType = context;
        put(AFInAppEventParameterName(), AFInAppEventType());
    }

    @NonNull
    private String AFInAppEventParameterName() {
        String str;
        int i10 = AFLogger + 109;
        unregisterClient = i10 % 128;
        int i11 = i10 % 2;
        try {
            String num = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.values;
            Object[] objArr = new Object[1];
            a("۾掄찺㚜錂ﶃ昔삇ⴃ鞛\uf010媰", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 25980, objArr);
            String obj = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.values;
            Object[] objArr2 = new Object[1];
            a("۽좖騈涀㼗", Color.green(0) + 52859, objArr2);
            String obj2 = map2.get(((String) objArr2[0]).intern()).toString();
            if (obj2 == null) {
                int i12 = AFLogger + 117;
                unregisterClient = i12 % 128;
                if (i12 % 2 == 0) {
                    Object[] objArr3 = new Object[1];
                    b(81 / (SystemClock.elapsedRealtimeNanos() > 1L ? 1 : (SystemClock.elapsedRealtimeNanos() == 1L ? 0 : -1)), null, null, "\u0087\u0081\u0086\u0085\u0084\u0083\u0082\u0081", objArr3);
                    str = (String) objArr3[0];
                } else {
                    Object[] objArr4 = new Object[1];
                    b((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 126, null, null, "\u0087\u0081\u0086\u0085\u0084\u0083\u0082\u0081", objArr4);
                    str = (String) objArr4[0];
                }
                obj2 = str.intern();
            }
            StringBuilder sb2 = new StringBuilder(obj);
            sb2.reverse();
            StringBuilder AFKeystoreWrapper2 = AFKeystoreWrapper(num, obj2, sb2.toString());
            int length = AFKeystoreWrapper2.length();
            if (length > 4) {
                int i13 = AFLogger + 35;
                unregisterClient = i13 % 128;
                if (i13 % 2 == 0) {
                    AFKeystoreWrapper2.delete(5, length);
                } else {
                    AFKeystoreWrapper2.delete(4, length);
                }
            } else {
                while (length < 4) {
                    int i14 = AFLogger + 25;
                    unregisterClient = i14 % 128;
                    int i15 = i14 % 2;
                    length++;
                    AFKeystoreWrapper2.append('1');
                }
            }
            Object[] objArr5 = new Object[1];
            a("۴ﮫﱛ", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 64849, objArr5);
            AFKeystoreWrapper2.insert(0, ((String) objArr5[0]).intern());
            return AFKeystoreWrapper2.toString();
        } catch (Exception e10) {
            Object[] objArr6 = new Object[1];
            b(128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), null, null, "\u0099\u008b\u0092\u0098\u0088\u008f\u008a\u0097\u0088\u0090\u008a\u0097\u0088\u0089\u0095\u0092\u008b\u0091\u0096\u008a\u0095\u008a\u0089\u0088\u0094\u008a\u0093\u0092\u0091\u0090\u0088\u008f\u008a\u008e\u008d\u008c\u008b\u008a\u0089\u0088", objArr6);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr6[0]).intern(), e10);
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr7 = new Object[1];
            a("۹鄉⤘섖夦\uf128襵ℹ륂兞\ue95c腰ᥪ녠䥴\ue188禈ᇘꦪ䆯\ud9b5燼ৎꇋ㧎토槾ǻ駯「졍怓\uf807逫⠴쀪塗\uf045衚⁐렽倰", 38903 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr7);
            sb3.append(((String) objArr7[0]).intern());
            sb3.append(e10);
            AFLogger.afRDLog(sb3.toString());
            Object[] objArr8 = new Object[1];
            b((ViewConfiguration.getWindowTouchSlop() >> 8) + 127, null, null, "\u009a\u009a\u009a\u009a\u0090\u008a\u0097", objArr8);
            return ((String) objArr8[0]).intern();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String AFInAppEventType() {
        /*
            Method dump skipped, instructions count: 787
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1rSDK.AFInAppEventType():java.lang.String");
    }

    private static StringBuilder AFKeystoreWrapper(@NonNull String... strArr) throws Exception {
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i10 = 0;
        while (i10 < 3) {
            arrayList.add(Integer.valueOf(strArr[i10].length()));
            i10++;
            int i11 = unregisterClient + 117;
            AFLogger = i11 % 128;
            int i12 = i11 % 2;
        }
        Collections.sort(arrayList);
        int intValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb2 = new StringBuilder();
        int i13 = 0;
        while (i13 < intValue) {
            int i14 = unregisterClient + 101;
            AFLogger = i14 % 128;
            int i15 = i14 % 2;
            Integer num = null;
            for (int i16 = 0; i16 < 3; i16++) {
                int charAt = strArr[i16].charAt(i13);
                if (num == null) {
                    int i17 = unregisterClient + 29;
                    AFLogger = i17 % 128;
                    if (i17 % 2 != 0) {
                        throw null;
                    }
                } else {
                    charAt ^= num.intValue();
                }
                num = Integer.valueOf(charAt);
            }
            sb2.append(Integer.toHexString(num.intValue()));
            i13++;
            int i18 = AFLogger + 25;
            unregisterClient = i18 % 128;
            int i19 = i18 % 2;
        }
        return sb2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r10 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.lang.String r10, int r11, java.lang.Object[] r12) {
        /*
            if (r10 == 0) goto L18
            int r0 = com.appsflyer.internal.AFd1rSDK.$10
            int r0 = r0 + 63
            int r1 = r0 % 128
            com.appsflyer.internal.AFd1rSDK.$11 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L13
            char[] r10 = r10.toCharArray()
            goto L18
        L13:
            r10.toCharArray()
            r10 = 0
            throw r10
        L18:
            char[] r10 = (char[]) r10
            com.appsflyer.internal.AFj1bSDK r0 = new com.appsflyer.internal.AFj1bSDK
            r0.<init>()
            r0.AFInAppEventParameterName = r11
            int r11 = r10.length
            long[] r1 = new long[r11]
            r2 = 0
            r0.valueOf = r2
        L27:
            int r3 = r0.valueOf
            int r4 = r10.length
            if (r3 >= r4) goto L4f
            int r4 = com.appsflyer.internal.AFd1rSDK.$11
            int r4 = r4 + 101
            int r5 = r4 % 128
            com.appsflyer.internal.AFd1rSDK.$10 = r5
            int r4 = r4 % 2
            char r4 = r10[r3]
            long r4 = (long) r4
            long r6 = (long) r3
            int r8 = r0.AFInAppEventParameterName
            long r8 = (long) r8
            long r6 = r6 * r8
            long r4 = r4 ^ r6
            long r6 = com.appsflyer.internal.AFd1rSDK.valueOf
            r8 = 53874021866711318(0xbf66232ffca916, double:4.471362378311836E-305)
            long r6 = r6 ^ r8
            long r4 = r4 ^ r6
            r1[r3] = r4
            int r3 = r3 + 1
            r0.valueOf = r3
            goto L27
        L4f:
            char[] r11 = new char[r11]
            r0.valueOf = r2
        L53:
            int r3 = r0.valueOf
            int r4 = r10.length
            if (r3 >= r4) goto L6d
            int r4 = com.appsflyer.internal.AFd1rSDK.$11
            int r4 = r4 + 59
            int r5 = r4 % 128
            com.appsflyer.internal.AFd1rSDK.$10 = r5
            int r4 = r4 % 2
            r4 = r1[r3]
            int r4 = (int) r4
            char r4 = (char) r4
            r11[r3] = r4
            int r3 = r3 + 1
            r0.valueOf = r3
            goto L53
        L6d:
            java.lang.String r10 = new java.lang.String
            r10.<init>(r11)
            r12[r2] = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1rSDK.a(java.lang.String, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(int r10, int[] r11, java.lang.String r12, java.lang.String r13, java.lang.Object[] r14) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1rSDK.b(int, int[], java.lang.String, java.lang.String, java.lang.Object[]):void");
    }

    public static void valueOf() {
        valueOf = -603186298485624951L;
        registerClient = true;
        f8423e = true;
        AFKeystoreWrapper = 928696761;
        AFInAppEventParameterName = new char[]{51311, 51304, 51288, 51323, 51307, 51322, 51317, 51609, 51280, 51286, 51269, 51303, 51595, 51308, 51266, 51287, 51290, 51282, 51277, 51285, 51279, 51275, 51276, 51264, 51281, 51586, 51591, 51599, 51594, 51589, 51593, 51598, 51284, 51603, 51270, 51271, 51272, 51301, 51318, 51298, 51316, 51313, 51312, 51265, 51585, 51268, 51291, 51607, 51274, 51273, 51278};
    }
}
