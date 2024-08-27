package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.appsflyer.AFLogger;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* loaded from: C:\Users\Admin\appsflyer\classes14.dex */
public final class AFc1aSDK$1938 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFInAppEventParameterName = 1;
    private static int AFKeystoreWrapper;
    private static char[] AFInAppEventType = {48958, 12118, 40952, 3679, 65196, 28377, 56693, 19858, 15387, 44213, 7372, 35700, 31647, 60007, 23116, 51951, 47465, 10652, 38951, 2143, 63724, 26373, 55275, 18400, 13947, 42744, 5444, 34232, 30206, 58445, 21678, 48717, 11822, 40630, 3908, 65520, 28599, 56339, 49487, 20771, 57735, 28775, 32982, 48956, 12127, 40913, 3604, 65199, 28380, 56674, 19885, 15378, 44222, 14841, 43402, 6438, 35039, 30846, 59464, 23475, 52040, 47829, 10868, 39441, 3568, 64863, 27873, 56451, 19502, 16309, 44886, 7923, 36560, 32316, 57801, 20861, 49420, 45203, 8249, 37840, 48956, 12127, 40906, 3589, 65188, 28356, 56672, 19858, 15369, 44216, 7384, 35681, 48942, 12112, 40946, 3630, 65187};
    private static long values = -4405002150698143943L;

    public final void AFInAppEventType(@NotNull AFa1qSDK aFa1qSDK) {
        int i10 = AFKeystoreWrapper + 11;
        AFInAppEventParameterName = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getLongPressTimeout() >> 16, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 31 - (Process.myPid() >> 22), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(31 - TextUtils.indexOf(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET), (char) (ImageFormat.getBitsPerPixel(0) + 370), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6, objArr2);
        String intern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(KeyEvent.keyCodeFromString(HttpUrl.FRAGMENT_ENCODE_SET) + 38, (char) (32383 - Color.alpha(0)), TextUtils.indexOf((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET, '0', 0) + 6, objArr3);
        String intern3 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(43 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getTapTimeout() >> 16), 10 - (Process.myPid() >> 22), objArr4);
        String intern4 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a((ViewConfiguration.getTouchSlop() >> 8) + 53, (char) (MotionEvent.axisFromString(HttpUrl.FRAGMENT_ENCODE_SET) + 34498), (KeyEvent.getMaxKeyCode() >> 16) + 27, objArr5);
        String intern5 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 81, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), View.MeasureSpec.getSize(0) + 12, objArr6);
        String intern6 = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        a((ViewConfiguration.getLongPressTimeout() >> 16) + 92, (char) ((ViewConfiguration.getScrollFriction() > s0.g.f34069a ? 1 : (ViewConfiguration.getScrollFriction() == s0.g.f34069a ? 0 : -1)) - 1), 5 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr7);
        String intern7 = ((String) objArr7[0]).intern();
        try {
            aFa1qSDK.AFKeystoreWrapper(intern3, Integer.valueOf(System.identityHashCode(aFa1qSDK)));
            Class<?> valueOf = valueOf(intern);
            AFKeystoreWrapper(intern2, valueOf, Map.class).invoke(AFKeystoreWrapper(intern4, valueOf, new Class[0]).invoke(null, new Object[0]), aFa1qSDK.AFInAppEventParameterName());
        } catch (Throwable th2) {
            AFLogger.afErrorLog(intern5, th2, true);
            StringBuilder sb2 = new StringBuilder();
            Object obj = aFa1qSDK.AFInAppEventParameterName().get(intern6);
            String str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            sb2.append(str);
            sb2.append(intern5);
            String obj2 = sb2.toString();
            Intrinsics.checkNotNullParameter(obj2, "");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = obj2.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            byte[] digest = messageDigest.digest(bytes);
            Intrinsics.checkNotNullExpressionValue(digest, "");
            int i12 = AFKeystoreWrapper + 121;
            AFInAppEventParameterName = i12 % 128;
            int i13 = i12 % 2;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            for (byte b10 : digest) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "");
                sb3.append(format);
                str2 = sb3.toString();
            }
            aFa1qSDK.AFKeystoreWrapper(intern7, str2);
            aFa1qSDK.AFInAppEventParameterName().remove(intern3);
        }
    }

    private static Class<?> valueOf(String str) {
        int i10 = AFKeystoreWrapper + 69;
        AFInAppEventParameterName = i10 % 128;
        int i11 = i10 % 2;
        Class<?> cls = Class.forName(str);
        Intrinsics.checkNotNullExpressionValue(cls, "");
        int i12 = AFInAppEventParameterName + 67;
        AFKeystoreWrapper = i12 % 128;
        if ((i12 % 2 != 0 ? 'V' : '#') == '#') {
            return cls;
        }
        int i13 = 67 / 0;
        return cls;
    }

    private static Method AFKeystoreWrapper(String str, Class<?> cls, Class<?>... clsArr) {
        int i10 = AFInAppEventParameterName + 1;
        AFKeystoreWrapper = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 22 : (char) 31) == 31) {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            declaredMethod.setAccessible(true);
            return declaredMethod;
        }
        Method declaredMethod2 = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        declaredMethod2.setAccessible(false);
        return declaredMethod2;
    }

    private static void a(int i10, char c10, int i11, Object[] objArr) {
        AFj1kSDK aFj1kSDK = new AFj1kSDK();
        long[] jArr = new long[i11];
        aFj1kSDK.AFInAppEventType = 0;
        while (true) {
            if (aFj1kSDK.AFInAppEventType >= i11) {
                break;
            }
            jArr[aFj1kSDK.AFInAppEventType] = (((char) (AFInAppEventType[aFj1kSDK.AFInAppEventType + i10] ^ (-6893508403516555427L))) ^ (aFj1kSDK.AFInAppEventType * ((-6893508403516555427L) ^ values))) ^ c10;
            aFj1kSDK.AFInAppEventType++;
            int i12 = $10 + 121;
            $11 = i12 % 128;
            int i13 = i12 % 2;
        }
        char[] cArr = new char[i11];
        aFj1kSDK.AFInAppEventType = 0;
        while (true) {
            if ((aFj1kSDK.AFInAppEventType < i11 ? UrlTreeKt.configurablePathSegmentSuffixChar : ':') == ':') {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[aFj1kSDK.AFInAppEventType] = (char) jArr[aFj1kSDK.AFInAppEventType];
            aFj1kSDK.AFInAppEventType++;
            int i14 = $11 + 55;
            $10 = i14 % 128;
            int i15 = i14 % 2;
        }
    }
}
