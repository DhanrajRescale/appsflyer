package in.juspay.hyper.core;

import android.util.Log;
import androidx.annotation.Keep;
import in.juspay.hyper.constants.LogLevel;

@Keep
/* loaded from: classes2.dex */
public final class JuspayLogger {
    private JuspayLogger() {
    }

    public static void d(String str, String str2) {
        if (JuspayCoreLib.isAppDebuggable()) {
            Log.d(str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (JuspayCoreLib.isAppDebuggable()) {
            Log.e(str, str2);
        }
    }

    public static void i(String str, String str2) {
        if (JuspayCoreLib.isAppDebuggable()) {
            Log.i(str, str2);
        }
    }

    public static void log(String str, String str2, String str3) {
        str2.getClass();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case 3237038:
                if (str2.equals("info")) {
                    c10 = 0;
                    break;
                }
                break;
            case 95458899:
                if (str2.equals(LogLevel.DEBUG)) {
                    c10 = 1;
                    break;
                }
                break;
            case 96784904:
                if (str2.equals("error")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1124446108:
                if (str2.equals(LogLevel.WARNING)) {
                    c10 = 3;
                    break;
                }
                break;
            case 1952151455:
                if (str2.equals(LogLevel.CRITICAL)) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                i(str, str3);
                return;
            case 1:
                d(str, str3);
                return;
            case 2:
            case 4:
                e(str, str3);
                return;
            case 3:
                w(str, str3);
                return;
            default:
                return;
        }
    }

    public static void w(String str, String str2) {
        if (JuspayCoreLib.isAppDebuggable()) {
            Log.w(str, str2);
        }
    }

    public static void e(String str, String str2, Throwable th2) {
        if (JuspayCoreLib.isAppDebuggable()) {
            Log.e(str, str2, th2);
        }
    }
}
