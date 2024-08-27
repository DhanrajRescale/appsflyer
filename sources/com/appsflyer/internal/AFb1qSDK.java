package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class AFb1qSDK {
    public String AFInAppEventParameterName;
    private byte[] AFInAppEventType;
    String AFKeystoreWrapper;
    public String valueOf;
    public AFf1zSDK values;

    public AFb1qSDK(String str, byte[] bArr, String str2, AFf1zSDK aFf1zSDK) {
        this.valueOf = str;
        this.AFInAppEventType = bArr;
        this.AFKeystoreWrapper = str2;
        this.values = aFf1zSDK;
    }

    public final byte[] AFInAppEventType() {
        return this.AFInAppEventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AFb1qSDK.class == obj.getClass()) {
            AFb1qSDK aFb1qSDK = (AFb1qSDK) obj;
            String str = this.AFKeystoreWrapper;
            if (str == null ? aFb1qSDK.AFKeystoreWrapper != null : !str.equals(aFb1qSDK.AFKeystoreWrapper)) {
                return false;
            }
            if (!Arrays.equals(this.AFInAppEventType, aFb1qSDK.AFInAppEventType)) {
                return false;
            }
            String str2 = this.valueOf;
            if (str2 == null ? aFb1qSDK.valueOf != null : !str2.equals(aFb1qSDK.valueOf)) {
                return false;
            }
            String str3 = this.AFInAppEventParameterName;
            if (str3 == null ? aFb1qSDK.AFInAppEventParameterName != null : !str3.equals(aFb1qSDK.AFInAppEventParameterName)) {
                return false;
            }
            if (this.values == aFb1qSDK.values) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        String str = this.AFKeystoreWrapper;
        int i13 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode = (Arrays.hashCode(this.AFInAppEventType) + (i10 * 31)) * 31;
        String str2 = this.valueOf;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (hashCode + i11) * 31;
        String str3 = this.AFInAppEventParameterName;
        if (str3 != null) {
            i12 = str3.hashCode();
        } else {
            i12 = 0;
        }
        int i15 = (i14 + i12) * 31;
        AFf1zSDK aFf1zSDK = this.values;
        if (aFf1zSDK != null) {
            i13 = aFf1zSDK.hashCode();
        }
        return i15 + i13;
    }

    public AFb1qSDK(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        int i10 = 0;
        int i11 = 0;
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.valueOf = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.AFKeystoreWrapper = nextLine.substring(8).trim();
                Matcher matcher = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.AFKeystoreWrapper);
                if (matcher.matches()) {
                    i10 = Integer.parseInt(matcher.group(1));
                    i11 = Integer.parseInt(matcher.group(2));
                }
            } else if (nextLine.startsWith("data=")) {
                String trim = nextLine.substring(5).trim();
                this.AFInAppEventType = (i10 > 4 || i11 >= 11) ? Base64.decode(trim, 2) : trim.getBytes(Charset.defaultCharset());
            } else if (nextLine.startsWith("type=")) {
                String trim2 = nextLine.substring(5).trim();
                try {
                    this.values = AFf1zSDK.valueOf(trim2);
                } catch (Exception e10) {
                    AFLogger.afErrorLog("CACHE: Unknown task type: ".concat(String.valueOf(trim2)), e10);
                }
            }
        }
        scanner.close();
    }
}
