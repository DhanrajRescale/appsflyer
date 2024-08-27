package com.appsflyer.internal;

/* loaded from: C:\Users\Admin\appsflyer\classes17.dex */
class AFa1hSDK$11276 {
    private int AFKeystoreWrapper;
    private final String valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AFa1hSDK$11276(String str) {
        if (str != null && str.startsWith("\ufeff")) {
            str = str.substring(1);
        }
        this.valueOf = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object valueOf() throws AFa1gSDK$18044 {
        int AFInAppEventParameterName = AFInAppEventParameterName();
        if (AFInAppEventParameterName == -1) {
            throw AFInAppEventType("End of input");
        }
        if (AFInAppEventParameterName == 34 || AFInAppEventParameterName == 39) {
            return AFInAppEventParameterName((char) AFInAppEventParameterName);
        }
        if (AFInAppEventParameterName == 91) {
            AFa1lSDK$17250 aFa1lSDK$17250 = new AFa1lSDK$17250();
            boolean z10 = false;
            while (true) {
                int AFInAppEventParameterName2 = AFInAppEventParameterName();
                if (AFInAppEventParameterName2 == -1) {
                    throw AFInAppEventType("Unterminated array");
                }
                if (AFInAppEventParameterName2 == 44 || AFInAppEventParameterName2 == 59) {
                    aFa1lSDK$17250.AFInAppEventParameterName((Object) null);
                } else {
                    if (AFInAppEventParameterName2 == 93) {
                        if (z10) {
                            aFa1lSDK$17250.AFInAppEventParameterName((Object) null);
                        }
                        return aFa1lSDK$17250;
                    }
                    this.AFKeystoreWrapper--;
                    aFa1lSDK$17250.AFInAppEventParameterName(valueOf());
                    int AFInAppEventParameterName3 = AFInAppEventParameterName();
                    if (AFInAppEventParameterName3 != 44 && AFInAppEventParameterName3 != 59) {
                        if (AFInAppEventParameterName3 == 93) {
                            return aFa1lSDK$17250;
                        }
                        throw AFInAppEventType("Unterminated array");
                    }
                }
                z10 = true;
            }
        } else {
            if (AFInAppEventParameterName != 123) {
                this.AFKeystoreWrapper--;
                return values();
            }
            AFa1jSDK$28002 aFa1jSDK$28002 = new AFa1jSDK$28002();
            int AFInAppEventParameterName4 = AFInAppEventParameterName();
            if (AFInAppEventParameterName4 == 125) {
                return aFa1jSDK$28002;
            }
            if (AFInAppEventParameterName4 != -1) {
                this.AFKeystoreWrapper--;
            }
            while (true) {
                Object valueOf = valueOf();
                if (!(valueOf instanceof String)) {
                    if (valueOf == null) {
                        throw AFInAppEventType("Names cannot be null");
                    }
                    StringBuilder sb2 = new StringBuilder("Names must be strings, but ");
                    sb2.append(valueOf);
                    sb2.append(" is of type ");
                    sb2.append(valueOf.getClass().getName());
                    throw AFInAppEventType(sb2.toString());
                }
                int AFInAppEventParameterName5 = AFInAppEventParameterName();
                if (AFInAppEventParameterName5 != 58 && AFInAppEventParameterName5 != 61) {
                    throw AFInAppEventType("Expected ':' after ".concat(String.valueOf(valueOf)));
                }
                if (this.AFKeystoreWrapper < this.valueOf.length() && this.valueOf.charAt(this.AFKeystoreWrapper) == '>') {
                    this.AFKeystoreWrapper++;
                }
                aFa1jSDK$28002.values((String) valueOf, valueOf());
                int AFInAppEventParameterName6 = AFInAppEventParameterName();
                if (AFInAppEventParameterName6 != 44 && AFInAppEventParameterName6 != 59) {
                    if (AFInAppEventParameterName6 == 125) {
                        return aFa1jSDK$28002;
                    }
                    throw AFInAppEventType("Unterminated object");
                }
            }
        }
    }

    private int AFInAppEventParameterName() throws AFa1gSDK$18044 {
        while (this.AFKeystoreWrapper < this.valueOf.length()) {
            String str = this.valueOf;
            int i10 = this.AFKeystoreWrapper;
            this.AFKeystoreWrapper = i10 + 1;
            char charAt = str.charAt(i10);
            if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                if (charAt != '#') {
                    if (charAt != '/' || this.AFKeystoreWrapper == this.valueOf.length()) {
                        return charAt;
                    }
                    char charAt2 = this.valueOf.charAt(this.AFKeystoreWrapper);
                    if (charAt2 == '*') {
                        int i11 = this.AFKeystoreWrapper + 1;
                        this.AFKeystoreWrapper = i11;
                        int indexOf = this.valueOf.indexOf("*/", i11);
                        if (indexOf == -1) {
                            throw AFInAppEventType("Unterminated comment");
                        }
                        this.AFKeystoreWrapper = indexOf + 2;
                    } else {
                        if (charAt2 != '/') {
                            return charAt;
                        }
                        this.AFKeystoreWrapper++;
                        AFKeystoreWrapper();
                    }
                } else {
                    AFKeystoreWrapper();
                }
            }
        }
        return -1;
    }

