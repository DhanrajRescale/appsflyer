package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.appsflyer.AFLogger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: C:\Users\Admin\appsflyer\classes17.dex */
final class AFa1zSDK$19360 {
    private static AFa1zSDK$19360 AFKeystoreWrapper;
    private final Map<String, String> valueOf = new HashMap<String, String>() { // from class: com.appsflyer.internal.AFa1zSDK$19360.4
        {
            put("aa", "ro.arch");
            put("ab", "ro.chipname");
            put("ac", "ro.dalvik.vm.native.bridge");
            put("ad", "persist.sys.nativebridge");
            put("ae", "ro.enable.native.bridge.exec");
            put("af", "dalvik.vm.isa.x86.features");
            put("ag", "dalvik.vm.isa.x86.variant");
            put("ah", "ro.zygote");
            put("ai", "ro.allow.mock.location");
            put("aj", "ro.dalvik.vm.isa.arm");
            put("ak", "dalvik.vm.isa.arm.features");
            put("al", "dalvik.vm.isa.arm.variant");
            put("am", "dalvik.vm.isa.arm64.features");
            put("an", "dalvik.vm.isa.arm64.variant");
            put("ao", "vzw.os.rooted");
            put("ap", "ro.build.user");
            put("aq", "ro.kernel.qemu");
            put("ar", "ro.hardware");
            put("as", "ro.product.cpu.abi");
            put("at", "ro.product.cpu.abilist");
            put("au", "ro.product.cpu.abilist32");
            put("av", "ro.product.cpu.abilist64");
        }
    };

    /* loaded from: classes.dex */
    public enum AFa1ySDK {
        XPOSED("xps"),
        FRIDA("frd");

        public String AFInAppEventParameterName;

        AFa1ySDK(String str) {
            this.AFInAppEventParameterName = str;
        }
    }

    /* loaded from: classes.dex */
    public enum AFa1zSDK {
        HOOKING("hk"),
        DEBUGGABLE("dbg");

        public String AFKeystoreWrapper;

        AFa1zSDK(String str) {
            this.AFKeystoreWrapper = str;
        }
    }

