package com.webengage.sdk.android.actions.rules.k;

/* loaded from: classes2.dex */
class b implements a {
    @Override // com.webengage.sdk.android.actions.rules.k.a
    public Object a(String str) {
        if (str.equalsIgnoreCase("null")) {
            return null;
        }
        if (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("false")) {
            return Boolean.valueOf(str);
        }
        try {
            try {
                return Long.valueOf(str);
            } catch (NumberFormatException unused) {
                return Double.valueOf(str);
            }
        } catch (NumberFormatException unused2) {
            return (!str.isEmpty() && str.charAt(0) == '\"' && str.charAt(str.length() - 1) == '\"') ? str.substring(1, str.length() - 1) : str;
        }
    }
}
