package com.appsflyer.internal;

import android.content.Context;
import android.database.Cursor;
import com.appsflyer.internal.AFi1hSDK;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFi1bSDK extends AFi1kSDK {
    private final AFd1kSDK valueOf;

    public AFi1bSDK(Runnable runnable, AFd1kSDK aFd1kSDK) {
        super("store", "samsung", runnable);
        this.valueOf = aFd1kSDK;
    }

    @Override // com.appsflyer.internal.AFi1hSDK
    public final void values(Context context) {
        AFc1dSDK<Map<String, Object>> aFc1dSDK = new AFc1dSDK<Map<String, Object>>(context, this.valueOf, "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFi1bSDK.2
            private static void AFInAppEventParameterName(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x00c3, code lost:
            
                if (r2 != null) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x00c5, code lost:
            
                r2.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x00dc, code lost:
            
                r0 = ((android.content.pm.PackageItemInfo) r10.valueOf.getPackageManager().resolveContentProvider(r10.AFKeystoreWrapper, 128)).packageName;
                r10.values.AFInAppEventParameterName.put("api_ver", java.lang.Long.valueOf(com.appsflyer.internal.AFb1uSDK.values(r10.valueOf, r0)));
                r10.values.AFInAppEventParameterName.put("api_ver_name", com.appsflyer.internal.AFb1uSDK.AFInAppEventType(r10.valueOf, r0));
                r10.values.values();
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0117, code lost:
            
                return r10.values.AFInAppEventParameterName;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00d9, code lost:
            
                if (0 == 0) goto L26;
             */
            @Override // com.appsflyer.internal.AFc1dSDK
            /* renamed from: values, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.util.Map<java.lang.String, java.lang.Object> AFKeystoreWrapper() {
                /*
                    Method dump skipped, instructions count: 286
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1bSDK.AnonymousClass2.AFKeystoreWrapper():java.util.Map");
            }

            private static void AFKeystoreWrapper(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j10 = cursor.getLong(columnIndex);
                if (j10 == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j10));
            }
        };
        AFd1qSDK valueOf = this.valueOf.valueOf();
        AFb1vSDK.AFKeystoreWrapper();
        if (AFb1vSDK.AFInAppEventType(valueOf, false) <= 0 && aFc1dSDK.AFInAppEventParameterName()) {
            aFc1dSDK.AFInAppEventType.values().execute(aFc1dSDK.AFInAppEventParameterName);
            this.f8508e = System.currentTimeMillis();
            this.unregisterClient = AFi1hSDK.AFa1ySDK.STARTED;
            addObserver(new AFi1hSDK.AnonymousClass1());
        }
    }
}