    AFa1zSDK$19360() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AFa1zSDK$19360 AFInAppEventParameterName() {
        if (AFKeystoreWrapper == null) {
            AFKeystoreWrapper = new AFa1zSDK$19360();
        }
        return AFKeystoreWrapper;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0007, code lost:
    
        if (AFInAppEventType(r5) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AFInAppEventType(android.content.Context r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 0
            if (r5 == 0) goto L9
            boolean r5 = AFInAppEventType(r5)     // Catch: java.lang.Exception -> L23
            if (r5 != 0) goto Lb
        L9:
            java.lang.String r0 = "invalid timestamp"
        Lb:
            com.appsflyer.internal.AFa1jSDK$28002 r5 = new com.appsflyer.internal.AFa1jSDK$28002     // Catch: java.lang.Exception -> L23
            r5.<init>()     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = "pr"
            com.appsflyer.internal.AFa1jSDK$28002 r2 = r3.AFKeystoreWrapper()     // Catch: java.lang.Exception -> L23
            r5.values(r1, r2)     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = "an"
            com.appsflyer.internal.AFa1jSDK$28002 r4 = r3.AFInAppEventType(r4)     // Catch: java.lang.Exception -> L23
            r5.values(r1, r4)     // Catch: java.lang.Exception -> L23
            goto L2a
        L23:
            r4 = move-exception
            java.lang.String r5 = "could not get anti fraud data"
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r5, r4)
            r5 = r0
        L2a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1zSDK$19360.AFInAppEventType(android.content.Context, java.lang.String):java.lang.Object");
    }

    private static boolean AFInAppEventType(String str) {
        return str.matches("\\d+");
    }

    private static boolean AFInAppEventParameterName(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    private static String AFInAppEventType() {
        StringBuilder sb2 = new StringBuilder();
        try {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
            int i10 = 0;
            int i11 = 0;
            while (it.hasNext()) {
                for (StackTraceElement stackTraceElement : it.next().getValue()) {
                    if (stackTraceElement.toString().contains("de.robv.android.xposed") && i11 <= 2) {
                        i11++;
                        sb2.append(AFa1ySDK.XPOSED.AFInAppEventParameterName);
                        if (stackTraceElement.getMethodName().equals("main")) {
                            sb2.append("+a");
                        }
                        if (stackTraceElement.getMethodName().equals("handleHookedMethod")) {
                            sb2.append("+h");
                        }
                        sb2.append(";");
                    }
                    if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit")) {
                        i10++;
                    }
                }
            }
            if (i10 > 1) {
                sb2.append("mz;");
            }
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("hooking check error", e10);
        }
        try {
            StringBuilder sb3 = new StringBuilder("/proc/");
            sb3.append(Process.myPid());
            sb3.append("/maps");
            if (AFKeystoreWrapper(sb3.toString(), "frida")) {
                sb2.append(AFa1ySDK.FRIDA.AFInAppEventParameterName);
                if (Build.VERSION.SDK_INT < 29 && AFKeystoreWrapper("/proc/net/tcp", "69A2")) {
                    sb2.append("+prt");
                }
            }
        } catch (Exception e11) {
            AFLogger.afErrorLogForExcManagerOnly("frida detection error", e11);
            sb2.append(e11.getMessage().toLowerCase(Locale.getDefault()));
        }
        sb2.append(";");
        return sb2.toString();
    }

    private AFa1jSDK$28002 AFInAppEventType(Context context) {
        AFa1jSDK$28002 aFa1jSDK$28002 = new AFa1jSDK$28002();
        try {
            aFa1jSDK$28002.values(AFa1zSDK.HOOKING.AFKeystoreWrapper, AFInAppEventType());
            aFa1jSDK$28002.AFInAppEventType(AFa1zSDK.DEBUGGABLE.AFKeystoreWrapper, AFInAppEventParameterName(context));
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("failed to perform analysis checks", e10);
        }
        return aFa1jSDK$28002;
    }

    private AFa1jSDK$28002 AFKeystoreWrapper() {
        AFa1jSDK$28002 aFa1jSDK$28002 = new AFa1jSDK$28002();
        try {
            for (Map.Entry<String, String> entry : this.valueOf.entrySet()) {
                String AFKeystoreWrapper2 = AFKeystoreWrapper(entry.getValue());
                if (AFKeystoreWrapper2 != null && !AFKeystoreWrapper2.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
                    aFa1jSDK$28002.values(entry.getKey(), AFKeystoreWrapper2);
                }
            }
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("failed to create props", e10);
        }
        return aFa1jSDK$28002;
    }

    @SuppressLint({"PrivateApi"})
    private static String AFKeystoreWrapper(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("error in props rfl", e10);
            return null;
        }
    }

    private static boolean AFKeystoreWrapper(String str, String str2) throws Exception {
        String readLine;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, Charset.defaultCharset()));
            String lowerCase = str2.toLowerCase(Locale.getDefault());
            do {
                readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    fileInputStream.close();
                    return false;
                }
            } while (!new HashSet(Arrays.asList(readLine.toLowerCase(Locale.getDefault()).split("[\\s.,\\]\\-:/_\\[]"))).contains(lowerCase));
            bufferedReader.close();
            fileInputStream.close();
            return true;
        } catch (FileNotFoundException e10) {
            AFLogger.afErrorLogForExcManagerOnly("FNF", e10);
            throw new Exception("FNF");
        } catch (IOException e11) {
            AFLogger.afErrorLogForExcManagerOnly("IOF", e11);
            throw new Exception("IOF");
        } catch (Exception e12) {
            AFLogger.afErrorLogForExcManagerOnly("GF", e12);
            throw new Exception("GF");
        }
    }
}
