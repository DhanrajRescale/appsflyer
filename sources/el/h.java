package el;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.facebook.FacebookSdk;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f15676a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f15677b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f15678c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final String f15679d = FacebookSdk.getApplicationContext().getPackageName();

    /* renamed from: e, reason: collision with root package name */
    public static final SharedPreferences f15680e = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final SharedPreferences f15681f = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    public static final ArrayList f(Context context, Object obj) {
        if (sl.a.b(h.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            h hVar = f15676a;
            return hVar.a(hVar.e(context, obj, "inapp"));
        } catch (Throwable th2) {
            sl.a.a(h.class, th2);
            return null;
        }
    }

    public final ArrayList a(ArrayList arrayList) {
        SharedPreferences sharedPreferences = f15681f;
        if (sl.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("productId");
                    long j10 = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (currentTimeMillis - (j10 / 1000) <= 86400 && !Intrinsics.a(sharedPreferences.getString(string, HttpUrl.FRAGMENT_ENCODE_SET), string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(str);
                    }
                } catch (JSONException unused) {
                }
            }
            edit.apply();
            return arrayList2;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:7:0x000a, B:10:0x0013, B:14:0x0037, B:24:0x0031, B:18:0x001d, B:20:0x0027), top: B:6:0x000a, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class b(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            boolean r0 = sl.a.b(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.HashMap r0 = el.h.f15678c
            java.lang.Object r2 = r0.get(r6)     // Catch: java.lang.Throwable -> L3b
            java.lang.Class r2 = (java.lang.Class) r2     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L13
            return r2
        L13:
            java.lang.Class<el.l> r2 = el.l.class
            boolean r3 = sl.a.b(r2)     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L1d
        L1b:
            r5 = r1
            goto L35
        L1d:
            java.lang.String r3 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "className"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)     // Catch: java.lang.Throwable -> L30
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L1b java.lang.Throwable -> L30
            java.lang.Class r5 = r5.loadClass(r6)     // Catch: java.lang.ClassNotFoundException -> L1b java.lang.Throwable -> L30
            goto L35
        L30:
            r5 = move-exception
            sl.a.a(r2, r5)     // Catch: java.lang.Throwable -> L3b
            goto L1b
        L35:
            if (r5 == 0) goto L3d
            r0.put(r6, r5)     // Catch: java.lang.Throwable -> L3b
            goto L3d
        L3b:
            r5 = move-exception
            goto L3e
        L3d:
            return r5
        L3e:
            sl.a.a(r4, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: el.h.b(android.content.Context, java.lang.String):java.lang.Class");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Method c(Class cls, String str) {
        Class[] clsArr;
        Method g02;
        if (sl.a.b(this)) {
            return null;
        }
        try {
            HashMap hashMap = f15677b;
            Method method = (Method) hashMap.get(str);
            if (method != null) {
                return method;
            }
            switch (str.hashCode()) {
                case -1801122596:
                    if (str.equals("getPurchases")) {
                        Class TYPE = Integer.TYPE;
                        Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
                        clsArr = new Class[]{TYPE, String.class, String.class, String.class};
                        break;
                    }
                    clsArr = null;
                    break;
                case -1450694211:
                    if (str.equals("isBillingSupported")) {
                        Class TYPE2 = Integer.TYPE;
                        Intrinsics.checkNotNullExpressionValue(TYPE2, "TYPE");
                        clsArr = new Class[]{TYPE2, String.class, String.class};
                        break;
                    } else {
                        clsArr = null;
                        break;
                    }
                case -1123215065:
                    if (str.equals("asInterface")) {
                        clsArr = new Class[]{IBinder.class};
                        break;
                    } else {
                        clsArr = null;
                        break;
                    }
                case -594356707:
                    if (str.equals("getPurchaseHistory")) {
                        Class TYPE3 = Integer.TYPE;
                        Intrinsics.checkNotNullExpressionValue(TYPE3, "TYPE");
                        clsArr = new Class[]{TYPE3, String.class, String.class, String.class, Bundle.class};
                        break;
                    } else {
                        clsArr = null;
                        break;
                    }
                case -573310373:
                    if (str.equals("getSkuDetails")) {
                        Class TYPE4 = Integer.TYPE;
                        Intrinsics.checkNotNullExpressionValue(TYPE4, "TYPE");
                        clsArr = new Class[]{TYPE4, String.class, String.class, Bundle.class};
                        break;
                    } else {
                        clsArr = null;
                        break;
                    }
                default:
                    clsArr = null;
                    break;
            }
            if (clsArr == null) {
                g02 = l.g0(cls, str, null);
            } else {
                g02 = l.g0(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            if (g02 != null) {
                hashMap.put(str, g02);
            }
            return g02;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    public final ArrayList d(Context context, Object obj) {
        ArrayList<String> stringArrayList;
        if (sl.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (i(context, obj, "inapp")) {
                char c10 = 0;
                String str = null;
                int i10 = 0;
                boolean z10 = false;
                while (true) {
                    Object[] objArr = new Object[5];
                    objArr[c10] = 6;
                    objArr[1] = f15679d;
                    objArr[2] = "inapp";
                    objArr[3] = str;
                    objArr[4] = new Bundle();
                    Object h10 = h(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, objArr);
                    if (h10 != null) {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) h10;
                        if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                            Iterator<String> it = stringArrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                    z10 = true;
                                    break;
                                }
                                arrayList.add(next);
                                i10++;
                            }
                            str = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            if (i10 < 30 || str == null || z10) {
                                break;
                                break;
                            }
                            c10 = 0;
                        }
                    }
                    str = null;
                    if (i10 < 30) {
                        break;
                    }
                    c10 = 0;
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[EDGE_INSN: B:24:0x0064->B:28:0x0064 BREAK  A[LOOP:0: B:12:0x0019->B:23:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList e(android.content.Context r13, java.lang.Object r14, java.lang.String r15) {
        /*
            r12 = this;
            boolean r0 = sl.a.b(r12)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5b
            r0.<init>()     // Catch: java.lang.Throwable -> L5b
            if (r14 != 0) goto L10
            return r0
        L10:
            boolean r2 = r12.i(r13, r14, r15)     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L64
            r2 = 0
            r3 = r1
            r4 = r2
        L19:
            r5 = 4
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L5b
            r5 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L5b
            r11[r2] = r6     // Catch: java.lang.Throwable -> L5b
            java.lang.String r6 = el.h.f15679d     // Catch: java.lang.Throwable -> L5b
            r7 = 1
            r11[r7] = r6     // Catch: java.lang.Throwable -> L5b
            r6 = 2
            r11[r6] = r15     // Catch: java.lang.Throwable -> L5b
            r11[r5] = r3     // Catch: java.lang.Throwable -> L5b
            java.lang.String r8 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r9 = "getPurchases"
            r6 = r12
            r7 = r13
            r10 = r14
            java.lang.Object r3 = r6.h(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L5d
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = "RESPONSE_CODE"
            int r5 = r3.getInt(r5)     // Catch: java.lang.Throwable -> L5b
            if (r5 != 0) goto L5d
            java.lang.String r5 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r5 = r3.getStringArrayList(r5)     // Catch: java.lang.Throwable -> L5b
            if (r5 == 0) goto L64
            int r6 = r5.size()     // Catch: java.lang.Throwable -> L5b
            int r4 = r4 + r6
            r0.addAll(r5)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L5b
            goto L5e
        L5b:
            r13 = move-exception
            goto L65
        L5d:
            r3 = r1
        L5e:
            r5 = 30
            if (r4 >= r5) goto L64
            if (r3 != 0) goto L19
        L64:
            return r0
        L65:
            sl.a.a(r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: el.h.e(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    public final LinkedHashMap g(Context context, ArrayList arrayList, Object obj, boolean z10) {
        Object obj2;
        int size;
        if (sl.a.b(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                Object[] objArr = new Object[4];
                int i10 = 0;
                objArr[0] = 3;
                objArr[1] = f15679d;
                if (z10) {
                    obj2 = "subs";
                } else {
                    obj2 = "inapp";
                }
                objArr[2] = obj2;
                objArr[3] = bundle;
                Object h10 = h(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
                if (h10 != null) {
                    Bundle bundle2 = (Bundle) h10;
                    if (bundle2.getInt("RESPONSE_CODE") == 0) {
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList != null && arrayList.size() == stringArrayList.size() && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i11 = i10 + 1;
                                Object obj3 = arrayList.get(i10);
                                Intrinsics.checkNotNullExpressionValue(obj3, "skuList[i]");
                                String str = stringArrayList.get(i10);
                                Intrinsics.checkNotNullExpressionValue(str, "skuDetailsList[i]");
                                linkedHashMap.put(obj3, str);
                                if (i11 > size) {
                                    break;
                                }
                                i10 = i11;
                            }
                        }
                        k(linkedHashMap);
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    public final Object h(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method c10;
        if (sl.a.b(this)) {
            return null;
        }
        try {
            Class b10 = b(context, str);
            if (b10 == null || (c10 = c(b10, str2)) == null) {
                return null;
            }
            return l.n0(b10, obj, c10, Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    public final boolean i(Context context, Object obj, String str) {
        if (sl.a.b(this) || obj == null) {
            return false;
        }
        try {
            Object h10 = h(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f15679d, str});
            if (h10 == null) {
                return false;
            }
            if (((Integer) h10).intValue() != 0) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return false;
        }
    }

    public final LinkedHashMap j(ArrayList arrayList) {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String sku = (String) it.next();
                String string = f15680e.getString(sku, null);
                if (string != null) {
                    List P = w.P(string, new String[]{";"}, 2, 2);
                    if (currentTimeMillis - Long.parseLong((String) P.get(0)) < 43200) {
                        Intrinsics.checkNotNullExpressionValue(sku, "sku");
                        linkedHashMap.put(sku, P.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    public final void k(LinkedHashMap linkedHashMap) {
        if (sl.a.b(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor edit = f15680e.edit();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                edit.putString((String) entry.getKey(), currentTimeMillis + ';' + ((String) entry.getValue()));
            }
            edit.apply();
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }
}