    private void AFKeystoreWrapper() {
        while (this.AFKeystoreWrapper < this.valueOf.length()) {
            char charAt = this.valueOf.charAt(this.AFKeystoreWrapper);
            if (charAt != '\r' && charAt != '\n') {
                this.AFKeystoreWrapper++;
            } else {
                this.AFKeystoreWrapper++;
                return;
            }
        }
    }

    String AFInAppEventParameterName(char c10) throws AFa1gSDK$18044 {
        int i10 = this.AFKeystoreWrapper;
        StringBuilder sb2 = null;
        while (this.AFKeystoreWrapper < this.valueOf.length()) {
            String str = this.valueOf;
            int i11 = this.AFKeystoreWrapper;
            this.AFKeystoreWrapper = i11 + 1;
            char charAt = str.charAt(i11);
            if (charAt == c10) {
                if (sb2 == null) {
                    return new String(this.valueOf.substring(i10, this.AFKeystoreWrapper - 1));
                }
                sb2.append((CharSequence) this.valueOf, i10, this.AFKeystoreWrapper - 1);
                return sb2.toString();
            }
            if (charAt == '\\') {
                if (this.AFKeystoreWrapper == this.valueOf.length()) {
                    throw AFInAppEventType("Unterminated escape sequence");
                }
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append((CharSequence) this.valueOf, i10, this.AFKeystoreWrapper - 1);
                sb2.append(AFInAppEventType());
                i10 = this.AFKeystoreWrapper;
            }
        }
        throw AFInAppEventType("Unterminated string");
    }

    private char AFInAppEventType() throws AFa1gSDK$18044 {
        String str = this.valueOf;
        int i10 = this.AFKeystoreWrapper;
        this.AFKeystoreWrapper = i10 + 1;
        char charAt = str.charAt(i10);
        if (charAt == 'b') {
            return '\b';
        }
        if (charAt == 'f') {
            return '\f';
        }
        if (charAt == 'n') {
            return '\n';
        }
        if (charAt == 'r') {
            return '\r';
        }
        if (charAt == 't') {
            return '\t';
        }
        if (charAt != 'u') {
            return charAt;
        }
        if (this.AFKeystoreWrapper + 4 > this.valueOf.length()) {
            throw AFInAppEventType("Unterminated escape sequence");
        }
        String str2 = this.valueOf;
        int i11 = this.AFKeystoreWrapper;
        String substring = str2.substring(i11, i11 + 4);
        this.AFKeystoreWrapper += 4;
        try {
            return (char) Integer.parseInt(substring, 16);
        } catch (NumberFormatException unused) {
            throw AFInAppEventType("Invalid escape sequence: ".concat(String.valueOf(substring)));
        }
    }

    AFa1gSDK$18044 AFInAppEventType(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(this);
        return new AFa1gSDK$18044(sb2.toString());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(" at character ");
        sb2.append(this.AFKeystoreWrapper);
        sb2.append(" of ");
        sb2.append(this.valueOf);
        return sb2.toString();
    }

    private Object values() throws AFa1gSDK$18044 {
        int i10;
        String substring;
        String substring2;
        int i11 = this.AFKeystoreWrapper;
        while (true) {
            i10 = 10;
            if (this.AFKeystoreWrapper < this.valueOf.length()) {
                char charAt = this.valueOf.charAt(this.AFKeystoreWrapper);
                if (charAt == '\r' || charAt == '\n' || "{}[]/\\:,=;# \t\f".indexOf(charAt) != -1) {
                    break;
                }
                this.AFKeystoreWrapper++;
            } else {
                substring = this.valueOf.substring(i11);
                break;
            }
        }
        if (substring.length() == 0) {
            throw AFInAppEventType("Expected literal value");
        }
        if ("null".equalsIgnoreCase(substring)) {
            return AFa1jSDK$28002.values;
        }
        if ("true".equalsIgnoreCase(substring)) {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(substring)) {
            return Boolean.FALSE;
        }
        if (substring.indexOf(46) == -1) {
            if (substring.startsWith("0x") || substring.startsWith("0X")) {
                substring2 = substring.substring(2);
                i10 = 16;
            } else if (!substring.startsWith("0") || substring.length() <= 1) {
                substring2 = substring;
            } else {
                substring2 = substring.substring(1);
                i10 = 8;
            }
            try {
                long parseLong = Long.parseLong(substring2, i10);
                if (parseLong <= 2147483647L && parseLong >= -2147483648L) {
                    return Integer.valueOf((int) parseLong);
                }
                return Long.valueOf(parseLong);
            } catch (NumberFormatException unused) {
            }
        }
        try {
            return Double.valueOf(substring);
        } catch (NumberFormatException unused2) {
            return new String(substring);
        }
    }
}
