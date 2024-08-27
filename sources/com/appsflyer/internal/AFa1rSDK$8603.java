package com.appsflyer.internal;

/* loaded from: C:\Users\Admin\appsflyer\classes17.dex */
class AFa1rSDK$8603 {
    AFa1rSDK$8603() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double AFKeystoreWrapper(double d10) throws AFa1gSDK$18044 {
        if (Double.isInfinite(d10) || Double.isNaN(d10)) {
            throw new AFa1gSDK$18044("Forbidden numeric value: ".concat(String.valueOf(d10)));
        }
        return d10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AFa1gSDK$18044 AFKeystoreWrapper(Object obj, String str) throws AFa1gSDK$18044 {
        if (obj == null) {
            throw new AFa1gSDK$18044("Value is null.");
        }
        StringBuilder sb2 = new StringBuilder("Value ");
        sb2.append(obj);
        sb2.append(" of type ");
        sb2.append(obj.getClass().getName());
        sb2.append(" cannot be converted to ");
        sb2.append(str);
        throw new AFa1gSDK$18044(sb2.toString());
    }
}
